/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author DELL
 */
public class BaiTap2Main {
    public static void main(String[] args) {
        HangHoa hh1 = new HangHoa();
        HangHoa hh2 = new HangHoa();
        HangHoa hh3 = new HangHoa();
        HangHoa hh4 = new HangHoa();
        
        hh1.setTenHH("Áo sơ mi caro nam");
        hh1.setGia(165000);
        hh1.setMoTa("Áo sơ mi dài tay dài tay họa tiết caro dành cho nam");
        
        hh2.setTenHH("Quần jean nam");
        hh2.setGia(300000);
        hh2.setMoTa("Quần jean hot dành cho nam giới");
        
        hh3.setTenHH("Quần jean nữ");
        hh3.setGia(300000);
        hh3.setMoTa("Quần jean hot dành cho nữ");
        
        hh4.setTenHH("Váy dài");
        hh4.setGia(400000);
        hh4.setMoTa("váy dài dự tiệc đẹp dành cho nữ");
        
        GioHang gh1 = new GioHang();
        gh1.setHinhThucTT(new ThanhToanOnline());
        gh1.them(hh1);
        gh1.them(hh2);
        
        System.out.println("Giỏ hàng 1:");
        gh1.xuat();
        gh1.tongTien();
        
        GioHang gh2 = new GioHang();
        gh2.setHinhThucTT(new ThanhToanCOD());
        gh2.them(hh3);
        gh2.them(hh4);
        
        System.out.println("\nGiỏ hàng 2:");
        gh2.xuat();
        gh2.tongTien();
    }
}
