package ASAC8._SpringP2ractice.item;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Item {
    // option + shift
    private Integer id;
    private String title;
    private String imageUrl;
    private String description;
    private Integer originalPrice;
    private Integer salePrice;
    private Integer discountRate;
    private Integer reviewCount;
    private Double rating;
    private Boolean isWeekendSpecial;
    private Boolean isBestSeller;
    private Boolean isNew;
    private Boolean isLowestPrice;

    public static Item of(
            Integer id,
            String title,
            String imageUrl,
            String description,
            Integer originalPrice,
            Integer salePrice,
            Integer discountRate,
            Integer reviewCount,
            Double rating,
            Boolean isWeekendSpecial,
            Boolean isBestSeller,
            Boolean isNew,
            Boolean isLowestPrice
    ) {
        return new Item(
            id,
            title,
            imageUrl,
            description,
            originalPrice,
            salePrice,
            discountRate,
            reviewCount,
            rating,
            isWeekendSpecial,
            isBestSeller,
            isNew,
            isLowestPrice
        );
    }
}
