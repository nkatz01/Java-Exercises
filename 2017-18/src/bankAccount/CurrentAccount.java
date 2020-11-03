package bankAccount;

public class CurrentAccount extends BankAccount {

    public CurrentAccount(String name){
        super(name);
    }
    public void print(){
        System.out.print("Current ");
        super.print();
    }

}