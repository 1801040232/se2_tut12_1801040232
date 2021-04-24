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
public class book {
    private String title;
    private String author;
    private double price;

    public String getTitle() {
        return title;
    }

    public book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

   

    public void setTitle(String title) {
        if(title.length()<3) System.out.println("title not valid");
        else
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        int index = author.indexOf(" ");
        String secondName = author.substring(index,author.length());
        char ch[] = secondName.toCharArray();
        int err = 0;
        for(char c : ch){
            if(Character.isDigit(c))
            {
                System.out.println("Author is valid");
                break;
            }
            else err++;
        }
        if(err==ch.length) this.author = author;       
    }

    public double getPrice() {
        
        return price;
    }

    public void setPrice(double price) {
        if(price<=0) System.out.println("price not valid");
        else this.price = price;
    }
    @Override
public String toString() {
final StringBuilder sb = new StringBuilder();
sb.append("Type: ").append(this.getClass().getSimpleName())
.append(System.lineSeparator())
.append("Title: ").append(this.getTitle())
.append(System.lineSeparator())
.append("Author: ").append(this.getAuthor())
.append(System.lineSeparator())
.append("Price: ").append(this.getPrice())

.append(System.lineSeparator());
return sb.toString();
}
}
