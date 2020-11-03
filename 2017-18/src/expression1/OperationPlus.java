package expression1;

public class OperationPlus implements   Expression{
    Expression left; //not sure maybe change to type Main
    Expression right;

    public OperationPlus(Expression lef, Expression righ){//not sure maybe change types
        left=lef;
        right=righ;
    }
    public String getType(){
        String typeleft=left.getType();
        String typeright=right.getType();
        if( typeleft.equals("int") && typeright.equals("int"))
            return "int";
        else if (((typeleft.equals("int")) && (typeright.equals("double"))) || ((typeleft.equals("double" ))&& (typeright.equals("int"))))
            return "double";
        else if (typeleft.equals("String" )|| typeright.equals("String"))
            return "String";
        else return null; }


    public String toString(){
        return "("+left.toString() +" + "  +right.toString()+")";

    }
    public static void main(String[] args) {
        System.out.println( );
    }
}
