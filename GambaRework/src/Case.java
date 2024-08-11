import java.time.LocalDateTime;
import java.util.*;

//potpm redi to do comparable
//v maine mzs spravit Arraylist<Case>kde to mozes sicko dat
public class Case{
    static Random rnd = new Random();
    public Rarity finalrar;
    public int mince;
    public String description;
    public LocalDateTime time;
    public int secret = 0;
    Case() {
        this.finalrar=Rarity.rarity();
        this.mince=rnd.nextInt(finalrar.origin, finalrar.bound);
        this.description=wisdom(finalrar);
        this.time=LocalDateTime.now();
        this.secret=secret;
    }
    public static Comparator<Case> comprar = (case1, case2) -> {
        if (case1.finalrar.power < case2.finalrar.power) {
            return 1;
        }
        if (case1.finalrar.power == case2.finalrar.power) {
            return 0;
        }
        return -1;
    };
    public static Comparator<Case> compcoins = (case1, case2) -> {
        if (case1.mince < case2.mince) {
            return 1;
        }
        if (case1.mince == case2.mince) {
            return 0;
        }
        return -1;
    };
    public static Comparator<Case> compsec = (case1, case2) -> {
        if (case1.secret < case2.secret) {
            return 1;
        }
        if (case1.secret == case2.secret) {
            return 0;
        }
        return -1;
    };
    public enum Rarity {
        THRASH(1,1,4,"Smradlave ponozky","Bobova OP vonafka","Stolen Mikina"),
        COMMON(2,4,9,"Hnisava Angina!!(hodnota iba sentimentalna)","Aksleho hodiny","Voucher na free miesto na gaucoch"),
        RARE(3,9,15,"Papita(karamelova)","Cvicne testy z UNIZA(neukradol som i swear)","Ukradnuty filament"),
        EPIC(4,15,40,"Papita(mliecna)","Karticka do Gewisu","Mariova stratena mikina(since 2 rocnik)"),
        LEGENDARY(5,40,90,"Papita(Jahodova)","Aksle the 3D muz","Ukradnute HDD"),
        MYTHICAL(6,90,100,"White Kinder Bueno","Mao da god of Java","Mariov semennik");
       public int power;
       public String[] desc;
       public int origin;
       public int bound;
        Rarity(int power,int origin,int bound,String... desc) {
            this.power = power;
            this.origin = origin;
            this.bound=bound;
            this.desc= desc;
        }
        public static Rarity rarity() {
            int gamba_chance = rnd.nextInt(0, 101);
            if (gamba_chance == 0 || gamba_chance == 1) {
                return Rarity.THRASH;
            } else if (gamba_chance > 1 && gamba_chance <= 60) {
                return Rarity.COMMON;
            } else if (gamba_chance > 60 && gamba_chance <= 80) {
                return Rarity.RARE;
            } else if (gamba_chance > 80 && gamba_chance <= 95) {
                return Rarity.EPIC;
            } else if (gamba_chance > 95 && gamba_chance <= 98) {
                return Rarity.LEGENDARY;
            } else
                return Rarity.MYTHICAL;
        }
    }
    public static String wisdom(Rarity rarity){
        switch(rarity){
            case THRASH -> {return(Rarity.THRASH.desc[rnd.nextInt(0,3)]);}
            case COMMON -> {return(Rarity.COMMON.desc[rnd.nextInt(0,3)]);}
            case RARE -> {return(Rarity.RARE.desc[rnd.nextInt(0,3)]);}
            case EPIC -> {return(Rarity.EPIC.desc[rnd.nextInt(0,3)]);}
            case LEGENDARY -> {return(Rarity.LEGENDARY.desc[rnd.nextInt(0,3)]);}
            case MYTHICAL -> {return(Rarity.MYTHICAL.desc[rnd.nextInt(0,3)]);}
            default -> {return "Iorem ipsum dolor amat";}
        }
    }

}
