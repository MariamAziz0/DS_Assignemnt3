package perfect_hashing;

public class Demo {

    public static void main(String[] args) {

        /*QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(1500, false);
        int temp = myHashDataStructure.batch_insert("file2");
        //myHashDataStructure.displayHashTable();
        System.out.println(temp);
        System.out.println(myHashDataStructure.getRehashCounter());
        System.out.println(myHashDataStructure.getResizeCounter());
        System.out.println(myHashDataStructure.getM());*/

        LinearSpace<String> myHashDataStructure2 = new LinearSpace<>(1500);
        int temp2 = myHashDataStructure2.batch_insert("file2");
        myHashDataStructure2.displayHashTable();
        System.out.println(temp2);
        System.out.println(myHashDataStructure2.getRehashCounter());
        System.out.println(myHashDataStructure2.getResizeCounter());
        System.out.println(myHashDataStructure2.isItOofN());

    }

}