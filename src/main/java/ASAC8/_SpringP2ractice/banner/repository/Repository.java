package ASAC8._SpringP2ractice.banner.repository;

import ASAC8._SpringP2ractice.banner.Banner;

import java.util.List;

public interface Repository {
    public abstract List<Banner> create(String title, String imageUrl);
}
