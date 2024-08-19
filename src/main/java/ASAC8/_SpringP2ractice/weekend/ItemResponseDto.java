package ASAC8._SpringP2ractice.weekend;

import ASAC8._SpringP2ractice.item.Item;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 *  {
 *      id: null,
 *      title: null,
 *      imageUrl: "asdasdasdasd",
 *  }
 *  // @JsonInclude(JsonInclude.Include.NON_NULL) // 필드값이 NULL 인 경우 (없는 경우), 그냥이면 출력되는데, 보기 안좋아서 없애는
 *  // NON_NULL (Null 이 아닌 애들만) Include (포함시키겠다) = NULL 필드는 출력하지 않겠다
 *  {
 *      imageUrl: "asdasdasdasd",
 *  }
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ItemResponseDto {
    private Integer id;
    private String title;
    private String imageUrl;
    private String description;
    private Integer originalPrice;
    private Integer salePrice;
    private Integer discountRate;
    private Integer reviewCount;
    private Double rating;

//    private Weekend(
//            Item item,
//            Boolean isWeekendSpecial
//    ) {
//        this.item = item;
//        this.isWeekendSpecial = isWeekendSpecial;
//    }

    // - ItemResponseDto : 반환할 객체 (민감정보 없이 전달할 정보만 노출)
    // - Item : 데이터베이스 객체 (민감한 정보가 있다)
    public static ItemResponseDto of(Item item) {
        return new ItemResponseDto(
                item.getId(),
                item.getTitle(),
                item.getDescription(),
                item.getImageUrl(),
                item.getOriginalPrice(),
                item.getSalePrice(),
                item.getDiscountRate(),
                item.getReviewCount(),
                item.getRating()
        );
    }

    // 전달인자(인수) = Argument : example(argument)
    // 매개변수(인자) = Parameter : public String example(String parameter)
    //
    // 매달변자
    // 전개인수
}
