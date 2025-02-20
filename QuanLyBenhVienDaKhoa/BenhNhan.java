package QuanLyBenhVienDaKhoa;

import javax.xml.namespace.QName;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BenhNhan extends Person{
    private String idBenhNhan;
    private String idBenh;
    private String idPhong;
    private String ngayNhapVien;
    private String ngayXuatVien;
    private boolean trangThaiXuatVien;
    private String idBacSi;

    public BenhNhan(String ten, int namSinh, String diaChi, String idBenhNhan, String idBenh, String idPhong, String ngayNhapVien, String ngayXuatVien, String idBacSi) {
        super(ten, namSinh, diaChi);
        this.idBenhNhan = idBenhNhan;
        this.idBenh = idBenh;
        this.idPhong = idPhong;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayXuatVien = ngayXuatVien;
        this.trangThaiXuatVien = false;
        this.idBacSi = idBacSi;
    }

    public BenhNhan(String ten, int namSinh, String diaChi) {
        super(ten, namSinh, diaChi);
    }

    public String getIdBenhNhan() {
        return idBenhNhan;
    }

    public void setIdBenhNhan(String idBenhNhan) {
        this.idBenhNhan = idBenhNhan;
    }

    public String getIdBenh() {
        return idBenh;
    }

    public void setIdBenh(String idBenh) {
        this.idBenh = idBenh;
    }

    public String getIdPhong() {
        return idPhong;
    }

    public void doiPhong(String idPhong) {
        this.idPhong = idPhong;
    }

    public Date NgayNhapVien() {
        return chuyenDoi(ngayNhapVien);
    }

    public void setNgayNhapVien(String ngayNhapVien) {
        this.ngayNhapVien=  ngayNhapVien;
    }
    public Date chuyenDoi(String date){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try{
            return formatter.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }



    public Boolean trangThaiXuatVien() {
       Date ngayNhap=chuyenDoi(ngayNhapVien);
       Date ngayXuat=chuyenDoi(ngayXuatVien);
       if(ngayNhap!=null&&ngayXuat!=null){
           ngayXuat.before(ngayNhap);//before so sanh trong Date
           return true;
       }else{
           return false;
       }
    }

    public void setNgayXuatVien(String ngayXuatVien) {
        this.ngayXuatVien = ngayXuatVien;
    }

    public boolean isTrangThaiXuatVien() {
        return trangThaiXuatVien;
    }

    public void setTrangThaiXuatVien(boolean trangThaiXuatVien) {
        this.trangThaiXuatVien = trangThaiXuatVien;
    }

    public String getIdBacSi() {
        return idBacSi;
    }

    public void setIdBacSi(String idBacSi) {
        this.idBacSi = idBacSi;
    }

    @Override
    public String toString() {
        return "BenhNhan{" +
                "idBenhNhan='" + idBenhNhan + '\'' +
                ", idBenh='" + idBenh + '\'' +
                ", idPhong='" + idPhong + '\'' +
                ", ngayNhapVien='" + ngayNhapVien + '\'' +
                ", ngayXuatVien='" + ngayXuatVien + '\'' +
                ", trangThaiXuatVien=" + trangThaiXuatVien +
                ", idBacSi='" + idBacSi + '\'' +
                '}';
    }
}
