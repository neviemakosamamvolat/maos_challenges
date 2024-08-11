import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadAllFile {
    static FileReader r;
    static File f;
    ReadAllFile(String name)throws IOException {
        f=new File(name);
        if(f.exists()){
            r=new FileReader(f);
            int a=0;
            while(a!=1){
                var b=r.read();
                System.out.print((char)b);
                switch (b){
                    case -1:a=1;
                    default:continue;
                }
            }
        }
            r.close();
        }
    }
