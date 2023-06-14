import java.util.Scanner;
public class Largestnum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a,b,c;
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>b&&a>c){
System.out.println(a+" is the greater");}
if(b>a&&b>c){
System.out.println(b+" a is  greater");}
if(c>a&&c>b){
System.out.println(c+" a is  greater");}
}
}