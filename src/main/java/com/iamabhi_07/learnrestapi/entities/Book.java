package com.iamabhi_07.learnrestapi.entities;

public class Book {
    private int bId;
    private String bName;
    private String bTitle;
    private String bAuthor;
    private int bPrice;
    
    public Book(int bId, String bName, String bTitle, String bAuthor, int bPrice) {
        this.bId = bId;
        this.bName = bName;
        this.bTitle = bTitle;
        this.bAuthor = bAuthor;
        this.bPrice = bPrice;
    }

    public Book() {
    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbTitle() {
        return bTitle;
    }

    public void setbTitle(String bTitle) {
        this.bTitle = bTitle;
    }

    public String getbAuthor() {
        return bAuthor;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }

    public int getbPrice() {
        return bPrice;
    }

    public void setbPrice(int bPrice) {
        this.bPrice = bPrice;
    }

    @Override
    public String toString() {
        return "book [bId=" + bId + ", bName=" + bName + ", bTitle=" + bTitle + ", bAuthor=" + bAuthor + ", bPrice="
                + bPrice + "]";
    }
    
    

}
