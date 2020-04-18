/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class SinhVien {
    public String hoTen;
    public Date ngaySinh;
    public float diemTB;

    public SinhVien(String hoTen, Date ngaySinh, float diemTB) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public float getDiemTB() {
        return diemTB;
    }
    
    public String InThongTin(){
        return "\tHọ tên: "+hoTen+"\tNgày sinh: "+ngaySinh+"\tĐiểm TB: "+diemTB;
    }
}
