package com.example.flavourecipe;

public class firebasemodel {

    private String title;
    private String content;

    public firebasemodel()
    {

    }

    //parameterized constructor with two parameters title and content
    public firebasemodel (String title, String content)
    {
        this.title=title;
        this.content=content;
    }

    //getter for title
    public String getTitle() {
        return title;
    }

    //setter for title
    public void setTitle(String title) {

        this.title = title;
    }

    //getter for content
    public String getContent() {

        return content;
    }

    //setter for content
    public void setContent(String content) {

        this.content = content;
    }
}

