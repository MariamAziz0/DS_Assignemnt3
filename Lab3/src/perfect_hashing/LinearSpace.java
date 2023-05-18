package perfect_hashing;

import IO.Concrete_FS;
import IO.File_Scanner_IF;

/*
 * NOTE:
 * It is recommended to use a "QuadraticSpace" object, for manipulating the dynamic perfect hashing
 * at each index, you can take advantage of all the predefined methods in the class.
 * BUT: You must send a boolean variable "isDynamic = true" in the constructor.
 */
public class LinearSpace<T> implements HashingDataStructure_IF<T>{

    private final Utilities utilities;
    private final File_Scanner_IF<T> fileScanner;
    private int currentElements;
    private final int N;
    private T[][] hashTable;
    private int rehashCounter;
    private int resizeCounter;
    private int[][] h;
    private int[][][] h_level2;

    public LinearSpace(int N) {
        this.utilities = new Utilities();
        this.fileScanner = new Concrete_FS<>();
        this.hashTable = (T[][]) new Object[N][];
        this.currentElements = 0;
        this.rehashCounter = 0;
        this.resizeCounter = 0;
        this.N = N;
    }

    @Override
    public boolean insert(T key) {
        return false;
    }

    @Override
    public boolean delete(T key) {
        return false;
    }

    @Override
    public boolean search(T key) {
        return false;
    }

    @Override
    public int batch_insert(String fileName) {
        return 0;
    }

    @Override
    public int batch_delete(String fileName) {
        return 0;
    }

    @Override
    public int getRehashCounter() {
        return 0;
    }

    @Override
    public void displayHashTable() {

    }
}
