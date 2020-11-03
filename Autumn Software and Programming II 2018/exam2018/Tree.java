package exam2018;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Write a description of class Tree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Tree {
    
    public int data;
    private ArrayList<Tree> children;

public Tree(int data) {
    this.data = data;
    this.children = new ArrayList<>();
}
public Tree(int data, Tree[] subtree){
    this( data); 
    for (Tree t: subtree) 
        children.add(t); 
    }
    
public ArrayList<Integer> getLeafValues(){
    ArrayList<Integer> integers = new ArrayList<>(); 
    if (children.size()==0){
         integers.add(data); 
         return integers;}
    for (Tree child: children)
        integers.addAll(child.getLeafValues()); 
    return integers; 
}

public void addLeftMostLeaf(int value){
    if (children.size()==0){
        children.add(new Tree(value));
        return; }
        else
        children.get(0).addLeftMostLeaf(value); 
        
        
}

/*public void addSubtreeToChild(int index, Tree[] subtree){
   Tree t = children.get(index); 
   for (Tree tree : subtree)
   t.children.add(tree); 
}*/
public   void addSubtree(  Tree[] subtree){
    
   for (Tree child : subtree)
    children.add(child); 
}
public ArrayList<Tree> getCertainIndexChildren(int size){
     ArrayList<Tree> al = new ArrayList<>(); 
if (children.size()==size) 
    
    return children ;  
 else {   
    for(Tree child : children)
         al =  child.getCertainIndexChildren(size); 
    }       
        return al;  
}
/*public Tree getCertainIndexRef(int value){
 
      for(Tree child : children) {
        if (child.data==value)
    return child;  
    else
 
       return child.getCertainIndexRef(value); 
    }
}*/


}
