package selfPractice.exception.message;

//program to print the exception information using printStackTrace() method
public class Test {
    public static void main (String[] args) {
        int a=5;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
    }
}

//program to print the exception information using toString() method
class GFG1 {
    public static void main (String[] args) {
        int a=5;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e.toString());
        }
    }
}

//program to print the exception information using getMessage() method
class GFG11 {
    public static void main (String[] args) {
        int a=5;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
