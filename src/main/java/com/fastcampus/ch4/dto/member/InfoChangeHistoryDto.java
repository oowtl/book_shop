package com.fastcampus.ch4.dto.member;

import java.util.Date;

public class InfoChangeHistoryDto {

  private int chgId;        // 변경 이력 ID
  private String id;            // 고유 식별자
  private Date chgTime;        // 변경 시각
  private String chgInfo;      // 변경 사항 설명
  private String bforChg;      // 변경 전 값
  private String aftrChg;      // 변경 후 값
  private Date regDate;        // 등록 시각
  private String regId;        // 등록자 ID
  private Date upDate;         // 업데이트 시각
  private String upId;         // 업데이트자 ID

  // Getters and Setters



  public int getChgId() {
    return chgId;
  }

  public void setChgId(int chgId) {
    this.chgId = chgId;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Date getChgTime() {
    return chgTime;
  }

  public void setChgTime(Date chgTime) {
    this.chgTime = chgTime;
  }

  public String getChgInfo() {
    return chgInfo;
  }

  public void setChgInfo(String chgInfo) {
    this.chgInfo = chgInfo;
  }

  public String getBforChg() {
    return bforChg;
  }

  public void setBforChg(String bforChg) {
    this.bforChg = bforChg;
  }

  public String getAftrChg() {
    return aftrChg;
  }

  public void setAftrChg(String aftrChg) {
    this.aftrChg = aftrChg;
  }

  public Date getRegDate() {
    return regDate;
  }

  public void setRegDate(Date regDate) {
    this.regDate = regDate;
  }

  public String getRegId() {
    return regId;
  }

  public void setRegId(String regId) {
    this.regId = regId;
  }

  public Date getUpDate() {
    return upDate;
  }

  public void setUpDate(Date upDate) {
    this.upDate = upDate;
  }

  public String getUpId() {
    return upId;
  }

  public void setUpId(String upId) {
    this.upId = upId;
  }

  @Override
  public String toString() {
    return "InfoChangeHistoryDto{" +
            "chgId='" + chgId + '\'' +
            ", id='" + id + '\'' +
            ", chgTime=" + chgTime +
            ", chgInfo='" + chgInfo + '\'' +
            ", bforChg='" + bforChg + '\'' +
            ", aftrChg='" + aftrChg + '\'' +
            ", regDate=" + regDate +
            ", regId='" + regId + '\'' +
            ", upDate=" + upDate +
            ", upId='" + upId + '\'' +
            '}';
  }

}