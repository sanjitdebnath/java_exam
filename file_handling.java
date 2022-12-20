import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class file_handling{
    public static void main(String[] args) {
        // creating a new file
        // File newfile = new File("text.txt");
        // try {
        //     newfile.createNewFile();
        // } catch (Exception e) {
        //     System.out.println(e);
        // }




        // write in to file
        // try {
            
        //     FileWriter writefile = new FileWriter("text.txt");
        //     writefile.write("hello this is my first time using file handling in java");
        //     writefile.close();
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }
        

        // read a file
        // File readfile = new File("text.txt");
        // try {
            
        //     Scanner sc = new Scanner(readfile);
        //     while(sc.hasNextLine())
        //     {
        //         String st = sc.nextLine();
        //         System.out.println(st);
        //     }
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }
        
        // deleting a file
        File readfile = new File("text.txt");
        try {
            if(readfile.delete())
            {
                System.out.println("file is deleted");
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}