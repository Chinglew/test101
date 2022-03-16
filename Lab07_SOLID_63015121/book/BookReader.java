/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package second;

import java.util.List;
/**
 *
 * @author Asus
 */
public class BookReader implements Reader{
    
    public static void main(String[] args) {
        
        BookReader bookreader = new BookReader();
        bookreader.printToScreen();
    }
    
    @Override
    public void printToScreen() {
        Book book = new Book("Ex_Book", List.of("Chapter 1", "Chapter 2", "Chapter 3", "Chapter 4", "Chapter 5"));
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }
}
