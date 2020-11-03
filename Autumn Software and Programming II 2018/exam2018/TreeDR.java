package exam2018;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Write a description of class TreeDR here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TreeDR
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
 
//Tree twenty = new Tree(20);
/*
Tree[] leafs = {one, two, three, four};

for (Tree child: children){
    System.out.println(child.data); }
       t = children.get(index);
*/

Tree eight = new Tree(8); 
Tree[] eigt = {eight};  
Tree root = new Tree(9); 
root.addSubtree( eigt); 
ArrayList<Tree> childOfRoot = root.getCertainIndexChildren(1); 

Tree numberEightRef = childOfRoot.get(0); 

Tree five = new Tree(5); 
Tree six = new Tree(6);
Tree seven = new Tree(7); 
Tree[] lowerMiddle = {five, six, seven};
numberEightRef.addSubtree(lowerMiddle); 
ArrayList<Tree> childrenOfEight = numberEightRef.getCertainIndexChildren(3);  


Tree numberSixRef = childrenOfEight.get(1);
//System.out.println(numberSixRef.data);

Tree one = new Tree(1);  
Tree two = new Tree(2); 
Tree three = new Tree(3);
Tree four = new Tree(4);   
Tree[] bottom = {one, two, three, four};
numberSixRef.addSubtree(  bottom); 
ArrayList<Tree> childrenOfSix  = numberSixRef.getCertainIndexChildren(4 );

 
// Tree numberFourRef = childrenOfSix.get(3);
 //System.out.println(numberFourRef.data);
 
 /*for(Tree tr: childrenOfSix){
System.out.println(tr.data);
}*/
  System.out.println(root.getLeafValues());
root.addLeftMostLeaf(20);
  System.out.println(root.getLeafValues());
 Tree numberFiveRef = childrenOfEight.get(0);
 ArrayList<Tree> childrenOfFive  = numberFiveRef.getCertainIndexChildren(1 );
 for(Tree tr: childrenOfFive){
System.out.println(tr.data);
}
}

}
