import java.util.Scanner;

class Decrypt extends Encrypt{

    String decrypt(String text,int n){

        Scanner sc = new Scanner(System.in);
        int keyMatrix[][] = new int[n][n];
        int messageMatrix[] = new int[n];
        int cipherMatrix[] = new int[n];

        int x,i,j;

        // Input KEY matrix
        System.out.println("\nEnter Inverse Matreix: ");
        x = 0;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                keyMatrix[i][j] = sc.nextInt(); // modulo 65 gives index of alphabet in alphabet series starting from 0
                x++;
            }
        }

        // GENERATING TEXT Vector

        for (i = 0; i < n; i++) {
            messageMatrix[i] = (text.charAt(i)) % 65;
        }

        // Matrix Multiplication key(nxn) * text (nx1)
        // resulting Matrirx will be (nx1)

        for (i = 0; i < n; i++) {
            cipherMatrix[i] = 0;
            for (j = 0; j < n; j++) {
                cipherMatrix[i] += keyMatrix[i][j]*messageMatrix[j];                                     
            }
            cipherMatrix[i] = cipherMatrix[i]%26;
        }

        // Generating Encrypted Text

        String encrypted = "";
        
        for (i = 0; i < n; i++) {
            encrypted += (char)(cipherMatrix[i]+65);  // Implicit Type Casting         
        }

        System.out.println("\nDecrypted String as: "+encrypted);

        return encrypted;

    }
    public static void main(String[] args){}
}

