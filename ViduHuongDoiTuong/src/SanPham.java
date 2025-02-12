
public class SanPham {
	// Định nghĩa các thuộc tính 
	int maSP;
	String tenSP;
	String loaiSP;
	String anhSP; // tên file ảnh

	
	// Hàm tạo
	// CÁCH 1: Hàm tạo không có tham số
	public SanPham() {
		// Khởi tạo giá trị ban đầu cho các thuộc tính nếu có ở đây
	}
	
	// CÁCH 2: Hàm tạo có tham số (có sử dụng gạch dưới "_" )
//	public SanPham(int _maSP, String _tenSP, String _loaiSP, String _anhSP) {
//		// Khởi tạo giá trị ban đầu cho các thuộc tính nếu có ở đây
//		maSP = _maSP;
//		tenSP = _tenSP;
//		loaiSP = _loaiSP;
//		anhSP = _anhSP;
//	}
	
	// CÁCH 3: Hàm tạo có tham số không cần gạch dưới, thay vào đó sử dụng con trỏ this.
	public SanPham(int maSP, String tenSP, String loaiSP, String anhSP) {
		// Khởi tạo giá trị ban đầu cho các thuộc tính nếu có ở đây
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.loaiSP = loaiSP;
		this.anhSP = anhSP;
	}
	
	
	// Các getter và setter
	public int getMaSP() {
		return maSP;
	}

	public void setMaSP(int maSP) {
		this.maSP = maSP;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public String getLoaiSP() {
		return loaiSP;
	}

	public void setLoaiSP(String loaiSP) {
		this.loaiSP = loaiSP;
	}

	public String getAnhSP() {
		return anhSP;
	}

	public void setAnhSP(String anhSP) {
		this.anhSP = anhSP;
	}
	
	// toString
	@Override
	public String toString() {
		return "SanPham [maSP=" + maSP + ", tenSP=" + tenSP + ", loaiSP=" + loaiSP + ", anhSP=" + anhSP + "]";
	}
	
	
}















