public class Basic {
     // A STATIC VARIABLE
     static int a=42;

     // A STATIC METHOD
     static int Method(){
        System.out.println("Value of a is"+a);
        return a;
     }
      
     // A STATIC BLOCK
     static{
        System.out.println("Static block initialized.");
     }
    public static void main(String[] args) {
        System.out.println(Method());
    }
}
