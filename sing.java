class calculator{
int a;
void addition(int x,int y)
{
a=x+y;
System.out.println("sum:"+a);
}
void subtraction(int x,int y)
{
a=x-y;
System.out.println("difference:"+a);
}
}
class calculation extends calculator
{
int b;
void multiplication(int x,int y)
{
b=x*y;
System.out.println("multiplied value:"+b);
}
void division(int x,int y)
{
b=x/y;
System.out.println("division value:"+b);
}
}
class arith
{
public static void main(String[] arg)
{
calculation c1=new calculation();
c1.addition(3,2);
c1.subtraction(3,2);
c1.multiplication(3,2);
c1.division(3,2);
}
}
