import java.util.Scanner;
class Pattern2{
public static void printLine(Char c, int col){
System.out.print();
for(int j=col;j>=1;j--)System.out.print(c);
}
public static void printPattern(char c, int n){
for(int i=n;i>=1;i--){
printLine(c,i);
}
}
public static void main(String args[]){
Scanner sc=new scanner(System.in);
Char ch=sc.next()CharAt(0);
int row=sc.nextInt();
printLine(ch,row);
}
}