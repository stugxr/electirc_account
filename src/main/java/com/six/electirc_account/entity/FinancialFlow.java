package com.six.electirc_account.entity;


import java.math.BigDecimal;

public class FinancialFlow {

  private long transferId;
  private long userId;
  private String transferName;
  private String transferType;
  private java.sql.Timestamp transferDate;
  private String remarks;
  private BigDecimal balance;
  private String transferState;
  private String tradingMode;
  private BigDecimal transferAmount;
  private long tellerNumber;
  private String typesCurrency;
  private String enjambment;
  private String customerLevel;
  private long serviceCharge;
  private String transferCode;

  public String getTransferCode() {
    return transferCode;
  }

  public void setTransferCode(String transferCode) {
    this.transferCode = transferCode;
  }

  public long getTransferId() {
    return transferId;
  }

  public void setTransferId(long transferId) {
    this.transferId = transferId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getTransferName() {
    return transferName;
  }

  public void setTransferName(String transferName) {
    this.transferName = transferName;
  }


  public String getTransferType() {
    return transferType;
  }

  public void setTransferType(String transferType) {
    this.transferType = transferType;
  }


  public java.sql.Timestamp getTransferDate() {
    return transferDate;
  }

  public void setTransferDate(java.sql.Timestamp transferDate) {
    this.transferDate = transferDate;
  }


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }


  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }


  public String getTransferState() {
    return transferState;
  }

  public void setTransferState(String transferState) {
    this.transferState = transferState;
  }


  public String getTradingMode() {
    return tradingMode;
  }

  public void setTradingMode(String tradingMode) {
    this.tradingMode = tradingMode;
  }


  public BigDecimal getTransferAmount() {
    return transferAmount;
  }

  public void setTransferAmount(BigDecimal transferAmount) {
    this.transferAmount = transferAmount;
  }


  public long getTellerNumber() {
    return tellerNumber;
  }

  public void setTellerNumber(long tellerNumber) {
    this.tellerNumber = tellerNumber;
  }


  public String getTypesCurrency() {
    return typesCurrency;
  }

  public void setTypesCurrency(String typesCurrency) {
    this.typesCurrency = typesCurrency;
  }


  public String getEnjambment() {
    return enjambment;
  }

  public void setEnjambment(String enjambment) {
    this.enjambment = enjambment;
  }


  public String getCustomerLevel() {
    return customerLevel;
  }

  public void setCustomerLevel(String customerLevel) {
    this.customerLevel = customerLevel;
  }


  public long getServiceCharge() {
    return serviceCharge;
  }

  public void setServiceCharge(long serviceCharge) {
    this.serviceCharge = serviceCharge;
  }

}
