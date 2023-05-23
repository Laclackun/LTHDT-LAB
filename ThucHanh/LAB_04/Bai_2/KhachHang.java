/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_04.Bai_2;

/**
 *
 * @author TAMTRAN
 */
import java.util.ArrayList;
import java.util.List;

class KhachHang {
    protected String maKhachHang;
    protected String hoTen;
    protected NgayThang ngayRaHoaDon;
    protected double thanhTien;

    public KhachHang(String maKhachHang, String hoTen, NgayThang ngayRaHoaDon) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.ngayRaHoaDon = ngayRaHoaDon;
        this.thanhTien = 0;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void tinhThanhTien() {
        // Được triển khai trong lớp con
    }

    public void xuatHoaDon() {
        System.out.println("Ma Khach Hang: " + maKhachHang);
        System.out.println("Ho Ten: " + hoTen);
        System.out.println("Ngay Ra Hoa Don: " + ngayRaHoaDon.toString());
        System.out.println("Thanh Tien: " + thanhTien);
    }
}

class KhachHangVietNam extends KhachHang {
    private String doiTuong;
    private double soLuong;
    private double donGia;
    private double dinhMuc;

    public KhachHangVietNam(String maKhachHang, String hoTen, NgayThang ngayRaHoaDon, String doiTuong, double soLuong, double donGia, double dinhMuc) {
        super(maKhachHang, hoTen, ngayRaHoaDon);
        this.doiTuong = doiTuong;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.dinhMuc = dinhMuc;
        tinhThanhTien();
    }

    @Override
    public void tinhThanhTien() {
        if (soLuong <= dinhMuc) {
            thanhTien = soLuong * donGia;
        } else {
            thanhTien = soLuong * donGia * dinhMuc + (soLuong - dinhMuc) * donGia * 25;
        }
    }

    @Override
    public void xuatHoaDon() {
        super.xuatHoaDon();
        System.out.printf("%-10s | %-10s | %10s | %10s \n",
                    "Doi Tuong", "So Luong", "Don Gia", "Dinh Muc");
        System.out.printf("%-10s | %-10s | %10s | %10s \n",
                    doiTuong, soLuong, donGia, dinhMuc);
        System.out.println("------------------------------------------------------------------------");
    }
}

class KhachHangNuocNgoai extends KhachHang {
    private String quocTich;
    private double soLuong;
    private double donGia;

    public KhachHangNuocNgoai(String maKhachHang, String hoTen, NgayThang ngayRaHoaDon, String quocTich, double soLuong, double donGia) {
        super(maKhachHang, hoTen, ngayRaHoaDon);
        this.quocTich = quocTich;
        this.soLuong = soLuong;
        this.donGia = donGia;
        tinhThanhTien();
    }

    @Override
    public void tinhThanhTien() {
        thanhTien = soLuong * donGia;
    }

    @Override
    public void xuatHoaDon() {
        super.xuatHoaDon();
        System.out.println("Quoc Tich: " + quocTich);
        System.out.println("So Luong: " + soLuong);
        System.out.println("Don Gia: " + donGia);
        System.out.println("-------------------------------------");
    }
}

class NgayThang {
    private int ngay;
    int thang;
    int nam;

    public NgayThang(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    @Override
    public String toString() {
        return ngay + "/" + thang + "/" + nam;
    }
}

class QuanLyHoaDon {
    private List<KhachHang> danhSachHoaDon;

    public QuanLyHoaDon() {
        danhSachHoaDon = new ArrayList<>();
    }

    public void themHoaDon(KhachHang hoaDon) {
        danhSachHoaDon.add(hoaDon);
    }

    public void xuatDanhSachHoaDon() {
        for (KhachHang hoaDon : danhSachHoaDon) {
            hoaDon.xuatHoaDon();
        }
    }

    public int demSoLuongKhachHangVietNam() {
        int count = 0;
        for (KhachHang hoaDon : danhSachHoaDon) {
            if (hoaDon instanceof KhachHangVietNam) {
                count++;
            }
        }
        return count;
    }

    public int demSoLuongKhachHangNuocNgoai() {
        int count = 0;
        for (KhachHang hoaDon : danhSachHoaDon) {
            if (hoaDon instanceof KhachHangNuocNgoai) {
                count++;
            }
        }
        return count;
    }

    public double tinhTrungBinhThanhTienKhachHangNuocNgoai() {
        double tongThanhTien = 0;
        int soLuongKhachHangNuocNgoai = 0;

        for (KhachHang hoaDon : danhSachHoaDon) {
            if (hoaDon instanceof KhachHangNuocNgoai) {
                tongThanhTien += hoaDon.getThanhTien();
                soLuongKhachHangNuocNgoai++;
            }
        }

        if (soLuongKhachHangNuocNgoai > 0) {
            return tongThanhTien / soLuongKhachHangNuocNgoai;
        } else {
            return 0;
        }
    }

    public void xuatHoaDonThang9Nam2013() {
        System.out.println("Các hoá đơn trong tháng 09 năm 2013:");
        for (KhachHang hoaDon : danhSachHoaDon) {
            if (hoaDon.ngayRaHoaDon.thang == 9 && hoaDon.ngayRaHoaDon.nam == 2013) {
                hoaDon.xuatHoaDon();
            }
        }
    }
}


