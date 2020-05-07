/**
 * SPIRAL GALAXIES
 * @author Amirul Luqman
 */
public class Galaxy1 extends Galaxy {
    
    String shape = "Pinwheel shape";
    String name = "Spiral Galaxies";
    String bulge = "Center of the shape";
    
    public void getShape(){
        System.out.println("Shape: " + shape);
    }
    public void getName(){
        System.out.println("Name: " + name);
    }
    public void getBulgeLocation(){
    System.out.println("Bulge: " + bulge);
    }
}
