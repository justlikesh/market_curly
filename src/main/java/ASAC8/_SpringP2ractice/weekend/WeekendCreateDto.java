package ASAC8._SpringP2ractice.weekend;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

// Java 클래스 2가지 : (1) 로직 클래스 (Controller, Service, Repository) (2) 데이터 클래스 (DTO)
// Data Tranasfer Object : 데이터 전달용 객체
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class WeekendCreateDto {
    private String title;
    private String imageUrl;
    private String description;
    private Integer originalPrice;
    private Integer salePrice;
    private Integer discountRate;
    private Integer reviewCount;
    private Double rating;
    private Boolean isWeekendSpecial;

    public static WeekendCreateDto of(
            String title,
            String imageUrl,
            String description,
            Integer originalPrice,
            Integer salePrice,
            Integer discountRate,
            Integer reviewCount,
            Double rating,
            Boolean isWeekendSpecial
    ) {
        return new WeekendCreateDto(
                title,
                description,
                imageUrl,
                originalPrice,
                salePrice,
                discountRate,
                reviewCount,
                rating,
                isWeekendSpecial
        );
    }
}
