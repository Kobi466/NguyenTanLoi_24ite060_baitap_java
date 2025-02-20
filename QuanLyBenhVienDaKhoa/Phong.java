package QuanLyBenhVienDaKhoa;

import java.util.ArrayList;

public class Phong {
    private String idKhoa;
    private String tenKhoa;
    private int slGiuong;
    static int slBenhNhan;
    public Phong(String idKhoa, String tenKhoa, int slGiuong, int slBenhNhan) {
        this.idKhoa = idKhoa;
        this.tenKhoa = tenKhoa;
        this.slGiuong = slGiuong;
        this.slBenhNhan = slBenhNhan;
    }
    public Phong(){}
    public static Phong getInstance(){
        return new Phong();
    }

    public String getIdKhoa() {
        return idKhoa;
    }

    public void doiIdPhong(String idKhoa) {
        this.idKhoa = idKhoa;
        --slGiuong;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public int getSlGiuong() {
        return slGiuong;
    }

    public void setSlGiuong(int slGiuong) {
        this.slGiuong = slGiuong;
    }

    public int getSlBenhNhan() {
        return slBenhNhan;
    }

    public void setSlBenhNhan(int slBenhNhan) {
        this.slBenhNhan = slBenhNhan;
    }

    public void addBenhNhan(BenhNhan benhNhan){
        if(slGiuong == 0){
            System.out.println("SO luong giuong hien tai da qua tai");
        }
        ArrayList<BenhNhan> danhSachBenhNhan = new ArrayList<>();
        if(slBenhNhan < slGiuong){
            danhSachBenhNhan.add(benhNhan);
            slBenhNhan++;
        }
    }

    public void xoaBenhNhan(String idBenhNhan){
        if(slBenhNhan == 0){
            System.out.println("Phong nay hien tai chua co benh nhan nao");
        }else{
            ArrayList<BenhNhan> danhSachBenhNhan = new ArrayList<>();
            for(BenhNhan benhNhan:danhSachBenhNhan){
                if(benhNhan.getIdBenhNhan().equals(idBenhNhan)){
                    danhSachBenhNhan.remove(benhNhan);
                    slBenhNhan--;
                }
            }
        }
    }
    public void editPhong(String tenKhoa, String idKhoa, int slGiuong){
        this.setTenKhoa(tenKhoa);
        this.doiIdPhong(idKhoa);
        this.setSlGiuong(slGiuong);
        System.out.println("Da sua thanh cong");
    }

    @Override
    public String toString() {
        return "Phong{" +
                "idKhoa='" + idKhoa + '\'' +
                ", tenKhoa='" + tenKhoa + '\'' +
                ", slGiuong=" + slGiuong +
                ", slBenhNhan=" + slBenhNhan +
                '}';
    }
}
