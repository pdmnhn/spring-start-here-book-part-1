package models;

public class Comment {
    private String text;
    private String author;

    public String getText() {
        return text;
    }

    public Comment setText(String text) {
        this.text = text;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Comment setAuthor(final String author) {
        this.author = author;
        return this;
    }

    public String toString() {
        return "Author " + this.getAuthor() + " commented " + this.getText();
    }
}
