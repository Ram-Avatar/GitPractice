//Direct and Indirect read

class DIRead{
static int i=5;
static{
m1();
System.out.println(i); //this is direct read of i
}

public static void m1(){
 System.out.println(i);  // This is Indirect read
}
 public static void main(String[] args){
System.out.println("Inside main method");
}
}

/* Output:
E:\Practice>java DIRead
5
5
Inside main method
*/