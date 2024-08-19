package ASAC8._SpringP2ractice.newProduct.service;

import ASAC8._SpringP2ractice.item.Item;
import ASAC8._SpringP2ractice.item.ItemRepository;
import ASAC8._SpringP2ractice.weekend.ItemResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NewProductService {
    private final ItemRepository itemRepository;

    public List<ItemResponseDto> getNewProduct() {
        List<Item> items = itemRepository.getAllItems();
        List<Item> newProducts = items.stream()  // List -> Stream
//                .filter((item) -> {
//                    return item.getIsNew();
//                })
                .filter(Item::getIsNew)
                .toList();   // Stream -> List

        // List<Item> -> List<ItemResponseDto>
        List<ItemResponseDto> response = newProducts.stream()
//                .map((item) -> {
//                    return ItemResponseDto.of(item);
//                })
                .map(ItemResponseDto::of)
                .toList();

        return response;
    }

}
