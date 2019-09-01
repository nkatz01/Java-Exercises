package previousExams;
import java.util.ArrayList;

public interface Combiner<A, B, C> {
    
C combine(A x, B y);

public default ArrayList<C> crossCombine(ArrayList<A> a, ArrayList<B> b){
    ArrayList<C> cc = new ArrayList<C>(); 
    for (A w:a){
        
    for( B i:b){
        cc.add(combine(w,i)); 
    }
  }
  return cc; 

}

}