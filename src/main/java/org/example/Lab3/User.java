package org.example.Lab3;

import java.util.ArrayList;

public class User
{
    private String username, email;
    private ArrayList<Media> purchaseMediaList;
    private ArrayList<Media> shoppingCart;




    public User(ArrayList<Media> purchaseMediaList, ArrayList<Media> shoppingCart) {
        this.purchaseMediaList = purchaseMediaList;
        this.shoppingCart = shoppingCart;
    }

    public void addToCart(Media media){
        shoppingCart.add(media);
    }

    public void removeFromCart(Media media){
        shoppingCart.remove(media);
    }

    public void checkOut(){
        double totalAmount=0;
        ArrayList<Media> delete = new ArrayList<>();
        for (Media m : shoppingCart) {
            totalAmount += m.getPrice();
            purchaseMediaList.add(m);
            delete.add(m);
        }
        for (Media m : delete) {
            shoppingCart.remove(m);
            System.out.println(m.getTitle());
        }
        System.out.println("total price is "+totalAmount);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Media> getPurchaseMediaList() {
        return purchaseMediaList;
    }

    public User(String username, String email, ArrayList<Media> purchaseMediaList, ArrayList<Media> shoppingCart) {
        this.username = username;
        this.email = email;
        this.purchaseMediaList = purchaseMediaList;
        this.shoppingCart = shoppingCart;
    }

    public User() {
    }

    public void setPurchaseMediaList(ArrayList<Media> purchaseMediaList) {
        this.purchaseMediaList = purchaseMediaList;
    }

    public ArrayList<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ArrayList<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", purchaseMediaList=" + purchaseMediaList +
                ", shoppingCart=" + shoppingCart +
                '}';
    }
}
