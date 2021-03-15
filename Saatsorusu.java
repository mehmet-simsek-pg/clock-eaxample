package SubatAyıSoruları;
public class Saatsorusu {
    public static void main(String[] args) {
        int saat=3;
        float saat1=1f;
        float saat2=2f/3;
        float saat3=5f/4;
        while (saat<1000){
            if ((saat1*saat)%12==0 && (saat2*saat)%12==0 && (saat3*saat)%12==0)
                break;
            saat++; }
        System.out.println(saat+" sonra tekrar aynı saati gösterirler");
    }
}
