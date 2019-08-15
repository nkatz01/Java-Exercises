package generics;

public class Foo { // Foo is not parameterised

    public <T> T aMethod(T x) {
        // will not compile without <T> to indicate
        // that this is a parameterised method.
        return x;
    }

    public static void main(String[] args) {
        Foo foo = new Foo();
        int k = foo.aMethod(5);
        String s = foo.aMethod("abc");
       System.out.println(k); 
       System.out.println(s);
       FooBox fbx = new FooBox(foo); 
       //FooBox fbx = new FooBox(s); 
       System.out.println(fbx.toString());
      // System.out.println(s);
       
       
    }
}
