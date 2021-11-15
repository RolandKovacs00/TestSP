import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Departament departamentMare = new Departament("Departament Mare");

        ArrayList<Element> elements = new ArrayList<Element>();
        Departament departamentMic = new Departament("Departament Mic", new Logistisca());

        IT itPers = new IT("Ion", "Asd 10", 2000, "Frontend", "IT");
        HR hrPers = new HR("Maria", "Wrfe 10", 2560, "Call", "HR");
        Manager mngPers = new Manager("Zoli", "Kui 78", 12560, "Boss", "Manager");

        departamentMic.add(itPers);
        departamentMic.add(hrPers);
        departamentMic.add(mngPers);

        departamentMare.add(departamentMic);

        departamentMare.print();

    }
}
