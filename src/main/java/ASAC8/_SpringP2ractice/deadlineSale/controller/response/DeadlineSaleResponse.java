package ASAC8._SpringP2ractice.deadlineSale.controller.response;

import ASAC8._SpringP2ractice.deadlineSale.Deadline;
import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.List;

@Getter
@AllArgsConstructor
public class DeadlineSaleResponse {
    private List<Deadline> closingSaleItems;
    private Integer totalCount;
}
