package perfect_hashing;

import IO.Concrete_FS;
import IO.File_Scanner_IF;
import java.util.*;

public class QuadraticSpace<T> implements HashingDataStructure_IF<T>{

    private T[] hashTable;
    private final Utilities utilities;
    private int[][] h;
    private int N;
    private int currentElements;
    private int rehashCounter;
    private final File_Scanner_IF<T> fileScanner;
    private final boolean isDynamic;

    public QuadraticSpace(int N, boolean isDynamic){
        this.N = N;
        this.currentElements = 0;
        this.rehashCounter = 0;
        this.isDynamic = isDynamic;
        this.hashTable = (T[]) new Object[N * N];
        this.utilities = new Utilities();
        this.fileScanner = new Concrete_FS<>();
        this.generateHashFunction();
    }

    private void generateHashFunction(){
        this.h = this.utilities.generateMatrix((int)Math.ceil(Math.log(N * N) / Math.log(2)), 32);
    }

    private void rehash(){
        this.generateHashFunction();
        System.out.println("Hash function has been changed.");
        T[] tempHashTable = (T[]) new Object[N * N];
        for(T key : this.hashTable)
            if (!(key == null))
                tempHashTable[this.utilities.hash(key, h, N * N)] = key;
        this.hashTable = tempHashTable;
        System.out.println("Rehashed.");
    }

    private void resize(int new_N){
        if(new_N <= N || !isDynamic)
            return;
        N = new_N;
        System.out.println("Resized");
    }

    public boolean insert(T key){
        if(currentElements == N){
            System.out.println("Size Limit Reached.");
            return false;
        }
        if(this.hashTable[this.utilities.hash(key, h, N * N)] == key){
            System.out.println("Element already exists in the hashtable.");
            return false;
        }
        while(this.hashTable[this.utilities.hash(key, h, N * N)] != null) {
            this.resize(currentElements + 1);
            this.rehash();
            this.rehashCounter++;
        }
        this.hashTable[this.utilities.hash(key, h, N * N)] = key;
        this.currentElements++;
        return true;
    }

    public boolean search(T key){
        return this.hashTable[this.utilities.hash(key, h, N * N)] != null;
    }

    public boolean delete(T key){
        if(this.hashTable[this.utilities.hash(key, h, N * N)] != null) {
            this.hashTable[this.utilities.hash(key, h, N * N)] = null;
            this.currentElements--;
            return true;
        }
        return false;
    }

    public void displayHashTable(){
        for(int i = 0; i < N * N; i++)
            System.out.println(i + ": " + ((this.hashTable[i] != null) ? this.hashTable[i] : "Null"));
    }

    public int getRehashCounter(){
        return this.rehashCounter;
    }

    public void displayHashFunction(){
        this.utilities.displayMatrix(this.h);
    }

    public int batch_insert(String fileName){
        int success_count = 0;
        List<T> data = this.fileScanner.importData(fileName);
        for(T key : data)
            if(this.insert(key))
                success_count++;
        return success_count;
    }

    public int batch_delete(String fileName){
        int success_count = 0;
        List<T> data = this.fileScanner.importData(fileName);
        for(T key : data)
            if(this.delete(key))
                success_count++;
        return success_count;
    }

}
