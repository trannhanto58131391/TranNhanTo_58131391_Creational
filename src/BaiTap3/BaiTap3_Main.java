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
public class BaiTap3_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeFactory factory = new ShapeFactory();
        
        Shape s1 = factory.createShape(ShapeType.Circle);
        Shape s2 = factory.createShape(ShapeType.Triangle);
        Shape s3 = factory.createShape(ShapeType.Rectangle);
        
        System.out.println(s1.draw());
        System.out.println(s2.draw());
        System.out.println(s3.draw());
    }
    
}
