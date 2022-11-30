package session;
/**
 * https://www.w3schools.com/java/java_files_create.asp
 */

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String[] studentName = {"Baiysh", "Saltanat", "Altynbek", "Samira"};
        System.out.println("Bizde massiv bar");
        System.out.println(Arrays.toString(studentName));

        try {
            System.out.println(studentName[4]);
            System.out.println("Java 8 is the best");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ushul exceptiondi karmaldy:  "+ e);
        }

        System.out.println("Bizdin bul codubuzudun exceptionga tieshesi jok");












//        try {
//            FileInputStream inputStream = new FileInputStream(file);
//            System.out.println("Java 8 is the best");
//        }catch (FileNotFoundException e){
//            System.out.println("Biz karmagan exception: "+ e);
//        }
//
//        System.out.println("Bul code exceptionga tiyeshesi jok");

    }
}
