package com.example;

public class Request {
    
    private MessagioMaranzone maranzone;

    public MessagioMaranzone getMaranzone() {
        return maranzone;
    }

    public void setMaranzone(MessagioMaranzone maranzone) {
        this.maranzone = maranzone;
    }

    public Request(MessagioMaranzone maranzone) {
        this.maranzone = maranzone;
    }

    
}
