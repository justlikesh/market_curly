package ASAC8._SpringP2ractice.weekend.controller.response;

import ASAC8._SpringP2ractice.weekend.ItemResponseDto;
import lombok.Getter;

import java.util.List;

//@Setter
@Getter
//@AllArgsConstructor
public class WeekendResponseDto {
    private List<ItemResponseDto> weekendSpecialItems;
    private Integer totalCount;

    // 객체를 생성할 수 있는 방법 내지는 구멍은 하나뿐이어야해. 둘중에 하나만 해!
//    public WeekendResponse(List<Weekend> weekendSpecialItems) {
    private WeekendResponseDto(List<ItemResponseDto> weekendSpecialItems) {
        this.weekendSpecialItems = weekendSpecialItems;
        this.totalCount = weekendSpecialItems.size();
    }

    // static static static static static static static static static static static
    // static static static static static static static static static static static
    // static static static static static static static static static static static
    // static static static static static static static static static static static
    // static static static static static static static static static static static
    // static static static static static static static static static static static
    // static static static static static static static static static static static
    // static static static static static static static static static static static
    // static static static static static static static static static static static
    // static static static static static static static static static static static
    // static static static static static static static static static static static
    // static static static static static static static static static static static
    // static static static static static static static static static static static
    // static static static static static static static static static static static
    // static static static static static static static static static static static
    // static static static static static static static static static static static
    // static static static static static static static static static static static
    public static WeekendResponseDto of(List<ItemResponseDto> weekendSpecialItems) {
        return new WeekendResponseDto(weekendSpecialItems);
    }
}
