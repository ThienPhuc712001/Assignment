package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DanhSachBaiVietController {
    private Scanner scanner;
    ArrayList<DanhSachBaiViet> danhSachBaiViets = new ArrayList<>();
    public void create() {


        System.out.println("Vui long nhap thong tin danh sach bai viet.");
        System.out.println("Nhap id: ");
        Scanner scanner = new Scanner(System.in);
        long id = scanner.nextLong();
        scanner.nextLine();

        System.out.println("Nhap tieu de: ");
        String tieuDe = scanner.nextLine();
        System.out.println("Nhap mo ta: ");
        String moTa = scanner.nextLine();
        System.out.println("Nhap noi dung bai viet: ");
        String noiDungChinh = scanner.nextLine();
        System.out.println("Nhap anh dai dien: ");
        String anhDaiDien = scanner.nextLine();
        System.out.println("Nhap ten tac gia: ");
        String tenTacGia = scanner.nextLine();
        System.out.println("Nhap ngay viet: ");
        String ngayViet = scanner.nextLine();



        DanhSachBaiViet danhSachBaiViet = new DanhSachBaiViet();
        danhSachBaiViet.setId(id);
        danhSachBaiViet.setTieuDe(tieuDe);
        danhSachBaiViet.setMoTa(moTa);
        danhSachBaiViet.setNoiDungChinh(noiDungChinh);
        danhSachBaiViet.setTenTacGia(tenTacGia);
        danhSachBaiViet.setNgayViet(ngayViet);
        danhSachBaiViet.setAnhDaiDien(anhDaiDien);

        danhSachBaiViets.add(danhSachBaiViet);
    }


    public void showListDanhSachBaiViet () {
        System.out.println("Hien thi danh sach bai viet");
        System.out.println("-----------------------------");
        System.out.printf("%-10s || %-30s || %-30s || %-30s || %-30s ||%-30s || %-30s\n", "Id", "Tieu De", "Mo Ta", "Ngay Viet", "Anh Dai Dien", "Ten Tac Gia", "Noi Dung Chinh");
        System.out.println("------------------------------");
        for (int i = 0; i < danhSachBaiViets.size(); i++) {
            DanhSachBaiViet ds = danhSachBaiViets.get(i);
            System.out.printf("%-10s || %-30s || %-30s || %-30s || %-30s || %-30s || %-30s\n", ds.getId(), ds.getTieuDe(), ds.getMoTa(), ds.getNgayViet(), ds.getAnhDaiDien(), ds.getTenTacGia(), ds.getNoiDungChinh());
        }
        System.out.println("Enter de tiep tuc");
        scanner.nextLine();

    }
}

