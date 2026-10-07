public class Person {
    private double height;

    public Person(double height){
        this.height = height;
    }

    public boolean equals(Person p){
        return this.height == p.height;
    }

}
