import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class QuanLyPhongHoc {
    private List<PhongHoc> danhSachPhong;

    public QuanLyPhongHoc() {
        danhSachPhong = new ArrayList<>();
    }

    public void themPhong(PhongHoc phongHoc) {
        if (!timPhong(phongHoc.getMaPhong())) {
            danhSachPhong.add(phongHoc);
            System.out.println("Thêm phòng thành công!");
        } else {
            System.out.println("Phòng đã tồn tại!");
        }
    }

    public boolean timPhong(String maPhong) {
        for (PhongHoc phongHoc : danhSachPhong) {
            if (phongHoc.getMaPhong().equals(maPhong)) {
                return true;
            }
        }
        return false;
    }

    public void inDanhSachPhong() {
        for (PhongHoc phongHoc : danhSachPhong) {
            System.out.println(phongHoc);
        }
    }

    public void inPhongHocDatChuan() {
        for (PhongHoc phongHoc : danhSachPhong) {
            if (phongHoc instanceof PhongLyThuyet) {
                PhongLyThuyet phongLyThuyet = (PhongLyThuyet) phongHoc;
                if (phongLyThuyet.isCoMayChieu() && phongHoc.getSoBongDen() >= (phongHoc.getDienTich() / 10)) {
                    System.out.println(phongHoc);
                }
            } else if (phongHoc instanceof PhongMayTinh) {
                PhongMayTinh phongMayTinh = (PhongMayTinh) phongHoc;
                if (phongMayTinh.getSoMayTinh() >= (phongHoc.getDienTich() / 1.5) && phongHoc.getSoBongDen() >= (phongHoc.getDienTich() / 10)) {
                    System.out.println(phongHoc);
                }
            } else if (phongHoc instanceof PhongThiNghiem) {
                PhongThiNghiem phongThiNghiem = (PhongThiNghiem) phongHoc;
                if (phongThiNghiem.isCoBonRua() && phongHoc.getSoBongDen() >= (phongHoc.getDienTich() / 10)) {
                    System.out.println(phongHoc);
                }
            }
        }
    }

    public void sapXepTheoDayNha() {
        Collections.sort(danhSachPhong, new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc ph1, PhongHoc ph2) {
                return ph1.getDayNha().compareTo(ph2.getDayNha());
            }
        });
    }

    public void sapXepTheoDienTichGiamDan() {
        Collections.sort(danhSachPhong, new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc ph1, PhongHoc ph2) {
                return Double.compare(ph2.getDienTich(), ph1.getDienTich());
            }
        });
    }

    public void sapXepTheoSoBongDenTangDan() {
        Collections.sort(danhSachPhong, new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc ph1, PhongHoc ph2) {
                return Integer.compare(ph1.getSoBongDen(), ph2.getSoBongDen());
            }
        });
    }

    public void capNhatSoMayTinh(String maPhong, int soMayTinh) {
        for (PhongHoc phongHoc : danhSachPhong) {
            if (phongHoc instanceof PhongMayTinh && phongHoc.getMaPhong().equals(maPhong)) {
                ((PhongMayTinh) phongHoc).setSoMayTinh(soMayTinh);
                System.out.println("Cập nhật số máy tính thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy phòng máy tính có mã phòng " + maPhong);
    }

    public void xoaPhong(String maPhong) {
        for (PhongHoc phongHoc : danhSachPhong) {
            if (phongHoc.getMaPhong().equals(maPhong)) {
                danhSachPhong.remove(phongHoc);
                System.out.println("Xóa phòng thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy phòng có mã phòng " + maPhong);
    }

    public void inTongSoPhong() {
        System.out.println("Tổng số phòng học: " + danhSachPhong.size());
    }

    public void inDanhSachPhongMay60May() {
        for (PhongHoc phongHoc : danhSachPhong) {
            if (phongHoc instanceof PhongMayTinh) {
                PhongMayTinh phongMayTinh = (PhongMayTinh) phongHoc;
                if (phongMayTinh.getSoMayTinh() == 60) {
                    System.out.println(phongHoc);
                }
            }
        }
    }
}
