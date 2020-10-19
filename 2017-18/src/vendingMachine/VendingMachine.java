package vendingMachine;

public class VendingMachine {
    private int cans;
    private int tokens;

    public VendingMachine(){
        this(10);
        tokens=0;

    }

    public VendingMachine(int cans){
        this.cans=cans;
        this.tokens=0;

    }

    public int countCans( ){
        return cans;
    }
    public int countTokens (){
        return tokens;
    }

    public boolean insertToken(){
        if (cans>0){
            cans--;
            tokens++;
            return true; }
        else
            return false;

    }

    public void fillUp(int cans){
        this.cans+=cans;
    }
}
