package QuanLyBenhVienDaKhoa;

import java.util.ArrayList;

public class Khoa {
    private String idKhoa;
    private String tenKhoa;
    private ArrayList<BacSi> danhSachBacSi;
    public Khoa(String idKhoa, String tenKhoa, ArrayList<BacSi> danhSachBacSi) {
        this.idKhoa = idKhoa;
        this.tenKhoa = tenKhoa;
        this.danhSachBacSi = danhSachBacSi;
    }
    public Khoa(String idKhoa, String tenKhoa){
        this.idKhoa = idKhoa;
        this.tenKhoa = tenKhoa;
        this.danhSachBacSi = new ArrayList<>();
    }
    public Khoa(){}

    public String getIdKhoa() {
        return idKhoa;
    }

    public void setIdKhoa(String idKhoa) {
        this.idKhoa = idKhoa;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void chinhSuaKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public ArrayList<BacSi> getDanhSachBacSi() {
        return danhSachBacSi;
    }

    public void setDanhSachBacSi(ArrayList<BacSi> danhSachBacSi) {
        this.danhSachBacSi = danhSachBacSi;
    }
    public void themBacSi(BacSi bacSi){
        if(danhSachBacSi.contains(bacSi)){
            System.out.println("Da ton tai ");
        }
        else{
            danhSachBacSi.add(bacSi);
            System.out.println("Da them thanh cong");
        }
    }
    public void xoaBacSi(String idBacSi){
        for(BacSi bacSi:danhSachBacSi){
            if(bacSi.getIdBacSi().equals(idBacSi)){
                danhSachBacSi.remove(bacSi);
                System.out.println("Da xoa thanh cong");
            }else{
                System.out.println("Khong tim thay bac si");
            }
        }
    }
    public BacSi find(String idBacSi){
        for(BacSi bacSi:danhSachBacSi){
            if(bacSi.getIdBacSi().equals(idBacSi)){
                return bacSi;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        return "Khoa{" +
                "idKhoa='" + idKhoa + '\'' +
                ", tenKhoa='" + tenKhoa + '\'' +
                ", danhSachBacSi=" + danhSachBacSi +
                '}';
    }
}
