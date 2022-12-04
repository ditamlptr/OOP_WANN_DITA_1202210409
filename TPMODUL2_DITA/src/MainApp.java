public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat perangkat1 = new Perangkat("Adata",2,(float)1.80);
        Laptop laptop1 = new Laptop("Seagate", 8, (float)2.40, false);
        Handphone handphone1 = new Handphone("Sandisk",3,(float)2.20,false);

        perangkat1.informasi();
        System.out.println();
        laptop1.informasi();
        laptop1.bukaGame("genshin impact");
        laptop1.kirimEmail("ditaamlptrr@student.telkomuniversity.com");
        laptop1.kirimEmail("ditaamalia.p12@gmail.com","jakesim12@student.telkomuniversity.com");

        System.out.println();
        handphone1.informasi();
        handphone1.telfon(628509213);
        handphone1.kirimSMS(628778291, 628919982);
    }
}
