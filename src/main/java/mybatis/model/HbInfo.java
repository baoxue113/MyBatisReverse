package main.java.mybatis.model;

public class HbInfo {
    private Integer id;

    private String hbNo;

    private Double hbBalance;

    private Double hbSize;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHbNo() {
        return hbNo;
    }

    public void setHbNo(String hbNo) {
        this.hbNo = hbNo == null ? null : hbNo.trim();
    }

    public Double getHbBalance() {
        return hbBalance;
    }

    public void setHbBalance(Double hbBalance) {
        this.hbBalance = hbBalance;
    }

    public Double getHbSize() {
        return hbSize;
    }

    public void setHbSize(Double hbSize) {
        this.hbSize = hbSize;
    }
}