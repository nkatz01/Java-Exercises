package cardClasses;

//package one;
public class IDcard extends Card{

    protected String iDnumber;

    public IDcard(String name, String id){
        super(name);
        this.iDnumber=id;
    }

    @Override
    public String format(){

        return  super.format() + "\nID Number: " + this.iDnumber ;
    }

    @Override
    public String toString() {
        return super.toString()+ "[ID Number = " + this.iDnumber  + "]"  ;
    }

    @Override
    public boolean equals(Object other) {
        if (super.equals(other) == true){
            IDcard idcard = (IDcard) other;
            if (this.iDnumber.equals(idcard.iDnumber)){
                return true;}
            else{
                return false; }
        }
        else{
            return false; }

    }
}