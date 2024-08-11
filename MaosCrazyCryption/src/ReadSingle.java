import java.io.*;

public class ReadSingle {
    static BufferedReader br;
    static File f;
    static FileReader fr;
    ReadSingle(String name,int line) throws FileNotFoundException, IOException {
        f= new File(name);
        if(f.exists()){
            br=new BufferedReader(fr=new FileReader(f));
            for(int i =1;i<=line-1;i++){
                br.readLine();
            }
            System.out.println(br.readLine());
        }
    }
}
