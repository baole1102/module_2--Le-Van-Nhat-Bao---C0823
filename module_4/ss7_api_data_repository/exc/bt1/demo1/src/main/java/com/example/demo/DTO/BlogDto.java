package com.example.demo.DTO;

import lombok.Data;

@Data
public class BlogDto {
    private Long id;
    private String name;
    private String content;
    private String date;
    private String author;
    private String img;
    private String nameCatelogy;

    public BlogDto() {
    }

    public BlogDto(Long id, String name, String content, String date, String author, String img, String nameCatelogy) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.date = date;
        this.author = author;
        this.img = img;
        this.nameCatelogy = nameCatelogy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getNameCatelogy() {
        return nameCatelogy;
    }

    public void setNameCatelogy(String nameCatelogy) {
        this.nameCatelogy = nameCatelogy;
    }
}
