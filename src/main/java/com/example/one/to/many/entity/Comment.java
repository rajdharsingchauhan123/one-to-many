package com.example.one.to.many.entity;

import javax.persistence.*;

@Entity
@Table(name = "comment")
public class Comment {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String txt;
    public Comment(){

    }


    public Comment(String txt) {
        this.txt = txt;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
}
