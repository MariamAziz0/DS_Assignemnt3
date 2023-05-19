package perfect_hashing;

import IO.Concrete_FS;
import IO.File_Scanner_IF;

import java.util.List;

/*
 * NOTE:
 * It is recommended to use a "QuadraticSpace" object, for manipulating the dynamic perfect hashing
 * at each index, you can take advantage of all the predefined methods in the class.
 * BUT: You must send a boolean variable "isDynamic = true" in the constructor.
 */
public class LinearSpace<T> implements HashingDataStructure_IF<T>{

    private final Utilities utilities;
    private final File_Scanner_IF<T> fileScanner;
    private final int N;
    private int[][] h;
    private QuadraticSpace[] bins;

    public LinearSpace(int N) {
        this.utilities = new Utilities();
        this.fileScanner = new Concrete_FS<>();
        this.bins = new QuadraticSpace[N];
        for(int i = 0 ; i < N ; i++)
            bins[i] = new QuadraticSpace(1, true);
        this.N = N;
        this.generateHashFunction();
    }

    private void generateHashFunction(){
        this.h = this.utilities.generateMatrix((int)Math.ceil(Math.log(N * N) / Math.log(2)), 32);
    }

    @Override
    public boolean insert(T key) {
        return bins[this.utilities.hash(key, h, N)].insert(key);
    }

    @Override
    public boolean delete(T key) {
        return bins[this.utilities.hash(key, h, N)].delete(key);
    }

    @Override
    public boolean search(T key) {
        return bins[this.utilities.hash(key, h, N)].search(key);
    }

    @Override
    public int batch_insert(String fileName) {
        int success_count = 0;
        List<T> data = this.fileScanner.importData(fileName);
        for(T key : data)
            if(this.insert(key))
                success_count++;
        return success_count;
    }

    @Override
    public int batch_delete(String fileName) {
        int success_count = 0;
        List<T> data = this.fileScanner.importData(fileName);
        for(T key : data)
            if(this.delete(key))
                success_count++;
        return success_count;
    }

    @Override
    public int getRehashCounter() {
        int counter = 0;
        for(QuadraticSpace Q : bins)
            counter += Q.getRehashCounter();
        return counter;
    }

    @Override
    public void displayHashTable() {
        for(int i = 0 ; i < N ; i++) {
            System.out.println("Bin(" + i + "): ");
            bins[i].displayHashTable();
        }
    }

    public int getResizeCounter(){
        int counter = 0;
        for(QuadraticSpace Q : bins)
            counter += Q.getResizeCounter();
        return counter;
    }

    public int getCurrentElements(){
        int counter = 0;
        for(QuadraticSpace Q : bins)
            counter += Q.getCurrentElements();
        return counter;
    }

    public int isItOofN(){
        int counter = 0;
        for(QuadraticSpace Q : bins)
            counter += Q.getN() * Q.getN();
        return counter;
    }
}
