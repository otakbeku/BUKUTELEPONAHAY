package bukuteleponahay;
public class umum {
    private String Nama, Alamat, Notel, Email;
    umum() {
    }
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
    public void setNotel(String Notel) {
        this.Notel = Notel;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }
    public String getNama() {
        return Nama;
    }
    public String getAlamat() {
        return Alamat;
    }
    public String getNotel() {
        return Notel;
    }
    public String getEmail() {
        return Email;
    }
    public String UbahString() {
        return (Nama + " " + Alamat + " " + Notel + " " + Email);
    }
}

