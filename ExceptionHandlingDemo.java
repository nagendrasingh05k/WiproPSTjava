public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        
        try {

            // Null Pointer Exception Example
            String str = null;
            System.out.println("Length of string: " + str.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after NullPointerException.");
        }

        try {

            // Array Index Out of Bounds Exception Example
            int[] arr = {1, 2, 3};
            System.out.println("Accessing element: " + arr[5]);  // This will throw ArrayIndexOutOfBoundsException

            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after ArrayIndexOutOfBoundsException.");
        }

        System.out.println("Program execution continues...");
    }
}