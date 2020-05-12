/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author TNT
 */
public class BaiTap2_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyStringBuilder ms = new MyStringBuilder.Builder()
                .addString("Họ & Tên: ")
                .addString("Trần Nhân Tố")
                .addString(", Chiều cao: ")
                .addFloat((float)1.68)
                .addString("m")
                .addString(", Cân nặng: ")
                .addFloat((float)52.5)
                .addString("kg")
                .addString(", Giới tính (nam): ")
                .addBool(true)
                .Builder();
        System.out.println(ms.toString());
    }
    
}
