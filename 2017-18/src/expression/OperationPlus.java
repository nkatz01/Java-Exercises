package expression;

public class OperationPlus   implements Expression{
        private Expression left;
        private  Expression right;
        private   String concat;
        public OperationPlus(Expression lef, Expression righ){
            this.left=lef;
            this.right=righ;
        }
        public String getValue(){
            return left.getValue()+" and "+right.getValue();}

        public String toString(){
            return right.toString()+ " " + left.toString() ;
        }

        public String getType(){
            if (right.getType()=="int" && left.getType()=="int")
                return left.getType();
            else if (right.getType()=="double" || left.getType()=="double" && (right.getType()!="String" && left.getType()!="String") )
                return "double";
            else if (right.getType()=="String" || left.getType()=="String")
                return "String";
            else
                return null;

        }




}
