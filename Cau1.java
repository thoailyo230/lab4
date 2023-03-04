class ChuyenXe {
  private String maSoChuyen;
  private String hoTenTaiXe;
  private String soXe;
  private float doanhThu;

  public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, float doanhThu) {
    this.maSoChuyen = maSoChuyen;
    this.hoTenTaiXe = hoTenTaiXe;
    this.soXe = soXe;
    this.doanhThu = doanhThu;
  }

  // các phương thức getter và setter cho các thuộc tính
}

class ChuyenXeNoiThanh extends ChuyenXe {
  private String soTuyen;
  private float soKmDiDuoc;

  public ChuyenXeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, float doanhThu, String soTuyen, float soKmDiDuoc) {
    super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
    this.soTuyen = soTuyen;
    this.soKmDiDuoc = soKmDiDuoc;
  }

  // các phương thức getter và setter cho các thuộc tính
}

class ChuyenXeNgoaiThanh extends ChuyenXe {
  private String noiDen;
  private int soNgayDiDuoc;

  public ChuyenXeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, float doanhThu, String noiDen, int soNgayDiDuoc) {
    super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
    this.noiDen = noiDen;
    this.soNgayDiDuoc = soNgayDiDuoc;
  }

  // các phương thức getter và setter cho các thuộc tính
}
