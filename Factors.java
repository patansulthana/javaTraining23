import java.util.Scanner;
class ReplaceAll{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
char ch=sc.next().charAt(0);
String s=sc.valueof(ch);
String rep=str.replaceAll(s);
System.out.print(rep);
}
}
