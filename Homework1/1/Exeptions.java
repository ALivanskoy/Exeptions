//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class Exeptions {
    public static void main(String[] args) {

        throwIndexOutOfВoundsException(new int[10]);
        throwArithmeticException(1);
        throwNumberFormatException("s");

    }

    public static void throwIndexOutOfВoundsException(int[] someArray) {
        try {
            System.out.println(someArray[someArray.length]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("First method throw \"" + e.getClass().getName()+"\" cause \""+e.getMessage()+"\"");
        }
    }

    public static void throwArithmeticException(int someNumber) {
        try {
            System.out.println(someNumber/0);
        } catch (ArithmeticException e) {
            System.out.println("Second method throw \"" + e.getClass().getName()+"\" cause \""+e.getMessage()+"\"");
        }
    }

    public static void throwNumberFormatException(String someString) {
        try {
            System.out.println(Integer.parseInt(someString));
        } catch (NumberFormatException e) {
            System.out.println("Third method throw \"" + e.getClass().getName()+"\" cause \""+e.getMessage());
        }
    }


}