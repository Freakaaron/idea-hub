package com.cuny.idea.bean;

public class Idea {
    private int id;
    private String title;
    private String description;
    private int upvotes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(int upvotes) {
        this.upvotes = upvotes;
    }

    @Override
    public String toString() {
        return String.format("Idea [id=%s, title=%s, upvotes=%s]", id, title, upvotes);
    }
}
