import java.util.Scanner;
public class CelsiusToFahrenheit{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the temperature in celsius:");
double celsius=sc.nextDouble();
double fahrenheit=(celsius*9/5)+32;
System.out.print(celsius+"degrees Celsius is equal to"+fahrenheit+"degrees Fahrenheit:");
}
}