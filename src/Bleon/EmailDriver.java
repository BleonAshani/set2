package Bleon;

import Bleon.Email;

public class EmailDriver {
    public static void main(String[] args) {
        Email em = new Email();

        System.out.println(em.toString());

        Email em2 = new Email("Bleon","joe","get a job");

        System.out.println(em2.toString());
    }
}
