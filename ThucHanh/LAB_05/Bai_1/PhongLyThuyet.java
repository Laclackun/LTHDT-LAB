class PhongLyThuyet extends PhongHoc {
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
        return "PhongLyThuyet [maPhong=" + getMaPhong() + ", dayNha=" + getDayNha() + ", dienTich=" + getDienTich() + ", soBongDen=" + getSoBongDen() + ", coMayChieu=" + coMayChieu + "]";
    }
}
