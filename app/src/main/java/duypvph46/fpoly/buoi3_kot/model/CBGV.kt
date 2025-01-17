package duypvph46.fpoly.buoi3_kot.model

class CBGV(var luongCung: Double, var luongThuong: Double, var tienPhat: Double,var nguoi: Nguoi) {

    fun tinhLuongThucLinh(): Double {
        return luongCung + luongThuong - tienPhat
    }

    fun inThongTin(){
        println("Họ tên: ${nguoi.hoTen}, Quê quán: ${nguoi.queQuan}, Mã số giáo viên: ${nguoi.maSoGiaoVien}, Lương cứng: $luongCung, Lương thưởng: $luongThuong, Tiền phạt: $tienPhat, Lương thực lĩnh: ${tinhLuongThucLinh()}")
    }

}
