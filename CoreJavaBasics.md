## Java Basics

1. Primitive Data Types
   ```
    1byte = 8 bits
    byte (1byte) 
    short (2byte) 
    int (4bytes)
    float (4bytes)
    double (8 byte)
    long (8 byte)
    boolean (1bit)
    char ( 2byte)

    Syntax: data-type variable-name = value
    Ex: 
    char sampleCharacter = 's';
    int sum = 0;
    float sumFloat = 2.3f;
   
    ```
   
3. Non Primitive Data types
        Classes
        Objects
        Interfaces
        Strings
        Arrays = [1,3,5,7,8]
        String sampleString = "Hello World!";


4. Math, Operations, Casting

Widening Casting: Converting smaller size to large byte--->short-->char-->int-->long-->float-->double
Narrowing Casting: Converting large size to small

int i = 5;
//Widening casting
double d = i;

long l = 123456789045l;
double d = (double)l;

4. Arithmatic operators
    Addition(+), subtraction(-), multiplication(*), division(/), Modulus(%), Increment(++), Decrement(--)
5. Comparison(<,> <=, >=, ==, !=) and Logical Operations and (&&)

Logical AND (&&) will be true only both conditions or all the conditions yield true

(a>b && a>c && a>d) { }

Logical Or ((a>b || a>c || a>d) )

Logical (!) (!(a>b))


6. Strings
 Ex: String greetingString = "Hello John!";
 String builder

7. If Else / Elseif Switch

```
Syntax:
if(condition1) {

} else if(condition) {

} else {

}
```

```
switch(expression) {

    case x:
    break;
    case y: 
    break;
    case z:
    break;
    default:
    //
}
```
8. for loop
```
for (int i =0; i< 10; i = i+2){

}
```

9. while, do while
```
while(condition) {

}

do {

}while(condition)
```

## Exercises

1. Print your name "Hello <Your Name>"
2. Write a program to print all data type variables
3. Update variable values in program2
4. Write a program to demonstrate type casting
5. Write a program to implement Math library functions
6. Write a program to demonstrate Arithmatic operations
7. Write a program to concatenate string parts into a line and print it.
8. Convert given string to uppercase
9. Write a program to print length of a new combined string
10. Write a origram to Convert Roman Number to Regular Number 

