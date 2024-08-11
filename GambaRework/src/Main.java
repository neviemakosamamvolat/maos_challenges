import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Case> gamba = new ArrayList<>();
        while (true){
            System.out.println("sc= zoradenie podla poctu minci");
            System.out.println("sr= zoradenie podla vzacnosti");
            System.out.println("st= zoradenie podla casu");
            System.out.println("Chces hrat gambu?");
            System.out.println("y=yes/ano n=no/nie ");
            String a = sn.nextLine();
            if (a.equalsIgnoreCase("y")){
                Case cs = new Case();
                System.out.println(cs.finalrar + " " + cs.mince + " " + cs.description +" " + cs.time);
                gamba.add(cs);
                cs.secret++;
            } else if (a.equalsIgnoreCase("n")) {
                System.exit(0);
            }else if(a.equalsIgnoreCase("sr")){
                gamba.sort(Case.comprar);
                for(int i = 0;i< gamba.size();i++){
                    System.out.println(gamba.get(i).finalrar+","+gamba.get(i).mince+","+gamba.get(i).description+" "+gamba.get(i).time);
                }
            }else if(a.equalsIgnoreCase("sc")){
                gamba.sort(Case.compcoins);
                for(int i = 0;i< gamba.size();i++){
                    System.out.println(gamba.get(i).finalrar+","+gamba.get(i).mince+","+gamba.get(i).description+" "+gamba.get(i).time);
                }
            }else if(a.equalsIgnoreCase("st")){
                gamba.sort(Case.compsec);
                for(int i = 0;i< gamba.size();i++){
                    System.out.println(gamba.get(i).finalrar+","+gamba.get(i).mince+","+gamba.get(i).description+" "+gamba.get(i).time);
                }
            }else System.out.println("Invalid syntax");
        }
    }
}