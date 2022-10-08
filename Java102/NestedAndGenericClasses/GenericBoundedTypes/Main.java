package Java102.NestedAndGenericClasses.GenericBoundedTypes;

public class Main {
    public static void main(String [] args) {
        //Integer, Double, Float extends Number

        Integer a = null;
        String str = "abc";
        Nullable<Integer> n1 = new Nullable<>(a);
        n1.run();

        //Nullable<String> s1 = new Nullable<String>(str);
        // error: Type parameter 'java.lang.String' is not within its bound; should extend 'java.lang.Number'
    }
}
