class B{
A obj;
B (A obj){
this.obj=obj;
}
void display(){
System.out.println(obj.data);//using data member of A class;
}
}
class A{
int data=10;
A(){
B b=new B(this);//B b=new B(a);
b.display();
}
public static void main(String args[]){
A a =new A();
}
}
