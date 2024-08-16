package ASAC8._SpringP2ractice.lowestPrice.repository;

import ASAC8._SpringP2ractice.lowestPrice.LowerPrice;
import java.util.List;

public interface Repository {
    public abstract List<LowerPrice> create(String title, String description, String imageUrl, Integer originalPrice, Integer salePrice, Integer discountRate, Integer reviewCount, double rating, Boolean isLowestPrice);
}
