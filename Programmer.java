class Programmer{
float Salary=40000;
}
class programmer extends Employee{
int bonus=10000;
public static void main(String args[]){
Programmer p=new Programmer();
System.out.println("Programmer Salary is:"+p.Salary);
System.out.println("Bonus Programmer is:"+p.Bonus);
}
}