public class Author {
    String name;
    String lastName;
    public Author (String name, String last_name){
        this.name = name;
        this.lastName =  last_name;
    }
    public String getName(){
        return this.name;
    }
    public String getLastName(){
        return this.lastName;
    }
}
