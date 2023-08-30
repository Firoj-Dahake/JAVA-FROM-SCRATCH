import java.util.Scanner;

public class Example2 {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the string");
            char str=sc.next().charAt(1);


            for (char ch = 'A'; ch <= 'Z'; ch++) {
                 int serialNumber = ch - 'A' + 1;
                //System.out.println(ch + " -> " + serialNumber);
                if (ch==str){
                    System.out.println(ch+"->"+serialNumber);
                }
            }
        }
    }

