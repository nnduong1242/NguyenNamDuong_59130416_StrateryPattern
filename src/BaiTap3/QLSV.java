/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class QLSV {
    ISoSanh<SinhVien> soSanh;
    ArrayList<SinhVien> danhSach = new ArrayList<>();

    public ISoSanh<SinhVien> getSoSanh() {
        return soSanh;
    }

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }

    public ArrayList<SinhVien> getDanhSach() {
        return danhSach;
    }

    public void setDanhSach(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }
    
    public void them(SinhVien sv){
        danhSach.add(sv);
    }
    
    public void SapXep(){
        SinhVien t;
        for (int i=0;i<danhSach.size();i++)
            for (int j=i+1;j<danhSach.size();j++)
                if (soSanh.soSanh(danhSach.get(i), danhSach.get(j))==1)
                {
                    t=danhSach.get(i);
                    danhSach.set(i, danhSach.get(j));
                    danhSach.set(j, t);
                }
    }
    
    public void inDS() {
        for (int i=0;i<danhSach.size();i++)
            System.out.println(danhSach.get(i).InThongTin());
    }
}
