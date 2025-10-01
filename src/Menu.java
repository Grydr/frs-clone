import java.util.Scanner;

public class Menu {
    public Menu(DB db) {
        this.db = db;
        this.scanner = new Scanner(System.in);
    }

    public void show() {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("=== FRS CLONE ===");
            System.out.println("1. Ambil Kelas");
            System.out.println("2. Lihat Dosen");
            System.out.println("3. Lihat Mahasiswa");
            System.out.println("4. Lihat Mata Kuliah");
            System.out.println("5. Lihat Kelas");
            System.out.println("6. Keluar");
            System.out.print("Pilih: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    ambilKelas();
                    break;
                case 2:
                    lihatDosen();
                    break;
                case 3:
                    lihatMahasiswa();
                    break;
                case 4:
                    lihatMatkul();
                    break;
                case 5:
                    lihatKelas();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    isRunning = false;
                    break;
                default:
                    System.err.println("Invalid Input");
                    break;
            }
        }
    }

    private void ambilKelas() {
        System.out.println("Masukkan NRP: ");
        String nrpIn = scanner.nextLine();

        Mahasiswa exist = null;
        for (var mhs : this.db.mahasiswaArr) {
            if (mhs.nrp.equals(nrpIn)) {
                exist = mhs;
                break;
            }
        }
        if (exist == null) {
            System.err.println("Mahasiswa tidak ditemukan");
            return;
        }

        for (int i = 0; i < this.db.matkulArr.size(); i++) {
            System.out.println("Index: " + i);
            this.db.matkulArr.get(i).printMatkul();
        }
        System.out.print("Pilih Mata Kuliah: ");
        int matkulIdx = scanner.nextInt();
        scanner.nextLine();

        if (matkulIdx < 0 || matkulIdx >= db.kelasArr.size() || db.kelasArr.get(matkulIdx) == null) {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        Kelas kelasDipilih = this.db.kelasArr.get(matkulIdx);

        if (kelasDipilih.kuotaNow >= kelasDipilih.kuotaMax) {
            System.out.println("Kelas penuh");
            return;
        }

        int sksKelas = kelasDipilih.matkul.sks;
        if ((exist.sksAmbil + sksKelas) >= exist.sksBatas) {
            System.out.println("SKS melebihi batas");
            return;
        }

        kelasDipilih.kuotaNow++;
        exist.sksAmbil += sksKelas;

        System.out.println("Kelas berhasil diambil");
    }

    private void lihatDosen() {
        for (var ds : this.db.dosenArr) {
            ds.printDosen();
        }
    }

    private void lihatMahasiswa() {
        for (var ms : this.db.mahasiswaArr) {
            ms.printMahasiswa();
        }
    }

    private void lihatMatkul() {
        for (var mk : this.db.matkulArr) {
            mk.printMatkul();
        }
    }

    private void lihatKelas() {
        for (var kls : this.db.kelasArr) {
            kls.printKelas();
        }
    }

    private DB db;
    private Scanner scanner;
}