package session;

import java.io.*;
import java.io.IOException;
import java.util.Scanner;


public class FileFromMukhammed {
    public static void main(String[] args) throws IOException {
        createNewFile();







    }

    public static void createNewFile(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the file name: ");
            String name = sc.nextLine();              //файлдын атын сактоо үчүн өзгөрмө аты
            FileOutputStream fos = new FileOutputStream(name, true);  // тиркеме режими үчүн чындык
            System.out.print("Enter file content: ");
            String str = sc.nextLine() + "\n";      //str биз киргизген сапты сактайт
            byte[] b = str.getBytes();       //сапты байттарга айлантат
            fos.write(b);           //байттарды файлга жазат
            fos.close();            //файлды жабуу
            System.out.println("file saved.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void createNewFile(String fileName){
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.(Файл мурунтан эле бар)(Файл уже существует)");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.(Ката кетти)(Произошла ошибка)");
            e.printStackTrace();
        }
    }


    public static void writeTextIntoTheFile(String fileName, String text){
        try {
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write(text);
            myWriter.close();
            System.out.println("Successfully wrote to the file.(Успешно записал в файл.)");
        } catch (IOException e) {
            System.out.println("An error occurred.(Ката кетти)(Произошла ошибка)");
            e.printStackTrace();
        }
    }

    public static void readFile(String fileName){
        try {
            File fileForJava8 = new File(fileName);
            Scanner myReader = new Scanner(fileForJava8);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.(Произошла ошибка).");
            e.printStackTrace();
        }
    }

    public static void deleteFile(String fileName){
        File fileForJava8 = new File(fileName);
        if (fileForJava8.delete()) {
            System.out.println("Deleted the file(Удалил файл)(Файл жок кылынды:): " + fileForJava8.getName());
        } else {
            System.out.println("Failed to delete the file(Не удалось удалить файл)(Файл жок кылынбай калды).");
        }
    }



}

