import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class WriteList {
    static FileWriter w;
    static File f;
    WriteList(String name,String[] list) throws IOException {
        f=new File(name);
        if(f.exists()){
            w=new FileWriter(f);
            w.write(Arrays.toString(list));
            System.out.println("Done");
            w.close();
        }
    }
}
