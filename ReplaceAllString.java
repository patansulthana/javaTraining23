import java.util.Scanner;
class ReplaceAllString{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String c=sc.next();
String r=sc.next();
String rep=str.replaceAll(c,r);
System.out.print(rep);
}
}
