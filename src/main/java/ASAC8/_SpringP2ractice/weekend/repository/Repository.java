package ASAC8._SpringP2ractice.weekend.repository;

import ASAC8._SpringP2ractice.weekend.Weekend;
import java.util.List;

public interface Repository {
    public abstract List<Weekend> create(Integer id, String title, String description, String imageUrl, Integer originalPrice, Integer salePrice, Integer discountRate, Integer reviewCount, double rating, Boolean isWeekendSpecial);
}
