package com.example.kafka.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name="KAFKA_CUSTOMER_DEBIT_CREDIT_CARD_MAPPING")
public class CustomerDebitCreditCardMapping {

    @Id
    @Column
    Integer Id;

    @Column(name="customerid")
    Long CustomerID;

    @Column(name="mobilenumber")
    String MobileNumber;

    @Column(name="emailid")
    String EmailID;

    @Column(name="debitcardnumber")
    String debitCardNumber;

    @Column(name="creditcardnumber")
    String CreditCardNumber;

    @Column(name="merchantgroupid")
    Integer MerchantGroupID;

    @Column(name="merchantgroupnumber")
    String MerchantGroupNumber;

    @Column(name="merchantgroupname")
    String MerchantGroupName;

    @Column(name="merchantid")
    Integer MerchantID;

    @Column(name="merchantnumber")
    String MerchantNumber;

    @Column(name="merchantname")
    String MerchantName;

    @Column(name="storeid")
    Integer StoreID;

    @Column(name="storename")
    String StoreName;

    @Column(name="storelocation")
    String StoreLocation;

    @Column(name="storetypeid")
    Integer StoreTypeID;

    @Column(name="terminalnumber")
    String TerminalNumber;


    public CustomerDebitCreditCardMapping() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Long getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(Long customerID) {
        CustomerID = customerID;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        MobileNumber = mobileNumber;
    }

    public String getEmailID() {
        return EmailID;
    }

    public void setEmailID(String emailID) {
        EmailID = emailID;
    }

    public String getDebitCardNumber() {
        return debitCardNumber;
    }

    public void setDebitCardNumber(String debitCardNumber) {
        debitCardNumber = debitCardNumber;
    }

    public String getCreditCardNumber() {
        return CreditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        CreditCardNumber = creditCardNumber;
    }

    public Integer getMerchantGroupID() {
        return MerchantGroupID;
    }

    public void setMerchantGroupID(Integer merchantGroupID) {
        MerchantGroupID = merchantGroupID;
    }

    public String getMerchantGroupNumber() {
        return MerchantGroupNumber;
    }

    public void setMerchantGroupNumber(String merchantGroupNumber) {
        MerchantGroupNumber = merchantGroupNumber;
    }

    public String getMerchantGroupName() {
        return MerchantGroupName;
    }

    public void setMerchantGroupName(String merchantGroupName) {
        MerchantGroupName = merchantGroupName;
    }

    public Integer getMerchantID() {
        return MerchantID;
    }

    public void setMerchantID(Integer merchantID) {
        MerchantID = merchantID;
    }

    public String getMerchantNumber() {
        return MerchantNumber;
    }

    public void setMerchantNumber(String merchantNumber) {
        MerchantNumber = merchantNumber;
    }

    public String getMerchantName() {
        return MerchantName;
    }

    public void setMerchantName(String merchantName) {
        MerchantName = merchantName;
    }

    public Integer getStoreID() {
        return StoreID;
    }

    public void setStoreID(Integer storeID) {
        StoreID = storeID;
    }

    public String getStoreName() {
        return StoreName;
    }

    public void setStoreName(String storeName) {
        StoreName = storeName;
    }

    public String getStoreLocation() {
        return StoreLocation;
    }

    public void setStoreLocation(String storeLocation) {
        StoreLocation = storeLocation;
    }

    public Integer getStoreTypeID() {
        return StoreTypeID;
    }

    public void setStoreTypeID(Integer storeTypeID) {
        StoreTypeID = storeTypeID;
    }

    public String getTerminalNumber() {
        return TerminalNumber;
    }

    public void setTerminalNumber(String terminalNumber) {
        TerminalNumber = terminalNumber;
    }








    /*
            [ID] [int] IDENTITY(1,1) NOT NULL,
	        [CustomerID] [bigint] NULL,
            [MobileNumber] [varchar](20) NULL,
            [EmailID] [varchar](50) NULL,
            [DebitCardNumber] [varchar](16) NULL,
            [CreditCardNumber] [varchar](16) NULL,
            [MerchantGroupID] [int] NULL,
            [MerchantGroupNumber] [varchar](5) NULL,
            [MerchantGroupName] [nvarchar](50) NULL,
            [MerchantID] [int] NOT NULL,
	        [MerchantNumber] [varchar](16) NULL,
            [MerchantName] [nvarchar](50) NULL,
            [StoreID] [int] NULL,
            [StoreName] [nvarchar](50) NULL,
            [StoreLocation] [nvarchar](50) NULL,
            [StoreTypeID] [int] NULL,
            [TerminalNumber] [varchar](24) NULL

     */

}
