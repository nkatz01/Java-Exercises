package genericTypes;

import java.util.ArrayList;

public class Pair<T,G>{
    private T obT;
    private G obG;
    private Pair<T,G> Pair;


    public  Pair(T obT, G obG){
        this.obT=obT;
        this.obG=obG;
    }


    public Pair( Pair<? extends T, ? extends G > pairObj ){
        this(pairObj.obT, pairObj.obG);

// this.Pair=pairObj;
    }

    public <E> T getTcomponent(){
        return this.obT;
    }

    public <E> G  getGcomponent()
    {
        return this.obG;
    }

    public Pair returnPair(){
        return this.Pair;
    }
    @Override
    public String toString()
    {
        return "("+ this.getTcomponent()+", "+this.getGcomponent()+")";
    }

    public  Pair<G,T> swap(){
        Pair<G,T> newpair = new Pair<G,T>(this.obG,this.obT);
        return newpair;



    }

}