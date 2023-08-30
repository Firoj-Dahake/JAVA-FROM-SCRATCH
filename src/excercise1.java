import java.util.Scanner;

public class excercise1 {
    public static void main(String[] args) {
        /*Scanner sc= new Scanner(System.in);
        System.out.println("Enter the marks of the subjects");
        System.out.println("Enter the marks of math's ");
        float math=sc.nextFloat();
        System.out.println("Enter the marks of Science ");
        float Science=sc.nextFloat();
        System.out.println("Enter the marks of English ");
        float English=sc.nextFloat();
        System.out.println("Enter the marks of Sinskrit ");
        float Sinskrit=sc.nextFloat();
        System.out.println("Enter the marks of Gk ");
        float GK=sc.nextFloat();
        float total=(math+Science+English+Sinskrit+GK);
        float per=(total/5);
        System.out.println("The total percentage of the scudent is "+per);*/
        Scanner sc= new Scanner(System.in);
        byte s1= sc.nextByte();
        byte s2= sc.nextByte();
        byte s3= sc.nextByte();
        byte s4= sc.nextByte();
        byte s5= sc.nextByte();
        int total=s1 + s2+ s3+ s4+ s5;
        float per=(total/5);
        System.out.println("Your total percentage are: "+per);


    }
}
