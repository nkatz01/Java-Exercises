package romanNumbers;

/** Nuchem Katz 18/01/2018 **/
/** Roman Number system class **/
import java.util.Scanner;
class Main
{

    public static void main(String[] args)
    {
        System.out.println("Please enter a decimal year, between 1 and 3999, that you wish to convert to roman numerals : ");
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        if ((n>=1)&&(n<=3999)){
            int year=n;
            String romanOnes=romanDigit(n % 10, "I", "V", "X"); //module assures that only 'place 1's' value is passed as argument
            n=n/10; //reduces n to 100s
            String romanTens=romanDigit(n % 10, "X", "L", "C");
            n=n/10; //reduces n to 10s
            String romanHundreds=romanDigit(n % 10, "C", "D", "M");
            n=n/10; // reduces n to 1s
            String romanThousands=romanDigit(n % 10, "M", "M", "M"); //M can be repeated in all 3 since we've put a cap so that 4000 cannot be converted
            // output value returned from method
            System.out.println("Year " + year + " converted to Roman numerals is " + romanThousands+romanHundreds+romanTens+romanOnes);
        }
        else {
            System.out.println("The year that you've entered is either less than 1 or more than 3999");
        }


    }

    public static String romanDigit(int n, String one, String five, String ten){

        String roman="";

        if (n==1)
        {roman+=one;}
        else if (n==2)
        {roman+=one+one;}
        else if (n==3)
        {roman+=one+one+one;}
        else if (n==4)
        {roman+=one+five;}
        else if (n==5)
        {roman+=five;}
        else if (n==6)
        {roman+=five+one;}
        else if (n==7)
        {roman+=five+one+one;}
        else if (n==8)
        {roman+=five+one+one+one;}
        else if(n==9)
        {roman+=one+ten;}
        else; // if n==0, roman returns empty

        return roman;

    }
}



