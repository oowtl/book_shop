package com.fastcampus.ch4.dto.order;

import java.util.Date;
import java.util.Objects;

public class OrderProductDto {
    // PK
    private Integer ord_prod_seq; // 주문 상품 번호

    // FK
    private Integer ord_seq; // 주문 번호
    private String isbn; // 도서 pk
    private String prod_type_code; // 상품 유형 코드

    // NOT NULL
    private Integer ord_stat; // 주문 상태
    private Integer deli_stat; // 배송 상태
    private Integer pay_stat; // 결제 상태
    private String cust_id; // 고객 id

    // NULL
    private String book_title; // 도서 제목
    private Integer item_quan; //주문 상품 수량
    private Double point_perc; // 적립율
    private Integer point_pric; // 적립금
    private Integer basic_pric; // 상품 정가
    private Double disc_perc; // 상품 할인율
    private Integer disc_pric; // 상품 할인 가격
    private Integer sale_pric; // 상품 판매 가격
    private Integer ord_pric; // 주문 금액
    private String repre_img; // 대표 이미지 url
    private String created_at; // 생성 일자
    private String updated_at; // 변경 일자

    // 시스템 컬럼  - equals 제외
    private Date reg_date; // 최초 등록 일시
    private String reg_id; // 최초 등록 id
    private Date up_date; // 최근 수정 일시
    private String up_id; // 최근 수정 id

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderProductDto)) return false;
        OrderProductDto that = (OrderProductDto) o;
        return Objects.equals(ord_prod_seq, that.ord_prod_seq) && Objects.equals(ord_seq, that.ord_seq) && Objects.equals(isbn, that.isbn) && Objects.equals(prod_type_code, that.prod_type_code) && Objects.equals(ord_stat, that.ord_stat) && Objects.equals(deli_stat, that.deli_stat) && Objects.equals(pay_stat, that.pay_stat) && Objects.equals(cust_id, that.cust_id) && Objects.equals(book_title, that.book_title) && Objects.equals(item_quan, that.item_quan) && Objects.equals(point_perc, that.point_perc) && Objects.equals(point_pric, that.point_pric) && Objects.equals(basic_pric, that.basic_pric) && Objects.equals(disc_perc, that.disc_perc) && Objects.equals(disc_pric, that.disc_pric) && Objects.equals(sale_pric, that.sale_pric) && Objects.equals(ord_pric, that.ord_pric) && Objects.equals(repre_img, that.repre_img);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ord_prod_seq, ord_seq, isbn, prod_type_code, ord_stat, deli_stat, pay_stat, cust_id, book_title, item_quan, point_perc, point_pric, basic_pric, disc_perc, disc_pric, sale_pric, ord_pric, repre_img);
    }

    public Integer getOrd_prod_seq() {
        return ord_prod_seq;
    }

    public void setOrd_prod_seq(Integer ord_prod_seq) {
        this.ord_prod_seq = ord_prod_seq;
    }

    public Integer getOrd_seq() {
        return ord_seq;
    }

    public void setOrd_seq(Integer ord_seq) {
        this.ord_seq = ord_seq;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getProd_type_code() {
        return prod_type_code;
    }

    public void setProd_type_code(String prod_type_code) {
        this.prod_type_code = prod_type_code;
    }

    public Integer getOrd_stat() {
        return ord_stat;
    }

    public void setOrd_stat(Integer ord_stat) {
        this.ord_stat = ord_stat;
    }

    public Integer getDeli_stat() {
        return deli_stat;
    }

    public void setDeli_stat(Integer deli_stat) {
        this.deli_stat = deli_stat;
    }

    public Integer getPay_stat() {
        return pay_stat;
    }

    public void setPay_stat(Integer pay_stat) {
        this.pay_stat = pay_stat;
    }

    public String getCust_id() {
        return cust_id;
    }

    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
    }

    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public Integer getItem_quan() {
        return item_quan;
    }

    public void setItem_quan(Integer item_quan) {
        this.item_quan = item_quan;
    }

    public Double getPoint_perc() {
        return point_perc;
    }

    public void setPoint_perc(Double point_perc) {
        this.point_perc = point_perc;
    }

    public Integer getPoint_pric() {
        return point_pric;
    }

    public void setPoint_pric(Integer point_pric) {
        this.point_pric = point_pric;
    }

    public Integer getBasic_pric() {
        return basic_pric;
    }

    public void setBasic_pric(Integer basic_pric) {
        this.basic_pric = basic_pric;
    }

    public Double getDisc_perc() {
        return disc_perc;
    }

    public void setDisc_perc(Double disc_perc) {
        this.disc_perc = disc_perc;
    }

    public Integer getDisc_pric() {
        return disc_pric;
    }

    public void setDisc_pric(Integer disc_pric) {
        this.disc_pric = disc_pric;
    }

    public Integer getSale_pric() {
        return sale_pric;
    }

    public void setSale_pric(Integer sale_pric) {
        this.sale_pric = sale_pric;
    }

    public Integer getOrd_pric() {
        return ord_pric;
    }

    public void setOrd_pric(Integer ord_pric) {
        this.ord_pric = ord_pric;
    }

    public String getRepre_img() {
        return repre_img;
    }

    public void setRepre_img(String repre_img) {
        this.repre_img = repre_img;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public Date getReg_date() {
        return reg_date;
    }

    public void setReg_date(Date reg_date) {
        this.reg_date = reg_date;
    }

    public String getReg_id() {
        return reg_id;
    }

    public void setReg_id(String reg_id) {
        this.reg_id = reg_id;
    }

    public Date getUp_date() {
        return up_date;
    }

    public void setUp_date(Date up_date) {
        this.up_date = up_date;
    }

    public String getUp_id() {
        return up_id;
    }

    public void setUp_id(String up_id) {
        this.up_id = up_id;
    }
}
