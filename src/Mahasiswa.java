public class Mahasiswa {
    public Mahasiswa(String nama, String nrp, float ipk) {
        this.nama = nama;
        this.nrp = nrp;
        this.sksAmbil = 0;
        this.sksBatas = batasSks(ipk);
        this.ipk = ipk;
    }

    public void printMahasiswa() {
        System.out.println("NRP     : " + this.nrp);
        System.out.println("Nama    : " + this.nama);
        System.out.println("IPK     : " + this.ipk);
        System.out.println("SKS     : " + this.sksAmbil + "/" + this.sksBatas);
        System.out.println("======================");
    }

    private int batasSks(float ipk) {
        if (ipk >= 3.5) return 24;
        if (ipk >= 3.0) return 22;
        if (ipk >= 2.5) return 20;
        return 18;
    }

    public String nama;
    public String nrp;
    public int sksAmbil;
    public int sksBatas;
    public float ipk;
}