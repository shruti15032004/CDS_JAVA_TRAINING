import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVFile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        File file= new File("myFile.csv");
        try {
            if(file.createNewFile()){
                System.out.println("File is Created");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Enter The Students Nmae");
        try {
            FileWriter writer =new FileWriter(file);
            writer.write(scanner.nextLine());
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    }

