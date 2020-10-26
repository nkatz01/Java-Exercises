package genericTypes;

public class MyString implements  Appendable<MyString> {

    public  MyString append(MyString a){
        return a;
    }
}