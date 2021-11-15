public abstract class Angajati implements Element{
    protected String nume;
    private String adresa;
    protected int salar;
    private String post;

    public Angajati(String nume, String adresa, int salar, String post) {
        this.nume = nume;
        this.adresa = adresa;
        this.salar = salar;
        this.post = post;
    }

    public int getSalar() {
        return salar;
    }
}
