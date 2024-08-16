package ASAC8._SpringP2ractice.newProduct.repository;

import ASAC8._SpringP2ractice.newProduct.NewProduct;
import java.util.List;

public interface Repository {
    public abstract List<NewProduct> create(Integer id, String title, String description, String imageUrl, Integer originalPrice, Integer salePrice, Integer discountRate, Integer reviewCount, double rating, Boolean isBestSeller, Boolean isNew);
}
