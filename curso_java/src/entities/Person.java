package entities;

public class Person {
    private String NewName;
    private int NewAge;

    public Person(){}

    public Person(String NewName, int NewAge){
        this.NewName = NewName;
        this.NewAge = NewAge;
    }

    public String getName() {
        return NewName;
    }

    public int getAge() {
        return NewAge;
    }

    public void setName(String NewName) {
        this.NewName = NewName;
    }

    public void setAge(int NewAge) {
        this.NewAge = NewAge;
    }
}
