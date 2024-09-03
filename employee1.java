 import java.lang.*;
class employee1
{
int refno;
String refname;
employee1(int i, String n)
{
refno = i;
refname= n ;
}
employee1(employee1 e)
{
refno = e.refno;
refname = e.refname;
}
void display()
{
System.out.println(refno+""+refname);
}
public static void main(String[]args)
{
employee1 e1=new employee1(123,"raman");
employee1 e2= new employee1(e1);
e1.display();
e1.display();
}
}