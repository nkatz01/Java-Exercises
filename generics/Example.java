package generics;

public class Example<T> {
    void method(Object item) {
      //  if (item instanceof T) { ... }  // Compile error!
       // T anotherItem = new T();        // Compile error!
       // T[] itemArray = new T[10];      // Compile error!
    }
}
