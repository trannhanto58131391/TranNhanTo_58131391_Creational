/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author TNT
 */
public class Rectangle extends Shape
{
    private static Rectangle instance;
    
    public static Rectangle createInstance()
    {
        if(instance == null)
            instance = new Rectangle();
        return instance;
    }

    @Override
    public String draw() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return brush+", "+ paper + ", " + frame + ", tạo thành " + "hình chữ nhật";
    }
    
    
}
