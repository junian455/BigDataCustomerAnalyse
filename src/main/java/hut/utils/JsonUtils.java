package hut.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

/**
 * @author : zhw
 * @Date: 2020/5/8
 * @Description: bigdatademo
 * @version: 1.0
 */
public class JsonUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger ( JsonUtils.class );


    /**
     * 将对象转换为json字符串
     * @param object
     * @return
     */
    public static String parseObject(Object object){
       Optional.of ( object );
       String str = JSONObject.toJSONString ( object );
       LOGGER.info ( "object => json :" + object.toString () );
       return str;
    }

    /**
     * 将json字符串转化为对象,用不到。
     * @param json
     * @param c
     * @param <T>
     * @return
     */
    public static <T> T parserJsonToObject ( String json, Class <T> c ) {
        Optional.of ( json );
        JSONObject jsonObject = JSON.parseObject ( json );
        LOGGER.info ( "json => object :" + json.toString () );
        return JSON.toJavaObject ( jsonObject, c );
    }
}
