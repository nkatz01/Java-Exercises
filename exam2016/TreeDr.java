package exam2016;


/**
 * Write a description of class TreeDr here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TreeDr
{
  public static void main(String[] args){
    Tree minusOne = new Tree(null, null, -1); 
    Tree eighteen = new Tree(minusOne, null, 18); 
    Tree three = new Tree(null, null ,3); 
    Tree fortyTwo = new Tree(three, eighteen, 42); 
    Tree minusEight = new Tree(null, null, -8); 
    Tree rootFifteen = new Tree(fortyTwo, minusEight, 15);
   // System.out.println(minusEight.getLeft().value);
   // System.out.println(minusEight.getRight().value);
     System.out.println(rootFifteen.asList()); 
     Tree treeMirrored = rootFifteen.getMirrored(); 
     System.out.println(treeMirrored.asList());
      System.out.println(treeMirrored.getLeft().value);
   System.out.println(treeMirrored.getRight().value);
  Tree mirFortyTwo = treeMirrored.getRight();
  
   Tree mirEighteen = mirFortyTwo.getLeft(); 
  System.out.println(mirFortyTwo.getRight().value);
   System.out.println(mirEighteen.getRight().value);
     // System.out.println(mirEighteen.test());
    }
}
