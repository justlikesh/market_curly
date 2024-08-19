package ASAC8._SpringP2ractice.newProduct;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
@Getter
@AllArgsConstructor
public class NewProduct {

    private Integer id;
    private String title;
    private String description;
    private String imageUrl;
    private Integer originalPrice;
    private Integer salePrice;
    private Integer discountRate;
    private Integer reviewCount;
    private Double rating;
    private Boolean isBestSeller;
    private Boolean isNew;
}
