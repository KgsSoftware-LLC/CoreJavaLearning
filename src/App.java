public class App {

    public static void printName(){
        System.out.println("Hello, John!");
    }

    public static void printAllDataaTypes(){
        byte b = 1;
        short s = 1234;
        int i = 23;
        float f = 24.345f;
        long l = 12323545454355435l;
        double d = 123456.5678;

        System.out.println(" byte value b: "+b);
        System.out.println(" short value s: "+s);
        System.out.println(" int value i: "+i);
        System.out.println(" float value b: "+f);

        //Todo Print long and double values

        //Update values
        b = 2;
        s = 4321;
        i = 32;
        //Todo Update remaining variables and  print

        System.out.println("After updating Values");
        System.out.println(" byte value b: "+b);
        System.out.println(" short value s: "+s);
        System.out.println(" int value i: "+i);

        //Type casting

        s = b;
        i = (int)l;

        System.out.println("After Typecasting");
        System.out.println(" short value s: "+s);
        System.out.println(" int value i: "+i);

        //Math Operations
        int a = 2;
        int c = 3;

        System.out.println("a to the power of c : " +Math.pow(a, c));
        System.out.println("Min of a, c : " +Math.min(a, c));
        System.out.println("Square root of  : " +Math.sqrt(3));

        //Arithmatic operations
        System.out.println("Addition : " +(a+c));
        System.out.println("Subtraction : " +(c - a));
        System.out.println("Multiplcation : " +(a*c));
        System.out.println("Pre increment : "+ (++a));
        System.out.println("After pre increment : "+a);
        System.out.println("Post increment : "+ (a++));
        System.out.println("After post increment : "+a);

        //TOD Decrement oper

    }

    public static void stringConcatenation() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tell me and I forget");
        sb.append(" Tit for tat");
        sb.append(" Love me like you do");

        //toLowerCase
        //toUpperCase
        System.out.println("String from sting buiolder \n "+sb.toString().length());
    }


    public static void main(String[] args) throws Exception {
       //printName();
      // printAllDataaTypes();
       stringConcatenation();
    }
}
