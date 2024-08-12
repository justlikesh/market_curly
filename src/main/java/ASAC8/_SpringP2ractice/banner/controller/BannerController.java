package ASAC8._SpringP2ractice.banner.controller;

import ASAC8._SpringP2ractice.banner.Banner;
import ASAC8._SpringP2ractice.banner.controller.response.BannerResponse;
import ASAC8._SpringP2ractice.banner.repository.BannerRepository;
import ASAC8._SpringP2ractice.deadlineSale.controller.response.DeadlineSaleResponse;
import ASAC8._SpringP2ractice.weekend.controller.response.WeekendResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/main/api")
@RestController
public class BannerController {

    @Autowired
    BannerRepository bannerRepository;

    @GetMapping("/main-slider")
    public BannerResponse getMain(){

        bannerRepository.reset();

        List<Banner> banner = bannerRepository.create(    //서비스로 빼거나 레파지토리에 넣기
                "1",
                "https://product-image.kurly.com/hdims/resize/%3E1900x%3E370/quality/85/src/banner/main/pc/img/e8a7168a-d665-4795-9fa0-2b9bcff17c7e.png"
        );
        BannerResponse response = new BannerResponse(banner);

        return response;
    }
}
