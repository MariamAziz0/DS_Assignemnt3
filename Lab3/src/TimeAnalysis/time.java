package TimeAnalysis;

import IO.Concrete_FS;
import Perfect_Hashing.LinearSpace;
import Perfect_Hashing.QuadraticSpace;

import java.util.ArrayList;
import java.util.List;

public class time {

    public static void main(String[] args) {
        int[] sizes = new int[]{10, 50, 100, 250, 500, 800, 1000, 2500, 5000, 8000, 10000, 12500, 15000, 20000, 30000, 40000,
                50000, 80000, 100000, 200000, 300000, 400000, 500000, 600000, 700000, 800000, 900000, 1000000};
        //long[] quadraticInsertTime = new long[sizes.length];
        //long[] quadraticDeleteTime = new long[sizes.length];
        //long[] quadraticSearchTime = new long[sizes.length];
        //int[] quadraticRehashCounter = new int[sizes.length];
        long[] linearInsertTime = new long[sizes.length];
        long[] linearDeleteTime = new long[sizes.length];
        long[] linearSearchTime = new long[sizes.length];
        int[] linearRehashCounter = new int[sizes.length];
        int[] linearResizeCounter = new int[sizes.length];
        for (int i = 16; i < 17; i++) {
            String fileName = "time/t" + (i+1);
            //QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(sizes[i], false);

            long start;// = System.nanoTime();
            //myHashDataStructure.batch_insert(fileName);
            long end;// = System.nanoTime();
            /*quadraticInsertTime[i] = (end - start);
            quadraticRehashCounter[i] += myHashDataStructure.getRehashCounter();

            List<String> data = new Concrete_FS<String>().importData(fileName);
            start = System.nanoTime();
            for (String str : data) myHashDataStructure.search(str);
            end = System.nanoTime();
            quadraticSearchTime[i] = (end - start);

            start = System.nanoTime();
            myHashDataStructure.batch_delete(fileName);
            end = System.nanoTime();
            quadraticDeleteTime[i] = (end - start);*/

            LinearSpace<String> myHashDataStructure2 = new LinearSpace<>(sizes[i]);
            List<String> data = new Concrete_FS<String>().importData(fileName);

            start = System.nanoTime();
            myHashDataStructure2.batch_insert(fileName);
            end = System.nanoTime();
            linearInsertTime[i] = (end - start);
            linearRehashCounter[i] += myHashDataStructure2.getRehashCounter();
            linearResizeCounter[i] += myHashDataStructure2.getResizeCounter();

            start = System.nanoTime();
            for (String str : data) myHashDataStructure2.search(str);
            end = System.nanoTime();
            linearSearchTime[i] = (end - start);

            start = System.nanoTime();
            myHashDataStructure2.batch_delete(fileName);
            end = System.nanoTime();
            linearDeleteTime[i] = (end - start);
        }

        for (int k = 0; k < 2; k++) {
            for (int i = 16; i < 17; i++) {
                String fileName = "time/t" + (i+1);
                //QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(sizes[i], false);

                long start;// = System.nanoTime();
                //myHashDataStructure.batch_insert(fileName);
                long end;// = System.nanoTime();
                /*quadraticInsertTime[i] += end - start;
                quadraticRehashCounter[i] += myHashDataStructure.getRehashCounter();

                List<String> data = new Concrete_FS<String>().importData(fileName);
                start = System.nanoTime();
                for (String str : data) myHashDataStructure.search(str);
                end = System.nanoTime();
                quadraticSearchTime[i] += end - start;

                start = System.nanoTime();
                myHashDataStructure.batch_delete(fileName);
                end = System.nanoTime();
                quadraticDeleteTime[i] += end - start;*/

                LinearSpace<String> myHashDataStructure2 = new LinearSpace<>(sizes[i]);
                List<String> data = new Concrete_FS<String>().importData(fileName);

                start = System.nanoTime();
                myHashDataStructure2.batch_insert(fileName);
                end = System.nanoTime();
                linearInsertTime[i] += end - start;
                linearRehashCounter[i] += myHashDataStructure2.getRehashCounter();
                linearResizeCounter[i] += myHashDataStructure2.getResizeCounter();

                start = System.nanoTime();
                for (String str : data) myHashDataStructure2.search(str);
                end = System.nanoTime();
                linearSearchTime[i] += end - start;

                start = System.nanoTime();
                myHashDataStructure2.batch_delete(fileName);
                end = System.nanoTime();
                linearDeleteTime[i] += end - start;
            }
        }
        for (int i = 16; i < 17; i++) {
            //quadraticInsertTime[i] /= 3;
            //quadraticDeleteTime[i] /= 3;
            //quadraticSearchTime[i] /= 3;
            linearInsertTime[i] /= 3;
            linearDeleteTime[i] /= 3;
            linearSearchTime[i] /= 3;
            /*System.out.println(
                    sizes[i] + "\t" +
                    quadraticInsertTime[i] + "\t" + linearInsertTime[i] + "\t" +
                    quadraticDeleteTime[i] + "\t" + linearDeleteTime[i] + "\t" +
                    quadraticSearchTime[i] + "\t" + linearSearchTime[i] + "\t" +
                    ((float) quadraticRehashCounter[i]) / 3 + "\t\t" + ((float) linearRehashCounter[i]) / 3 + "\t\t" +
                    ((float) linearResizeCounter[i]) / 3 );*/
            System.out.println(
                    sizes[i] + "\t" +
                            linearInsertTime[i] + "\t" +
                            linearDeleteTime[i] + "\t" +
                            linearSearchTime[i] + "\t\t" +
                            ((float) linearRehashCounter[i]) / 3 + "\t\t" +
                            ((float) linearResizeCounter[i]) / 3 );
        }


    }

}
