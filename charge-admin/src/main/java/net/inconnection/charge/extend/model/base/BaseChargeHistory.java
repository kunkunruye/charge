package net.inconnection.charge.extend.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseChargeHistory<M extends BaseChargeHistory<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setOpenId(java.lang.String openId) {
		set("openId", openId);
		return (M)this;
	}
	
	public java.lang.String getOpenId() {
		return getStr("openId");
	}

	public M setDeviceId(java.lang.String deviceId) {
		set("deviceId", deviceId);
		return (M)this;
	}
	
	public java.lang.String getDeviceId() {
		return getStr("deviceId");
	}

	public M setSocketSn(java.lang.String socketSn) {
		set("socketSn", socketSn);
		return (M)this;
	}
	
	public java.lang.String getSocketSn() {
		return getStr("socketSn");
	}

	public M setCompanyId(java.lang.Long companyId) {
		set("company_id", companyId);
		return (M)this;
	}
	
	public java.lang.Long getCompanyId() {
		return getLong("company_id");
	}

	public M setOperStartTime(java.util.Date operStartTime) {
		set("operStartTime", operStartTime);
		return (M)this;
	}
	
	public java.util.Date getOperStartTime() {
		return get("operStartTime");
	}

	public M setStartTime(java.util.Date startTime) {
		set("startTime", startTime);
		return (M)this;
	}
	
	public java.util.Date getStartTime() {
		return get("startTime");
	}

	public M setEndTime(java.util.Date endTime) {
		set("endTime", endTime);
		return (M)this;
	}
	
	public java.util.Date getEndTime() {
		return get("endTime");
	}

	public M setFeeStatus(java.lang.String feeStatus) {
		set("feeStatus", feeStatus);
		return (M)this;
	}
	
	public java.lang.String getFeeStatus() {
		return getStr("feeStatus");
	}

	public M setOperType(java.lang.String operType) {
		set("operType", operType);
		return (M)this;
	}
	
	public java.lang.String getOperType() {
		return getStr("operType");
	}

	public M setChargeType(java.lang.String chargeType) {
		set("chargeType", chargeType);
		return (M)this;
	}
	
	public java.lang.String getChargeType() {
		return getStr("chargeType");
	}

	public M setChargeStatus(java.lang.String chargeStatus) {
		set("chargeStatus", chargeStatus);
		return (M)this;
	}
	
	public java.lang.String getChargeStatus() {
		return getStr("chargeStatus");
	}

	public M setChargeMoney(java.lang.Integer chargeMoney) {
		set("chargeMoney", chargeMoney);
		return (M)this;
	}
	
	public java.lang.Integer getChargeMoney() {
		return getInt("chargeMoney");
	}

	public M setRealMoney(java.lang.Integer realMoney) {
		set("realMoney", realMoney);
		return (M)this;
	}
	
	public java.lang.Integer getRealMoney() {
		return getInt("realMoney");
	}

	public M setGiftMoney(java.lang.Integer giftMoney) {
		set("giftMoney", giftMoney);
		return (M)this;
	}
	
	public java.lang.Integer getGiftMoney() {
		return getInt("giftMoney");
	}

	public M setRealRate(java.lang.Double realRate) {
		set("realRate", realRate);
		return (M)this;
	}
	
	public java.lang.Double getRealRate() {
		return getDouble("realRate");
	}

	public M setAutoUnitPrice(java.lang.Integer autoUnitPrice) {
		set("autoUnitPrice", autoUnitPrice);
		return (M)this;
	}
	
	public java.lang.Integer getAutoUnitPrice() {
		return getInt("autoUnitPrice");
	}

	public M setChargeTime(java.lang.Integer chargeTime) {
		set("chargeTime", chargeTime);
		return (M)this;
	}
	
	public java.lang.Integer getChargeTime() {
		return getInt("chargeTime");
	}

	public M setRealChargeTime(java.lang.Integer realChargeTime) {
		set("realChargeTime", realChargeTime);
		return (M)this;
	}
	
	public java.lang.Integer getRealChargeTime() {
		return getInt("realChargeTime");
	}

	public M setCreateDate(java.util.Date createDate) {
		set("createDate", createDate);
		return (M)this;
	}
	
	public java.util.Date getCreateDate() {
		return get("createDate");
	}

	public M setMD5(java.lang.String MD5) {
		set("MD5", MD5);
		return (M)this;
	}
	
	public java.lang.String getMD5() {
		return getStr("MD5");
	}

	public M setPayToAgentStatus(java.lang.String payToAgentStatus) {
		set("pay_to_agent_status", payToAgentStatus);
		return (M)this;
	}
	
	public java.lang.String getPayToAgentStatus() {
		return getStr("pay_to_agent_status");
	}

	public M setPayToAgentTime(java.util.Date payToAgentTime) {
		set("pay_to_agent_time", payToAgentTime);
		return (M)this;
	}
	
	public java.util.Date getPayToAgentTime() {
		return get("pay_to_agent_time");
	}

	public M setAddMoney(java.lang.String addMoney) {
		set("add_money", addMoney);
		return (M)this;
	}
	
	public java.lang.String getAddMoney() {
		return getStr("add_money");
	}

}