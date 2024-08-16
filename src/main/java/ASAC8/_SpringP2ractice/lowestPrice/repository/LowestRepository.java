package ASAC8._SpringP2ractice.lowestPrice.repository;

import ASAC8._SpringP2ractice.lowestPrice.LowerPrice;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LowestRepository implements Repository{

    List<LowerPrice> lowerPriceList = new ArrayList<>();

    static Integer id = 1;

    public void reset(){
        lowerPriceList.clear();
    }

    @Override
    public List<LowerPrice> create(String title, String description, String imageUrl, Integer originalPrice, Integer salePrice, Integer discountRate, Integer reviewCount, double rating, Boolean isLowestPrice) {
        lowerPriceList.add(new LowerPrice(id, title, description, imageUrl, originalPrice, salePrice, discountRate, reviewCount, rating, isLowestPrice));

        for(LowerPrice each : lowerPriceList){
            System.out.println(each);
        }

        id = id + 1;

        return lowerPriceList;
    }


}
