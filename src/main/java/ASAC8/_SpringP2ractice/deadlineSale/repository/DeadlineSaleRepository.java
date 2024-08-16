package ASAC8._SpringP2ractice.deadlineSale.repository;

import ASAC8._SpringP2ractice.deadlineSale.Deadline;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeadlineSaleRepository implements Repository{

    List<Deadline> deadlineList = new ArrayList<>();

    static Integer id = 1;

    @Override
    public List<Deadline> create(Integer id, String title, String description, String imageUrl, Integer originalPrice, Integer salePrice, Integer discountRate, Integer reviewCount, double rating) {
        deadlineList.add(new Deadline(id, title, description, imageUrl, originalPrice, salePrice, discountRate, reviewCount, rating));

        for(Deadline each : deadlineList){
            System.out.println(each);
        }

        id = id + 1;

        return deadlineList;
    }

    public void reset(){
        deadlineList.clear();
    }
}
