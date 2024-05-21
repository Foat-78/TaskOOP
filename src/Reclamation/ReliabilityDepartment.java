package Reclamation;

import java.util.List;

// отдел надёжности
public interface ReliabilityDepartment {
    public void initReclamation(List<Product> reclamationList);
    public Product getProduct(String name);

}
