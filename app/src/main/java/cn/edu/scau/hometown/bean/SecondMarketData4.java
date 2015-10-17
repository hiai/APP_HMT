package cn.edu.scau.hometown.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2015/10/11 0011.
 */
public class SecondMarketData4 implements Serializable{

    /**
     * goods : [{"secondgoods_id":"67","secondgoods_price":"21","secondgoods_name":"1234","secondgoods_views":"4","secondgoods_bewrite":"123123","secondgoods_postdate":"1439290356","secondgoods_pastdate":"1439549556","secondgoods_picture":null}]
     * page : <nav><ul class="pagination">    </ul></nav>
     */

    private String page;
    private List<GoodsEntity> goods;

    public void setPage(String page) {
        this.page = page;
    }

    public void setGoods(List<GoodsEntity> goods) {
        this.goods = goods;
    }

    public String getPage() {
        return page;
    }

    public List<GoodsEntity> getGoods() {
        return goods;
    }

    public static class GoodsEntity implements Serializable{
        /**
         * secondgoods_id : 67
         * secondgoods_price : 21
         * secondgoods_name : 1234
         * secondgoods_views : 4
         * secondgoods_bewrite : 123123
         * secondgoods_postdate : 1439290356
         * secondgoods_pastdate : 1439549556
         * secondgoods_picture : null
         */

        private String secondgoods_id;
        private String secondgoods_price;
        private String secondgoods_name;
        private String secondgoods_views;
        private String secondgoods_bewrite;
        private String secondgoods_postdate;
        private String secondgoods_pastdate;
        private Object secondgoods_picture;

        public void setSecondgoods_id(String secondgoods_id) {
            this.secondgoods_id = secondgoods_id;
        }

        public void setSecondgoods_price(String secondgoods_price) {
            this.secondgoods_price = secondgoods_price;
        }

        public void setSecondgoods_name(String secondgoods_name) {
            this.secondgoods_name = secondgoods_name;
        }

        public void setSecondgoods_views(String secondgoods_views) {
            this.secondgoods_views = secondgoods_views;
        }

        public void setSecondgoods_bewrite(String secondgoods_bewrite) {
            this.secondgoods_bewrite = secondgoods_bewrite;
        }

        public void setSecondgoods_postdate(String secondgoods_postdate) {
            this.secondgoods_postdate = secondgoods_postdate;
        }

        public void setSecondgoods_pastdate(String secondgoods_pastdate) {
            this.secondgoods_pastdate = secondgoods_pastdate;
        }

        public void setSecondgoods_picture(Object secondgoods_picture) {
            this.secondgoods_picture = secondgoods_picture;
        }

        public String getSecondgoods_id() {
            return secondgoods_id;
        }

        public String getSecondgoods_price() {
            return secondgoods_price;
        }

        public String getSecondgoods_name() {
            return secondgoods_name;
        }

        public String getSecondgoods_views() {
            return secondgoods_views;
        }

        public String getSecondgoods_bewrite() {
            return secondgoods_bewrite;
        }

        public String getSecondgoods_postdate() {
            return secondgoods_postdate;
        }

        public String getSecondgoods_pastdate() {
            return secondgoods_pastdate;
        }

        public Object getSecondgoods_picture() {
            return secondgoods_picture;
        }
    }
}
