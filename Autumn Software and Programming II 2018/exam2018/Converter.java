package exam2018;
import java.util.ArrayList; 

/**
 * Write a description of interface Converter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Converter<A, B> {
    
  B convert(A xs);  

public default ArrayList<B> convertAll(ArrayList<A> xs){
ArrayList<B> al = new ArrayList<>(); 
for (A a: xs)
al.add(convert(a)); 
return al; 
}
}
