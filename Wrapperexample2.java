//java program to convert object into primitives
//unboxing example of interger to int
public class Wrapperexample2{
public static void main(String args[]){
//converting interger to int
Integer a=new Integer(3);
int i=a.intValue();  //converting interger to int explicity
int j=a;  //converting now compiler will write a.intValue() internally
System.out.println(a+" "+i+" "+j);
}
}