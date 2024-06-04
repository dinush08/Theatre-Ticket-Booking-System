
public class Ticket {
    int row_number;
    int seat_number;
    double price;
    Person person;


    public Ticket(Person person, int row_number, int seat_number, double price) {
        this.person = person;
        this.row_number = row_number;
        this.seat_number = seat_number;
        this.price = price;

    }


    public void print_method(){
        System.out.println("name : "+ person.name);
        System.out.println("surname : "+person.surname);
        System.out.println("email : "+person.email);
        System.out.println("row number : "+row_number);
        System.out.println("seat number : "+seat_number);
        System.out.println("price : "+price);
        System.out.println();
        }
    }


