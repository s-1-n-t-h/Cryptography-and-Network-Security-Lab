import java.util.*;

class HillCipher extends Encrypt{
    public static void main(String... args){
        
        System.out.print("\nInput Length of text: ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        System.out.print("\nInput text: ");
        String text = sc.nextLine();

        System.out.print("\nInput key: ");
        String key = sc.nextLine();

        new HillCipher().encrypt(key,text,n);

    }
}