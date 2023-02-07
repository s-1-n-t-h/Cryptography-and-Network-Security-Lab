import java.util.*;

class HillCipher extends Decrypt{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\ntext: ");
        String text = sc.nextLine();

        int n = text.length();

        System.out.print("\nkey: ");
        String key = sc.nextLine();

        String cipherText = new HillCipher().encrypt(key,text,n);

        //new HillCipher().decrypt(cipherText,cipherText.length())

    }
}