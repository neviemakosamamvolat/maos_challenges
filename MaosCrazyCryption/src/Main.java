import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args)throws IOException {
       System.out.println("1.Open file");
       System.out.println("2.Create file");
       System.out.println("3.Write file");
       System.out.println("4.Read whole file");
       System.out.println("5.Read line");
       System.out.println("6.Write list");
       String answer = sn.nextLine();
       if(answer.equalsIgnoreCase("1")){
           System.out.println("Name of file: ");
           new FileOpen(sn.nextLine());
       }else if(answer.equalsIgnoreCase("2")) {
           System.out.println("Name of file: ");
           new CreateFile(sn.nextLine());
       }else if(answer.equalsIgnoreCase("3")) {
           System.out.println("Name of file: ");
           new WriteFile(sn.nextLine(),sn.nextLine());
       }else if(answer.equalsIgnoreCase("4")) {
           System.out.println("Name of file: ");
           new ReadAllFile(sn.nextLine());
       }else if(answer.equalsIgnoreCase("5")) {
           System.out.println("Name of file: ");
           new ReadSingle(sn.nextLine(), sn.nextInt());
       }else if(answer.equalsIgnoreCase("6")) {
           System.out.println("Message: ");
           String b=sn.nextLine();
           String[] strings=null;
           strings=b.split(" ");
           System.out.println("File name: ");
           new WriteList(sn.nextLine(),strings);
       }else {
           System.exit(0);
       }
    }
}