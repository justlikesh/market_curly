package ASAC8._SpringP2ractice.banner.repository;

import ASAC8._SpringP2ractice.banner.Banner;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BannerRepository implements Repository {

    List<Banner> bannerList = new ArrayList<>();

    static Integer id = 1;

    public void reset(){
        bannerList.clear();
    }

    @Override
    public List<Banner> create(Integer id, String title, String imageUrl) {
        bannerList.add(new Banner(id, title, imageUrl));

        for(Banner each : bannerList){
            System.out.println(each);
        }



        return bannerList;
    }

}
