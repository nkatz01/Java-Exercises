package expression1;

public class Main implements   Expression{
    String val;
    String tp;
    public Main(int i){
        tp="int";
        val=""+i;
    }
    public Main(double d){
        tp="double";
        val=""+d;
    }
    public Main(String s){
        tp="String";
        val=s;
    }
    public String getValue(){return val;}
    public String getType(){return tp;  }
    public String toString(){
        return val+"@"+tp;
    }
    public static void main(String[] args) {
        Expression p1 = new OperationPlus(new Main(1), new Main(2.0));
        Expression p2 = new OperationPlus(p1, new Main("s"));
        System.out.println(p2.toString());
        System.out.println(p2.getType());
        System.out.println();
        Main p3 = new Main(2.0);
        Main p4 = new Main(6);
        Expression ex1 = new OperationPlus(p3,p4);
        System.out.println(ex1.getType());
        System.out.println(ex1.toString());
        System.out.println(p3.getType());
        System.out.println(p4.getType());
        System.out.println(p3.getValue());
        System.out.println(p4.getValue());
        Main p5= new Main(5);
        Main p6 = new Main(6);
        Expression exp2 = new OperationPlus(p6, p5);
        System.out.println(exp2.getType());
        System.out.println();


    }

}