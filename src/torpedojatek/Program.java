package torpedojatek;

import java.util.Arrays;
import java.util.Scanner;

public class Program {

    public static String[] palya = new String[7];

    public static String kiir() {
        for (int i = 0; i < palya.length; i++) {
            palya[i] = "_";
        }
        System.out.println(Arrays.toString(palya));
        return "";
    }

    public static String lovesBeker() {
        int hajoTalalat = 0;
        int loves = 0;
        boolean hajo1 = true;
        Hajo hajo = new Hajo(new int[]{2, 3, 4});
        Scanner sc = new Scanner(System.in);
        while (hajo1 == true) {
            System.out.println("Lövés helye: 0-6");
            int beker = sc.nextInt();
            loves++;
            if (hajo.talalat(beker) == "talált") {
                hajoTalalat++;
                System.out.println("Találat"
                        + "");
            } else {
                System.out.println("Mellé");
            }
            if (hajoTalalat<=3) {
                hajo1=false;
                
            }
            
        }
        System.out.println("elsüllyedt");
        return "";
    }

    public static void main(String[] args) {
        kiir();
        lovesBeker();
    }
}
