package exam2016;

import java.util.HashSet;
public class Point {
private int x;
private int y;
public Point(int x, int y) {
this.x = x;
this.y = y;
}
@Override
public boolean equals(Object other) {
if (! (other instanceof Point)) {
return false;
}
Point p = (Point) other;
return this.x == p.x && this.y == p.y;
}
public static void main(String[] args) {
Point p = new Point(3, 4);
Point q = new Point(3, 4);
HashSet<Point> set = new HashSet<Point>();
set.add(p);
System.out.println( p.equals(q) );
System.out.println( set.contains(p) );
System.out.println( set.contains(q) );
}
}

