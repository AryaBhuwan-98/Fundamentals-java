public class Basic {
    public static void main(String[] args) {
        System.out.println("This is a simple command line program!");
        System.out.println("Your Command Line arguments are:"); // loop through all arguments and print it to the user 
        for (String str: args) {
          System.out.println(str);
        }
    }
}
