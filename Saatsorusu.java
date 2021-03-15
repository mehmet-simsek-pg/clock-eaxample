package SubatAyıSoruları;
public class Saatsorusu {
    public static void main(String[] args) {
        int hour=3;
        float hour1=1f;
        float hour2=2f/3;
        float hour3=5f/4;
        while (hour<1000){
            if ((hour1*hour)%12==0 && (hour2*hour)%12==0 && (hour3*hour)%12==0)
                break;
            hour++; }
        System.out.println(saat+" sonra tekrar aynı saati gösterirler");
    }
}
