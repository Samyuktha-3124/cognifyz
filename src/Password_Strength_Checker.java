import java.util.Scanner;

public class Password_Strength_Checker {
    public static void main(String[] args) {
        System.out.println("Enter your password: ");
        Scanner scan=new Scanner(System.in);
        String password=scan.nextLine();

        if(password.contains(" ")){
            System.out.println("Invalid password\nEnter valid password");
            return;
        }
        boolean hasAtleast8Char=password.length()>=8;
        boolean hasUpperCase=false;
        boolean hasLowerCase=false;
        boolean hasDigit=false;
        boolean hasSpecialChar=false;

        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            if(Character.isUpperCase(ch)){
                hasUpperCase=true;
            }
            else if(Character.isLowerCase(ch)){
                hasLowerCase=true;
            }
            else if(Character.isDigit(ch)){
                hasDigit=true;
            }
            else{
                hasSpecialChar=true;
            }
        }
        boolean isStrongPassword= hasAtleast8Char && hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;

        if(isStrongPassword){
            System.out.println(password+ " is a Strong Password");
        }
        else{
            System.out.println(password+ " is a weak password.\nTo create a strong password, password should contain atleast\n   -->8 characters\n   -->One UpperCase letter\n   -->One LowerCase letter\n   -->One numeric]\n   -->One Special Character");
        }

    }
}
