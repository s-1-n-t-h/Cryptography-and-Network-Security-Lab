import java.util.*;
import java.lang.Math;
class RailFence {

    void encrypt(String text, int depth){
        int length = text.length();
        int cols = Math.ceilDiv(length, depth);
        int rows = depth;
   
        char splittedText[][] = new char[rows][cols];
        int count,i,j;
        
        // i points the index of text
        // j points the column index
        // (i%depth) points the row index
        count = 0;j =0;
        for(i=0;i<length;i++){
            if(count == depth){
                j++; // shifiting j to point to next column
                count = 0; // re initialize count to avoid replacing the data 
            }
            splittedText[i%2][j] = text.charAt(i);  // 1. G O M R I G
                                                    // 2. O D O N N *
            count++;
        }

        if (cols != (length/depth)){
            splittedText[rows-1][cols-1] = '*';
        }

        // print the 2D array

        for (i = 0; i < rows; i++) {
            for(j=0;j < cols;j++){
                System.out.print(splittedText[i][j]);
            }
            System.out.println();
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
