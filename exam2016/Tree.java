package exam2016;
import java.util.ArrayList; 

/**
 * Write a description of class dsfsf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tree {
    private Tree left;
    private Tree right;
    public int value;

public Tree(Tree left, Tree right, int value) {
    
    this.left = left;
    this.right = right;
    this.value = value;
}

public  ArrayList<Integer> asList(){
    ArrayList<Integer> al = new ArrayList<>(); 
    if (right==null && left==null){
        al.add(value); 
        return al ;
    }
    else if (left!=null && right==null){
    al.addAll(left.asList()); 
    al.add(value); 
    return al; 

   }
   else if (left==null && right!=null){
    al.addAll(right.asList()); 
    al.add(value); 
    return al; 
    }
    else{
    al.addAll(left.asList()); 
    al.addAll(right.asList());
    al.add(value); 
    return al;
    }

}
 public Tree getMirrored(){
    Tree tree; 
    if (left==null && right==null){
      //    tree = new Tree(left, right, value); 
        return this; }
    else  if (left!=null && right==null)
       return new Tree(null, left.getMirrored() , value); 
    else if (left==null && right!=null)
     return new Tree(right.getMirrored(), null , value); 
    else
    return new Tree( right.getMirrored() , left.getMirrored() , value);
        
        
   } /* 
 public int deleteLeavesWith(int val){
    if (right==null & left == null){
    
   return 0;
   if   
}
        
}*/

public Tree getRight(){

return right; 
}
 
 
public Tree getLeft(){

return left; 
}


}
