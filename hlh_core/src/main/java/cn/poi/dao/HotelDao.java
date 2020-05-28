package cn.poi.dao;

import cn.poi.po.Hotel;

import java.util.List;

public interface HotelDao {
    List<Hotel> selectHotelList() throws Exception;
}
