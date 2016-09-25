package bukuteleponahay;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Formatter;

public class FileMaker {

    private Formatter x, y;

    /** digunakan untuk membuat file. Jika sudah ada, tidak perlu dibuat lagi.
     *
     */
    public void buatfile() {
        try {
            x = new Formatter("D:\\bukutelponAHAY1.txt");
            y = new Formatter("D:\\bukutelponAHAY2.txt");
            System.out.println("File berhasil dibuat");
        } catch (Exception e) {
            System.out.println("File tidak dapat dibuat");
        }
    }
/** merupakan sebuah fungsi yang membantu menampilkan setiap baris dari file
 * 
 * @param baca berupa file yang akan di baca
 * @return 1 baris penuh dari txt
 */
    public String DisplayOrang(File baca) {
        String no = null;
        File bukutelpon = baca;
        if (!bukutelpon.exists() || !bukutelpon.canRead()) {
            System.out.println("File tidak ada");
        }
        try {
            int i = 0;
            BufferedReader in = new BufferedReader(new FileReader(bukutelpon));
            String line;
            while ((line = in.readLine()) != null) {
                i++;
                no += "\n " + line;
//                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("File tidak dapat terbaca");
            no += "File tidak dapat terbaca";
        }
        return no;
    }

    /** fungsi untuk mengisi baris kosong di akhir/paling bawah dalam sebuah txt.
     * 
     * @param baca file yang akan dibaca
     * @param tulis file yang akan di timpa + String fill
     * @param fill susunan String yang sudah diatur menjadi 1 baris
     * @return 
     */
    public String FillOrang(File baca, File tulis, String fill) {
        String n = null;
        File dibaca = baca;
        File ditulis = tulis;
        if ((!dibaca.exists() && !ditulis.exists()) || (!dibaca.canRead() && !ditulis.canRead())) {
            System.out.println("File tidak ada");
        }
        try {
            int i = 0;
            BufferedReader in = new BufferedReader(new FileReader(dibaca));
            BufferedWriter out = new BufferedWriter(new FileWriter(ditulis));
            String line;
//            System.out.println("File terbaca. Mohon tunggu sebentar");
            n = "File terbaca. Mohon tunggu sebentar";
            while ((line = in.readLine()) != null) {
                i++;
//                System.out.println(".");
                n += "\n .";
                out.write(line);
                out.newLine();
            }
            if ((line = in.readLine()) == null) {
                i++;
                out.write(i + ". " + fill);
                out.newLine();
            }
//            System.out.println("Berhasil!");
            n += "\n Berhasil!";
            in.close();
            out.close();
        } catch (Exception e) {
            System.out.println("File tidak dapat terbaca");
            n = "File tidak dapat terbaca";
        }
        return n;
    }

    public String getOrang(File baca, String cari) {
        String n = "";
        File bukutelpon = baca;
        if (!bukutelpon.exists() || !bukutelpon.canRead()) {
            System.out.println("File tidak ada");
        }
        try {
            int i = 0, j = 0;
            BufferedReader in = new BufferedReader(new FileReader(bukutelpon));
            String line;
//            System.out.print("Mohon tunggu sebentar ");
            while ((line = in.readLine()) != null) {
                i++;
                if (line.contains(cari)) {
                    System.out.println();
                    j++;
//                    System.out.println("ada di baris ke (" + i + ") " + line);
                    n += "\n ada di baris ke (" + i + ") " + line;
                } else if (line.contains(cari.toLowerCase())) {
                    System.out.println();
                    j++;
//                    System.out.println("ada di baris ke (" + i + ") " + line);
                    n += "\n ada di baris ke (" + i + ") " + line;
                } else if (line.contains(cari.toUpperCase())) {
                    System.out.println();
                    j++;
//                    System.out.println("ada di baris ke (" + i + ") " + line);
                    n += "\n ada di baris ke (" + i + ") " + line;
                } else if (line.contains(cari.substring(0))) {
                    System.out.println();
                    j++;
//                    System.out.println("ada di baris ke (" + i + ") " + line);
                    n += "\n ada di baris ke (" + i + ") " + line;
                } else if (line.contains(cari.trim())) {
                    System.out.println();
                    j++;
//                    System.out.println("ada di baris ke (" + i + ") " + line);
                    n += "\n ada di baris ke (" + i + ") " + line;
                } else if (line.contains(cari.replaceFirst("" + cari.charAt(0), ("" + cari.charAt(0)).toUpperCase()))) {
                    System.out.println();
                    j++;
//                    System.out.println("ada di baris ke (" + i + ") " + line);
                    n += "\n ada di baris ke (" + i + ") " + line;
                } else if (line.contains(cari.replaceFirst("" + cari.charAt(0), ("" + cari.charAt(0)).toLowerCase()))) {
                    System.out.println();
                    j++;
//                    System.out.println("ada di baris ke (" + i + ") " + line);
                    n += "\n ada di baris ke (" + i + ") " + line;
                }
            }
            if (j == 0) {
//                System.out.println("Pencarian tidak ditemukan");
                n += "\n Pencarian tidak ditemukan";
            }
//            System.out.println("Ada " + j + " pencarian");
            n += "\n Ada " + j + " pencarian";

        } catch (Exception e) {
//            System.out.println("File tidak dapat terbaca");
            n += "\n  File tidak dapat terbaca";
        }
        return n;
    }

    public void EqualityFile(File copy, File paste) {
        File dibaca = copy;
        File ditulis = paste;
        if ((!dibaca.exists() && !ditulis.exists()) || (!dibaca.canRead() && !ditulis.canRead())) {
            System.out.println("File tidak ada");
        }
        try {
            int i = 0;
            BufferedReader in = new BufferedReader(new FileReader(dibaca));
            BufferedWriter out = new BufferedWriter(new FileWriter(ditulis));
            String line;
            while ((line = in.readLine()) != null) {
                out.write(line);
                out.newLine();
            }
            in.close();
            out.close();
        } catch (Exception e) {
            System.out.println("File tidak dapat terbaca");
        }
    }
}
