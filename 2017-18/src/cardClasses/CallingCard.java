package cardClasses;



    //package one;
    public class CallingCard extends Card{

        private String cardNumber;
        private String PIN;

        public CallingCard(String name, String cardNumber, String pin){
            super(name);
            this.cardNumber=cardNumber;
            this.PIN=pin;

        }

        @Override
        public String format(){

            return  super.format() + "\nCard Number: " + this.cardNumber + "\nPin: " + this.PIN;
        }

        @Override
        public String toString() {
            return super.toString()+ "[Card Number = " + this.cardNumber + " Pin = " + this.PIN + "]"  ;
        }

        @Override
        public boolean equals(Object other) {
            if (super.equals(other) == true){
                CallingCard callingcard = (CallingCard) other;
                if (this.cardNumber.equals(callingcard.cardNumber) && this.PIN.equals(callingcard.PIN)){
                    return true;}
                else{
                    return false; }
            }
            else{
                return false; }

        }//end of equal method






}
