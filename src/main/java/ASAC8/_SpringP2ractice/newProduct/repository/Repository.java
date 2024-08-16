package ASAC8._SpringP2ractice.newProduct.repository;

import ASAC8._SpringP2ractice.newProduct.NewProduct;
import java.util.List;

public interface Repository {
    List<NewProduct> getAll();
    void addNewProduct(NewProduct newProduct);
    void reset();
}