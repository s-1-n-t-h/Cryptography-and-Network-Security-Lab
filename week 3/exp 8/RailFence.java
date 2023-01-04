import java.util.*;
import java.lang.Math;
class RailFence {

    String encrypt(String text, int depth){
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
            splittedText[i%depth][j] = text.charAt(i);  // 1. G O M R I G
                                                    // 2. O D O N N *
            count++;
        }
        // In case of any empty column like in above example
        if (cols != (length/depth)){
            splittedText[rows-1][cols-1] = '*';
        }

        // extracting Cypher Text
        String cypher = "";

        for (i = 0; i < rows; i++) {
            for(j = 0; j< cols; j++){
                cypher += splittedText[i][j];
            }
        }

        System.out.println("\nCypher text: "+cypher);
        return cypher;
        
    }

    void decrypt(String text, int depth){
        int length = text.length();
        int cols = Math.ceilDiv(length, depth);
        int rows = depth;

        String[] splitted = new String[depth]; // stores sub strings needed for decryption G OMRIG | ODONN*

        int offset = 0;
        for(int i =0; i<rows; i++){
            splitted[i] = text.substring(offset,offset+cols); // offset is updated for reaching next block's starting element
            offset += cols;
        }

        String actual = "";
        int k = 0;
        while( k!= cols){
            for (int i = 0; i < rows; i++) {
                    actual += splitted[i].charAt(k);
            }
            k++;
        }
        actual = actual.replace("*", "");
        System.out.println(actual);
        
    }
    public static void main(String[] args){

        System.out.print("\n\t\t\t\t\tRAIL_FENCE CIPHER TECHNIQUE: ");

        Scanner sc = new Scanner(System.in);

        System.out.print("\ntext: ");
        String text = sc.nextLine();

        System.out.print("\nDepth: ");
        int depth = sc.nextInt();

        String cypher = new RailFence().encrypt(text, depth);
        new RailFence().decrypt(cypher, depth);
    }
}
