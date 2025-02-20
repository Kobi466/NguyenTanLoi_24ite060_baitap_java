package QuanLyBenhVienDaKhoa;

public class Person {
    private String ten;
    private int namSinh;
    private String diaChi;
    public Person(String ten, int namSinh, String diaChi) {
        this.ten = ten;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ten='" + ten + '\'' +
                ", namSinh=" + namSinh +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }


}
