import java.util.Scanner;

public class Trans {



    public static void main(String[] args) {
        int k = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the message:");
        String msg = new String(sc.next());
        int n = msg.length();
        if (n % 5 != 0) {
            for (int i = 0; i < (5 - (n % 5)); i++) {
                msg += "z";
            }
            n = n + (5 - (n % 5));
        }
        char[] msg1 = new char[n];
        msg1 = msg.toCharArray();
        char[][] temp = new char[n / 5][5];
        for (int i = 0; i < n / 5; i++) {
            for (int j = 0; j < 5; j++) {
                temp[i][j] = msg1[k];
                k++;
            }
        }
        char[][] temp1 = new char[n / 5][5];
        char[][] temp2 = new char[n / 5][5];
        int[] k1 = {2, 0, 3, 4, 1};
        int[] k2 = {3, 1, 4, 0, 2};
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < n / 5; j++) {
                temp1[j][i] = temp[j][k1[i]];
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < n / 5; j++) {
                temp2[j][i] = temp1[j][k2[i]];
            }
        }
        String ct = "";
        for (int i = 0; i < n / 5; i++) {
            for (int j = 0; j < 5; j++) {
                ct += temp2[i][j];
            }
        }
        System.out.println("After Encryption:\n" + ct);

        char[][] temp11 = new char[n / 5][5];
        char[][] temp12 = new char[n / 5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < n / 5; j++) {
                temp11[j][k2[i]] = temp2[j][i];
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < n / 5; j++) {
                temp12[j][k1[i]] = temp11[j][i];
            }
        }
        String pt = "";
        for (int i = 0; i < n / 5; i++) {
            for (int j = 0; j < 5; j++) {
                pt += temp12[i][j];
            }
        }
        System.out.println("After Decryption:\n" + pt);
    }
}
