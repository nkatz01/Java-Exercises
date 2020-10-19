package exam2018;
import java.util.ArrayList; 
public class Pair<A,B> {
private A a;
private B b;
public Pair(A a, B b) {
this.a = a;
this.b = b;
}
public A getFirst() { return this.a; }
public B getSecond() { return this.b; }
public String toString() {
return "(" + this.a + "," + this.b + ")";
}
}