class Student{
int rollno;
String name;
static String collage="ABC";
static void change(){
collage="cd";
}
Student(int i,String n){
rollno=r;
name=n;
}
void display(){
void display(){
System.out.println(rollno+" "+name+" "+collage);
}
public class TestStaticMethod{
public static void main(String args[]){
Student.change();
Student s1=new Student1(777,"SUL");
Student s2=new Student1(786,"REK");
Student s3=new Student1(796,"SR");
s1.display();
s2.display();
s3.display();
}
}

