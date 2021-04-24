/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se2_tut11.bookShop;

/**
 *
 * @author Win 8.1 Version 2
 */
public class GoldenEditionBook extends book{

    public GoldenEditionBook(String title, String author, double price) {
        super(title, author, price);
    }

    
    @Override
    public double getPrice(){
        return super.getPrice()+(super.getPrice()*30)/100;
    }
}
