import java.util.ArrayList;

public class Hain {
    public static void main(String [] args){
        //PROBLEMS Task6 - House
        ArrayList<House> houseArrayList = new ArrayList<>();
        House house1 = new House(1, 43, 65, 5, 2, "Beverly", "kirpish", 50);
        House house2 = new House(2, 25, 48, 2,  9, "takhom", "agash", 50);
        House house3 = new House(3, 168, 69, 3,  6, "Junisaliev", "tas", 50);
        House house4 = new House(4, 14, 87, 3,  2, "pushkin", "tas", 50);
        House house5 = new House(5, 254, 120, 4, 7, "mambetbatyr", "kirpish", 50);

        houseArrayList.add(house1);
        houseArrayList.add(house2);
        houseArrayList.add(house3);
        houseArrayList.add(house4);
        houseArrayList.add(house5);

        //Houses with 2 rooms
        for (House s : houseArrayList){
            if (s.getRoomsQuantity() == 2){
                System.out.println(s.number + " " + s.getRoomsQuantity() + " rooms");
            }
        }

        //Houses with 2 rooms and 2 - 4 floor interval
        for (House s : houseArrayList){
            if (s.getRoomsQuantity() == 2){
                if (s.getFloor() > 1 && s.getFloor() < 5){
                    System.out.println(s);
                }
            }
        }

        //Houses with more area than 60
        for (House s : houseArrayList){
            if (s.area > 60){
                System.out.println(s.number + " area: " + s.area);
            }
        }
    }
}

//task6 - House
class House{
    int id;
    int number;
    int area;
    int floor;
    int roomsQuantity;
    String street;
    String typeOfBuilding;
    int serviceLife;

    public House (int id, int number, int area, int floor, int roomsQuantity, String street, String typeOfBuilding, int serviceLife){
        this.id = id;
        this.number = number;
        this.area = area;
        this.floor = floor;
        this.roomsQuantity = roomsQuantity;
        this.street = street;
        this.typeOfBuilding = typeOfBuilding;
        this.serviceLife = serviceLife;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", number=" + number +
                ", area=" + area +
                ", floor=" + floor +
                ", roomsQuantity=" + roomsQuantity +
                ", street='" + street + '\'' +
                ", typeOfBuilding='" + typeOfBuilding + '\'' +
                ", serviceLife=" + serviceLife +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRoomsQuantity() {
        return roomsQuantity;
    }

    public void setRoomsQuantity(int roomsQuantity) {
        this.roomsQuantity = roomsQuantity;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTypeOfBuilding() {
        return typeOfBuilding;
    }

    public void setTypeOfBuilding(String typeOfBuilding) {
        this.typeOfBuilding = typeOfBuilding;
    }

    public int getServiceLife() {
        return serviceLife;
    }

    public void setServiceLife(int serviceLife) {
        this.serviceLife = serviceLife;
    }
}
