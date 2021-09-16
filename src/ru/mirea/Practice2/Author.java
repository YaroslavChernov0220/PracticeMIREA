package ru.mirea.Practice2;

public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String name, char gender, String email) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        String g = new String("m");
        if (gender == 'F')
            g = "ms";
        else if (gender == 'U')
            g = "unknown";

        return   name +  " (" + g + ") " + "at " +  email;
    }
}
