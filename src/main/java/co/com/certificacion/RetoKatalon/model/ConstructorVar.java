package co.com.certificacion.RetoKatalon.model;

public class ConstructorVar {
    private String username;
    private String password;
    private String date;
    private String comment;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ConstructorVar(String username, String password, String date, String comment) {
        this.username = username;
        this.password = password;
        this.date = date;
        this.comment = comment;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}