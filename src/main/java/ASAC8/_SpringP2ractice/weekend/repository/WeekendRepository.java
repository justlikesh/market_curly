package ASAC8._SpringP2ractice.weekend.repository;

import ASAC8._SpringP2ractice.weekend.Weekend;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeekendRepository implements Repository{

    List<Weekend> weekendList = new ArrayList<>();

    static Integer id = 1;

    @Override
    public List<Weekend> create(String title, String description, String imageUrl, Integer originalPrice, Integer salePrice, Integer discountRate, Integer reviewCount, double rating, Boolean isWeekendSpecial) {
        weekendList.add(new Weekend(id, title, description, imageUrl, originalPrice, salePrice, discountRate, reviewCount, rating, isWeekendSpecial));

        for(Weekend each : weekendList){
            System.out.println(each);
        }

        id = id + 1;

        return weekendList;
    }

    public void reset(){
        weekendList.clear();
    }
}
