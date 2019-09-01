package previousExams;

public interface Combiner<A, B, C> {
    
C combine(A x, B y);

}