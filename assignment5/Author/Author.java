package assignment5.Author;

public class Author {
    private String name;
    private String email;
    private Character gender;

    public Author(String name,String email,Character gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Character getGender() {
        return gender;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return this.name + "("+this.gender+") at "+this.email;
    }
}
