package ASAC8._SpringP2ractice.deadlineSale.repository;

import ASAC8._SpringP2ractice.deadlineSale.Deadline;
import java.util.List;

public interface Repository {
    public abstract List<Deadline> create(String title, String description, String imageUrl, Integer originalPrice, Integer salePrice, Integer discountRate, Integer reviewCount, double rating);
}
