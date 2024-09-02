import java.io.*;
public class FileManager {
    static BufferedReader br;
    static FileWriter fw;
    static FileReader fr;
    static File f;
    static File file;
    FileManager(File file){
        this.file =file;
    }
    public static void main(String[] args) throws IOException {
        createandgetfile("test.txt").write("ahojte cukrousci");
    }
    static FileManager openandgetfile (String filename){
        f=new File(filename);
        return new FileManager(f);
    }
    static FileManager createandgetfile (String filename) throws IOException {
        f=new File(filename);
        f.createNewFile();
        if(f.exists()){
            return new FileManager(f);
        }else return null;
    }
    void write (String text) throws IOException {
        fw=new FileWriter(f);
        fw.write(text);
        fw.close();
    }
    String read(int line) throws IOException {
        if(f.exists()) {
            br = new BufferedReader(fr = new FileReader(f));
            for (int i = 1; i <= line - 1; i++) {
                br.readLine();
            }
            return (br.readLine());
        }else return null;
    }
    String readall() throws IOException {
        br = new BufferedReader(fr = new FileReader(f));
        int lines=0;
        String b = "";
        while (lines==0){
             var a=br.readLine();
             if(a != null){
                 b = b +"\n"+ a;
             }else lines++;
        }
        return b;
    }
}