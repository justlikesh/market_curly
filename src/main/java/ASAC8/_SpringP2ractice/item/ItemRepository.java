package ASAC8._SpringP2ractice.item;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

// 모든 상품데이터가 저장된 거대 저장소
@Repository
public class ItemRepository {
    static Integer id = 1;

    // fn + shift + F6
    // Map<Item>
    List<Item> itemList = Arrays.asList(
            Item.of(
                    1,
                    "퓨어 튜나 스틱 버라이어티팩",
                    "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                    30000,
                    20000,
                    33,
                    120,
                    4.5,
                    true,
                    false,
                    true,
                    false
            ),
            Item.of(
                    2,
                    "퓨어 튜나 스틱 버라이어티팩",
                    "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                    30000,
                    20000,
                    33,
                    120,
                    4.5,
                    false,
                    false,
                    false,
                    false
            ),
            Item.of(
                    3,
                    "퓨어 튜나 스틱 버라이어티팩",
                    "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                    30000,
                    20000,
                    33,
                    120,
                    4.5,
                    true,
                    false,
                    false,
                    false
            ),
            Item.of(
                    4,
                    "퓨어 튜나 스틱 버라이어티팩",
                    "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                    30000,
                    20000,
                    33,
                    120,
                    4.5,
                    true,
                    true,
                    true,
                    true
            ),
            Item.of(
                    5,
                    "퓨어 튜나 스틱 버라이어티팩",
                    "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                    30000,
                    20000,
                    33,
                    120,
                    4.5,
                    true,
                    false,
                    false,
                    true
            ),
            Item.of(
                    6,
                    "퓨어 튜나 스틱 버라이어티팩",
                    "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                    30000,
                    20000,
                    33,
                    120,
                    4.5,
                    true,
                    true,
                    true,
                    false
            ),
            Item.of(
                    7,
                    "퓨어 튜나 스틱 버라이어티팩",
                    "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                    30000,
                    20000,
                    33,
                    120,
                    4.5,
                    true,
                    true,
                    true,
                    true
            ),
            Item.of(
                    8,
                    "퓨어 튜나 스틱 버라이어티팩",
                    "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                    30000,
                    20000,
                    33,
                    120,
                    4.5,
                    true,
                    false,
                    true,
                    false
            ),
            Item.of(
                    9,
                    "퓨어 튜나 스틱 버라이어티팩",
                    "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                    30000,
                    20000,
                    33,
                    120,
                    4.5,
                    true,
                    false,
                    true,
                    false
            ),
            Item.of(
                    10,
                    "퓨어 튜나 스틱 버라이어티팩",
                    "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                    30000,
                    20000,
                    33,
                    120,
                    4.5,
                    false,
                    true,
                    false,
                    true
            ),
            Item.of(
                    11,
                    "퓨어 튜나 스틱 버라이어티팩",
                    "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                    30000,
                    20000,
                    33,
                    120,
                    4.5,
                    true,
                    true,
                    true,
                    true
            ),
            Item.of(
                    12,
                    "퓨어 튜나 스틱 버라이어티팩",
                    "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                    30000,
                    20000,
                    33,
                    120,
                    4.5,
                    false,
                    false,
                    false,
                    false
            ),
            Item.of(
                    13,
                    "퓨어 튜나 스틱 버라이어티팩",
                    "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                    30000,
                    20000,
                    33,
                    120,
                    4.5,
                    false,
                    true,
                    false,
                    true
            ),
            Item.of(
                    14,
                    "퓨어 튜나 스틱 버라이어티팩",
                    "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                    30000,
                    20000,
                    33,
                    120,
                    4.5,
                    true,
                    false,
                    true,
                    true
            ),
            Item.of(
                    15,
                    "퓨어 튜나 스틱 버라이어티팩",
                    "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                    30000,
                    20000,
                    33,
                    120,
                    4.5,
                    false,
                    false,
                    true,
                    true
            )
    );

    public List<Item> getAllItems() {
        return itemList;
    }
}
