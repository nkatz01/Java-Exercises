package generics;

public class BoxDriver {
    public static void main(String[] args) {
        IntBox intBox = new IntBox(42);
        int x = intBox.getData();

        StrBox strBox = new StrBox("Hello");
        String s = strBox.getData();

     //   intBox = strBox;                     // Compile error
     //   int y = (Integer) strBox.getData();  // Compile error
    }
}
