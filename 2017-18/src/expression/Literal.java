package expression;

public class Literal implements Expression {
    private String val;
    private String tp;
    public  Literal(int val){
        tp="int";
        this.val=String.valueOf(val);
    }
    public   Literal(double val){
        tp="double";
        this.val=String.valueOf(val);

    }
    public   Literal(String val){
        tp="String";
        this.val=val;
    }
    public String toString(){
        return val+ "@"  + tp   ;
    }
    public String getValue(){
        return val;
    }
    public String getType(){
        return tp;
    }
}