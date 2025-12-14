package com.training;

public class operatorsAndExpressions {
        public static void main(String[] args) {
            int a=10;
            int b=12;
            int c=a+b;
            int d=a-b;
            int e=a*b;
            int f=a%b;
            int g=a/b;
            //arithematic
            System.out.println(" A value  is : "+a);
            System.out.println(b);
            System.out.println(" addition is : "+c);
            System.out.println(" subtraction is : "+d);
            System.out.println(" multiplication is : "+e);
            System.out.println(" division  is : "+f);
            System.out.println(" quotient is : "+g);

            //logical
            System.out.println("checking using and operator : "+((a>5)&&(b<20)));
            System.out.println("checking using and operator : "+((a>15)&&(b<20)));
            System.out.println("checking using or operator : "+((a>5)||(b>20)));
            System.out.println("checking using or operator : "+((a<5)||(b<20)));
            System.out.println("checking using not operator : "+!(a<b));

            //relational
            System.out.println("checking that a>b :"+(a>b));
            System.out.println("checking that a<b :"+(a<b));
            System.out.println("checking that a and b are equal :"+(a==b));
            System.out.println("checking that a and b are not equal :"+(a!=b));
        }
}
