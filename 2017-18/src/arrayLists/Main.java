package arrayLists;
import java.util.Scanner;

import java.util.Arrays;
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        final int CUSTOMER_SIZE=5;
        String[] customerName = { "Cathy","Ben","Jeorge","Wandee","Freddie"};
        System.out.println(Arrays.toString(customerName));

        ArrayList<String> names = new ArrayList<String>();
        System.out.println(names);
        names.add("Alice");
        String[] t = {"Bob","Connie","David","Edward","Fran","Gomez","Harry","Anne"};
        for (int i=0; i<t.length; i++){
            names.add(t[i]);
        }
        System.out.println(names);
        System.out.println(names.get(0) + " " + names.get(names.size()-1));
        System.out.println(names.size());
        names.set(0,"Anne");
        System.out.println(names.get(0));
        System.out.println(names);
        names.add(4,"menche");
        System.out.println(names);
        for (String name:names){
            System.out.println(name);}
        ArrayList<String> names2 = new ArrayList<String>(names);
        names2.add(4,"frau");
        System.out.println(names2);
        names.remove("Anne");
        System.out.println(names);
        System.out.println(names2);
        ArrayList<String> list = new ArrayList<String>();
        list.add("P");
        list.add("Q");
        list.add("R");
        list.set(2,"s");
        list.add(2,"T");
        list.add("u");
        String[] words = {"alef", "bait", "gimel", "dalet"};
        list.addAll(Arrays.asList(words));

        System.out.println(list);
        ArrayList<String> nul = new ArrayList<String>();
        String[] word = {null};

        System.out.println(word.length);
        nul.add(null);
        System.out.println(nul.size());



        ArrayList<Integer> values = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value");
        int val = 0;
        int times=0;
        while (in.hasNextInt()){

            System.out.println("Enter value");
            val = in.nextInt();
            if (val!=-1){
                values.add(val);
                times++;}
            else
                break;

   /* if (in.nextInt()==-1){
          break;} */

        }
        System.out.println(values);
        System.out.println(times);
        double sum=0.0;
        int length = values.size();
        for (int value : values){
            sum+=value;
        }

        double mean = sum/length;
        System.out.println(mean);
        double StandDiviation=0.0;
        sum=0;//wipe the previous value in order to accumlate sum of odds
        for (int value : values){
            if (value%2==0)
                StandDiviation+=Math.pow(value-mean, 2);
            else
                sum+=value;

        }
        StandDiviation = Math.sqrt(StandDiviation/values.size()) ;
        System.out.println(StandDiviation);
        System.out.println(sum);
    }
}