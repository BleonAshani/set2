package Bleon;

public class books {

    private int NumofPages;
    private float Price;
    private String Title;
    private String ISBN;

    public books()  {this ( "Unknown", "Unknown", 0, 0); }



    public books(String Title, String ISBN, int NumofPages, float Price) {
        setTitle(Title);
        setISBN(ISBN);
        setNumofPages(NumofPages);
        setPrice(Price);
    }
    public int getNumofPages() {
        return NumofPages;
    }

    public double getPrice() {
        return Price;
    }

    public String getTitle() {
        return Title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setNumofPages(int numofPages) {
        NumofPages = numofPages;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String toString(){
        return String.format("Title %15s\n  ISBN %15s\n  Price %15.2f\n  NumbofPages %15d\n\n",getTitle(),getISBN(),getPrice(),getNumofPages());
    }


}
