/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author DELL
 */
public class BaiTap3Main {
    public static void main(String[] args) throws ParseException {
        QLSV ql = new QLSV();
        SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        
        SinhVien sv1, sv2, sv3;
        sv1 = new SinhVien("Nguyễn Nam Dương", df.parse("20/10/1999"), 8);
        sv2 = new SinhVien("Trịnh Huy Khôi", df.parse("13/7/2000"), 9);
        sv3 = new SinhVien("Nguyễn Xuân Thời", df.parse("12/4/1999"), 5);
        
        ql.them(sv1);
        ql.them(sv2);
        ql.them(sv3);
        
        ql.inDS();
        
        ISoSanh sxTheoTen = new SoSanhTheoTen();
        ISoSanh sxTheoDiem = new SoSanhTheoDiem();
        
        System.out.println("\nSắp xếp danh sách sinh viên theo tên: ");
        ql.setSoSanh(sxTheoTen);
        ql.SapXep();
        ql.inDS();
        
        System.out.println("\nSắp xếp danh sách sinh viên theo điểm: ");
        ql.setSoSanh(sxTheoDiem);
        ql.SapXep();
        ql.inDS();
    }
}
