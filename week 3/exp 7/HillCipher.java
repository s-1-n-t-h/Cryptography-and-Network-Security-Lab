import java.util.*;

class HillCipher extends Encrypt{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\ntext: ");
        String text = sc.nextLine();

        int n = text.length();

        System.out.print("\nkey: ");
        String key = sc.nextLine();

        new HillCipher().encrypt(key,text,n);

    }
}