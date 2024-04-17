//Indirect read

class IndirectRead{
public static void main(String[] args){
System.out.println("Inside main method");
}
static{
fun();
}
public static void fun(){
System.out.println(i);
}
static int i=10;
}


/* Out put:

E:\Practice>javac IndirectRead.java

E:\Practice>java IndirectRead
0
Inside main method

*/