package appliction;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Boolean isLinear;
        int N, tempInput;
        String tempStr;
        System.out.println("Enter the Dictionary initial size:");
        N = myScanner.nextInt();
        System.out.println("Would you like to create a linear version ?? (True or False)");
        isLinear = myScanner.nextBoolean();
        Dict_IF myDictionary = new Dict_App(N, isLinear);
        while(true){
            System.out.println("Enter the word to apply the operation on:");
            tempStr = myScanner.next();
            System.out.println("Choose the desired command:");
            System.out.println("1) Insertion");
            System.out.println("2) Deletion");
            System.out.println("3) Searching");
            tempInput = myScanner.nextInt();
            switch (tempInput){
                case 1:
                    System.out.println(myDictionary.insert(tempStr));
                    break;
                case 2:
                    System.out.println(myDictionary.delete(tempStr));
                    break;
                case 3:
                    System.out.println(myDictionary.search(tempStr));
                    break;
                default:
                    System.out.println("Wrong Input, please try again.");
                    break;
            }
        }
    }
}
