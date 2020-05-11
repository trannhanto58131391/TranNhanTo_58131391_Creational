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
public class CTHD 
{
    String sanPham;
    int soLuong;
    double donGia, chiecKhau;

    public CTHD() {
    }

    public CTHD(String sanPham, int soLuong, double donGia, double chiecKhau) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chiecKhau = chiecKhau;
    }

    public String getSanPham() {
        return sanPham;
    }

    public void setSanPham(String sanPham) {
        this.sanPham = sanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getChiecKhau() {
        return chiecKhau;
    }

    public void setChiecKhau(double chiecKhau) {
        this.chiecKhau = chiecKhau;
    }

    @Override
    public String toString() {
        return "\nCTHD: " + "sản phẩm: " + sanPham + 
                ", số lượng: " + soLuong + 
                ", đơn giá: " + donGia + 
                ", chiếc khấu: " + chiecKhau;
    }
    
    
}
