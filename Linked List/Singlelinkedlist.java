import java.util.*;

class Node {
    int value;
    Node link;
}

class Main {
    static Node Start = null;

    static Node createnode() {
        return new Node();
    }

    static void insertNode(Scanner sc) {
        Node temp, temp2;
        temp = createnode();
        System.out.print("Enter any number:");
        temp.value = sc.nextInt();
        temp.link = null;

        if (Start == null) {
            Start = temp;
        } else {
            temp2 = Start;
            while (temp2.link != null) {
                temp2 = temp2.link;
            }
            temp2.link = temp;
        }
    }

    static void delete_node() {
        if (Start == null) {
            System.out.print("List is empty:");
        } else {
            Node deletevalue = Start;
            Start = Start.link;
        }
    }

    static void print_list() {
        Node t1;
        if (Start == null) {
            System.out.print("list is empty:");
        } else {
            t1 = Start;
            while (t1 != null) {
                System.out.print(t1.value);
                t1 = t1.link;
            }
        }
    }

    static int check_menus(Scanner sc) {
        int choice;
        System.out.println("\n1.ADD\n2.Delete\n3.Print\n4.Exit");
        System.out.print("Enter your choice:");
        choice = sc.nextInt();
        return choice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            switch (check_menus(sc)) {
                case 1:
                    insertNode(sc);
                    break;
                case 2:
                    delete_node();
                    break;
                case 3:
                    print_list();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.print("invalid choice...");
            }
        }
    }
}
