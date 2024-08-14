package ASAC8._SpringP2ractice.newProduct.controller.response;

import ASAC8._SpringP2ractice.newProduct.NewProduct;
import ASAC8._SpringP2ractice.weekend.ItemResponseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
public class NewProductResponse {
    private List<ItemResponseDto> approvedNewProducts;
    private Integer totalCount;
}
