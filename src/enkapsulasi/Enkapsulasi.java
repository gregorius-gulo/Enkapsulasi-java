package enkapsulasi;

public class Enkapsulasi {

    
    public static void main(String[] args) {
        
        Persegi p = new Persegi();
        
        p.setPanjang(7);
        p.setLebar(6);
        
        System.out.println("Panjang: " + p.getPanjang());
        System.out.println("Lebar: " + p.getLebar());
        System.out.println("Luas Persegi: " + p.getLuas());
     }
   }
