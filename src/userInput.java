import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class userInput {
    public static void main(String[] args) {//Exception

       // System.out.println("Tacking input form the user");
        Scanner sc =new Scanner(System.in);//take input form keyboard

        System.out.println("Enter two number: ");
        System.out.println("Enter the first number");
        int a =sc.nextInt();
        System.out.println("Enter the second number");
        int b= sc.nextInt();
        int sum=a+b;
        System.out.println("Sum  of a and b is "+sum);

        //System.out.println("Enter your name");
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Your name is :"+name);


    }
}
//static allow to directly call the main method without create an object  of that class
//for integer sc.nextInt();
//for float sc.nextFloat();
//for String sc.next(); ---> only the one word from the string
//for String sc.nextLine(); ---> for all the word from the string
//to check whether the int/float/String data is entered sout(sc.hasNextInt(); /sc.hasNextFloat(); / sc.hasNextLine();
//to check sc.hasNextInt(); in boolean datatype to check the validity of value