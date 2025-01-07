public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Person person1 = new Person("John", 6);
        Person person2 = new Person("Dave", 5);
        person1.display();
        person2.display();
    }
}
