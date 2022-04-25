package com.hz.pojo;


import lombok.Data;

@Data
public class bill {
   private Integer id;
   private String billCode;
   private String productName;
   private  String productDesc;
   private  String productUnit;
   private  double productCount;
   private  double totalPrice;
   private Integer isPayment;
   private  Integer createdBy;
   private  String creationDate;
   private  String modifyBy;
   private  String modifyDate;
   private  String   providerId;
}
