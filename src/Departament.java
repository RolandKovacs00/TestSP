import java.util.ArrayList;

public class Departament implements Element{
    private String name;
    private Categorie cat;
    private ArrayList<Element> elements;

    public Departament(String name){
        this.name = name;
        this.elements = new ArrayList<Element>();
    }

    public Departament(String name,Categorie cat){
        this.name = name;
        this.elements = new ArrayList<Element>();
        this.cat = cat;
    }
    public Departament(String name, Categorie cat, ArrayList<Element> angajati) {
        this.name = name;
        this.cat = cat;
        this.elements = angajati;
    }

    public void setCat(Categorie cat) {
        this.cat = cat;
    }

    public void add(Element element){
        elements.add(element);
    }

    @Override
    public void print() {
        System.out.println("Departament " + this.name);
        if(elements != null){
            for(Element i: elements)
                i.print();
        }
    }
}
