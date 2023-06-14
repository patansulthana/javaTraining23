import java.util.Scanner;
class PolymorphismExp{
void print(){System.out.println("Welcome");}
void print(String n){System.out.println("Welcome"+n);}
}
class Test{
public static void main(String args[]){
PolymorphismExp ob1=new PolymorphismExp();
ob1.print();
Scanner sc=new Scanner(System.in);
System.out.println("please type your name:");
String s=sc.next();
ob1.print(s);
}
}
