public class Kelas {
    public Kelas(char kodeKelas, int kuotaMax, Dosen dosen, Matakuliah mk) {
        this.kodeKelas = kodeKelas;
        this.kuotaMax = kuotaMax;
        this.kuotaNow = 0;
        this.dosen = dosen;
        this.matkul = mk;
    }

    public void printKelas() {
        System.out.println("Kode kelas  : " + this.kodeKelas);
        System.out.println("Kuota       : " + this.kuotaNow + "/" + this.kuotaMax);
        System.out.println("Dosen       : " + this.dosen.nama);
        System.out.println("Mata Kuliah : " + this.matkul.namaMatkul);
        System.out.println("======================");
    }

    public char kodeKelas;
    public int kuotaMax;
    public int kuotaNow;
    public Dosen dosen;
    public Matakuliah matkul;
}
