package ASAC8._SpringP2ractice.weekend.controller.response;

import ASAC8._SpringP2ractice.weekend.Weekend;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
public class WeekendResponse {
    private List<Weekend> weekendSpecialItems;
    private Integer totalCount;
}
