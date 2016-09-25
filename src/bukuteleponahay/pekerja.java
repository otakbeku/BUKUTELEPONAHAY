package bukuteleponahay;
public class pekerja extends umum {
    private String kerja;
    pekerja() {
        super();
    }
    public void getKerja(String kerja) {
        this.kerja = kerja;
    }
    @Override
    public String UbahString() {
        return " " + kerja;
    }
}
