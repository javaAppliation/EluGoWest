package com.exa;

public class ProductBean {

    private String name;

    private  boolean done = false;

    private String getName(){
        return this.name;
    }

    private void setName(String name ){
        this.name = name ;
    }

    public boolean isDone(){
        return this.done;
    }

    public void setDone(boolean done ){
        this.done = done;
    }



}
