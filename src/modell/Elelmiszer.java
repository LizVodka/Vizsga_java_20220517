package modell;

import java.time.LocalDate;
import java.util.Comparator;

class NevComparator implements Comparator<Elelmiszer> {

    @Override
    public int compare(Elelmiszer o1, Elelmiszer o2) {
        return o1.getNev().compareTo(o2.getNev());
    }
}

class GyartoComparator implements Comparator<Elelmiszer> {

    @Override
    public int compare(Elelmiszer o1, Elelmiszer o2) {
        return o1.getGyarto().compareTo(o2.getGyarto());
    }
}

public abstract class Elelmiszer {
    private String nev, gyarto;
    private LocalDate lejarati;

    public Elelmiszer(String nev, String gyarto, LocalDate lejarati) {
        this.nev = nev;
        this.gyarto = gyarto;
        this.lejarati = lejarati;
    }

    public Elelmiszer(String nev, String gyarto) {
        this.nev = nev;
        this.gyarto = gyarto;
        LocalDate date = LocalDate.now();
        this.lejarati = date.plusYears(1);
    }

    public String getNev() {
        return nev;
    }

    public String getGyarto() {
        return gyarto;
    }

    public LocalDate getLejarati() {
        return lejarati;
    }

    @Override
    public String toString() {
        return "Elelmiszer{" + "nev=" + nev + ", gyarto=" + gyarto + ", lejarati=" + lejarati + '}';
    }
    
    public static NevComparator NevRendezo() {
        return new NevComparator();
    }
    
    public static GyartoComparator GyartoRendezo() {
        return new GyartoComparator();
    }
}
