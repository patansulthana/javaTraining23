class Author{
String authorName;
int age;
String place;
Author(String name,int age,String place)
{
this.authorName=name;
this.age=age;
this.place=place;
}
}
class Book{
String name;
int price;
Author auther;
Book(String n,int p, Author auther){
this.name=n;
this.price=p;
this.auther=auther;
}
public static void main(String args[]){
Author auther=new Author("sul",18,"USA");
Book b=new Book("java for beginner",700,auther);
System.out.println("Book Name:"+b.name);
System.out.println("Book price:"+b.price);
System.out.println(".......Auther Details......");
System.out.println("Auther Name:"+b.auther.authorName);
System.out.println("Auther Age:"+b.auther.age);
System.out.println("Auther Place:"+b.auther.place);
}
}