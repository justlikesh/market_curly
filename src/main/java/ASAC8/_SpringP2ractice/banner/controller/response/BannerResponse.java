package ASAC8._SpringP2ractice.banner.controller.response;

import ASAC8._SpringP2ractice.banner.Banner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public class BannerResponse {
    @JsonProperty("MainBannerSlider")   //대문자를 쓰기위한 어노테이션
    private List<Banner> MainBannerSlider;
}