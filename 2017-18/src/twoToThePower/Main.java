package twoToThePower;

class Main {
    public static void main(String[] args) {
        long results=0;
        int base=2;
        System.out.println(base+"^0" +"="+1);//for base^0
        System.out.println(base+"^1="+ base);
        results=(base*base);
        System.out.println(base+"^2="+results);
        for (int exponent=3; exponent<=40; exponent++)
        {
            results=(results*base);
            System.out.println(base+"^" + exponent +"=" +results);
        }
    }

}
