package aranyhal;

public class Aranyhal {

    private final static int KIVANSAGSZAM =3; 
    private int kor;
    private String[] kivansagok = new String[KIVANSAGSZAM];
    private String kifogta;

    public Aranyhal(String kifogta) {
        this(0, kifogta);
    }
    
    public Aranyhal(int kor, String kifogta) {
        this.kor = kor;
        this.kifogta = kifogta;
    }

    public int getKor() {
        return kor;
    }

    public void setKifogta(String kifogta) {
        this.kifogta = kifogta;
    }
    
    public int kivansagokSzama(String kifogta) {
        return 0;
    }
    
    public String[] kikkelTalalkozott() {
        return null;
    }
    
    public boolean kivansagotTeljest(String kivansag) {
        return false;
    }

    @Override
    public String toString() {
        return "Aranyhal{" + "kor=" + kor + ", kivansagok=" + kivansagok + ", kifogta=" + kifogta + '}';
    }
    
    
    
    

}
