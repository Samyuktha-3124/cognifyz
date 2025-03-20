import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Temperature: ");
        double temperature=scan.nextDouble();
        System.out.print("Enter unit:");
        String unit=scan.next();
        converted_temperature(temperature,unit);
    }
    public static void converted_temperature(double temperature, String unit){
        double temp;
        if(unit.equals("C")){
            temp= (temperature*9/5)+32;
            System.out.println(temperature + "°C is equal to " +temp +"°F");
        }
        else if(unit.equals("F")){
            temp= (temperature-32)*5/9;
            System.out.println(temperature + "°F is equal to " +temp +"°C");
        }
        else {
            System.out.println("Enter Valid Unit");
        }
    }
}
