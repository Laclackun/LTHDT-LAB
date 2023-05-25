class PhongMayTinh extends PhongHoc {
    private int soMayTinh;

    public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.soMayTinh = soMayTinh;
    }

    public int getSoMayTinh() {
        return soMayTinh;
    }

    public void setSoMayTinh(int soMayTinh) {
        this.soMayTinh = soMayTinh;
    }

    @Override
    public String toString() {
         return "___ PhongMayTinh ___\n" 
            "Ma Phong: " + getMaPhong() + "\n" +
            "Day Nha: " + getDayNha() + "\n" +
            "Dien Tich: " + getDienTich() + "\n" +
            "So Bong Den:" + getSoBongDen() + "\n" +
            "So May Tinh: " + soMayTinh + "\n" +
            "------------------------------------------";
     }
}
