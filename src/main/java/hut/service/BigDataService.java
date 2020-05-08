package hut.service;

import hut.dao.BigDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : zhw
 * @Date: 2020/5/8
 * @Description: bigdatademo
 * @version: 1.0
 */
@Service
public class BigDataService {

    @Autowired
    private BigDataMapper bigDataMapper;

}
