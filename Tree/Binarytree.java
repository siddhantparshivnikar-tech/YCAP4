class Node {
    int data;
    Node left;
    Node right;

    Node(int value) {
        data = value;
        left = null;
        right = null;
    }
}

class Main {
    static Node createnode(int value) {
        return new Node(value);
    }

    public static void main(String[] args) {
        Node root = createnode(10);
        root.left = createnode(20);
        root.right = createnode(30);
        root.left.left = createnode(40);
        root.left.right = createnode(50);
        System.out.print("Tree created succesfully");
    }
}
