package Stack;

public class wrapperClasses {
    // Long,Integer... inherits Number class and it's methods
    /* AutoBoxing :- Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and
      their corresponding object wrapper classes. For example, converting an int to an Integer

      unboxing:- Converting an object of a wrapper type (Integer) to its corresponding primitive (int) value is called unboxing.

       // one wrapper class cannot be converted into another wrapper class directly
        // use methods to convert one wrapperClass object into another . ex ->To convert an Integer object to a Long object in Java, you can use the longValue() method of the Integer class, which returns the value of the Integer object as a primitive long
        // longValue() :- This method is used to retrieve the numeric value of the object as a long primitive type.

     */

   // autobxing does not allow auto casting of smaller primitive types to larger primitive types  and explicit type casting also
    // but unboxing allows widening
    // () typecastOperator works only with primitive

    public static void main(String[] args) {


        // Long a =10;
        // long b = 2147483648655;

        Long a = (long) 15;







    }


}


/*
int b = 2*a-b;  :- compiler will need memory that is capable for storing 2*a-b
Please note that if the Long value is too large to fit into an int, the conversion will result in the lower 32 bits of the
Long, potentially leading to unexpected results
*/
