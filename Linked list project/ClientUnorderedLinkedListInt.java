//Class: ClientUnorderedLinkedListInt
//Input: 37 10 88 59 27 20 14 32 89 100 12 999
import java.util.*;
public class ClientUnorderedLinkedListInt {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        UnorderedLinkedListInt intList = new UnorderedLinkedListInt();
        UnorderedLinkedListInt tempList;
        int num;
        num = getInt(input, "Enter integers (999 to stop)");
        while (num != 999) {
            intList.insertLast((Integer) num);
            num = getInt(input, "");
        }
        System.out.print("\nTesting .insertLast and .print. The original list is: ");
        intList.print();
        System.out.println("\nTesting .length. The length of the list is: " + intList.length());
        if (!intList.isEmptyList()) {
            System.out.println("Testing .front. First element/list: " + intList.front());
            System.out.println("Testing .back. Last element/list: "  + intList.back());
        }
        System.out.println("Testing .sum. The sum of data in all nodes is: " + intList.findSum());
        System.out.println("Testing .min. The smallest data in all nodes is: " + intList.findMin());
        System.out.print("Testing .search. Enter the number to search for/list: ");
        num = input.nextInt();
        if (intList.search(num))
            System.out.println(num + " found in this list.");
        else
            System.out.println(num + " is not in this list.");
        System.out.print("Testing .remove. Enter the number to be deleted from list: ");
        num = input.nextInt();
        intList.deleteNode(num);
        System.out.print("Testing .toString. After deleting " + num + ", the list is: " + intList);
        //intList.print();
        System.out.println("\nThe length of the list after delete is: " + intList.length());    
    }

    public static int getInt(Scanner sc, String prompt) {
          System.out.println(prompt);
          while (!sc.hasNextInt()) {
            sc.next();
            System.out.print("Not an integer! try again: ");
          }
          return sc.nextInt();

    }
  
}
