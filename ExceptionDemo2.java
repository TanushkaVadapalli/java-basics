public class ExceptionDemo2 {
    public static void main(String[] args){
        try{
            int a = 10/2;
            int b = 10/0;
            System.out.println(a);
            System.out.println(b);


        }
        catch(ArithmeticException e){
            System.out.println("Dont do divide by 0");
        }
    }
}