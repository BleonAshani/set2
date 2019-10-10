package Bleon;

public class BookDriver {
    public static void main(String[] args) {
          books bk = new books();

          System.out.println(bk.toString());

        books bk2 = new books("Bleon","aghalegas464364",1,45.54f);

        System.out.println(bk2.toString());
    }
}
