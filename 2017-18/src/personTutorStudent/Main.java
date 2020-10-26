package personTutorStudent;

import java.util.Scanner;
public class Main //StudentTest
{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Tutor teacher1 = new Tutor("Mike", 2018, "BSc", 20.00 ,25.5);
        System.out.println(teacher1.toString());
        System.out.println(teacher1.getNumberOfTutors());
        Tutor teacher2 = new Tutor("Michael", 2017, "Masters", 25.00 ,25.5);
        System.out.println(teacher2.toString());
        System.out.println(teacher2.getNumberOfTutors());


        final int ARRAY_LENGTH = 10;
        Student[] studentObjectsArray = new Student[ARRAY_LENGTH] ;

        for (int i=0; i<studentObjectsArray.length; i++){
            String name;
            int year;
            String programme;
            System.out.println("Enter Student");
            name = input.nextLine();
            System.out.println("Enter year");
            Scanner inp = new Scanner(System.in);

            year = inp.nextInt();
            System.out.println("Enter programme");
            Scanner in = new Scanner(System.in);

            programme = in.nextLine();
            studentObjectsArray[i]= new Student(name, year, programme);  }
        System.out.println("The folowing students are enroled on a BSc ISM course");
        for(Student a:studentObjectsArray)
        {
            if   (    a.getProgramme().equals("BSc ISM"))
                System.out.println(a.getName());
        }





    }
}