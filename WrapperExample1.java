//wrapper class example: primitive to Wrapper
//java program to convert primitive into objects
//autoboxing example of int to interger
public class WrapperExample1{
public static void main(String args[]){
//converting int into Integer
int a=20;
Integer i=Integer.valueOf(a); //converting int into integer explicity
Integer j=a; //autoboxing, now complier will write interger.valueof(a) internally
System.out.println(a+" "+i+" "+j);
}
}