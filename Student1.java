class Student1{
int rollno;//instance variable
String name;
static String collage="ITS";//static variable
//constructor
Student(int r,String n){
rollno=r;
name=n;
//method to display the values
Void display(){System.out.println(rollno+" "+name+" "+collage);}
}
}
public class TestStaticVariable{
public static void main(String args[]);{
Student s1=new Student(786,"SULTHANA");
Student s2=new Student(787,"REKHA");
Student.collage="M.T";
s1.display();
s2.display();
}
}
