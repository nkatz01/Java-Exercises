package generic2;

public class Bar<T> { // Bar is parameterised by T (class scope)
    public T aMethod(T x) {
        return x;
    }

    public <E> E bMethod(E x) {
        // <E> before the return type in the method declaration
        // means: E is a method-scoped type parameter
        return x;  // (so E is fresh for each new call to bMethod)
    }

    public static void main(String[] args) {
        Bar<Integer> bar = new Bar<Integer>();
        int k = bar.bMethod(5);
        String s = bar.bMethod("abc"); // compiles and runs fine
    }
}
