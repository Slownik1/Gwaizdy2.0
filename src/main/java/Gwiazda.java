

public class Gwiazda {

    public Gwiazda(String nazwa, String nazwaKatalogowa,
                   polkula polkula, double deklinacja,
                   double rektascencja, double odleglosc,
                   double obsertowanaWielkoscGwiazdowa, double absolutnaWielkoscGwiazdowa,
                   double temperatura, double masa, String gwiazdozbior) {

        this.nazwa = nazwa;
        this.nazwaKatalogowa = nazwaKatalogowa;
        this.polkula = polkula;
        this.deklinacja = deklinacja;
        this.rektascencja = rektascencja;
        this.odleglosc = odleglosc;
        this.obsertowanaWielkoscGwiazdowa = obsertowanaWielkoscGwiazdowa;
        this.absolutnaWielkoscGwiazdowa = absolutnaWielkoscGwiazdowa;
        this.temperatura = temperatura;
        this.masa = masa;
        this.gwiazdozbior = gwiazdozbior;
    }

    private String nazwa;
    private String nazwaKatalogowa;
    private polkula polkula;
    private double deklinacja;
    private double rektascencja;
    private double odleglosc;
    private double obsertowanaWielkoscGwiazdowa;
    private double absolutnaWielkoscGwiazdowa;
    private double temperatura;
    private double masa;
    private String gwiazdozbior;

    public polkula getPolkula() {
        return polkula;
    }

    public void setPolkula(polkula polkula) {
        this.polkula = polkula;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwaKatalogowa() {
        return nazwaKatalogowa;
    }

    public void setNazwaKatalogowa(String nazwaKatalogowa) {
        this.nazwaKatalogowa = nazwaKatalogowa;
    }

    public double getDeklinacja() {
        return deklinacja;
    }

    public void setDeklinacja(double deklinacja) {
        this.deklinacja = deklinacja;
    }

    public double getRektascencja() {
        return rektascencja;
    }

    public void setRektascencja(double rektascencja) {
        this.rektascencja = rektascencja;
    }

    public double getOdleglosc() {
        return odleglosc;
    }

    public void setOdleglosc(double odleglosc) {
        this.odleglosc = odleglosc;
    }

    public double getObsertowanaWielkoscGwiazdowa() {
        return obsertowanaWielkoscGwiazdowa;
    }

    public void setObsertowanaWielkoscGwiazdowa(double obsertowanaWielkoscGwiazdowa) {
        this.obsertowanaWielkoscGwiazdowa = obsertowanaWielkoscGwiazdowa;
    }

    public double getAbsolutnaWielkoscGwiazdowa() {
        return absolutnaWielkoscGwiazdowa;
    }

    public void setAbsolutnaWielkoscGwiazdowa(double absolutnaWielkoscGwiazdowa) {
        this.absolutnaWielkoscGwiazdowa = absolutnaWielkoscGwiazdowa;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public String getGwiazdozbior() {
        return gwiazdozbior;
    }

    public void setGwiazdozbior(String gwiazdozbior) {
        this.gwiazdozbior = gwiazdozbior;
    }



}
