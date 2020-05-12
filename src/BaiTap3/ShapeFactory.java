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
public class ShapeFactory 
{   
    protected Shape createShape(ShapeType shapeType)
    {
        switch(shapeType)
        {
            case Triangle : return Triangle.createInstance();
            case Rectangle: return Rectangle.createInstance();
            case Circle : return Circle.createInstance();
        }
        return null;
    }
}
