import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Cain {
    public static void main(String [] args){
        //PROBLEMS Task2 - Customer
        ArrayList<Customer> customerArrayList = new ArrayList<>();
        Customer customer1 = new Customer(1, "Berikkazy", "Madi", "Mukhitzhnauly", 1282004, "Aiteke bi 176", "87021874596");
        Customer customer2 = new Customer(2, "Kopbosyn", "Ulbosyn", "Kurmangazykyzy", 2572003, "Kazybek bi 23", "87725487856");
        Customer customer3 = new Customer(3, "Mendigereyeva", "Ayana", "Ibraykyzy", 1632004, "Tole bi 66", "87024587891");
        Customer customer4 = new Customer(4, "Nurdauletov", "Zhomart", "Alpamysuly", 18102005, "Pushkin 154", "87056428404");
        Customer customer5 = new Customer(5, "Seksenbaev", "Miras", "Mukhitovich", 2532005, "Balasagun 55", "87056408505");

        customerArrayList.add(customer1);
        customerArrayList.add(customer2);
        customerArrayList.add(customer3);
        customerArrayList.add(customer4);
        customerArrayList.add(customer5);

        //Sort by Alphabet
        Collections.sort(customerArrayList, new SortByName());
        for (Customer s : customerArrayList){
            System.out.println(s);
        }

        //Interval creditcard
        for (Customer s : customerArrayList){
            if (s.getCreditCard() > 1500000 && s.getCreditCard() < 2500000){
                System.out.println(s.getName() + " " + s.getSurname() + " " + s.getCreditCard());
            }
        }
    }
}



//task2 - Customer
class Customer {
    int id;
    String surname;
    String name;
    String middleName;
    int creditCard;
    String adress;
    String bankAccNum;

    public Customer(int id, String surname, String name, String middleName,
                    int creditCard, String adress, String bankAccNum) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.creditCard = creditCard;
        this.adress = adress;
        this.bankAccNum = bankAccNum;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", adress='" + adress + '\'' +
                ", creditCard='" + creditCard + '\'' +
                ", bankAccNum='" + bankAccNum + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }

    public String getBankAccNum() {
        return bankAccNum;
    }

    public void setBankAccNum(String bankAccNum) {
        this.bankAccNum = bankAccNum;
    }

}

//Customer - sortAlpahbet
class SortByName implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getName().compareTo(o2.getName());
    }
}



