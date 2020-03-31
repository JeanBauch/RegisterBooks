package com.example.livros.model;

/**
 * Book
 */
public class Book {
    private String name;
    private String author;
    private int edition;
    private int numPag;
    private double cost;

    public Book(String name, String author, int edition, int numPag, double cost) {
        this.name = name;
        this.author = author;
        this.edition = edition;
        this.numPag = numPag;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Book [author=" + author + ", cost=" + cost + ", edition=" + edition + ", name=" + name
                + ", numPag=" + numPag + "]";
    }
}