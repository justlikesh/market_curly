package ASAC8._SpringP2ractice.weekend.repository;

import ASAC8._SpringP2ractice.weekend.ItemResponseDto;
import ASAC8._SpringP2ractice.weekend.WeekendCreateDto;

import java.util.List;

public interface IRepository {
    public abstract List<ItemResponseDto> create(WeekendCreateDto dto);
}
