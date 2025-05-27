
package modell;


public class Diakok {
    private int ID;
    private String Targy;
    private int Jegy;
    private boolean Bukas;

    public Diakok() {
        
    }
    
    
    public Diakok(int ID, String Targy, int Jegy, boolean Bukas) {
        this.ID = ID;
        this.Targy = Targy;
        this.Jegy = Jegy;
        this.Bukas = Bukas;
    }

    public int getID() {
        return ID;
    }

    public String getTargy() {
        return Targy;
    }

    public int getJegy() {
        return Jegy;
    }

    public boolean isBukas() {
        return Bukas;
    }

    @Override
    public String toString() {
        return "Diakok{" + "ID=" + ID + ", Targy=" + Targy + ", Jegy=" + Jegy + ", Bukas=" + Bukas + '}';
    }

    
    
}
