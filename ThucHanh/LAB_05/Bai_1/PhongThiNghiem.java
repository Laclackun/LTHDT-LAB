public class PhongThiNghiem extends PhongHoc {
    private String chuyenNganh;
    private int sucChua;
    private boolean coBonRua;

    public PhongThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen, String chuyenNganh, int sucChua, boolean coBonRua) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.chuyenNganh = chuyenNganh;
        this.sucChua = sucChua;
        this.coBonRua = coBonRua;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public int getSucChua() {
        return sucChua;
    }

    public boolean isCoBonRua() {
        return coBonRua;
    }

    @Override
    public String toString() {
        return "___ PhongLyThuyet ___\n" 
            "Ma Phong: " + getMaPhong() + "\n" +
            "Day Nha: " + getDayNha() + "\n" +
            "Dien Tich: " + getDienTich() + "\n" +
            "So Bong Den:" + getSoBongDen() + "\n" +
   
            "Chuyen Nganh:" + chuyenNganh +  "\n" +
            "Suc Chua=" + sucChua +  "\n" +
            "Co Bon Rua=" + coBonRua +  "\n" +

            "------------------------------------------\n";
    }
}
