package frequentFlyer;

class Main {
    int accountNumber;
    int points;
    int pointsFromYearStart;
    int tier;
    public Main (int account){
        accountNumber=account;
        points=0;
        pointsFromYearStart=0;
        tier=0;
    }
    public int getAccount(){ return accountNumber;}
    public int getBalance(){return points;}
    public int getTier(){return tier;}
    public void addFlights(int miles){
        points+= (tier==0)? miles: (int)(miles*1.25);
    }
    public void endOfYear(){
        if (pointsFromYearStart>10000)
            tier=1;
        pointsFromYearStart=0;
    }
    public boolean redeemPoints(int points){
        if (this.points>=points){
            this.points-=points;
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        Main GimmiKatz= new Main(1238374);
        System.out.println(GimmiKatz.getAccount());
        GimmiKatz.addFlights(13000);
        System.out.println(GimmiKatz.getBalance());
        GimmiKatz.endOfYear();
        System.out.println(GimmiKatz.getTier());
        System.out.println(GimmiKatz.redeemPoints(10000));
        System.out.println(GimmiKatz.getBalance());

    }
}