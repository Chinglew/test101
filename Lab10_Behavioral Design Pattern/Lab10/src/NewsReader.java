/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lewin
 */
public class NewsReader {
    
    private String r_name;
    public NewsReader(String name) {
        this.r_name = name;
    }
    public void update(String m) {
        System.out.println(this.r_name+" got news :: " + m);
    }
    
    
    
}
