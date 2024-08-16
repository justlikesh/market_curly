package ASAC8._SpringP2ractice.newProduct.repository;

import ASAC8._SpringP2ractice.newProduct.NewProduct;
import java.util.List;

public interface Repository {
    public abstract List<NewProduct> create(NewProduct newProduct);
}
