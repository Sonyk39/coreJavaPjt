package day2;

public class ExampleString2 {
    public static void main(String[] args){

        String city="United States of America";
        System.out.println(city.length());//counts character and space//
        System.out.println(city.contains("S"));//it contains S//
        System.out.println(city.startsWith("Uni"));
        System.out.println(city.endsWith("ite"));
        System.out.println(city.replace("U","u"));
        System.out.println(city.equals("United"=="united"));
        System.out.println(city.equals("USA"));
        System.out.println(city.toLowerCase());
        System.out.println(city.toUpperCase());
        System.out.println(city.equalsIgnoreCase("uNited STates OF AMErica"));




    }
}
