package cn.poi.service.impl;

import cn.poi.dao.HotelDao;
import cn.poi.po.Hotel;
import cn.poi.service.HotelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Resource
    private HotelDao hotelDao;

    @Override
    public List<Hotel> selectHotelList() throws Exception {
        return hotelDao.selectHotelList();
    }
}
