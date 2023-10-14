interface BaseI { void method(); }
class BaseC
{
public void method ()
{
System.out.println("Inside BaseC::method");
}
}
class Implc extends BaseC implements BaseI
{
public static void main(String []s)
{
//(new Implc()). method();
Implc sr=new Implc();
sr.method();
}
}