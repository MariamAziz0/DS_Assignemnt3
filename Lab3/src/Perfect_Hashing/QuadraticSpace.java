package Perfect_Hashing;

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
    private int resizeCounter;
    private final File_Scanner_IF<T> fileScanner;
    private final boolean isDynamic;
    private final int MAX_BITS;

    public QuadraticSpace(int N, boolean isDynamic){
        this.N = N;
        this.currentElements = 0;
        this.rehashCounter = 0;
        this.resizeCounter = 0;
        this.isDynamic = isDynamic;
        this.hashTable = (T[]) new Object[N * N];
        this.utilities = new Utilities();
        this.fileScanner = new Concrete_FS<>();
        this.MAX_BITS = 64;
        this.generateHashFunction();
    }

    private void generateHashFunction(){
        this.h = this.utilities.generateMatrix((int)Math.ceil(Math.log(N * N) / Math.log(2)), MAX_BITS);
    }

    private void rehash(){
        this.rehashCounter++;
        this.generateHashFunction();
//        System.out.println("Hash function has been changed.");
        T[] tempHashTable = (T[]) new Object[N * N];
        for(T key : this.hashTable)
        {
            if (!(key == null))
            {
                if(tempHashTable[this.utilities.hash(key, h, N * N)] != null) {
                    rehash();
                    return;
                } else
                    tempHashTable[this.utilities.hash(key, h, N * N)] = key;
            }
        }
        this.hashTable = tempHashTable;
    }

    private void resize(int new_N){
        if(new_N <= N || !isDynamic)
            return;
        N = new_N;
        this.resizeCounter++;
    }

    public boolean insert(T key){
        // In case of Quadratic space && maximum # of elements reached, return false.
        if(currentElements == N && !isDynamic)
            return false;

        // In case of the key already does exist, return false;
        if(this.search(key))
        {
            System.out.println("Element already exists in the hashtable.");
            return false;
        }

        // In case of Linear space && maximum # of elements reached, resize.
        if(currentElements == N)
        {
            this.resize(currentElements + 1);
            this.rehash();
        }

        // As long as the new hash function leads to collision, rehash.
        while(this.hashTable[this.utilities.hash(key, h, N * N)] != null)
            this.rehash();

        this.hashTable[this.utilities.hash(key, h, N * N)] = key;
        this.currentElements++;
        return true;
    }

    public boolean search(T key){
        return this.hashTable[this.utilities.hash(key, h, N * N)] != null &&
                this.hashTable[this.utilities.hash(key, h, N * N)].equals(key);
    }

    public boolean delete(T key){
        if(this.hashTable[this.utilities.hash(key, h, N * N)] != null && this.hashTable[this.utilities.hash(key, h, N * N)].equals(key)) {
            this.hashTable[this.utilities.hash(key, h, N * N)] = null;
            this.currentElements--;
            return true;
        }
        return false;
    }

    public void displayHashTable(){
        for(int i = 0; i < N * N; i++)
            System.out.println(i + ": " + ((this.hashTable[i] != null) ? this.hashTable[i] : "-"));
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

    public int getCurrentElements(){
        return this.currentElements;
    }

    public int getResizeCounter(){
        return this.resizeCounter;
    }

    public int getN(){
        return this.N;
    }
}
