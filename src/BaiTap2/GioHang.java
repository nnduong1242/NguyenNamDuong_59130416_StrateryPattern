/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.ArrayList;
/**
 *
 * @author DELL
 */
public class GioHang {
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> DS = new ArrayList<>();

    public IThanhToan getHinhThucTT() {
        return hinhThucTT;
    }

    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }

    public ArrayList<HangHoa> getDsHangHoa() {
        return DS;
    }

    public void setDsHangHoa(ArrayList<HangHoa> DS) {
        this.DS = DS;
    }
    
    //them vao gio hang
    public void them(HangHoa hh){
        DS.add(hh);
    }
    
    public void tongTien(){
        int tongTIen=0;
        for (int i=0;i<DS.size();i++)
            tongTIen = tongTIen + DS.get(i).getGia();
        System.out.println("Tổng tiền: "+tongTIen);
    }
    
    public void xuat(){
        for (int i=0;i<DS.size();i++)
            System.out.println(DS.get(i).thongTinHH()); 
    }
}
