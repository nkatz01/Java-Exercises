package personTutorStudent;

public class Tutor extends Person{
    private Double ratePerHoure, hoursPerWeek;
    private   int employeeID;
    private String programme;
    public static int lastAssignedID=100;

    public Double getSalary()
    {
        return  ratePerHoure*hoursPerWeek;
    }
    public int getNumberOfTutors()
    {
        return lastAssignedID-100;
    }
    public int getEmployeeID()
    {
        return employeeID;
    }
    public String getProgramme()
    {
        return this.programme;
    }
    public String toString()
    {
        return "Tutor "+super.getName()+", with employee ID " + getEmployeeID() + ", joined at year" + super.getYear() + ", and earnes a salary per week of " + getSalary()+". He is teaching a " + this.programme + " course in Mathematics.";
    }
    public Tutor(String name, int year, String programme, Double rate, Double hours)
    {
        super(name,year);
        ratePerHoure=rate;
        hoursPerWeek=hours;
        lastAssignedID++;
        employeeID=lastAssignedID;
        this.programme=programme;
    }
}
