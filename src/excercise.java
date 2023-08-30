import java.util.Scanner;
import java.util.Random;
public class excercise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();

        System.out.println("We are going to play rock paper scissor");
        System.out.println("1--> Rock,2---> Paper , and 3---> Scissor ");
        int userinput=sc.nextInt();
        int computergenerateno= rd.nextInt(3);
        if (userinput==3 && computergenerateno==1 || userinput==3 && computergenerateno==2 || userinput==1 && computergenerateno==3){
            System.out.println("User got win");
        }
        else if (userinput==1 && computergenerateno==2 || userinput==2 && computergenerateno==3 || userinput==2 && computergenerateno==1){
            System.out.println("Computer Has Win");
        }
        else{
            System.out.println("Tiee");
        }


        System.out.println("UserInpur was: "+userinput);
        System.out.println("Computer generated no.: "+computergenerateno);

    }
}
