package cn.poi.dao;

import cn.poi.po.Img;

public interface ImgDao {
    Img selectImgByHotelId(Integer hotelId) throws Exception;
}
