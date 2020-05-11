/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

import java.util.ArrayList;

/**
 *
 * @author TNT
 */
public class HoaDon 
{
    HoaDonHeader hdh;
    ArrayList<CTHD> ds = new ArrayList<>();
    
    public HoaDon(Builder builder)
    {
        this.hdh = builder.hdh;
        this.ds = builder.ds;
    }
    
    public static class Builder
    {
        HoaDonHeader hdh;
        ArrayList<CTHD> ds = new ArrayList<>();

        public Builder() {
        }
        
        public Builder addHDH(HoaDonHeader hdh)
        {
            this.hdh = hdh;
            return this;
        }
        
        public Builder addCTHD(CTHD cthd)
        {
            this.ds.add(cthd);
            return this;
        }
        
        public HoaDon build()
        {
            return new HoaDon(this);
        }
    }

    @Override
    public String toString() {
        return  "Hóa Đơn: " + hdh + 
                "\nDanh sách chi tiết: " + ds +
                "\n---------------------------------------";
    }
    
    
}
