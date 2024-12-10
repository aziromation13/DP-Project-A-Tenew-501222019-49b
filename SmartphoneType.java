import java.util.ArrayList;
import java.util.List;

public class SmartphoneType {
    private List<Smartphone> smartphones = new ArrayList<>();

    public void addSmartphone(Smartphone smartphone) {
        smartphones.add(smartphone);
    }

    public void showSmartphones() {
        for (Smartphone smartphone : smartphones) {
            System.out.println("Brand: " + smartphone.getBrand());
            System.out.println("Features: " + smartphone.getFeatures());
            System.out.println();
        }
    }
}