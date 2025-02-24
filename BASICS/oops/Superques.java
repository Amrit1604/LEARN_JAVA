package BASICS.oops;

public class Superques {
    
    class Event {
        protected String name;
        protected String detail;
        protected String type;
        protected String organiserName;

        public Event() {}

        public Event(String name, String detail, String type, String organiserName) {
            this.name = name;
            this.detail = detail;
            this.type = type;
            this.organiserName = organiserName;
        }

        // Getters and Setters
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getDetail() { return detail; }
        public void setDetail(String detail) { this.detail = detail; }
        public String getType() { return type; }
        public void setType(String type) { this.type = type; }
        public String getOrganiserName() { return organiserName; }
        public void setOrganiserName(String organiserName) { this.organiserName = organiserName; }
    }

    class Exhibition extends Event {
        private Integer noOfStalls;

        public Exhibition() {}

        public Exhibition(String name, String detail, String type, String organiserName, Integer noOfStalls) {
            super(name, detail, type, organiserName);
            this.noOfStalls = noOfStalls;
        }

        public Integer getNoOfStalls() { return noOfStalls; }
        public void setNoOfStalls(Integer noOfStalls) { this.noOfStalls = noOfStalls; }
    }

    class StageEvent extends Event {
        private Integer noOfSeats;

        public StageEvent() {}

        public StageEvent(String name, String detail, String type, String organiserName, Integer noOfSeats) {
            super(name, detail, type, organiserName);
            this.noOfSeats = noOfSeats;
        }

        public Integer getNoOfSeats() { return noOfSeats; }
        public void setNoOfSeats(Integer noOfSeats) { this.noOfSeats = noOfSeats; }
    }

    class Main {
        public static void main(String[] args) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.println("Choose Event type");
            System.out.println("1.Exhibition");
            System.out.println("2.StageEvent");
            
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline
            
            if (choice != 1 && choice != 2) {
                System.out.println("Invalid choice");
                return;
            }

            System.out.println("Enter the details in CSV format");
            String[] details = sc.nextLine().split(",");

            if (choice == 1) {
                Exhibition exhibition = new Exhibition(details[0], details[1], details[2], details[3], 
                    Integer.parseInt(details[4]));
                System.out.println("Event Name:" + exhibition.getName());
                System.out.println("Detail:" + exhibition.getDetail());
                System.out.println("Type:" + exhibition.getType());
                System.out.println("Organiser Name:" + exhibition.getOrganiserName());
                System.out.println("Number of stalls:" + exhibition.getNoOfStalls());
            } else {
                StageEvent stageEvent = new StageEvent(details[0], details[1], details[2], details[3], 
                    Integer.parseInt(details[4]));
                System.out.println("Event Name:" + stageEvent.getName());
                System.out.println("Detail:" + stageEvent.getDetail());
                System.out.println("Type:" + stageEvent.getType());
                System.out.println("Organiser Name:" + stageEvent.getOrganiserName());
                
                System.out.println("Number of seats:" + stageEvent.getNoOfSeats());
            }
        }
    }








    
}
