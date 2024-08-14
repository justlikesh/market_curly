package ASAC8._SpringP2ractice.weekend.service;

import ASAC8._SpringP2ractice.item.Item;
import ASAC8._SpringP2ractice.item.ItemRepository;
import ASAC8._SpringP2ractice.weekend.ItemResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // 등록 // @Repository 클래스에 있는 메서드들을 조합하는거야 // 실질적인 로직은 다 여기에 담겨 <> : 컨트롤러(작음) - 서비스(존나큼) - 레파지토리(작음)
@RequiredArgsConstructor
public class WeekendService {

//    @Autowired
//    private WeekendIRepository weekendIRepository;
//    private final WeekendRepository weekendRepository;
    private final ItemRepository itemRepository;

    public List<ItemResponseDto> getWeekend() {
        List<Item> items = itemRepository.getAllItems();
        List<Item> weekend = items.stream()  // List -> Stream
//                .filter((item) -> {
//                    return item.getIsWeekendSpecial();
//                })
                .filter(Item::getIsWeekendSpecial)
                .toList();   // Stream -> List

        // List<Item> -> List<ItemResponseDto>
        List<ItemResponseDto> response = weekend.stream()
//                .map((item) -> {
//                    return ItemResponseDto.of(item);
//                })
                .map(ItemResponseDto::of)
                .toList();

        return response;
    }


//    public List<Weekend> getWeekend() {
//        weekendRepository.reset();
//        WeekendCreateDto dto = WeekendCreateDto.of(
//                "퓨어 튜나 스틱 버라이어티팩",
//                "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
//                "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
//                30000,
//                20000,
//                33,
//                120,
//                4.5,
//                true
//        );
//        List<Weekend> weekend = weekendRepository.create(dto);
//        return weekend;
//    }

}
