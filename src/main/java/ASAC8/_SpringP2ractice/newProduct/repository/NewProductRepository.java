package ASAC8._SpringP2ractice.newProduct.repository;

import ASAC8._SpringP2ractice.newProduct.NewProduct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class NewProductRepository implements Repository{



    static Integer id = 1;

//    @Override
//    public List<NewProduct> create(){
//        newProductList.add(
List<NewProduct> newProductList = new ArrayList<>(List.of(
    NewProduct.of(
        1,
        "고양이 종합 영양제",
        "모든 연령대의 고양이를 위한 종합 영양제, 60점",
        "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/d7d1c775-4128-4536-aa8c-c922d2089da4.jpg?v=0531",
        "코카콜라",
        45000,
        38000,
        16,
        120,
        4.8,
        true,
        true
    ),

    NewProduct.of(
        2,
        "강아지 종합 영양제",
        "모든 연령대의 고양이를 위한 종합 영양제, 60점",
        "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/d7d1c775-4128-4536-aa8c-c922d2089da4.jpg?v=0531",
        "코카콜라",
        45000,
        38000,
        16,
        120,
        4.8,
        true,
        true
    ),
    NewProduct.of(
        3,
        "호랑이 종합 영양제",
        "모든 연령대의 고양이를 위한 종합 영양제, 60점",
        "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/d7d1c775-4128-4536-aa8c-c922d2089da4.jpg?v=0531",
        "코카콜라",
        45000,
        38000,
        16,
        120,
        4.8,
        true,
        true
    ),
    NewProduct.of(
        4,
        "두루미 종합 영양제",
        "모든 연령대의 고양이를 위한 종합 영양제, 60점",
        "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/d7d1c775-4128-4536-aa8c-c922d2089da4.jpg?v=0531",
        "코카콜라",
        45000,
        38000,
        16,
        120,
        4.8,
        true,
        true
    )));
    @Override
    public List<NewProduct> create(NewProduct newProduct){

//        NewProduct newProduct = NewProduct.of(
//                    newProduct.getId(),
//                    newProduct.getTitle(),
//                    newProduct.getDescription(),
//                    newProduct.getBrand(),
//                    newProduct.getImageUrl(),
//                    newProduct.getOriginalPrice(),
//                    newProduct.getSalePrice(),
//                    newProduct.getDiscountRate(),
//                    newProduct.getReviewCount(),
//                    newProduct.getRating(),
//                    newProduct.getIsBestSeller(),
//                    newProduct.getIsNew()
//        );
        newProductList.add(newProduct);
//
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
