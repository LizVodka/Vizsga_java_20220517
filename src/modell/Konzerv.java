package modell;

import java.io.File;
import java.time.LocalDate;

public class Konzerv extends Elelmiszer{
    private String leiras;
    private File recept;

    public Konzerv(String leiras, File recept, String nev, String gyarto, LocalDate lejarati) throws HibasDatumException{
        super(nev, gyarto, lejarati);
        this.leiras = leiras;
        this.recept = recept;
    }

    public Konzerv(String leiras, String nev, String gyarto, LocalDate lejarati) throws HibasDatumException{
        super(nev, gyarto, lejarati);
        this.leiras = leiras;
    }

    public void receptMutat() {
        if(recept.exists()){
            //TODO
        }else{
            //TODO
        }
    }
    
    
    
}
