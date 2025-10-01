import java.util.ArrayList;

public class DB {
    public DB() {
        mahasiswaArr = new ArrayList<Mahasiswa>();
        dosenArr = new ArrayList<Dosen>();
        matkulArr = new ArrayList<Matakuliah>();
        kelasArr = new ArrayList<Kelas>();

        mahasiswaArr.add(new Mahasiswa("Jalu Cahyo S", "5025241155", 3.2f));
        mahasiswaArr.add(new Mahasiswa("Christian von Koenigsegg", "5025241165", 3.8f));
        mahasiswaArr.add(new Mahasiswa("Mate Rimac", "5025241175", 2.9f));

        dosenArr.add(new Dosen("Albert Einstein", "5024314445", "RPL"));
        dosenArr.add(new Dosen("Nikola Tesla", "5024314455", "KCV"));
        dosenArr.add(new Dosen("Alexander Grahambell", "5024314465", "NETICS"));

        matkulArr.add(new Matakuliah("Pemrograman Web", 3));
        matkulArr.add(new Matakuliah("Pemrograman Berbasis Objek", 3));
        matkulArr.add(new Matakuliah("Jaringan Komputer", 4));

        kelasArr.add(new Kelas('A', 30, dosenArr.get(0), matkulArr.get(0)));
        kelasArr.add(new Kelas('B', 30, dosenArr.get(0), matkulArr.get(0)));
        kelasArr.add(new Kelas('A', 30, dosenArr.get(1), matkulArr.get(1)));
        kelasArr.add(new Kelas('B', 30, dosenArr.get(1), matkulArr.get(1)));
        kelasArr.add(new Kelas('A', 30, dosenArr.get(2), matkulArr.get(2)));
        kelasArr.add(new Kelas('B', 30, dosenArr.get(2), matkulArr.get(2)));
    }

    public ArrayList<Mahasiswa> mahasiswaArr;
    public ArrayList<Dosen> dosenArr;
    public ArrayList<Matakuliah> matkulArr;
    public ArrayList<Kelas> kelasArr;
}