package com.sunnyweather.android.logic.model;

import java.util.List;

public class PlaceResponse {
    //用于搜索城市数据接口
    String status;
    List<Place> places;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }
}

