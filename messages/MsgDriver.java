package messages;


/**
 * Write a description of class MsgDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MsgDriver
{
    // instance variables - replace the example below with your own
   public static void main(String[] args){
      // int[] str    =    {1,2};
        
         Msg[] msgs =   {new Post(), null, new Fax(), new Email()}; 
         System.out.println(totalCost(msgs));
          Msg[] nulmsgs= null; 
         System.out.println(totalCost(nulmsgs)); 
    }
    
   public static double totalCost(Msg[] msgs){
       double totalCost=0; 
       if (msgs==null)
       throw new IllegalArgumentException(); 
       for (Msg msg: msgs){
        if (msg!=null && (msg instanceof HasFee)){
       HasFee hf = (HasFee)msg; 
        totalCost+=hf.calcFee(); 
        
    }
        }
       return totalCost; 
       
   }
}
