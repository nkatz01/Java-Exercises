package exam2018;


/**
 * Write a description of class Down here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Down extends Up {
 
public Down(String name) {
super(name);
}
public String getName() {
return super.getName()
+ " in the subclass";
}
public Object getObject() {
return "Hello";
}
}
