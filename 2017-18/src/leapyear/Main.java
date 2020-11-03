package leapyear;

class Main {
    public static String computeLeap(int year){
        if ((year<0)|| (year>2018))
            return "year"+year+"isn\'t in the gorgian calendar";
        else{
            if ((year%4==0) && (year%100!=0))
                return "year"+year+"is a leap";
            else if (year%400==0)
                return "year"+year+"is a leap";
            else
                return "year "+year+" is not a leap";
        }
    }

    public static void main(String[] args) {
        System.out.println(computeLeap(2017));
    }
}