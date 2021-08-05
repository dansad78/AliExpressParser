package org.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.opencsv.bean.CsvBindByName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {
    @CsvBindByName
    private Long productId;
    @CsvBindByName
    private Long sellerId;
    @CsvBindByName
    private String oriMinPrice;
    @CsvBindByName
    private String oriMaxPrice;
    @CsvBindByName
    private Long promotionId;
    @CsvBindByName
    private Long startTime;
    @CsvBindByName
    private Long endTime;
    @CsvBindByName
    private int phase;
    @CsvBindByName
    private String productTitle;
    @CsvBindByName
    private String minPrice;
    @CsvBindByName
    private String maxPrice;
    @CsvBindByName
    private String discount;
    @CsvBindByName
    private String orders;
    @CsvBindByName
    private String productImage;
    @CsvBindByName
    private String productDetailUrl;
    @CsvBindByName
    private String shopUrl;
    @CsvBindByName
    private String totalTranpro3;
    @CsvBindByName
    private String productPositiveRate;
    @CsvBindByName
    private String productAverageStar;
    @CsvBindByName
    private int itemEvalTotalNum;

    public Item() {
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public String getOriMinPrice() {
        return oriMinPrice;
    }

    public void setOriMinPrice(String oriMinPrice) {
        this.oriMinPrice = oriMinPrice;
    }

    public String getOriMaxPrice() {
        return oriMaxPrice;
    }

    public void setOriMaxPrice(String oriMaxPrice) {
        this.oriMaxPrice = oriMaxPrice;
    }

    public Long getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Long promotionId) {
        this.promotionId = promotionId;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(String minPrice) {
        this.minPrice = minPrice;
    }

    public String getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(String maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getOrders() {
        return orders;
    }

    public void setOrders(String orders) {
        this.orders = orders;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductDetailUrl() {
        return productDetailUrl;
    }

    public void setProductDetailUrl(String productDetailUrl) {
        this.productDetailUrl = productDetailUrl;
    }

    public String getShopUrl() {
        return shopUrl;
    }

    public void setShopUrl(String shopUrl) {
        this.shopUrl = shopUrl;
    }

    public String getTotalTranpro3() {
        return totalTranpro3;
    }

    public void setTotalTranpro3(String totalTranpro3) {
        this.totalTranpro3 = totalTranpro3;
    }

    public String getProductPositiveRate() {
        return productPositiveRate;
    }

    public void setProductPositiveRate(String productPositiveRate) {
        this.productPositiveRate = productPositiveRate;
    }

    public String getProductAverageStar() {
        return productAverageStar;
    }

    public void setProductAverageStar(String productAverageStar) {
        this.productAverageStar = productAverageStar;
    }

    public int getItemEvalTotalNum() {
        return itemEvalTotalNum;
    }

    public void setItemEvalTotalNum(int itemEvalTotalNum) {
        this.itemEvalTotalNum = itemEvalTotalNum;
    }

    @Override
    public String toString() {
        return "Item{" +
                "productId=" + productId +
                ", sellerId=" + sellerId +
                ", oriMinPrice='" + oriMinPrice + '\'' +
                ", oriMaxPrice='" + oriMaxPrice + '\'' +
                ", promotionId=" + promotionId +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", phase=" + phase +
                ", productTitle='" + productTitle + '\'' +
                ", minPrice='" + minPrice + '\'' +
                ", maxPrice='" + maxPrice + '\'' +
                ", discount='" + discount + '\'' +
                ", orders='" + orders + '\'' +
                ", productImage='" + productImage + '\'' +
                ", productDetailUrl='" + productDetailUrl + '\'' +
                ", shopUrl='" + shopUrl + '\'' +
                ", totalTranpro3='" + totalTranpro3 + '\'' +
                ", productPositiveRate='" + productPositiveRate + '\'' +
                ", productAverageStar='" + productAverageStar + '\'' +
                ", itemEvalTotalNum=" + itemEvalTotalNum +
                '}';
    }
}
