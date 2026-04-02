import java.util.*;

class Main {
    static final int size = 100;
    static int[] stack = new int[size];
    static int index = -1;

    static void pushoperation(Scanner sc) {
        int element;
        if (index == size - 1) {
            System.out.print("stack is overflow...");
        } else {
            System.out.print("Enter any element: ");
            element = sc.nextInt();
            index++;
            stack[index] = element;
        }
    }

    static void popOperation() {
        if (index == -1) {
            System.out.print("Stack is empty:");
        } else {
            int n = stack[index];
            index--;
            System.out.print("Element is deleted " + n);
        }
    }

    static void printstack() {
        if (index == -1) {
            System.out.print("Stack is empty...");
        } else {
            System.out.print("Elements of stack is: ");
            for (int i = index; i >= 0; i--) {
                System.out.print(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.PUSH\n2.POP\n3.PRINT\n4.EXIT");
            System.out.print("Enter your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    pushoperation(sc);
                    break;
                case 2:
                    popOperation();
                    break;
                case 3:
                    printstack();
                    break;
                case 4:
                    System.out.print("Exit the programm...");
                    break;
                default:
                    System.out.print("Invalid choice...");
            }
        } while (choice != 4);
    }
}
