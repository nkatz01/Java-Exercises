package generics;

public class OldBoxDriver {
    public static void main(String[] args) {
        OldBox intBox = new OldBox(42);
        int x = (Integer) intBox.getData();

        OldBox strBox = new OldBox("Hello");
        String s = (String) strBox.getData();

        intBox = strBox;
        int y = (Integer) strBox.getData();
    }
}
