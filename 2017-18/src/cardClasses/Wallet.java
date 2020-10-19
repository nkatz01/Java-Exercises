package cardClasses;

public class Wallet {


        private Card Card1;
        private Card Card2;

        public Wallet(){
            this.Card1=null;
            this.Card2=null;
        }

        public void addCard(Card card){
            if (this.Card1==null)
                this.Card1=card;
            else if (this.Card1!=null)
                this.Card2=card;
            else  ;
        }


        public String format(){
            if (Card1!=null && Card2!=null)
                return "[Slot Card1: "+Card1.format()+ " | Slot Card2: "+ Card2.format()+"]";
            else if (Card1==null && Card2!=null)
                return "[Slot Card1: " + this.Card1 +" | Slot Card2: "+ Card2.format()+"]";
            else if (Card1!=null && Card2==null)
                return "[Slot Card1: "+Card1.format()+ " | Slot Card2: "+ this.Card2+"]";
            else
                return "[Slot Card1: "+this.Card1+ " | Slot Card2: "+ this.Card2+"]";

        }

}
