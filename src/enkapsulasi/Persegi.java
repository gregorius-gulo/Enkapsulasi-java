package enkapsulasi;
 
public class Persegi {
    // Information Hiding
    private int panjang;
    private int lebar;
    
    public int getLebar(){
        return lebar;
    }
    public void setLebar(int lebar){
        this.lebar = lebar;
    }
    
    public int getPanjang(){
        return panjang;
    }
    public void setPanjang(int panjang){
        this.panjang = panjang;
    }
    // Constructor
    public Persegi(){
        int p = 0;
        int l = 0;
    }
    
    public int luas(int p, int l){
        return p*l;
    }
    
    public int getLuas(){
        return luas(panjang, lebar);
    }
    
}
