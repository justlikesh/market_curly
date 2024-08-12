package ASAC8._SpringP2ractice.lowestPrice.controller.response;

import ASAC8._SpringP2ractice.lowestPrice.LowerPrice;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
public class LowestPriceResponse {
    private List<LowerPrice> lowestPriceItems;
    private Integer totalCount;
}
