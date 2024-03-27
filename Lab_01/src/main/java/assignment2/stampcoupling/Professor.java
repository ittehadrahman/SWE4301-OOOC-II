package assignment2.stampcoupling;

public class Professor {
    public String Name;
    public int age;
    public int salary;
    public int bonus;
    public Professor( Faculty faculty, int bonus)
    {
        this.age= faculty.age;
        this.Name = faculty.Name;
        this.salary = faculty.salary;
        this.bonus= bonus;
    }
}
// A parameter of an object of Faculty class in passed into the constructor of Professor class
// The Professor class is highly dependent on the Faculty class