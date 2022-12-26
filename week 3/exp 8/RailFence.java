import java.util.*;
import java.lang.Math;
class RailFence {

    void encrypt(String text, int depth){
        String splittedText[][] = new String[depth][];
    }
    public static void main(String[] args){

        System.out.println("\n\t\t\t\t\tRAIL_FENCE CIPHER TECHNIQUEt: ");

        Scanner sc = new Scanner(System.in);

        System.out.println("\ntext: ");
        String text = sc.nextLine();

        System.out.println("\nDepth: ");
        int depth = sc.nextInt();

        new RailFence().encrypt(text, depth);
    }
}
