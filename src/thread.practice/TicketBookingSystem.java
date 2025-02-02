package thread.practice;
//Simulate a simple real-world use case for multithreading (e.g., a ticket booking system).
class TicketCounter
{
    private int availableTickets=5;
    public synchronized void bookTicket(String name,int numTickets)
    {
        if(numTickets<=availableTickets)
        {
            System.out.println( name +" " + "booked " + numTickets + " " + "tickets");
            availableTickets = availableTickets-numTickets;
        }
        else
            System.out.println( "Not eligible to book tickets");
    }
}
class Customer extends Thread
{
  private TicketCounter counter;
  private String name;
  private  int numTickets;
  Customer(TicketCounter counter, String name, int numTickets)
  {
      this.counter = counter;
      this.name = name;
      this.numTickets = numTickets;
  }
  @Override
    public void run()
  {
      counter.bookTicket(name,numTickets);
  }

}
public class TicketBookingSystem {
    public static void main(String[] args)
    {
        TicketCounter counter = new TicketCounter();
        Thread t1 = new Customer(counter,"Alice",3);
        Thread t2 = new Customer(counter,"Bob",2);
        Thread t3 = new Customer(counter,"John",4);
        System.out.println(counter);
        t1.start();
        t2.start();
        t3.start();
    }
}
