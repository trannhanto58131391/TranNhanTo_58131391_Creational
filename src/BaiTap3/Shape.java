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
public abstract class Shape 
{
    String brush = "quét sạch";
    String paper = "chuẩn bị giấy";
    String frame = "tạo khung";

    public Shape() {
    }

    public Shape(String brush, String paper, String frame) {
        this.brush = brush;
        this.paper = paper;
        this.frame = frame;
    }
    
    public abstract String draw();
}
