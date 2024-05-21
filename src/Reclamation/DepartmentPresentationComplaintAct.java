package Reclamation;

import java.util.ArrayList;
import java.util.List;

public class DepartmentPresentationComplaintAct implements ReliabilityDepartment {
    private List<Product> reclamationList = new ArrayList<>();

    @Override
    public void initReclamation(List<Product> reclamationList) {
        this.reclamationList = reclamationList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product reclama: reclamationList) {
            if (reclama.getName().equals(name)){
                return reclama;
            }
        }
        return null;
    }
}
