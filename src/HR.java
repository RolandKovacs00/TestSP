public class HR extends Angajati{
    private String name;

    public HR(String nume, String adresa, int salar, String post, String name) {
        super(nume, adresa, salar, post);
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Personal "+ this.name + "cu numele "+ super.nume + "cu salar " + super.salar );
    }
}

