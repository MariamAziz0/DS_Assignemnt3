package CLI;

import Application.Dict_App;
import Application.Dict_IF;
import java.util.Scanner;

public class CLI implements CLI_IF{

    private Dict_IF dictionary;
    private Scanner scanner;

    public static void main(String[] args) {
        CLI_IF cli = new CLI();
        cli.run();
    }

    public CLI(){
        System.out.println("CLI Object has been instantiated.");
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void run() {
        int tempType = 0, tempSize = 0, tempInput = 0;
        String tempStr = "NA";
        while(tempType != 1 && tempType != 2) {
            System.out.println("Choose the desired backend implementation:");
            System.out.println("1) Linear Space Dictionary");
            System.out.println("2) Quadratic Space Dictionary");
            tempType = scanner.nextInt();
        }
        while(tempSize <= 0){
            System.out.println("Enter the dictionary initial size:");
            tempSize = scanner.nextInt();
        }
        if(tempType == 1)
            this.dictionary = new Dict_App(tempSize, true);
        else
            this.dictionary = new Dict_App(tempSize, false);

        while(true){
            while(tempInput <= 0 || tempInput >= 8){
                System.out.println("Choose the desired command:");
                System.out.println("1) Insertion");
                System.out.println("2) Deletion");
                System.out.println("3) Searching");
                System.out.println("4) Batch Insertion");
                System.out.println("5) Batch Deletion");
                System.out.println("6) Display");
                System.out.println("7) Return To Main Menu");
                tempInput = scanner.nextInt();
            }
            if(tempInput == 7)
                this.run();
            if(tempInput != 6) {
                if (tempInput != 4 && tempInput != 5)
                    System.out.println("Enter the word to apply the operation on:");
                else
                    System.out.println("Enter the file name:");
                tempStr = scanner.next();
            }
            switch (tempInput){
                case 1:
                    System.out.println("Insertion Result: " + (dictionary.insert(tempStr) ? "Successfully" : "Failed"));
                    break;
                case 2:
                    System.out.println("Deletion Result: " + (dictionary.delete(tempStr) ? "Successfully" : "Failed"));
                    break;
                case 3:
                    System.out.println("Search Result: " + (dictionary.search(tempStr) ? "Found" : "Not Found"));
                    break;
                case 4:
                    System.out.println(dictionary.batchInsert(tempStr) + " has been inserted successfully.");
                    break;
                case 5:
                    System.out.println(dictionary.batchDelete(tempStr) + " has been deleted successfully.");
                    break;
                case 6:
                    dictionary.display();
                    break;
                default:
                    break;
            }
            tempInput = 0;
            System.out.println(dictionary.getCurrentElements());
        }
    }
}
