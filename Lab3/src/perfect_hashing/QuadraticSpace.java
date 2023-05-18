package perfect_hashing;

import IO.Concrete_FS;
import IO.File_Scanner_IF;
import java.util.*;

public class QuadraticSpace<T> {

    private T[] hashTable;
    private final Utilities utilities;
    private int[][] h;
    private final int N;
    private int currentElements;
    private int rehashCounter;
    private File_Scanner_IF<T> fileScanner;

    public QuadraticSpace(int N){
        this.N = N;
        this.hashTable = (T[]) new Object[N * N];
        this.utilities = new Utilities();
        this.fileScanner = new Concrete_FS<>();
        this.generateHashFunction();
    }

    private void generateHashFunction(){
        this.h = this.utilities.generateMatrix((int)Math.ceil(Math.log(N * N) / Math.log(2)), 32);
    }

    private void reHash(){
        this.generateHashFunction();
        System.out.println("Hash function has been changed.");
        T[] tempHashTable = (T[]) new Object[N * N];
        for(T key : this.hashTable)
            if(key == null)
                continue;
            else
                tempHashTable[this.utilities.hash(key, h, N * N)] = key;
        this.hashTable = tempHashTable;
        System.out.println("Rehashed.");
    }

    public void insert(T key){
        while(this.hashTable[this.utilities.hash(key, h, N * N)] != null) {
            this.reHash();
            this.rehashCounter++;
        }
        this.hashTable[this.utilities.hash(key, h, N * N)] = key;
        this.currentElements++;
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

    public void batch_insert(String fileName){
        List<T> data = this.fileScanner.importData(fileName);
        for(T key : data)
            this.insert(key);
    }

    public void batch_delete(String fileName){
        List<T> data = this.fileScanner.importData(fileName);
        for(T key : data)
            this.delete(key);
    }

}
