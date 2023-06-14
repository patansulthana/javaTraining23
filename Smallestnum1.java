import java.util.Scanner;
public class Smallestnum1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a,b,c;
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a<b&&a<c){
System.out.println(a+" is the smallest");}
if(b<a&&b<c){
System.out.println(b+" a is smallest");}
if(c<a&&c<b){
System.out.println(c+" a is smallest");}
}
}