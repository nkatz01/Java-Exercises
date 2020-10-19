package exam2016;
import java.util.ArrayList; 
import java.util.List; 
public interface Transformer<A, B> {
B transform(A item);


public static <A,B> ArrayList<B> transformList(Transformer<A,B> trafo, List<? extends A> items) {
    
    
    ArrayList<B> transformed = new ArrayList<B>(); 
    for (A item: items)
    transformed.add(trafo.transform(item)); 
    return transformed; 
}
}