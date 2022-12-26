class Encrypt {

    void encrypt(String key, String text,int n){

        int keyMatrix[][] = new int[n][n];
        int messageMatrix[] = new int[n];
        int cipherMatrix[] = new int[n];

        int x,i,j;

        // GENERATING KEY matrix
        x = 0;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                keyMatrix[i][j] = (key.charAt(x))%65; // modulo 65 gives index of alphabet in alphabet series starting from 0
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

        System.out.println("\nEncrypted String as: "+encrypted);


    }
    public static void main(String[] args){}
}

