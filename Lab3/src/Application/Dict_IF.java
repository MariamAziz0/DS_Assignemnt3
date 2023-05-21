package Application;

public interface Dict_IF {
    boolean insert(String key);
    boolean delete(String key);
    boolean search(String key);
    int batchInsert(String fileName);
    int batchDelete(String fileName);
    void display();
    int getCurrentElements();
}
