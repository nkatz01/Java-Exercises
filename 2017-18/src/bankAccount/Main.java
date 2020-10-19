package bankAccount;

class Main {
    public static void  main(String[] args) {
        CashRegister register1= new CashRegister("reg1");
        CashRegister register2= new CashRegister("reg1");

        register1.addItem(5.50);
        register2.addItem(5.50);

   /*
    System.out.println( register1.getTotal());
    System.out.println(register1.toString());
    System.out.println(register2.toString());
    //use the class'es static method
    System.out.println(CashRegister.changeClass(register2.getTotal()));

    //1 instance changing another instance
    register2.addItem(register1.getTotal());
    System.out.println( register2.getTotal());

     //change class variable from other class
   System.out.println( CashRegister.noOfRegisters);
   System.out.println(CashRegister.changeNoOfRegisters());
       CashRegister.noOfRegisters++;//CashRegister.noOfRegisters;
   System.out.println(CashRegister.noOfRegisters);
       System.out.println(CashRegister.getNoOfRegisters());

    System.out.println(CashRegister.changeNoOfRegisters());

System.out.println();

BankAccount BanAcc = new BankAccount("BanAcc");

CurrentAccount current1 = new CurrentAccount("curr1");

SavingsAccount current2 = new SavingsAccount("curr2", .5);



BanAcc.deposite(2.00);
System.out.println(BanAcc.getBalance());
 BanAcc.print();

current1.deposite(6.00);
current1.withdraw(3.00);
System.out.println(current1.getBalance());
 current1.print();

 current2.deposite(9.00);
System.out.println(current2.getBalance());
 current2.print();
current2.setInterestRate(.3);
 current2.print();

current3.print();

System.out.println(current3);

CashRegister register3 = new  CashRegister("reg3");
CashRegister register4 = register3;

System.out.println(register3.equals(register4) );*/

        CashRegister register3 = new CashRegister("reg3");
        CashRegister register4 = new CashRegister("reg4");
        register3.addItem(6);
        register4.addItem(6);
        register3.getTotal();
        register4.getTotal();
      //  System.out.println(register3.getTotal().compareTo(register4.getTotal()) );


    }
}