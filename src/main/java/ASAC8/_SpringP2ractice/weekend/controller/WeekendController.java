package ASAC8._SpringP2ractice.weekend.controller;

import ASAC8._SpringP2ractice.weekend.Weekend;
import ASAC8._SpringP2ractice.weekend.controller.response.WeekendResponse;
import ASAC8._SpringP2ractice.weekend.repository.WeekendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RequestMapping("/main/api")
@RestController
public class WeekendController {

    @Autowired
    WeekendRepository weekendRepository;

    @GetMapping("/weekend-special")
    public WeekendResponse getWeekend(){

        weekendRepository.reset();

        List<Weekend> weekend = weekendRepository.create(
                "퓨어 튜나 스틱 버라이어티팩",
                "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                30000,
                20000,
                33,
                120,
                4.5,
                true
        );

//        Integer totalCount = 6;

        WeekendResponse response = new WeekendResponse(weekend,weekend.size());

        return response;
    }
}
