public class Book {
    String label;
    Author author;
    int year;
    public Book (String label, Author author, int year){
        this.label = label;
        this.author =  author;
        this.year = year;
    }
    public String getLabel(){
        return this.label;
    }
    public Author getAuthor(){
        return this.author;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year = year;
    }
}
