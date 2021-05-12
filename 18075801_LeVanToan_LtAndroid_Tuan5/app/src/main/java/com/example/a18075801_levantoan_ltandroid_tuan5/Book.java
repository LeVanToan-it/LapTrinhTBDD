package com.example.a18075801_levantoan_ltandroid_tuan5;

public class Book {
    private int photo;
    private String name;

    public Book() {
    }

    public Book(int photo, String name) {
        this.photo = photo;
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "photo=" + photo +
                ", name='" + name + '\'' +
                '}';
    }
}
