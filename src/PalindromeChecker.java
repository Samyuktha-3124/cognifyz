import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Word or Phrase:");
        String str1;
        str1=scan.nextLine();
        String str=str1.replaceAll("[^A-Za-z]+","");
        str=str.toLowerCase();
        boolean ans=isPalindrome(str);
        if(ans){
            System.out.println(str1+" is a Palindrome");
        }
        else{
            System.out.println(str1+ " is not a palindrome");
        }
    }
    public static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
