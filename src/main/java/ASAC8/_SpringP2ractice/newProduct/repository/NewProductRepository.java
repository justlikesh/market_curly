package ASAC8._SpringP2ractice.newProduct.repository;

import ASAC8._SpringP2ractice.newProduct.NewProduct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewProductRepository implements Repository {

    private List<NewProduct> newProductList = new ArrayList<>(List.of(
        NewProduct.of(
            1,
            "고양이 종합 영양제",
            "모든 연령대의 고양이를 위한 종합 영양제, 60점",
            "코카콜라",
            "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/d7d1c775-4128-4536-aa8c-c922d2089da4.jpg?v=0531",
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
            "모든 연령대의 강아지를 위한 종합 영양제, 60점",
            "코카콜라",
            "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/d7d1c775-4128-4536-aa8c-c922d2089da4.jpg?v=0531",
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
            "모든 연령대의 호랑이를 위한 종합 영양제, 60점",
            "코카콜라",
            "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/d7d1c775-4128-4536-aa8c-c922d2089da4.jpg?v=0531",
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
            "모든 연령대의 두루미를 위한 종합 영양제, 60점",
            "코카콜라",
            "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/d7d1c775-4128-4536-aa8c-c922d2089da4.jpg?v=0531",
            45000,
            38000,
            16,
            120,
            4.8,
            true,
            true
        )
    ));

    public List<NewProduct> getAll() {
        return new ArrayList<>(newProductList);
    }

    // 필요한 경우에만 사용하는 메소드
    public void addNewProduct(NewProduct newProduct) {
        newProductList.add(newProduct);
    }

    public void reset() {
        newProductList.clear();
    }
}