import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

    public class Main {
        public static int[] row_1={0,0,0,0,0,0,0,0,0,0,0,0};      //row_1 array
        public static int[] row_2={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};  //row_2 array
        public static int[] row_3={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};  //row_3 array
        static ArrayList<Ticket> ticket_array = new ArrayList<Ticket>();   //ArrayList Define
        static int seat_number;


        static void bye_ticket_method() {


            Scanner input_4 = new Scanner(System.in);
            System.out.print("Enter your name: ");        // get name input
            String name = input_4.nextLine();


            Scanner input_5 = new Scanner(System.in);
            System.out.print("Enter your surname: ");   // get surname input
            String surname = input_5.nextLine();
            String email;
            while (true) {
                Scanner input_6 = new Scanner(System.in);
                System.out.print("Enter your email: ");
                email = input_6.nextLine();
                if (email.contains("@") && email.contains(".")) {
                    break;
                }else{
                    System.out.println("Enter valid email ! ");
                }
            }

            double price;
            while (true) {
                try {
                    Scanner input_7 = new Scanner(System.in);
                    System.out.print("Enter Price: ");             //get price input
                    price = input_7.nextDouble();
                    break;
                } catch (Exception e) {
                    System.out.println("Enter valid Price ! ");
                }
            }


            int row_number;
            while (true) {
                try {
                    Scanner input_2 = new Scanner(System.in);
                    System.out.print("Enter row number: ");         //get row number input
                    row_number = input_2.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Enter valid row number ! ");
                }
            }


            int seat_number = 0;


            if (row_number > 0 && row_number < 4) {    //check row number valied or not

                while (true) {
                    try {
                        Scanner input_3 = new Scanner(System.in);
                        System.out.print("Enter seat number: ");            //get seat number input
                        seat_number = input_3.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println("Enter valied seat number !");
                    }
                }


                seat_number = seat_number - 1;

                if (row_number == 1) {
                    if (seat_number >= 0 && seat_number < 12) {      //check seat number valied or not
                        if (row_1[seat_number] == 0) {
                            row_1[seat_number] = 1;                  //check seat availavle or not
                        } else {
                            System.out.println("Seat is not available !");
                        }
                    } else {
                        System.out.println("Enter correct seat number !");
                    }
                } else if (row_number == 2) {
                    if (seat_number >= 0 && seat_number < 16) {         //check seat number valied or not
                        if (row_2[seat_number] == 0) {
                            row_2[seat_number] = 1;                     //check seat availavle or not
                        } else {
                            System.out.print("Seat is not available !");
                        }
                    } else {
                        System.out.print("Enter correct seat number !");
                    }
                } else {
                    if (seat_number >= 0 && seat_number < 20) {           //check seat number valied or not
                        if (row_3[seat_number] == 0) {
                            row_3[seat_number] = 1;                       //check seat availavle or not
                        } else {
                            System.out.print("Seat is not available !");
                        }
                    } else {
                        System.out.print("Enter correct seat number !");
                    }
                }
            } else {
                System.out.println("Enter correct row number !");
            }


            Person person = new Person(name, surname, email);                                     //creat person object
            Ticket ticket_obj = new Ticket(person, row_number, seat_number + 1, price);    //creat ticket object

            ticket_array.add(ticket_obj);          //add ticket to arraylist
        }  //bye_ticket_method

        static void print_seating_area_method(){
            System.out.println();
            System.out.println("     ***********     ");
            System.out.println("     *  STAGE  *     ");           //stage alignment
            System.out.println("     ***********     ");
            System.out.print("    ");
            for (int i =1;i<=row_1.length;i++) {
                if(i==6){
                    System.out.print("   ");
                }
                if(row_1[i-1]==0){
                    System.out.print("O");
                }
                else{
                    System.out.print("X");
                }
            }
            System.out.println();
            System.out.print("  ");
            for (int i =1;i<=row_2.length;i++) {
                if(i==8){
                    System.out.print("   ");
                }
                if(row_2[i-1]==0){
                    System.out.print("O");
                }
                else{
                    System.out.print("X");
                }
            }
            System.out.println();

            for (int i =1;i<=row_3.length;i++) {
                if(i==10){
                    System.out.print("   ");
                }
                if(row_3[i-1]==0){
                    System.out.print("O");
                }
                else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }  //print_seating_area_method

        static void cancel_ticket_method(){

            int row_number;
            while (true) {
                try {
                    Scanner input_2 = new Scanner(System.in);
                    System.out.print("Enter row number: ");           //get row number
                    row_number = input_2.nextInt();
                    break;
                }catch (Exception e) {
                    System.out.println("Enter valied row number !");   //check row number is valied or not
                }
            }

            if (row_number > 0 && row_number < 4) {                    //check row number is correct or not

                while (true) {
                    try {
                        Scanner input_3 = new Scanner(System.in);
                        System.out.print("Enter seat number: ");       //get seat number
                        seat_number = input_3.nextInt();
                        break;
                    }catch (Exception e){
                        System.out.println("Enter valied seat number !");   //check seat number is valied or not
                    }
                }

                seat_number=seat_number-1;

                if (row_number==1){
                    if(seat_number>=0 && seat_number<12){                    //check seat number is correct or not
                        if(row_1[seat_number]==1){
                            row_1[seat_number] = 0;
                        }
                        else {
                            System.out.println("Seat is already available !");
                        }
                    }
                    else{
                        System.out.println("Enter correct seat number !");
                    }
                }
                else if (row_number==2) {
                    if(seat_number>=0 && seat_number<16){                   //check seat number is correct or not
                        if(row_2[seat_number]==1){
                            row_2[seat_number] = 0;
                        }
                        else {
                            System.out.println("Seat is already available !");
                        }
                    }
                    else {
                        System.out.println("Enter correct seat number !");
                    }
                }
                else {
                    if (seat_number>=0 && seat_number<20){                 //check seat number is correct or not
                        if(row_3[seat_number]==1){
                            row_3[seat_number] = 0;                        //check seat number is available or not
                        }
                        else {
                            System.out.println("Seat is already available !");
                        }
                    }
                    else {
                        System.out.println("Enter correct seat number !");
                    }
                }
            }
            else {
                System.out.println("Enter correct row number !");
            }
            for(int i =0;i<ticket_array.size();i++){
                if(row_number==ticket_array.get(i).row_number&& seat_number+1==ticket_array.get(i).seat_number){       // remove seat from list
                    ticket_array.remove(i);
                }
            }
        }  // cancel_ticket_method

        static void show_available_method(){
            System.out.print("Seats available in row 1: ");
            for (int j=0;j<row_1.length;j++) {
                if(j==row_1.length-1){
                    if (row_1[j] == 0) {
                        System.out.print(j+1+". ");         //check available seats in row_1
                    }
                }
                else {
                    if (row_1[j] == 0) {
                        System.out.print(j+1+", ");
                    }
                }
            }
            System.out.println();

            System.out.print("Seats available in row 2: ");
            for (int j=0;j<row_2.length;j++)  {
                if(j==row_2.length-1){
                    if (row_2[j] == 0) {
                        System.out.print(j+1+". ");        //check available seat in row_2
                    }
                }
                else {
                    if (row_2[j] == 0) {
                        System.out.print(j+1+", ");
                    }
                }
            }
            System.out.println();

            System.out.print("Seats available in row 3: ");
            for (int j=0;j<row_3.length;j++) {
                if(j==row_3.length-1){
                    if (row_3[j] == 0) {
                        System.out.print(j+1+". ");       //check available seat in row_3
                    }
                }
                else {
                    if (row_3[j] == 0) {
                        System.out.print(j+1+", ");
                    }
                }
            }
        }  //show_available_method

        static void save_method() {
            try {
                File file = new File("text.txt");
                boolean file_created = file.createNewFile();
                if (file_created) {
                    System.out.println("File created: " + file.getName());    //creat new file
                }
                else {
                    System.out.println("Error while creating file: " + file.getName());
                }

                BufferedWriter outputWriter = null;
                outputWriter = new BufferedWriter(new FileWriter(file));
                outputWriter.write(Arrays.toString(row_1));
                outputWriter.newLine();
                outputWriter.write(Arrays.toString(row_2));
                outputWriter.newLine();                                        //add rows to arrays
                outputWriter.write(Arrays.toString(row_3));
                outputWriter.flush();
                outputWriter.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }  //save_method

        static void load_method(){
            try{
                File file = new File("text.txt");
                Scanner file_reader = new Scanner(file);
                while (file_reader.hasNextLine()){                     //load from file
                    String text = file_reader.nextLine();
                    System.out.println(text);
                }
            }
            catch (IOException e) {
                System.out.println("Error while reading a file.");
                e.printStackTrace();
            }
        }  //load_method

        static void show_tickets_info_method(){
            double total_price=0;
            for(int i=0;i<ticket_array.size();i++){
                total_price=total_price+ticket_array.get(i).price;
                Ticket ticket_obj = ticket_array.get(i);                  //print tickets and calculate total price
                ticket_obj.print_method();
            }
            System.out.println("Total price : "+ total_price);
        }  //show_tickets_info_method

        static void sort_tickets_method() {
            int top = ticket_array.size() - 2;
            Ticket temp;
            boolean change = true;
            while (change) {
                change = false;
                for (int i = 0; i <= top; i++) {
                    if (ticket_array.get(i).price > ticket_array.get(i + 1).price) {         //sort the list
                        temp = ticket_array.get(i);
                        ticket_array.set(i, ticket_array.get(i + 1));
                        ticket_array.set((i + 1), temp);
                        change = true;
                    }
                }
                top--;
            }

            for(int i=0;i<ticket_array.size();i++){
                Ticket ticket_obj = ticket_array.get(i);
                ticket_obj.print_method();
            }
        } //sort_tickets_method


        public static void main(String[] args) {
            System.out.println("Welcome to the New Theatre");
            int entered_option;
            do {
                System.out.println();
                System.out.println("---------------------------------------");
                System.out.println("Please select an option:");
                System.out.println("1) Buy a ticket");
                System.out.println("2) Print seating area");
                System.out.println("3) Cancel ticket");                                        //menu
                System.out.println("4) List available seats");
                System.out.println("5) Save to file");
                System.out.println("6) Load from file");
                System.out.println("7) Print ticket information and total price");
                System.out.println("8) Sort tickets by price");
                System.out.println("0) Quit");
                System.out.println("---------------------------------------");
                while(true) {
                    try {
                        Scanner input_1 = new Scanner(System.in);
                        System.out.print("Enter option: ");
                        entered_option = input_1.nextInt();                               //check option is valied or not
                        break;
                    }catch (Exception e){
                        System.out.println("Enter valid option ! ");
                    }
                }
                if (!(entered_option >= 0 && entered_option < 9)) {
                    System.out.println("Enter valied option !");
                }


                if (entered_option == 1) {
                    bye_ticket_method();
                }
                else if (entered_option == 2) {
                    print_seating_area_method();
                }
                else if (entered_option == 3) {
                    cancel_ticket_method();
                }
                else if (entered_option == 4) {
                    show_available_method();
                }
                else if (entered_option == 5) {
                    save_method();
                }
                else if (entered_option == 6) {
                    load_method();
                } else if (entered_option == 7) {
                    show_tickets_info_method();
                } else if (entered_option == 8) {
                    sort_tickets_method();
                }
            } while (!(entered_option == 0 ));
        }
    }