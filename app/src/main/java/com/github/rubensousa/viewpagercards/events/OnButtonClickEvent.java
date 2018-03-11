package com.github.rubensousa.viewpagercards.events;



public class OnButtonClickEvent {

    private final String message;

    public OnButtonClickEvent(String message){
        this.message=message;
    }

    public String getMessage(){
        return message;
    }
}
