import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Password length: ");
        int length=scan.nextInt();
        System.out.println(password_gen(length));
    }
    static char[] password_gen(int length){
        String capital_letters="QWERTYUIOPLKJHGFDSAZXCVBNM";
        String small_letters  ="qwertyuioplkjhgfdsazxcvbnm";
        String numbers   ="1234567890";
        String symbol ="<>/@#$%^&*{}[]()!";
        String values=capital_letters+small_letters+numbers+symbol;
        Random random=new Random();
        char[] password=new char[length];
        for(int i=0;i<length;i++){
            password[i]=values.charAt(random.nextInt(values.length()));
        }
        return password;
    }
}
