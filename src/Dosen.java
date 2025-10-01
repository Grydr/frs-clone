public class Dosen {
    public Dosen(String nama, String nidn, String lab) {
        this.nama = nama;
        this.nidn = nidn;
        this.lab = lab;
    }

    public void printDosen() {
        System.out.println("NIDN    : " + this.nidn);
        System.out.println("Nama    : " + this.nama);
        System.out.println("Lab     : " + this.lab);
        System.out.println("======================");
    }

    public String nama;
    public String nidn;
    public String lab;
}