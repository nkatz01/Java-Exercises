package personTutorStudent;

public class Person{
    private String name;
    private int year;

    public String getName()
    {
        return this.name;
    }
    public int getYear()
    {
        return this.year;
    }
    public Person(String name, int year)
    {
        this.name=name;
        this.year=year;
    }
}