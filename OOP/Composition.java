/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author admin
 */
public class Composition {
    public static void main(String[] args) {
        House h = new House(4, 3, new Bathrooms(2, "Rough", true), new livingroom(40, 60, new Furniture(4)));
    }
}class Bathrooms{
    private int no;
    private String titletype;
    boolean joined;

    public Bathrooms(int no, String titletype, boolean joined) {
        this.no = no;
        this.titletype = titletype;
        this.joined = joined;
    }
    
}
class House{
    private int rooms;
   
    private int bhk;
    Bathrooms bathroom;
    livingroom livingroom;

    public House(int rooms, int bhk, Bathrooms bathroom, livingroom livingroom) {
        this.rooms = rooms;

        this.bhk = bhk;
        this.bathroom = bathroom;
        this.livingroom = livingroom;
    }

    public int getRooms() {
        System.out.println("TOTAL ROOMS");
        return rooms;
    }



    public String getBhk() {
        return "House is "+bhk+" BHK";
    }

    public Bathrooms getBathroom() {
        
        return bathroom;
    }

    public livingroom getLivingroom() {
        
        return livingroom;
    }
       
    
}

class livingroom{
    private int width;
    private int height;
    Furniture fur;

    public livingroom(int width, int height, Furniture fur) {
        this.width = width;
        this.height = height;
        this.fur = fur;
    }
    
}
class Furniture{
    private int no;

    public Furniture(int no) {
        this.no = no;
    }
    
}