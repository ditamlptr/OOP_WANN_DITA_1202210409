public class Sampan extends TransportasiAir{
    protected int jumlahKursi, String biaya, int layar, int berlabuh;

    public Sampan(int jumlahKursi,String biaya,int layar){
        super(jumlahKursi, biaya, layar, berlabuh);
    }

    @Override
    public void informasi(){
        System.out.println("Transportasi Air jenis Sampan dengan kursi berjumlah" + jumlahKursi+ " ditetapkan dengan biaya sebesar"+ biaya);
    }

    @Override
    public void berlayar(){
        System.out.println("Transportasi Air jenis Sampan sedang berlayar menggunaan"+ layar + "layar");
    }

    @Override
    public void berlabuh(){
        System.out.println("Transportasi Air jenis Sampan berlabuh di pantai tanpa jangkar");
    }

    public void berlabuh(int berlabuh){
        System.out.println("Transportasi Air jenis sampan berlabuh di pantai menggunakan 2 jangkar");
    }
    
}
