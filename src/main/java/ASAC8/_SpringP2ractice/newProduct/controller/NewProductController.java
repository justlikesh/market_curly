package ASAC8._SpringP2ractice.newProduct.controller;

import ASAC8._SpringP2ractice.newProduct.NewProduct;
import ASAC8._SpringP2ractice.newProduct.controller.response.NewProductResponse;
import ASAC8._SpringP2ractice.newProduct.repository.NewProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RequestMapping("/main/api")
@RestController
public class NewProductController {

    @Autowired
    NewProductRepository newProductRepository;

    @GetMapping("/approved-new-products")
    public NewProductResponse getNewProduct(){

        newProductRepository.reset();

        List<NewProduct> newProduct = newProductRepository.create(
                1,
                "고양이 종합 영양제",
                "모든 연령대의 고양이를 위한 종합 영양제, 60점",
                "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/d7d1c775-4128-4536-aa8c-c922d2089da4.jpg?v=0531",
                45000,
                38000,
                16,
                120,
                4.8,
                true,
                true
        );
//        Integer totalCount = 2;

        NewProductResponse response = new NewProductResponse(newProduct, newProduct.size());

        return response;

    }
}
