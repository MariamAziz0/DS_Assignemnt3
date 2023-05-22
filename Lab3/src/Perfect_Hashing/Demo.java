package Perfect_Hashing;

public class Demo {

    public static void main(String[] args) {

//        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(1500, false);
//        int temp = myHashDataStructure.batch_insert("dontEditMe");
        //myHashDataStructure.displayHashTable();
//        System.out.println(temp);
//        System.out.println(myHashDataStructure.getRehashCounter());
//        System.out.println(myHashDataStructure.getResizeCounter());

//        LinearSpace<String> myHashDataStructure2 = new LinearSpace<>(1500);
//        int temp2 = myHashDataStructure2.batch_insert("file2");
//        /*myHashDataStructure2.displayHashTable();*/
//        System.out.println(temp2);
//        System.out.println(myHashDataStructure2.getRehashCounter());
//        System.out.println(myHashDataStructure2.getResizeCounter());
//        System.out.println(myHashDataStructure2.isItOofN());

        QuadraticSpace<Integer> myHDS = new QuadraticSpace(5, false);
        System.out.println(myHDS.insert(5));
        System.out.println(myHDS.insert(190));
        System.out.println(myHDS.insert(-23423));
        System.out.println(myHDS.delete(4));
        System.out.println(myHDS.insert(4));
        System.out.println(myHDS.search(5));
        System.out.println(myHDS.insert(444));
        myHDS.displayHashTable();
    }

}