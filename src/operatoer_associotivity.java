public class operatoer_associotivity {
    public static void main(String[] args) {
    int a=6*5-34/2;
    /* 6*5=30
       34/2=17
       30-17=13
     */
     int b=6/5-34*2;
    /* 6/5=1       * Actual 6/5=1
       34*2=68              1-34=-33
       1-68=67              -33/2=-16
     */
        System.out.println(a);
        System.out.println(b);
    }
}
//Type of operator
//--> 1) Arithmeic operators -----> +,-,*,/,%,++,--
//--> 2) Assignment Operators ----> =,+=
//--> 3) Camparrison Operators ---> ==, >=, <=
//--> 4) Logical Operators    ----> &&, || ,!
//--> 5) Bitwise OPerator     ----> &,|

//Associotivity  ==
/*
Precedence of Operator == bada hona
/ and * --> same precedence
+ and - ---> same precedence
and in another condition From Left to Right



*/