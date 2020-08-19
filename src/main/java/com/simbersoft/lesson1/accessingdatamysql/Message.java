package com.simbersoft.lesson1.accessingdatamysql;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String text;


    public Message() {

    }

    public Message(String text) {
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }




}
