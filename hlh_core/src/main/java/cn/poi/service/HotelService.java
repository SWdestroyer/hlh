package cn.poi.service;

import cn.poi.po.Hotel;

import java.util.List;

public interface HotelService {
    List<Hotel> selectHotelList() throws Exception;
}
