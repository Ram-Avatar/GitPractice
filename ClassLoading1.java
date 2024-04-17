class A{
public void fun(){
System.out.println("Inside Fun of A");

}
A(){
System.out.println("A class construcor");
}
static
{
System.out.println("A is Loaded");
}
}
class B{
B(){
System.out.println("B class construcor");
}
static
{
System.out.println("B is Loaded");
}
}
class ClassLoading1{

 
public static void main(String[] args){
try{
Class c=Class.forName(args[0]);
System.out.println(c.getName());
A a=(A)c.newInstance();
a.fun();
}
catch(Exception e){
System.out.println(e);
}
 
//System.out.println(a.getClass().getName());
}
}