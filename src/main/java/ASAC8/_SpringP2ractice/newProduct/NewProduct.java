package ASAC8._SpringP2ractice.newProduct;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class NewProduct {

    private Integer id;
    private String title;
    private String description;
    private String brand;
    private String imageUrl;
    private Integer originalPrice;
    private Integer salePrice;
    private Integer discountRate;
    private Integer reviewCount;
    private Double rating;
    private Boolean isBestSeller;
    private Boolean isNew;

    public static NewProduct of(
        Integer id,
        String title,
        String description,
        String brand,
        String imageUrl,
        Integer originalPrice,
        Integer salePrice,
        Integer discountRate,
        Integer reviewCount,
        Double rating,
        Boolean isBestSeller,
        Boolean isNew){

        return new NewProduct(
            id,
            title,
            description,
            brand,
            imageUrl,
            originalPrice,
            salePrice,
            discountRate,
            reviewCount,
            rating,
            isBestSeller,
            isNew);
    }


}
