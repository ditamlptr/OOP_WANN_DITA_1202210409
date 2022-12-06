public class Kapal extends TransportasiAir{
    protected String mesin;

    public Kapal(int jumlahKursi, int biaya, String mesin){
        super(jumlahKursi, biaya, mesin);
        this.mesin = mesin;
    }

    public void informasi(){
        System.out.println("Transportasi Air jenis kapal dengan kursi"+ jumlahKursi+ "ditetapkan dengan biaya sebesar"+biaya);
    }

    public void berlayar(){
        System.out.println();
    }

    public void berlayar(){
        System.out.println();
    }

    public void berlabuh(){
        System.out.println();
    }

}