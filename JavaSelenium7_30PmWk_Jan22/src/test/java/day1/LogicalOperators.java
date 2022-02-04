package day1;
/* logical operators(<,>,<=,>=,==)(&&,||,!=)*/

public class LogicalOperators {
    public static void main(String[] args){

        int i=10;
        int y=30;
        int z=60;

        System.out.println(i<y && z>y); //true && true=true//
        System.out.println(i<z && y>z); //true && false=false//
        System.out.println(i<=y && z>=y); //true && true=true//
        System.out.println(i==y && y==z); //false && false=false//

        System.out.println(i<y || y<z); //true || true=true//
        System.out.println(i<z || z>i); //true || true=true//
        System.out.println(i>y || y>z); //true || false=false//
        System.out.println(y==z || i==z); //false || false=false//

        System.out.println(i==y);//false//

        String n1 = "Sony";
        String n2 = "Sinha";
        System.out.println("n1==n2");

        System.out.println(10!=20);

        System.out.println(n1+n2);//concatenation( adding two things)//
        System.out.println(i+n1);//adding string and integer//
        System.out.println(i+y);//adding two integer//
        System.out.println(n1+" "+n2);//space between characters//concatination




        }
}
