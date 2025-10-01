public class Matakuliah {
    public Matakuliah(String nama, int sks) {
        this.namaMatkul = nama;
        this.sks = sks;
    }

    public void printMatkul() {
        System.out.println("Mata Kuliah : " + this.namaMatkul);
        System.out.println("SKS         : " + this.sks);
        System.out.println("======================");
    }

    public String namaMatkul;
    public int sks;
}