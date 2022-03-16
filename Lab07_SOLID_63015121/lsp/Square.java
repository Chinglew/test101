/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package first;

/**
 *
 * @author Asus
 */
public class Square extends Rectangle implements Shape{
    
    private int side;
    
    Square(int side) {
        this.setSide(side);
    }
    
    @Override
    public void setWidth(int width) {
        this.setSide(width);
    }

    @Override
    public void setHeight(int height) {
        this.setSide(height);
    }

    public void setSide(int side) {
        this.side = side;
    }
    
    public int getSide(){
        return side;
    }
    
    public int getArea(){
        return this.getSide() * this.getSide();
    }
}
