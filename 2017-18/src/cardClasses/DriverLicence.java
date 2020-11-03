package cardClasses;
//package one;
import java.util.*;
public class DriverLicence extends IDcard{


    private int expirationYear;

    public DriverLicence(String name, String id, int expYr){
        super(name, id);
//this.iDnumber=id;
        this.expirationYear=expYr;
    }
    @Override
    public String format(){

        return  super.format() + "\nExpiration Year: " + this.expirationYear;
    }

    @Override
    public boolean isExpired(){
        GregorianCalendar calendar = new GregorianCalendar();
        if (calendar.get(Calendar.YEAR)>=expirationYear)
            return true;
        else return false;
    }

    @Override
    public String toString() {
        return super.toString()+ "[Expiration Year = " + this.expirationYear + "]"  ;
    }

    @Override
    public boolean equals(Object other) {
        if (super.equals(other) == true){
            DriverLicence driverlicence = (DriverLicence) other;
            Integer  y = this.expirationYear; //Wrapping going on
            Integer x = driverlicence.expirationYear; //wrapping going on
            if (this.iDnumber.equals(driverlicence.iDnumber) && y.equals(x)){
                return true;}
            else{
                return false; }
        }
        else{
            return false; }

    }

}