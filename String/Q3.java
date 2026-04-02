import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = 0, j = s.length() - 1;
        int check = 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                check = 0;
                break;
            }
            i++;
            j--;
        }

        if (check == 1) {
            System.out.print("its a pallindrome");
        } else {
            System.out.print("Not a pallindrome");
        }
    }
}
