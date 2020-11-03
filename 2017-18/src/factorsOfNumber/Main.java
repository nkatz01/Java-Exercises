package factorsOfNumber;

class Main
{
    public static void main(String[] args)
    {
        String s="1";
        int n=18;
        int i=2;
        while (i<=n)
        {
            if (n%i==0)
                s=s+" "+ i;

            i=i+1;
        }
        System.out.println("Result:" +s);
    }
}