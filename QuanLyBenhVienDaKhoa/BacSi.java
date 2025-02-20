package QuanLyBenhVienDaKhoa;

import java.util.ArrayList;

public class BacSi extends Person{
    private String idBacSi;
    private String idKhoaDamNhiem;
    private ArrayList<BenhNhan> danhSachBenhNhan;

    public BacSi(String ten, int namSinh, String diaChi, String idBacSi, String idKhoaDamNhiem, ArrayList<BenhNhan> danhSachBenhNhan) {
        super(ten, namSinh, diaChi);
        this.idBacSi = idBacSi;
        this.idKhoaDamNhiem = idKhoaDamNhiem;
        this.danhSachBenhNhan = new ArrayList<>();
    }
    public BacSi(String ten, int namSinh, String diaChi, String idBacSi, String idKhoaDamNhiem) {
        super(ten, namSinh, diaChi);
        this.idBacSi = idBacSi;
        this.idKhoaDamNhiem = idKhoaDamNhiem;
        this.danhSachBenhNhan = new ArrayList<>();
    }


    public String getIdBacSi() {
        return idBacSi;
    }

    public void setIdBacSi(String idBacSi) {
        this.idBacSi = idBacSi;
    }

    public String getIdKhoaDamNhiem() {
        return idKhoaDamNhiem;
    }

    public void doiKhoaDamNhiem(String idKhoaDamNhiem) {
        this.idKhoaDamNhiem = idKhoaDamNhiem;
    }

    public ArrayList<BenhNhan> getDanhSachBenhNhan() {
        return danhSachBenhNhan;
    }

    public void setDanhSachBenhNhan(ArrayList<BenhNhan> danhSachBenhNhan) {
        this.danhSachBenhNhan = danhSachBenhNhan;
    }

    public void chinhSuaThongTinBacSi(String ten, int namSinh, String diaChi, String idBacSi, String idKhoaDamNhiem){
        this.setTen(ten);
        this.setNamSinh(namSinh);
        this.setDiaChi(diaChi);
        this.setIdBacSi(idBacSi);
        this.doiKhoaDamNhiem(idKhoaDamNhiem);
    }

    @Override
    public String toString() {
        return "BacSi{" +
                "idBacSi='" + idBacSi + '\'' +
                ", idKhoaDamNhiem='" + idKhoaDamNhiem + '\'' +
                ", danhSachBenhNhan=" + danhSachBenhNhan +
                '}';
    }
}
