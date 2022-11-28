public class Hotel {

    //singleton

    private static Hotel hotelObject;
    private String hotelAddress;
    private String hotelName;
    private String Employee; //Is an object in diagram but used as a string in this example
    private String resteraunt; //same as above
    private String rooms; //same as above
    private String customers; //same as above

    private static Hotel getHotelObject() {
        return hotelObject;
    }

    public static void setHotelObject(Hotel hotelObject) {
        Hotel.hotelObject = hotelObject;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getEmployee() {
        return Employee;
    }

    public String getResteraunt() {
        return resteraunt;
    }

    public String getRooms() {
        return rooms;
    }

    public String getCustomers() {
        return customers;
    }

    public Hotel(String hotelAddress, String hotelName, String employee, String resteraunt, String rooms, String customers) {
        this.hotelAddress = hotelAddress;
        this.hotelName = hotelName;
        Employee = employee;
        this.resteraunt = resteraunt;
        this.rooms = rooms;
        this.customers = customers;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }
}
