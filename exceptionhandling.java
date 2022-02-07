public class exceptionhandling {
    static void fun() throws IllegalAccessException {
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }

    public static void main(String args[]) {
        int a = 10, b = 5, c = 5, result;
        try {
            result = a / (b - c);
            System.out.println("result" + result);
            fun();
        } catch (IllegalAccessException e) {
            System.out.println("caught in main.");
        } catch (ArithmeticException e) {
            System.out.println("Exception caught:Division by zero");
        } finally {
            System.out.println("I am in final block");
        }
    }
}
