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
public class Circle extends Shape
{
    
    private static Circle instance;
    
    public static Circle createInstance()
    {
        if(instance == null)
            instance = new Circle();
        return instance;
    }

    @Override
    public String draw() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return  brush+", "+ paper + ", " + frame + ", tạo thành " + "hình tròn";
    }
    
    
}
