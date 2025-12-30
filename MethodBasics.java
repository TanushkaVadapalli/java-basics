public class MethodBasics {
    int add() {
        int a = 10;
        int b = 20;
        return a + b;
    }

    public static void main(String[] args) {
        MethodBasics obj = new MethodBasics();
        int result = obj.add();
        System.out.println(result);
    }
}
