package bukuteleponahay;
import java.io.File;
import java.util.Scanner;
public class BUKUTELEPONAHAY {
    static File fin = null;
    static File fout = null;
    static Runtime rt = Runtime.getRuntime();
    static int p = 0;
    public static void main(String[] args) {
        fin = new File("D:\\bukutelponAHAY1.txt");
        fout = new File("D:\\bukutelponAHAY2.txt");
        Scanner in = new Scanner(System.in);
        FileMaker fm = new FileMaker();
        umum ip = new umum();
        pelajar pl = new pelajar();
        pekerja pkr = new pekerja();
        int i = 0, j = 1;
        String cari = null, isi = null;
        boolean m = true;
        while (m == true) {
            displaymenu();
            i = in.nextInt();
            switch (i) {
                case 1:
                    System.out.println("==================================================================");
                    System.out.println("urutan : NO NAMA -TEMPAT TINGGAL -NO.TELP-EMAIL -PEKERJAAN");
                    System.out.println("===================================================================");
                    fm.DisplayOrang(fin);
                    break;
                case 2:
                    System.out.println("===================================================================");
                    System.out.print("Masukkan nama/tempat tinggal orang/pekerjaan : ");
                    cari = in.nextLine();
                    cari = in.nextLine();
                    fm.getOrang(fin, cari);
                    break;
                case 3:
                    System.out.println("===================================================================");
                    System.out.print("Nama panggilan: ");
                    ip.setNama(in.nextLine());
                    ip.setNama(in.nextLine());
                    System.out.print("Masukkan alamat : ");
                    ip.setAlamat(in.nextLine());
                    System.out.print("Masukkan Nomor telpon : ");
                    ip.setNotel(in.nextLine());
                    System.out.print("Masukkan alamat Email : ");
                    ip.setEmail(in.nextLine());
                    tanyaKerja();
                    isi = ip.UbahString();
                    if (p == 1) {
                        isi = isi + " Tidak/Belum Bekerja";
                        fm.FillOrang(fin, fout, isi);
                        fm.EqualityFile(fout, fin);
                        break;
                    }
                    if (p == 2) {
                        isi = isi + pl.UbahString();
                        fm.FillOrang(fin, fout, isi);
                        fm.EqualityFile(fout, fin);
                        break;
                    }
                    if (p == 3) {
                        System.out.print("Apa pekerjaan Anda? : ");
                        pkr.getKerja(in.nextLine());
                        isi = isi + pkr.UbahString();
                        fm.FillOrang(fin, fout, isi);
                        fm.EqualityFile(fout, fin);
                        break;
                    }
                    if (p != 1 && p != 2 && p != 3) {
                        System.out.println("SALAH!!");
                        break;
                    }
                    break;
                case 4:
                    System.out.println("===================================================================");
                    System.out.print("Input sandi rahasia : ");
                    isi = in.next();
                    if (isi.equals("bukafile!")) {
                        bukafile();
                        break;
                    } else {
                        System.out.println("Sandi salah");
                        break;
                    }
                case 5:
                    System.out.println("Terima Kasih :D ");
                    m = false;
                    break;
                default:
                    break;
            }
        }
    }
    public static void bukafile() {

        String file1 = "D:\\bukutelponAHAY1.txt";
        String file2 = "D:\\bukutelponAHAY2.txt";

        try {
            System.out.println("Mohon tunggu sebentar . . . ");
            Process buka1 = rt.exec("notepad " + file1);
            Process buka2 = rt.exec("notepad " + file2);
        } catch (Exception e) {
            System.out.println("File tidak ditemukan");
        }
    }
    public static void displaymenu() {
        System.out.println();
        System.out.println("===========================================");
        System.out.println("             BUKU TELEPON KOTA AHAY");
        System.out.println("===========================================");
        System.out.println("Selamat datang dalam buku telepon kota A");
        System.out.println("Silahkan pilh menu yang tersedia : ");
        System.out.println("1. Tampilkan isi bukunya!");
        System.out.println("2. Cari orang!");
        System.out.println("3. Input orang!");
        System.out.println("4. Buku file rahasia he he he");
        System.out.println("5. Keluar :( ");
        System.out.println("===========================================");
        System.out.print(" INPUT : ");
    }
    public static void tanyaKerja() {
        Scanner in = new Scanner(System.in);
        System.out.println("Apa status pekerjaan Anda ?");
        System.out.println("1. Belum/Tidak bekerja");
        System.out.println("2. Pelajar Sekolah/Mahasiswa/Pelajar Bimbel");
        System.out.println("3. Lain-lain");
        System.out.print("Pilih : ");
        p = in.nextInt();
    }
}
