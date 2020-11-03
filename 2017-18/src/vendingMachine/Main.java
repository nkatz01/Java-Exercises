package vendingMachine;

class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.fillUp(10);
        machine.insertToken();
        System.out.println("Token count: ");

        System.out.println(machine.countTokens());

        System.out.println("Can count: ");

        System.out.println(machine.countCans());
        System.out.println("");
        System.out.println("");

    }
}