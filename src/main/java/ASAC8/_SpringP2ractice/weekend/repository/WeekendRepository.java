package ASAC8._SpringP2ractice.weekend.repository;

import ASAC8._SpringP2ractice.weekend.ItemResponseDto;
import ASAC8._SpringP2ractice.weekend.WeekendCreateDto;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository // 데이터베이스 접근 및 쿼리 CRUD 진짜 단순한 데이터베이스 작업 : Read, Create, Update, Delete
public class WeekendRepository implements IRepository {

//    List<Weekend> weekendList = new ArrayList<>();
    // fn + shift + F6
    List<ItemResponseDto> itemList = Arrays.asList(
        ItemResponseDto.of(
                1,
                WeekendCreateDto.of(
                        "퓨어 튜나 스틱 버라이어티팩",
                        "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                        "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                        30000,
                        20000,
                        33,
                        120,
                        4.5,
                        true
                )
        ),
        ItemResponseDto.of(
                2,
                WeekendCreateDto.of(
                        "퓨어 튜나 스틱 버라이어티팩",
                        "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                        "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                        30000,
                        20000,
                        33,
                        120,
                        4.5,
                        true
                )
        ),
        ItemResponseDto.of(
                3,
                WeekendCreateDto.of(
                        "퓨어 튜나 스틱 버라이어티팩",
                        "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                        "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                        30000,
                        20000,
                        33,
                        120,
                        4.5,
                        true
                )
        ),
        ItemResponseDto.of(
                4,
                WeekendCreateDto.of(
                        "퓨어 튜나 스틱 버라이어티팩",
                        "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                        "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                        30000,
                        20000,
                        33,
                        120,
                        4.5,
                        false
                )
        ),
        ItemResponseDto.of(
                5,
                WeekendCreateDto.of(
                        "퓨어 튜나 스틱 버라이어티팩",
                        "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                        "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                        30000,
                        20000,
                        33,
                        120,
                        4.5,
                        false
                )
        ),
        ItemResponseDto.of(
                6,
                WeekendCreateDto.of(
                        "퓨어 튜나 스틱 버라이어티팩",
                        "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                        "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                        30000,
                        20000,
                        33,
                        120,
                        4.5,
                        false
                )
        )
    );

    static Integer id = 1;

    @Override
    public List<ItemResponseDto> create(WeekendCreateDto dto) {
        itemList.add(ItemResponseDto.of(id, dto));
        for(ItemResponseDto each : itemList){
            System.out.println(each);
        }
        id = id + 1;

        return itemList;
    }

    public void reset(){
        itemList.clear();
    }

}
