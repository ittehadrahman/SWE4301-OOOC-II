package assignment2.contentcoupling;

public class ContentCoupling {
    public class Person
    {
        public int age;
    }
    public void main(String[] args)
    {
        Person person=new Person();
        person.age = 21;
    }
}

// If any other class can directly access the content of another class, it is called content coupling.
// In this case, the main class changes the content or the attribute of the Person class.
