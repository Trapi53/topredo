package torpedojatek;

public class TorpedoJatek {

    public static void main(String[] args) {
        System.out.println("Teszt");
        new TorpedoJatek().tesztLovesTalalt(4);
    }

    public String tesztLovesTalalt(int poz) {
        Hajo hajo = new Hajo(new int[]{2, 3, 4});
        String t = hajo.talalat(4);
        assert t == ("talált") : "nem jó a találat ellenőrzése";
        return "";
    }

}
