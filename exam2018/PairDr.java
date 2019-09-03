package exam2018;
import java.util.ArrayList; 

/**
 * Write a description of class PairDr here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PairDr
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class PairDr
     */
    public static void main(String[] args)
    {
        ArrayList<Pair<String,Integer>> pairs = new ArrayList<>();
        pairs.add(new Pair<>("a",3));
        pairs.add(new Pair<>("b",1));
        pairs.add(new Pair<>("a",2));
        System.out.println(decode(pairs));
        
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("a");
        strings.add("a");
        strings.add("b");
        strings.add("a");
        strings.add("a");
        System.out.println(encode(strings));


       
    }

   public static <E> ArrayList<E> decode(ArrayList<Pair<E,Integer>> runLength){
    ArrayList<E> al = new ArrayList<>(); 
    for (Pair p: runLength){
    Integer n = (Integer)p.getSecond();
    for (int i=1; i<=n; i++){
       E e = (E)p.getFirst();
        al.add(e); 
    }
    
    }
    return al; 
    }
    
    public static <E> ArrayList<Pair<E,Integer>> encode(ArrayList<E> data){
        ArrayList<Pair<E,Integer>> al = new ArrayList<>(); 
        if (data.size()==0)
            return al; 
     int n = 1; 
     int i = 0;
     for ( i=0; i<(data.size()-1); i++){
        if (!(data.get(i).equals(data.get(i+1)))){
        al.add(new Pair(data.get(i),n)); 
        n=1; 
        
        }
        else
        n++;
        }
        System.out.println(i);
        al.add(new Pair(data.get(i),n));
        return al; 
    
    }
}
