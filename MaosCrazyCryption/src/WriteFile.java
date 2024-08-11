import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    static File f;
    static FileWriter w;
    WriteFile(String name,String text)throws IOException {
        f=new File(name);
        if(f.exists()){
            System.out.println("Task done successfully");
            w=new FileWriter(f);
            w.write(text);
            w.close();
        }else {
            System.out.println("An error occurred try again later");
        }
    }
}
