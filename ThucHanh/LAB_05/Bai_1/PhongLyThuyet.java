public class PhongLyThuyet extends PhongHoc {
    private boolean coMayChieu;

    public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean coMayChieu) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.coMayChieu = coMayChieu;
    }

    public boolean isCoMayChieu() {
        return coMayChieu;
    }

    @Override
    public String toString() {
        return "___ PhongLyThuyet ___\n" 
            "Ma Phong: " + getMaPhong() + "\n" +
            "Day Nha: " + getDayNha() + "\n" +
            "Dien Tich: " + getDienTich() + "\n" +
            "So Bong Den:" + getSoBongDen() + "\n" +
            "Co May Chieu: " + coMayChieu + "\n" +
            "------------------------------------------";
    }
}
