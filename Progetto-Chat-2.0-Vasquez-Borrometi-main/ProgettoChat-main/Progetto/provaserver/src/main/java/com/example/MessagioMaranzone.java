package com.example;
public class MessagioMaranzone {
    
    private String mitente; 
    private String destinatario;
    private String msg;
    private String sessione;

    public MessagioMaranzone(String mitente, String destinatario,String msg,String sessione) {
        this.mitente = mitente;
        this.destinatario = destinatario;
        this.msg=msg;
        this.sessione=sessione;
    }

    public MessagioMaranzone(String mitente, String msg, String sessione) {
        this.mitente = mitente;
        this.destinatario="tutti";
        this.msg = msg;
        this.sessione = sessione;
    }

    public String getMitente() {
        return mitente;
    }

    public void setMitente(String mitente) {
        this.mitente = mitente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getSessione() {
        return sessione;
    }

    public void setSessione(String sessione) {
        this.sessione = sessione;
    }


    
    

}