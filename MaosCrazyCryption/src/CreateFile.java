import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class CreateFile {
    static File f;
    static File g;
    static String s;
    CreateFile(String name)throws IOException {
        f=new File(name);
        f.createNewFile();
        if (f.exists()){
            System.out.println(f.getAbsolutePath());
        }else {
            System.out.println("Something went wrong");
        }
    }
}
