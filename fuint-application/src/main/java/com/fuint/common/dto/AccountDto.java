package com.fuint.common.dto;

import java.util.Date;

/**
 * 后台账户实体类
 */
public class AccountDto {

    /**
     * 账户主键id
     */
    private Integer id;

    /**
     * 账户编码
     */
    private String accountKey;

    /**
     * 账户名称
     */
    private String accountName;
    /**
     * 密码
     */
    private String password;

    /**
     * 账户状态
     * 状态 : 0 无效 1 有效
     */
    private int accountStatus;

    /**
     * 是否激活
     * 状态 : 0 未激活 1已激活
     */
    private int isActive;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改时间
     */
    private Date modifyDate;

    /**
     * 随机码（公盐）
     */
    private String salt;

    /**
     * 是否被锁定
     */
    private int locked;

    /**
     * 管理员真实姓名
     */
    private String realName;

    /**
     * 所属店铺id
     */
    private Integer storeId;

    /**
     * 所属店铺名称
     */
    private String storeName;

    /**
     * 员工ID
     */
    private Integer staffId;

    /**
     * 所属商户
     */
    private Integer merchantId;

    /**
     * 所属商户名称
     */
    private String merchantName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountKey() {
        return accountKey;
    }

    public void setAccountKey(String accountKey) {
        this.accountKey = accountKey;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(int accountStatus) {
        this.accountStatus = accountStatus;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public int getLocked() {
        return locked;
    }

    public void setLocked(int locked) {
        this.locked = locked;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantName() {
        return merchantName;
    }
}
