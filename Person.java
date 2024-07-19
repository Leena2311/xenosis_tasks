public class Person
{
    private String name;
    private int age;

    //Constructor
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    //Getter and Setter Method
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    //Display Information about the person
    public void displayDetails()
    {
        System.out.println("Name:-" + name);
        System.out.println("Age:-" + age);
    }
}


