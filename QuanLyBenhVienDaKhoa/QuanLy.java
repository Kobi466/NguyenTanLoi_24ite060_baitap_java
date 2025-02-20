package QuanLyBenhVienDaKhoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLy {
    Scanner scanner;
    ArrayList<Khoa> danhSachKhoa;
    ArrayList<BacSi> danhSachBacSi;
    ArrayList<Phong> danhSachPhong;
    ArrayList<BenhNhan> danhSachBenhNhan;
    public QuanLy() {
        scanner = new Scanner(System.in);
        danhSachKhoa = new ArrayList<>();
        danhSachBacSi = new ArrayList<>();
        danhSachPhong = new ArrayList<>();
        danhSachBenhNhan = new ArrayList<>();
    }
    public void addKhoa(Khoa khoa){
        danhSachKhoa.add(khoa);
    }
    public void addBacSi(BacSi bacSi){
        Khoa khoa = new Khoa();
        khoa.themBacSi(bacSi);
    }
    public void addPhong(Phong phong){
        danhSachPhong.add(phong);
    }
    public void addBenhNhan(BenhNhan benhNhan){
        Phong phong = new Phong();
        phong.addBenhNhan(benhNhan);
    }
    public void benhNhanXuat_NhapVien(){
        System.out.println();
    }
    public void doiPhongChoBenhNhan(String idBenhNhan, String idPhong){
        for(BenhNhan benhNhan:danhSachBenhNhan){
            if(idBenhNhan.equals(benhNhan)){
                benhNhan.doiPhong(idPhong);
                System.out.println("Da sua doi thanh cong");
            }else{
                System.out.println("Khong tim thay benh nhan");
            }
        }
    }
    public void doiBacSiDamNhiem(String benhNhan, String bacSi){
        for(BenhNhan benhNhan1:danhSachBenhNhan){
            if(benhNhan.equals(benhNhan1)){
                benhNhan1.setIdBacSi(bacSi);
                System.out.println("Da sua doi thanh cong");
            }else{
                System.out.println("Khong tim thay benh nhan");
            }
        }
    }
    public void displayDSBenhNhanTheoBenh(String idBenh){
        for(BenhNhan benhNhan:danhSachBenhNhan){
            if(idBenh.equals(benhNhan.getIdBenh())){
                System.out.println(benhNhan);
            }else{
                System.out.println("Khong tim thay benh");
            }
        }
    }
    public void displayDSBenhNhanTheoPhong(String phong){
        for(BenhNhan benhNhan:danhSachBenhNhan){
            if(phong.equals(benhNhan.getIdPhong())){
                System.out.println(benhNhan);
            }else{
                System.out.println("Khong tim thay phong");
            }
        }
    }
    public void displayDSBacSiTheoKhoa(String khoa1){
        for(Khoa khoa:danhSachKhoa){
            if(khoa1.equals(khoa.getIdKhoa())){
                System.out.println(khoa);
            }else{
                System.out.println("Khong tim thay khoa");
            }
        }
    }
    public int inDStheoThuTuNamSinh(){
        Collections.sort(danhSachBenhNhan, new Comparator<BenhNhan>() {
            @Override
            public int compare(BenhNhan o1, BenhNhan o2) {
                return o1.getNamSinh()> o2.getNamSinh()?1:-1;
            }
        });
        return 0;
    }
    public void showMenu() {
        int choice;
        do{
            System.out.println("1.Them Khoa");
            System.out.println("2.Them Bac Si");
            System.out.println("3.Them Phong");
            System.out.println("4.Them Benh Nhan");
            System.out.println("5.Xuat Nhap Vien");
            System.out.println("6.Doi phong cho benh nhan(tim theo id benh nhan)");
            System.out.println("7.Doi bac si dam nhiem cho benh nhan");
            System.out.println("8.Hien thi danh sach benh nhan theo benh");
            System.out.println("9.Hien thi danh sach benh nhan theo phong");
            System.out.println("10.Hien thi danh sach bac si theo khoa");
            System.out.println("11.Hien thi danh sach Benh nhan theo thu tu nam sinh");
            choice = scanner.nextInt();
            scanner.nextLine();
            if(choice == 1){
                System.out.println("id khoa:");
                String idtenKhoa = scanner.nextLine();
                System.out.println("ten khoa:");
                String tenKhoa = scanner.nextLine();
                addKhoa(new Khoa(idtenKhoa, tenKhoa));
            }else if(choice == 2){
                System.out.println("id bac si:");
                String ten = scanner.nextLine();
                System.out.println("nam sinh:");
                int namSinh = scanner.nextInt();
                System.out.println("dia chi:");
                String diaChi = scanner.nextLine();
                System.out.println("id bac si:");
                String idBacSi = scanner.nextLine();
                System.out.println("id khoa dam nhiem:");
                String idKhoaDamNhiem = scanner.nextLine();
                addBacSi(new BacSi(ten, namSinh, diaChi, idBacSi, idKhoaDamNhiem));
            }else if(choice == 3){
                System.out.println("id phong:");
                String idPhong = scanner.nextLine();
                System.out.println("ten phong:");
                String tenPhong = scanner.nextLine();
                System.out.println("so luong giuong:");
                int slGiuong = scanner.nextInt();
                System.out.println("so luong benh nhan:");
                int slBenhNhan = scanner.nextInt();
                addPhong(new Phong(idPhong, tenPhong, slGiuong, slBenhNhan));
            }else if(choice == 4){
                System.out.println("id benh nhan:");
                String ten = scanner.nextLine();
                System.out.println("nam sinh:");
                int namSinh = scanner.nextInt();
                System.out.println("dia chi:");
                String diaChi = scanner.nextLine();
                System.out.println("id benh nhan:");
                String idBenhNhan=scanner.nextLine();
                System.out.println("id benh:");
                String idBenh=scanner.nextLine();
                System.out.println("id phong:");
                String idPhong=scanner.nextLine();
                System.out.println("ngay nhap vien:");
                String ngayNhapVien=scanner.nextLine();
                System.out.println("ngay xuat vien:");
                String ngayXuatVien=scanner.nextLine();
                System.out.println("id bac si:");
                String idBacSi=scanner.nextLine();
                addBenhNhan(new BenhNhan(ten, namSinh, diaChi, idBenhNhan, idBenh, idPhong, ngayNhapVien, ngayXuatVien, idBacSi));
            }else if(choice == 6){
                System.out.println("id benh nhan:");
                String idBenhNhan = scanner.nextLine();
                doiPhongChoBenhNhan(idBenhNhan, scanner.nextLine());
            }else if(choice == 7){
                System.out.println("id benh:");
                String idBenh = scanner.nextLine();
                doiBacSiDamNhiem(idBenh, scanner.nextLine());
            }else if(choice == 8){
                System.out.println("id benh:");
                String idBenh=scanner.nextLine();
                displayDSBenhNhanTheoBenh(idBenh);
            }else if(choice == 9){
                System.out.println("id phong:");
                String idPhong=scanner.nextLine();
                displayDSBenhNhanTheoPhong(idPhong);
            }else if(choice == 10){
                System.out.println("id khoa:");
                String idKhoa=scanner.nextLine();
                displayDSBacSiTheoKhoa(idKhoa);
            }else if(choice == 11){
                inDStheoThuTuNamSinh();
            }
        }while(choice>0&&choice<12);
    }
}
