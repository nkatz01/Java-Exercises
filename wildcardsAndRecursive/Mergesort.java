package wildcardsAndRecursive;
import java.util.ArrayList;
import java.util.Arrays; 
import java.util.*; 

/**
 * Write a description of class mergeSorty here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mergesort
{
    // instance variables - replace the example below with your own
    private ArrayList<Integer> arr;
    private ArrayList<Integer> sortedArr;
    private int length; 
    /**
     * Constructor for objects of class mergeSorty
     */
    public Mergesort()
    {
        arr = new ArrayList<Integer>(Arrays.asList(100, 8, 4, 13, 99, 23, 17 ,7, 25 )); 
        sortedArr = new ArrayList<Integer>(); 
       length = arr.size();
      // System.out.println(length);
    }
    
    public void changeArrList( ArrayList<Integer> newArr){
        
        arr=newArr; 
    }

    public ArrayList<Integer> getArr(){
    return arr; 
    }
    public void setSortedArr(int sa){
    sortedArr.add(0,sa);
    //System.out.println(sortedArr);
    }
  
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] args){
        Mergesort ms = new Mergesort(); 
        // ms.setSortedArr((ms.getArr()).get(0));
        ms. mergeSort(0);
      
      
    }
    
    public ArrayList<Integer> mergeSort(int i)
    {
            
            
       // playArray.set(0,1 ,merge(arr.sortedArr(i),arr.get(j)));
           
        //int length = arr.size(); 
      if (length==1)
      return arr;//leave mergeSort() alltogether
      
      arr=merge(0,i+1); 
      // System.out.println(sortedArr);
      
      //sortedArr.addAll((mergeSort( i, j+1))); //inner loop
            
      length--;   
      return mergeSort(i+1) ;//leave intermediate calls
        
    }
    
     public  ArrayList<Integer>  merge(int a, int b)
    {
           
         
      if (b==(arr.size())) {  
          
          System.out.println(arr);
          return  arr ;
        }
      else {
         // System.out.println(sortedArr.get(a));
         if (arr.get(a)>arr.get(b)){
             //System.out.println(sortedArr.get(a));
          Collections.swap(arr, a,b) ;
            //System.out.println(sortedArr);
           
        }
        /*
        else {
           //  System.out.println(arr.get(b));
          sortedArr.add(sortedArr.size(),arr.get(b)) ;
         // System.out.println(sortedArr);
        } */
        }
        
        
       return merge( a,  (b+1));
       
         
    }
   // array =  new  ArrayList<Integer>(Arrays.asList(b,a)) ;
}
