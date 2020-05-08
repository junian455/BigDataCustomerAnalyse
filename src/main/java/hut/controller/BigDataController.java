package hut.controller;


import hut.service.BigDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : zhw
 * @Date: 2020/5/8
 * @Description: bigdatademo
 * @version: 1.0
 */
@Controller
@ResponseBody
public class BigDataController {

    @Autowired
    private BigDataService bigDataService;


}
