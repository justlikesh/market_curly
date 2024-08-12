package ASAC8._SpringP2ractice.banner.controller.response;

import ASAC8._SpringP2ractice.banner.Banner;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class BannerResponse {
    private List<Banner> MainBannerSlider;
}