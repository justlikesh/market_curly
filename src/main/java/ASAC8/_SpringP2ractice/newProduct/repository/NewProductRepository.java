package ASAC8._SpringP2ractice.newProduct.repository;

import ASAC8._SpringP2ractice.newProduct.NewProduct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewProductRepository implements Repository{

    List<NewProduct> newProductList = new ArrayList<>();

    static Integer id = 1;

    @Override
    public List<NewProduct> create(Integer id, String title, String description, String imageUrl, String brand, Integer originalPrice, Integer salePrice, Integer discountRate, Integer reviewCount, double rating, Boolean isWeekendSpecial, Boolean isNew){
        newProductList.add(new NewProduct(id, title, description, brand, imageUrl, originalPrice, salePrice, discountRate, reviewCount, rating, isWeekendSpecial, isNew));

        for(NewProduct each : newProductList){
            System.out.println(each);
        }

        id = id + 1;

        return newProductList;

    }

    public void reset(){
        newProductList.clear();
    }

}
