package printBarChart;

public class Main {

    public static void printBarChart(int[] data, String[] lables) {
        double biggest = 0;
        // task 1: find the largest value bar
        for (double e:data){
            if (e>biggest)
                biggest=e;
        }
        biggest=biggest/40;
        //task 2 find largest lable
        int largestlable=0;
        int ast=0;
        for (String l:lables){
            if (l.length()>largestlable)
                largestlable=l.length();
        }
        //task 3 print out spaces followed by lables, followed by astr representing bars
        for (int j=0; j<lables.length; j++){
            for (int i=0; i<largestlable-lables[j].length(); i++)
                System.out.print(" ");
            System.out.print(lables[j]);
            System.out.print(" ");
            ast=(int)(data[j]/biggest);
            for (int i=0; i<ast; i++)
                System.out.print("*");
            System.out.println();
        }
    }




    public static void main(String[] args) {
        int[] data = {20,30,80,15};
        String[] lables={"Eygpt", "France", "Japan","Swtitzerland"};
        printBarChart(data,lables);
    }}