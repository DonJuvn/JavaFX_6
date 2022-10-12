import java.util.ArrayList;

public class Pain {
    public static void main(String [] args){
        //PROBLEMS Task3 - Patient
        ArrayList<Patient> patientArrayList = new ArrayList<>();
        Patient pateient1 = new Patient(1, "Berikkazy", "Madi", "Mukhitzhnauly",  "Aiteke bi 176", "87021874596", 1282004,  "Cancer");
        Patient pateient2 = new Patient(2, "Kopbosyn", "Ulbosyn", "Kurmangazykyzy",  "Kazybek bi 23", "87725487856", 2572003,  "Asthma");
        Patient pateient3 = new Patient(3, "Mendigereyeva", "Ayana", "Ibraykyzy",  "Tole bi 66", "87024587891", 1632004,  "BreakAnkle");
        Patient pateient4 = new Patient(4, "Nurdauletov", "Zhomart", "Alpamysuly",  "Pushkin 154", "87056428404", 18102005,  "Headache");
        Patient pateient5 = new Patient(5, "Seksenbaev", "Miras", "Mukhitovich",  "Balasagun 55", "87056408505", 2532005,  "HeartBreathe");

        patientArrayList.add(pateient1);
        patientArrayList.add(pateient2);
        patientArrayList.add(pateient3);
        patientArrayList.add(pateient4);
        patientArrayList.add(pateient5);

        //Patient with diagnosis
        for (Patient s : patientArrayList){
            if(s.getDiagnosis().equals("Asthma")){
                System.out.println("patient with asthma: " + s);
            }
        }

        //Interval creditcard
        for (Patient s : patientArrayList){
            if (s.getMedCard() > 1500000 && s.getMedCard() < 2500000){
                System.out.println(s.getName() + " " + s.getSurname() + ", Credit card: " + s.getMedCard());
            }
        }

    }
}


//task3 - Patient
class Patient {
    int id;
    String surname;
    String name;
    String middleName;
    String adress;
    String phoneNum;
    int medCard;
    String diagnosis;

    public Patient(int id, String surname, String name, String middleName, String adress,
                    String phoneNum, int medCard, String diagnosis) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.adress = adress;
        this.phoneNum = phoneNum;
        this.medCard = medCard;
        this.diagnosis = diagnosis;
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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getMedCard() {
        return medCard;
    }

    public void setMedCard(int medCard) {
        this.medCard = medCard;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", adress='" + adress + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", medCard=" + medCard +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}
