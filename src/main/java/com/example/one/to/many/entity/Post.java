package com.example.one.to.many.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String title;
    private String desctiption;
@OneToMany(cascade = CascadeType.ALL)
        @JoinColumn(name = "pc_did",referencedColumnName = "id")
    List<Comment> comments=new ArrayList<>();
    public  Post(){

    }


    public Post( String title, String desctiption) {

        this.title = title;
        this.desctiption = desctiption;

    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesctiption() {
        return desctiption;
    }

    public void setDesctiption(String desctiption) {
        this.desctiption = desctiption;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
