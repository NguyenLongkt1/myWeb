package javabean;

public class Cart {
    private int userID;
    private String userName;
    private int productID;
    private String productName;
    private String image;
    private int price;
    private int numbers;
    private int total_price;
    private int categoryID;
    private String categoryName;
    private String seller;
    
    public Cart(){}

    public Cart(String userName, String productName, String image, int price, int numbers, int total_price) {
        this.userName = userName;
        this.productName = productName;
        this.image = image;
        this.price = price;
        this.numbers = numbers;
        this.total_price = total_price;
    }
    
    public Cart(int userID, String userName, int productID, String productName, String image, int price, int numbers, int total_price, int categoryID, String categoryName, String seller) {
        this.userID = userID;
        this.userName = userName;
        this.productID = productID;
        this.productName = productName;
        this.image = image;
        this.price = price;
        this.numbers = numbers;
        this.total_price = total_price;
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.seller = seller;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }
    
}
