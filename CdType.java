import java.util.ArrayList;
import java.util.List;

public class CdType {
    private List<Packing>items=new ArrayList<Packing>();
    public void addItem(Packing packs){
        items.add(packs);
    }
    public void getCost(){
        for (Packing packs : items) {
        packs.price();
        }
        
    }
    
    public void afficherItems() {
        for (Packing packing : items) {
            System.out.println("Cd Name:" + packing.pack());
            System.out.println("Prix:" + packing.price());
        }
    }
}
