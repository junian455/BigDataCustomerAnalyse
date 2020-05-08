package hut.pojo;

/**
 * 用户行为的枚举类
 *
 * @author : zhw
 * @Date: 2020/5/8
 * @Description: bigdatademo
 * @version: 1.0
 */
public enum BehaviorTypeEnum {

    /**
     * 用户的四种行为
     */
    BROWS ( "游览", "1" ),
    COLLECT ( "收藏", "2" ),
    ADDCART ( "加入购物车", "3" ),
    BUY ( "购买", "4" );

    String name;
    String id;

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getId () {
        return id;
    }

    public void setId ( String id ) {
        this.id = id;
    }

    private BehaviorTypeEnum ( String name, String id ) {
        this.name = name;
        this.id = id;
    }


}
