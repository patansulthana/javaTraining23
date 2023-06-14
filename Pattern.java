import java.util.*;
public class pattern{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int n=sc.nextInt();
for(int i=0;i<=n;i++){
System.out.print(ch);
for(int j=1;j>n;j--){
System.out.print("#");
}
System.out.println();
}
}
}