import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Pracownia {
    private Map<Uczen, Komputer> przypisania = new HashMap<>();
    Set<Map.Entry<Uczen,Komputer>> entries = przypisania.entrySet();

    public void dodajKomputerDoUcznia(Uczen uczen, Komputer komputer){
        przypisania.put(uczen,komputer);
    }
    public void wyswietlPracownie(){
        System.out.println("dzialam");
        for(Map.Entry<Uczen,Komputer> entry : entries){
            Uczen uczen = entry.getKey();
            Komputer komputer = entry.getValue();

            System.out.println(
                 uczen.getImie()+", "+uczen.getNazwisko()+" -> "+komputer.getNumer()
            );
        }

    }
}
