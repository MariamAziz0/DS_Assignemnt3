package perfect_hashing;

public interface HashingDataStructure_IF<T> {

    public boolean insert(T key);
    public boolean delete(T key);
    public boolean search(T key);
    public int batch_insert(String fileName);
    public int batch_delete(String fileName);
    public int getRehashCounter();
    public void displayHashTable();

}
