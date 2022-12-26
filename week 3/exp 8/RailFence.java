import java.util.*;
import java.lang.Math;
class RailFence {

    void encrypt(String text, int depth){
        int length = text.length();
        int cols = Math.ceilDiv(length, depth);
        int rows = depth;
        System.out.println(length);
        System.out.println(rows);
        System.out.println(cols);
        char splittedText[][] = new char[rows][cols];
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
            splittedText[i%2][j++] = text.charAt(i);
            count++;
        }

        if (cols != (length/depth)){
            splittedText[rows-1][cols-1] = '*';
        }

        // print the 2D array
        try{
            for (i = 0; i < depth; i++) {
                for(j=0;j < length;j++){
                    System.out.print(splittedText[i][j]);
                }
                System.out.println();
            }
        }
        catch(Exception e){
            System.out.println(e.toString());
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
