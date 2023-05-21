package TimeAnalysis;

import IO.Concrete_FS;
import Perfect_Hashing.LinearSpace;
import Perfect_Hashing.QuadraticSpace;

import java.util.ArrayList;
import java.util.List;

public class time {

    public static void main(String[] args) {
        ArrayList<Long> quadraticInsertTime = new ArrayList<Long>();
        ArrayList<Long> quadraticDeleteTime = new ArrayList<Long>();
        ArrayList<Long> quadraticSearchTime = new ArrayList<Long>();
        ArrayList<Long> linearInsertTime = new ArrayList<Long>();
        ArrayList<Long> linearDeleteTime = new ArrayList<Long>();
        ArrayList<Long> linearSearchTime = new ArrayList<Long>();
        int[] sizes = new int[]{0, 0, 0, 0, 0, 15, 40, 80, 120, 350, 500, 800, 1000, 1250, 1500, 2000, 2500, 3000};
        for (int i = 5; i < 18; i++) {
            String fileName = "time/file" + i;
            QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(sizes[i], false);

            long start = System.nanoTime();
            myHashDataStructure.batch_insert(fileName);
            long end = System.nanoTime();
            quadraticInsertTime.add(end - start);

            List<String> data = new Concrete_FS<String>().importData(fileName);
            start = System.nanoTime();
            for (String str : data) myHashDataStructure.search(str);
            end = System.nanoTime();
            quadraticSearchTime.add(end - start);

            start = System.nanoTime();
            myHashDataStructure.batch_delete(fileName);
            end = System.nanoTime();
            quadraticDeleteTime.add(end - start);

            LinearSpace<String> myHashDataStructure2 = new LinearSpace<>(sizes[i]);

            start = System.nanoTime();
            myHashDataStructure2.batch_insert(fileName);
            //System.out.println(i);///////////////////////////////
            end = System.nanoTime();
            linearInsertTime.add(end - start);

            start = System.nanoTime();
            for (String str : data) myHashDataStructure2.search(str);
            end = System.nanoTime();
            linearSearchTime.add(end - start);

            start = System.nanoTime();
            myHashDataStructure2.batch_delete(fileName);
            end = System.nanoTime();
            linearDeleteTime.add(end - start);
        }

        for (int k = 0; k < 2; k++) {
            for (int i = 5; i < 18; i++) {
                String fileName = "time/file" + i;
                QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(sizes[i], false);

                long start = System.nanoTime();
                myHashDataStructure.batch_insert(fileName);
                long end = System.nanoTime();
                quadraticInsertTime.set(i - 5, quadraticInsertTime.get(i - 5) + end - start);

                List<String> data = new Concrete_FS<String>().importData(fileName);
                start = System.nanoTime();
                for (String str : data) myHashDataStructure.search(str);
                end = System.nanoTime();
                quadraticSearchTime.set(i - 5, quadraticSearchTime.get(i - 5) + end - start);

                start = System.nanoTime();
                myHashDataStructure.batch_delete(fileName);
                end = System.nanoTime();
                quadraticDeleteTime.set(i - 5, quadraticDeleteTime.get(i - 5) + end - start);

                LinearSpace<String> myHashDataStructure2 = new LinearSpace<>(sizes[i]);

                start = System.nanoTime();
                myHashDataStructure2.batch_insert(fileName);
                end = System.nanoTime();
                linearInsertTime.set(i - 5, linearInsertTime.get(i - 5) + end - start);

                start = System.nanoTime();
                for (String str : data) myHashDataStructure2.search(str);
                end = System.nanoTime();
                linearSearchTime.set(i - 5, linearSearchTime.get(i - 5) + end - start);

                start = System.nanoTime();
                myHashDataStructure2.batch_delete(fileName);
                end = System.nanoTime();
                linearDeleteTime.set(i - 5, linearDeleteTime.get(i - 5) + end - start);
            }
        }
        for (int i = 5; i < 18; i++) {
            quadraticInsertTime.set(i - 5, quadraticInsertTime.get(i - 5) / 3);
            quadraticDeleteTime.set(i - 5, quadraticDeleteTime.get(i - 5) / 3);
            quadraticSearchTime.set(i - 5, quadraticSearchTime.get(i - 5) / 3);
            linearInsertTime.set(i - 5, quadraticInsertTime.get(i - 5) / 3);
            linearDeleteTime.set(i - 5, quadraticDeleteTime.get(i - 5) / 3);
            linearSearchTime.set(i - 5, quadraticSearchTime.get(i - 5) / 3);
            System.out.println(
                    quadraticInsertTime.get(i - 5) + "\t" + linearInsertTime.get(i - 5) + "\t" +
                            quadraticDeleteTime.get(i - 5) + "\t" + linearDeleteTime.get(i - 5) + "\t" +
                            quadraticSearchTime.get(i - 5) + "\t" + linearSearchTime.get(i - 5));
        }


    }

}
