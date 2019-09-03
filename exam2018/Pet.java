package exam2018;

public class Pet {
protected int x = 15;
public static int y = 2;
public Pet() { this(20);  }
public Pet(int z) { x = 25; y++; }
private void f() { x = 30; }
public void g(int x) { x = 35; }
public void g(Object o) { x = 40; }
public static void main(String[] args) {
Pet p1 = new Pet();
System.out.println("1  : " + y);
p1.f();
System.out.println("2 : " + p1.x);
Pet p2 = new Rabbit();
System.out.println("3 : " + y);
 
p2.f();
System.out.println("4 : " + p2.x);
p2.g("");
System.out.println("5 : " + p2.x);
try {
Rabbit r = (Rabbit) p2;
System.out.println("6 : " + y);
r.f();
System.out.println("7 : " + r.x);
r.g("");
System.out.println("8 : " + r.x);
r.h();
System.out.println("9 : " + r.x);
r.g(new Object());
System.out.println("10 : " + r.x);
} catch (ClassCastException e) {
System.out.println("CATCH : " + 50);
} catch (RuntimeException e) {
System.out.println("CATCH : " + 55);
} catch (Exception e) {
System.out.println("CATCH : " + 60);
} finally {
System.out.println("FINALLY : " + 65);
 
}
}
}
