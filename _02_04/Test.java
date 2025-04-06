package _02_04;

public class Test {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        ticket.setDestination("234234");
        String b = ticket.getDestination();
        System.out.println(b);
    }
}
