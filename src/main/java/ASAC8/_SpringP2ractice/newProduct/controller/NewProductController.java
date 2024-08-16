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
    public NewProductResponse getNewProduct() {
        List<NewProduct> newProductList = newProductRepository.getAll();
        return new NewProductResponse(newProductList, newProductList.size());
    }
}