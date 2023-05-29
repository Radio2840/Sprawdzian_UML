public class Main {
    public static void main(String[] args) {
        Pracownia pracownia = new Pracownia();

        pracownia.dodajKomputerDoUcznia(new Uczen("Kinga","Smolarek","11111111111","3Tp"), new Komputer(1,true));
        pracownia.dodajKomputerDoUcznia(new Uczen("Magdalena","Monika","22222222222","2Tf"), new Komputer(4,false));
        pracownia.wyswietlPracownie();
    }
}