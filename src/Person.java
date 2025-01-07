public class Person {
 //Data members
    String name;
    int height;

    //Constructor
    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    //display function
    public void display(){
        System.out.println("Person Name: "+name+" and Height: "+height);
    }
}
