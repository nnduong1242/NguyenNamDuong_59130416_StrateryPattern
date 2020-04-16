/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author DELL
 */
public class BaiTap1Main {
    public static void main(String[] args) {
        Context ct = new Context();   
        
        ct.setTinhToan(new Cong());
        float kq = ct.tinh(75, 12);
        System.out.println("75 + 12 = "+ kq);
        
        ct.setTinhToan(new Tru());
        kq = ct.tinh(54, 78);
        System.out.println("54 - 78 = "+ kq);
        
    }
}
