import javax.swing.*;
import javax.tools.JavaFileManager;
import java.io.File;
import java.util.Scanner;

public class FileOpen{
    static File f;
    static String s;
    FileOpen(String s){
        f = new File(s);
        if (f.exists()){
            System.out.println(f.getAbsolutePath());
        }else {
            System.out.println("File does not exist");
        }
    }
}
