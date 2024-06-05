public class Q5 {

        public static void main(String[] args) {
            // ArrayIndexOutOfBoundsException example
            try {
                int[] array = {1, 2, 3};
                System.out.println(array[3]); // This will throw an exception
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds: " + e.getMessage());
            }

            // StringIndexOutOfBoundsException example
            try {
                String str = "hello";
                System.out.println(str.charAt(5)); // This will throw an exception
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("String index out of bounds: " + e.getMessage());
            }
        }
    }


