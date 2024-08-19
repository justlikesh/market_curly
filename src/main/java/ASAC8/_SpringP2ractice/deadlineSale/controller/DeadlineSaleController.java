package ASAC8._SpringP2ractice.deadlineSale.controller;
import ASAC8._SpringP2ractice.deadlineSale.Deadline;
import ASAC8._SpringP2ractice.deadlineSale.controller.response.DeadlineSaleResponse;
import ASAC8._SpringP2ractice.deadlineSale.repository.DeadlineSaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@RestController
public class DeadlineSaleController {

    @Autowired
    DeadlineSaleRepository deadlineSaleRepository;

    @GetMapping("/closingSaleItems")
    public DeadlineSaleResponse getClosing(){

        deadlineSaleRepository.reset();

        List<Deadline> deadline = deadlineSaleRepository.create(
                "퓨어 튜나 스틱 버라이어티팩",
                "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                30000,
                20000,
                33,
                120,
                4.5
        );

//        Integer totalCount = 15;

        DeadlineSaleResponse response = new DeadlineSaleResponse(deadline,deadline.size());

        return response;

    }
}
