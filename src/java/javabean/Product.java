package javabean;

import java.text.NumberFormat;
import java.util.Locale;

public class Product {
    private int ID;
    private String product_name;
    private String image;
    private int price;
    private int numbers;
    private String categoryname;
    private String description;
    private int userID;
    private int categoryID;

    public Product(){}

    public Product(int ID, String product_name, String image, int price, int numbers, String categoryname, String description, int userID, int categoryID) {
        this.ID = ID;
        this.product_name = product_name;
        this.image = image;
        this.price = price;
        this.numbers = numbers;
        this.categoryname = categoryname;
        this.description = description;
        this.userID = userID;
        this.categoryID = categoryID;
    }

    public Product(String product_name, String image, int price) {
        this.product_name = product_name;
        this.image = image;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    @Override
    public String toString() {
        return "Product{" + "ID=" + ID + ", product_name=" + product_name + ", image=" + image + ", price=" + price + ", numbers=" + numbers + ", categoryname=" + categoryname + ", description=" + description + ", userID=" + userID + ", categoryID=" + categoryID + '}';
    }
    
    public String formatNumber(int price){
        String prices="";
        Locale locale = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        prices += numberFormat.format(price);
        return prices;
    }
    
}
