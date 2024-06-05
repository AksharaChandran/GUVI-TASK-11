public class TheoriticalAnswers {
   // 1. Four Access Modifiers in Java
    //public:
    //Class: Accessible from any other class.
    //Method/Variable: Accessible from any other class.
    //protected:
    //Class: Cannot be used for top-level classes.
    //Method/Variable: Accessible within the same package and subclasses.
    //default (no modifier):
    //Class: Accessible only within the same package.
    //Method/Variable: Accessible only within the same package.
    //private:
    //Class: Cannot be used for top-level classes.
    //Method/Variable: Accessible only within the same class.


    // 2. Difference between Exception and Error
    //Exception:

    //Indicates conditions that a reasonable application might want to catch.
   // Can be checked or unchecked.
            //Examples: IOException, NullPointerException.
           // Error:

   // Indicates serious problems that a reasonable application should not try to catch.
    //Always unchecked.
    //Examples: OutOfMemoryError, StackOverflowError.


//3. Difference between Checked and Unchecked Exception
    //Checked Exception:

    //Checked at compile-time.
    //The compiler ensures that these exceptions are handled.
    //Examples: IOException, SQLException.
    //Unchecked Exception:

   // Checked at runtime.
    //Includes RuntimeException and its subclasses.
          //  Examples: NullPointerException, ArrayIndexOutOfBoundsException.
}
