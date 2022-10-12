import java.util.ArrayList;

public class Cars {
    public static void main(String [] args){
        ArrayList<Car> carArrayList = new ArrayList<>();
        Car car1 = new Car(1, "BMW", "e39", 1997, "black", 14000, "6458562");
        Car car2 = new Car(2, "Mercedes", "s63", 2020, "white", 30000, "784512");
        Car car3 = new Car(3, "RollsRoyse", "Phantom", 2021, "oxfordblue", 45000, "32465489");
        Car car4 = new Car(4, "Toyota", "camry 70", 2019, "white", 3600, "894651651");
        Car car5 = new Car(5, "Volkswagen", "Golf", 2002, "green", 1200, "74128963");

        carArrayList.add(car1);
        carArrayList.add(car2);
        carArrayList.add(car3);
        carArrayList.add(car4);
        carArrayList.add(car5);

        //only 1 mark cars
        /*for (Car s : carArrayList){
            if (s.stamp.equals("Mercedes")){
                System.out.println(s);
            }
        }*/

        //one mark cars that are released before 2021
        /*for (Car s : carArrayList){
            if (s.stamp.equals("Mercedes") && s.yearRelease < 2021){
                System.out.println(s);
            }
        }*/

        //year of release and price is more expensive than given
        /*for (Car s : carArrayList){
            if (s.yearRelease == 2002 && s.price > 100){
                System.out.println(s);
            }
        }*/
    }
}

class Car{
    int id;
    String stamp;
    String model;
    int yearRelease;
    String color;
    int price;
    String registrationNum;

    public Car(int id, String stamp, String model, int yearRelease, String color, int price, String registrationNum){
        this.id = id;
        this.stamp = stamp;
        this.model = model;
        this.yearRelease = yearRelease;
        this.color = color;
        this.price = price;
        this.registrationNum = registrationNum;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", stamp='" + stamp + '\'' +
                ", model='" + model + '\'' +
                ", yearRelease=" + yearRelease +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", registrationNum='" + registrationNum + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStamp() {
        return stamp;
    }

    public void setStamp(String stamp) {
        this.stamp = stamp;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRegistrationNum() {
        return registrationNum;
    }

    public void setRegistrationNum(String registrationNum) {
        this.registrationNum = registrationNum;
    }
}
