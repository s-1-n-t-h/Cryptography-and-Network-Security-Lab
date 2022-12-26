import java.util.*;
import java.lang.Math;
class RailFence {

    void encrypt(String text, int depth){
        int length = text.length();
        int cols = Math.ceilDiv(length, depth);
        int rows = depth;
        String splittedText[][] = new String[rows][cols];
        int count,i,j;
        
        // i points the index of text
        // j points the column index
        // (i%depth) points the row index
        count = 0;j =0;
        for(i=0;i<length;i++){
            if(count == depth){
                j = 0;
                count = 0;
            }
            splittedText[i%2][j++] = Character.toString(text.charAt(i));
            count++;
        }

        // print the 2D array
        for (i = 0; i < length; i++) {
            for(j=0;j < depth;j++){
                System.out.println(splittedText[i][j]);
            }
        }

    }
    public static void main(String[] args){

        System.out.print("\n\t\t\t\t\tRAIL_FENCE CIPHER TECHNIQUEt: ");

        Scanner sc = new Scanner(System.in);

        System.out.print("\ntext: ");
        String text = sc.nextLine();

        System.out.print("\nDepth: ");
        int depth = sc.nextInt();

        new RailFence().encrypt(text, depth);
    }
}
