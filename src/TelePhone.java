import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TelePhone {
    public static void main(String [] args){
        ArrayList<Phone> phoneArrayList = new ArrayList<>();
        Phone phone1 = new Phone(1, "Berikkazy", "Madi", "Mukhitzhnauly",  "Aiteke bi 176","1282004", 15000, 50000000, 20, 15);
        Phone phone2 = new Phone(2, "Kopbosyn", "Ulbosyn", "Kurmangazykyzy",  "Kazybek bi 23","2572003",  27000, 1200000, 25, 20);
        Phone phone3 = new Phone(3, "Mendigereyeva", "Ayana", "Ibraykyzy",  "Tole bi 66","1632004",  83000, 454000, 30, 15);
        Phone phone4 = new Phone(4, "Nurdauletov", "Zhomart", "Alpamysuly",  "Pushkin 154","18102005",  9000, 32000, 10, 7);
        Phone phone5 = new Phone(5, "Seksenbaev", "Miras", "Mukhitovich",  "Balasag", "2532005", 51400, 170000, 40, 15);

        phoneArrayList.add(phone1);
        phoneArrayList.add(phone2);
        phoneArrayList.add(phone3);
        phoneArrayList.add(phone4);
        phoneArrayList.add(phone5);

        //has abroad calls
        /*for (Phone s : phoneArrayList){
            if (s.timeAmongCities > 0){
                System.out.println(s.getId() + " has minutes among city calls: " + s.timeAmongCities);
            }
        }*/

        //more minutes than given
        /*for (Phone s : phoneArrayList){
            if (s.timeInCity > 15){
                System.out.println(s.getId() + " has more minutes than 15 in city: " + s.timeInCity);
            }
        }*/

        //sort by alphabet
        for (Phone s : phoneArrayList){
            System.out.println("original list: " + '\n' + s);
        }

        Collections.sort(phoneArrayList, new SortAtymen());
        for (Phone s : phoneArrayList){
            System.out.println("sorted list: " + '\n' + s);
        }
    }
}

class Phone{
    int id;
    String surname;
    String name;
    String middleName;
    String adress;
    String creditCardNum;
    int debet;
    int credit;
    int timeInCity;
    int timeAmongCities;

    public Phone(int id, String surname, String name,
    String middleName, String adress, String creditCardNum, int debet, int credit, int timeInCity, int timeAmongCities){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.adress = adress;
        this.creditCardNum = creditCardNum;
        this.debet = debet;
        this.credit = credit;
        this.timeInCity = timeInCity;
        this.timeAmongCities = timeAmongCities;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", adress='" + adress + '\'' +
                ", creditCardNum='" + creditCardNum + '\'' +
                ", debet=" + debet +
                ", credit=" + credit +
                ", timeInCity=" + timeInCity +
                ", timeAmongCities=" + timeAmongCities +
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

    public String getCreditCardNum() {
        return creditCardNum;
    }

    public void setCreditCardNum(String creditCardNum) {
        this.creditCardNum = creditCardNum;
    }

    public int getDebet() {
        return debet;
    }

    public void setDebet(int debet) {
        this.debet = debet;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getTimeInCity() {
        return timeInCity;
    }

    public void setTimeInCity(int timeInCity) {
        this.timeInCity = timeInCity;
    }

    public int getTimeAmongCities() {
        return timeAmongCities;
    }

    public void setTimeAmongCities(int timeAmongCities) {
        this.timeAmongCities = timeAmongCities;
    }
}

class SortAtymen implements Comparator<Phone> {
    @Override
    public int compare(Phone o1, Phone o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

