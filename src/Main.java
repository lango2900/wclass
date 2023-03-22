public class Main {
    public static void main(String[] args) {

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Michael";
        //reference data types have been created via autoboxing above

        //unboxing example: treating reference as a primitive

        if (a == true) {

            System.out.println("This is true");


        }
    }
}




// wrapper class - provides a way to use primitive data types as reference data types
// reference data types contain useful methods
// can be used with collections (ex.ArrayList)


// primitives - boolean char int double
//wrapper - Boolean Character Integer Double

// autoboxing = the automatic conversation that the Java compiler makes between primitive types & their corresponding object wrapper classes
// unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
