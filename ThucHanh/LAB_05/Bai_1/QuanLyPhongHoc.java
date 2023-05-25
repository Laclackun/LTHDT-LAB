import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class QuanLyPhongHoc {
    private List<PhongHoc> danhSachPhong;

    public QuanLyPhongHoc() {
        danhSachPhong = new ArrayList<>();
    }
    
    public void HienMenu() {
        QuanLyPhongHoc quanLyPhongHoc = new QuanLyPhongHoc();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("==== MENU ====");
            System.out.println("1. Thêm phòng học");
            System.out.println("2. Tìm kiếm phòng học");
            System.out.println("3. In danh sách phòng học");
            System.out.println("4. In danh sách phòng học đạt chuẩn");
            System.out.println("5. Sắp xếp danh sách theo dãy nhà");
            System.out.println("6. Sắp xếp danh sách theo diện tích giảm dần");
            System.out.println("7. Sắp xếp danh sách theo số bóng đèn tăng dần");
            System.out.println("8. Cập nhật số máy tính cho phòng máy tính");
            System.out.println("9. Xóa phòng học");
            System.out.println("10. In tổng số phòng học");
            System.out.println("11. In danh sách các phòng máy có 60 máy");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine(); // Clear the input buffer
                    System.out.print("Nhập mã phòng: ");
                    String maPhong = scanner.nextLine();
                    System.out.print("Nhập dãy nhà: ");
                    String dayNha = scanner.nextLine();
                    System.out.print("Nhập diện tích: ");
                    double dienTich = scanner.nextDouble();
                    System.out.print("Nhập số bóng đèn: ");
                    int soBongDen = scanner.nextInt();
                    System.out.print("Loại phòng học (1-Phòng lý thuyết, 2-Phòng máy tính, 3-Phòng thí nghiệm): ");
                    int loaiPhong = scanner.nextInt();

                    switch (loaiPhong) {
                        case 1:
                            System.out.print("Có máy chiếu (true/false): ");
                            boolean coMayChieu = scanner.nextBoolean();
                            quanLyPhongHoc.themPhong(new PhongLyThuyet(maPhong, dayNha, dienTich, soBongDen, coMayChieu));
                            break;
                        case 2:
                            System.out.print("Số máy tính: ");
                            int soMayTinh = scanner.nextInt();
                            quanLyPhongHoc.themPhong(new PhongMayTinh(maPhong, dayNha, dienTich, soBongDen, soMayTinh));
                            break;
                        case 3:
                            scanner.nextLine(); // Clear the input buffer
                            System.out.print("Chuyên ngành: ");
                            String chuyenNganh = scanner.nextLine();
                            System.out.print("Sức chứa: ");
                            int sucChua = scanner.nextInt();
                            System.out.print("Có bồn rửa (true/false): ");
                            boolean coBonRua = scanner.nextBoolean();
                            quanLyPhongHoc.themPhong(new PhongThiNghiem(maPhong, dayNha, dienTich, soBongDen, chuyenNganh, sucChua, coBonRua));
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ!");
                            break;
                    }
                    break;
                case 2:
                    scanner.nextLine(); // Clear the input buffer
                    System.out.print("Nhập mã phòng cần tìm: ");
                    String maPhongTimKiem = scanner.nextLine();
                    boolean timThay = quanLyPhongHoc.timPhong(maPhongTimKiem);
                    if (timThay) {
                        System.out.println("Tìm thấy phòng có mã phòng " + maPhongTimKiem);
                    } else {
                        System.out.println("Không tìm thấy phòng có mã phòng " + maPhongTimKiem);
                    }
                    break;
                case 3:
                    quanLyPhongHoc.inDanhSachPhong();
                    break;
                case 4:
                    quanLyPhongHoc.inPhongHocDatChuan();
                    break;
                case 5:
                    quanLyPhongHoc.sapXepTheoDayNha();
                    System.out.println("Danh sách đã được sắp xếp theo dãy nhà.");
                    break;
                case 6:
                    quanLyPhongHoc.sapXepTheoDienTichGiamDan();
                    System.out.println("Danh sách đã được sắp xếp theo diện tích giảm dần.");
                    break;
                case 7:
                    quanLyPhongHoc.sapXepTheoSoBongDenTangDan();
                    System.out.println("Danh sách đã được sắp xếp theo số bóng đèn tăng dần.");
                    break;
                case 8:
                    scanner.nextLine(); // Clear the input buffer
                    System.out.print("Nhập mã phòng máy tính cần cập nhật: ");
                    String maPhongCapNhat = scanner.nextLine();
                    System.out.print("Nhập số máy tính mới: ");
                    int soMayTinhMoi = scanner.nextInt();
                    quanLyPhongHoc.capNhatSoMayTinh(maPhongCapNhat, soMayTinhMoi);
                    break;
                case 9:
                    scanner.nextLine(); // Clear the input buffer
                    System.out.print("Nhập mã phòng cần xóa: ");
                    String maPhongXoa = scanner.nextLine();
                    quanLyPhongHoc.xoaPhong(maPhongXoa);
                    break;
                case 10:
                    quanLyPhongHoc.inTongSoPhong();
                    break;
                case 11:
                    quanLyPhongHoc.inDanhSachPhongMay60May();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }
        } while (choice != 0);

        scanner.close();
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
