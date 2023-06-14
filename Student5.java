class Student5{
int id;
String name;
int age;
Student5(int i, String n){
id=i;
name=n;
}
Student5(int i,String n,int a){
id=1;
name=n;
age=a;
}
void display(){System.out.println(id+""+name+""+age);}
public static void main(String args[]){
Student5 s1=new Student5(786,"Sullu");
Student5 s2=new Student5(999,"Rekh");
s1.display();
s2.display();
}
}

