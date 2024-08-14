package ASAC8._SpringP2ractice.weekend.controller;

import ASAC8._SpringP2ractice.weekend.ItemResponseDto;
import ASAC8._SpringP2ractice.weekend.controller.response.WeekendResponseDto;
import ASAC8._SpringP2ractice.weekend.service.WeekendService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RequestMapping("/main/api")
@RestController // 얘는 존나 간단해야해. 얘한테 뭘 시킬 생각을 하지마. 요청-응답
@RequiredArgsConstructor
public class WeekendController {

    // 주입
//    @Autowired
//    private WeekendRepository weekendRepository;
//    private final/* 생성자 말고는 이 값을 설정할 방법이 없어 .. Setter 호출을 못하니까 */ WeekendIRepository weekendRepository;
    private final/* 생성자 말고는 이 값을 설정할 방법이 없어 .. Setter 호출을 못하니까 */ WeekendService weekendService;

    @GetMapping("/weekend-special")
    public WeekendResponseDto getWeekend(){
        List<ItemResponseDto> weekend = weekendService.getWeekend();
        WeekendResponseDto response = WeekendResponseDto.of(weekend);
        // of : 정적 팩토리 메서드
        //  - static 정적 메서드 : Object object = new Object() -> 객체 object.method() | 클래스 Object.method()
        //          - 메서드를 쓸려면 객체가 필요해. 이게 제일 기본이야      = 객체 object.method()
        //          - 정적 static 메서드는 클래스만 필요해. 객체가 필요없어 = 클래스 Object.method()
        //  - 팩토리 : 새로운 객체 / 생성한 객체
        //      - 팩토리 = 공장
        //      - 자동차 팩토리 = 자동차 생성
        //      - 객체 팩토리 = 객체 생성

        return response;
    }
}
