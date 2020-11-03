package personTutorStudent;

public class Student extends Person
{
    private String programme;

    public   String getProgramme()
    {
        return this.programme;
    }



    public String toString()
    {
        return "Student "+super.getName() + ", programme " + this.programme;
    }


    //constructor
    public Student(String name, int year, String programm)
    {
        super(name, year);
        this.programme = programm;
    }
}