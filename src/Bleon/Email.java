package Bleon;

public class Email {


    private String sender;
    private String recipient;
    private String message;

    public Email()  {this ("Unknown","Unknown","Unknown"); }


    public Email(String sender,String recipient,String message) {
        setSender(sender);
        setRecipient(recipient);
        setMessage(message);

    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toString(){
        return String.format("sender %15s\n  recipient %15s\n  message %15s\n",getSender(),getRecipient(),getMessage() );
    }

}














