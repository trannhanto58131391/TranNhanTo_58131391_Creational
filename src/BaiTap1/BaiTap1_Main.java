/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author TNT
 */
public class BaiTap1_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HoaDonHeader hdh1 = new HoaDonHeader("HD98","02/04/2020","Trần Nhân Tố");
        HoaDonHeader hdh2 = new HoaDonHeader("HD99","12/01/2020","Trương Tuyền");
        
        CTHD ctHD1 = new CTHD("điện thoại",2,25000000,0.1);
        CTHD ctHD2 = new CTHD("máy tính",1,15000000,0.15);
        CTHD ctHD3 = new CTHD("bàn phím",1,200000,0.05);
        CTHD ctHD4 = new CTHD("chuột",1,150000,0.1);
        CTHD ctHD5 = new CTHD("ổ SSD",2,2000000,0.05);
        CTHD ctHD6 = new CTHD("cáp sạc",2,100000,0.09);
        
        HoaDon hd1 = new HoaDon.Builder()
                .addHDH(hdh1)
                .addCTHD(ctHD2)
                .addCTHD(ctHD3)
                .addCTHD(ctHD4)
                .addCTHD(ctHD5)
                .build();
        System.out.println(hd1.toString());
        
        HoaDon hd2 = new HoaDon.Builder()
                .addHDH(hdh2)
                .addCTHD(ctHD1)
                .addCTHD(ctHD6)
                .build();
        System.out.println(hd2.toString());
    }
    
}
