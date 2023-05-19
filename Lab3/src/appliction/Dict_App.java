package appliction;

import perfect_hashing.HashingDataStructure_IF;
import perfect_hashing.LinearSpace;
import perfect_hashing.QuadraticSpace;

public class Dict_App implements Dict_IF{

    HashingDataStructure_IF<String> perfectHashingType;

    public Dict_App(int N, boolean isLinear){
        if(isLinear)
            this.perfectHashingType = new LinearSpace<>(N);
        else
            this.perfectHashingType = new QuadraticSpace<>(N, false);
    }

    @Override
    public boolean insert(String key) {
        return this.perfectHashingType.insert(key);
    }

    @Override
    public boolean delete(String key) {
        return this.perfectHashingType.delete(key);
    }

    @Override
    public boolean search(String key) {
        return this.perfectHashingType.search(key);
    }

    @Override
    public int batchInsert(String fileName) {
        return this.perfectHashingType.batch_insert(fileName);
    }

    @Override
    public int batchDelete(String fileName) {
        return this.perfectHashingType.batch_delete(fileName);
    }

    @Override
    public void display() {
        perfectHashingType.displayHashTable();
    }

    @Override
    public int getCurrentElements() {
        return perfectHashingType.getCurrentElements();
    }
}
