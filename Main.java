/**
 *
 * @author Amirul Luqman
 */
public class Main { // Main class to check all the subclass
    public static void main(String[]args){
        
        Galaxy1 x = new Galaxy1(); // For Galaxy1
        x.getName();
        x.getSize();
        x.getContent();
        x.getCharacteristic();
        x.getShape();
        x.getBulgeLocation();
        
        System.out.println("");
        
        Galaxy2 y = new Galaxy2(); // For Galaxy2
        y.getName();
        y.getSize();
        y.getContent();
        y.getCharacteristic();
        y.getShape();
        
        System.out.println("");
        
        Galaxy3 z = new Galaxy3();
        z.getName();
        z.getSize();
        z.getContent();
        z.getCharacteristic();
        z.getShape();       
    }
}
