import java.util.*;

public class StackQueueClient {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedStackClass<Integer> intStack = new LinkedStackClass<Integer>();
         QueueClass<Integer> queue = new QueueClass<Integer>();

        int[] a1 = getInt(sc, "Enter digits for stack (999) to stop: ");
        for (int i = 0; i < a1.length; i++) {
          intStack.push(a1[i]);
        }
        System.out.println("The original stack printed in direct order (bottom to top) is:");
        printStack(intStack);   
        System.out.println();
      
        System.out.println("The stack printed in reverse order (top to bottom) is: ");
        printBackStack(intStack);
        System.out.println();

        System.out.println("The stack stores " + countItems(intStack) + " items");
        
        System.out.println("The second number is " + getSecond(intStack));
        
        int removeNum = getNum(sc, "Enter a number to remove: ");
        removeItem(intStack, removeNum);
        System.out.println("The stack after removing every occurrence of " + removeNum + " is: ");
        printStack(intStack);

        System.out.println();
        int[] a2 = getInt(sc, "Enter digits for queue (999) to stop: "); 
        for (int i = 0; i < a2.length; i++) {
            queue.enqueue(a2[i]);
        }
        System.out.println("The queue is: ");
        printQueue(queue);

        System.out.println();
        System.out.println("The reversed queue is: ");
        reverseQueue(queue);
        printQueue(queue);
        
    }

    public static void printStack(LinkedStackClass<Integer> intStack) {
        LinkedStackClass<Integer> tempStack = new LinkedStackClass<Integer>(); 
        
        while (!intStack.isEmptyStack()) {
            tempStack.push(intStack.peek());
            intStack.pop();
        }

        while (!tempStack.isEmptyStack()) {
            System.out.print(tempStack.peek() + " ");
            intStack.push(tempStack.peek());
            tempStack.pop();
        }
    }
  
    public static void printBackStack(LinkedStackClass<Integer> intStack) {
        LinkedStackClass<Integer> tempStack = new LinkedStackClass<Integer>();
        while (!intStack.isEmptyStack()) {
            System.out.print(intStack.peek() + " ");
            tempStack.push(intStack.peek());
            intStack.pop();
        }
      
        while (!tempStack.isEmptyStack()) {
            intStack.push(tempStack.peek());
            tempStack.pop();
        }
      
    }

    public static int countItems(LinkedStackClass<Integer> intStack) {
        LinkedStackClass<Integer> tempStack = new LinkedStackClass<Integer>();
        int count = 0;
            while (!intStack.isEmptyStack()){
                tempStack.push(intStack.peek());
                intStack.pop();
                count++; 
            }

            while (!tempStack.isEmptyStack()) {
                intStack.push(tempStack.peek());
                tempStack.pop();
        }
            
        return count;
    }

    public static Integer getSecond(LinkedStackClass<Integer> intStack) {
        int temp, value;
        if (intStack.isEmptyStack()) {
          return null;
        } else {
          temp = intStack.peek();
          intStack.pop();
          value = intStack.peek();
          intStack.push(temp);
        }
          return value;
      
    }

    public static void removeItem(LinkedStackClass<Integer> intStack, Integer n) {
            LinkedStackClass<Integer> tempStack = new LinkedStackClass<Integer>();
            while (!intStack.isEmptyStack()) {
                if (intStack.peek()!= n) {
                   tempStack.push(intStack.peek());
                   intStack.pop();
                } else {
                  intStack.pop();
                }
            }

            while (!tempStack.isEmptyStack()) {
                intStack.push(tempStack.peek());
                tempStack.pop();
            }
    }

    public static void reverseStack(LinkedStackClass<Integer> s) {
        QueueClass<Integer> q = new QueueClass<Integer>();
        while (!s.isEmptyStack()) {
          q.enqueue(s.peek());
          s.pop();
        }

        while (!q.isEmptyQueue()) {
          s.push(q.front());
          q.dequeue();
        }
      
    } 

    public static void reverseQueue(QueueClass<Integer> q) {
        LinkedStackClass<Integer> s = new LinkedStackClass<Integer>();
        while (!q.isEmptyQueue()) {
            s.push(q.front());
            q.dequeue();
        }

        while (!s.isEmptyStack()) {
            q.enqueue(s.peek());
            s.pop();
        }
    }

    public static void printQueue(QueueClass<Integer> q) {
        QueueClass<Integer> tempQueue = new QueueClass<Integer>();
        while (!q.isEmptyQueue()) {
          System.out.print( q.front() + " ");
          tempQueue.enqueue(q.front());
          q.dequeue();
        }

        while (!tempQueue.isEmptyQueue()) {
            q.enqueue(tempQueue.front());
            tempQueue.dequeue();
        }
    }
  
    public static int[] getInt(Scanner sc, String prompt) {
        System.out.println(prompt);
       int[] intArray = new int[999];
      int i = 0;
        while (true) {
            if(!sc.hasNextInt()) {
                sc.next();
                System.out.print("Not an integer! try again: ");
            } else {
                int input = sc.nextInt();
                if (input == 999) {
                    break;
                }
                intArray[i] = input;
                i++; 
           }
        }
      int [] trimmedArray = new int[i];
      System.arraycopy(intArray, 0, trimmedArray, 0, i);
      return trimmedArray;

    }
  
    public static int getNum(Scanner sc, String prompt) {
        System.out.println(prompt);
        while (!sc.hasNextInt()){
             sc.next();
             System.out.print("Not a valid integer");
        }
        return sc.nextInt();
    }
        
  
}
