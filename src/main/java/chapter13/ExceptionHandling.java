package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandling
{
    public static void main(String[] args) {
        createNewFile();
        numbersExeptionHandling();
    }
    public static void createNewFile(){
     File file = new File("resources/demo.txt");
        try{
            file.createNewFile();
        }catch (Exception e){
            System.out.println("Directory does not exists");
            e.printStackTrace();
        }
    }

    public static void numbersExeptionHandling(){
        File file = new File("resources/demo.txt");
        try {
            Scanner filereader = new Scanner(file);
            while (filereader.hasNext()){
                double num = filereader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

}
