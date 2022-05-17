package modell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Raktar implements Iterable<Elelmiszer>{
    private ArrayList<Elelmiszer> elelmisz;

    public Raktar() {
        elelmisz = new ArrayList<>();
    }

    public void felvesz(Elelmiszer esz){
        elelmisz.add(esz);
    }
    
    @Override
    public Iterator<Elelmiszer> iterator() {
        return Collections.unmodifiableList(elelmisz).iterator();
    }
    
    public List<Elelmiszer> rendezCimSzerint(){
        Collections.sort(elelmisz, Elelmiszer.NevRendezo());
        return Collections.unmodifiableList(elelmisz);
    }
    
    public List<Elelmiszer> rendezKeszitoSzerint(){
        Collections.sort(elelmisz, Elelmiszer.GyartoRendezo());
        return Collections.unmodifiableList(elelmisz);
    }
}
