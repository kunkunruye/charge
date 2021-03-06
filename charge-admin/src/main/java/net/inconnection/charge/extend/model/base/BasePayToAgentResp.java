package net.inconnection.charge.extend.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePayToAgentResp<M extends BasePayToAgentResp<M>> extends Model<M> implements IBean {

	public M setId(Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public Integer getId() {
		return getInt("id");
	}

	public M setReturnCode(String returnCode) {
		set("return_code", returnCode);
		return (M)this;
	}
	
	public String getReturnCode() {
		return getStr("return_code");
	}

	public M setReturnMsg(String returnMsg) {
		set("return_msg", returnMsg);
		return (M)this;
	}
	
	public String getReturnMsg() {
		return getStr("return_msg");
	}

	public M setMchAppid(String mchAppid) {
		set("mch_appid", mchAppid);
		return (M)this;
	}
	
	public String getMchAppid() {
		return getStr("mch_appid");
	}

	public M setMchid(String mchid) {
		set("mchid", mchid);
		return (M)this;
	}
	
	public String getMchid() {
		return getStr("mchid");
	}

	public M setDeviceInfo(String deviceInfo) {
		set("device_info", deviceInfo);
		return (M)this;
	}
	
	public String getDeviceInfo() {
		return getStr("device_info");
	}

	public M setNonceStr(String nonceStr) {
		set("nonce_str", nonceStr);
		return (M)this;
	}
	
	public String getNonceStr() {
		return getStr("nonce_str");
	}

	public M setResultCode(String resultCode) {
		set("result_code", resultCode);
		return (M)this;
	}
	
	public String getResultCode() {
		return getStr("result_code");
	}

	public M setErrCode(String errCode) {
		set("err_code", errCode);
		return (M)this;
	}
	
	public String getErrCode() {
		return getStr("err_code");
	}

	public M setErrCodeDes(String errCodeDes) {
		set("err_code_des", errCodeDes);
		return (M)this;
	}
	
	public String getErrCodeDes() {
		return getStr("err_code_des");
	}

	public M setPartnerTradeNo(String partnerTradeNo) {
		set("partner_trade_no", partnerTradeNo);
		return (M)this;
	}
	
	public String getPartnerTradeNo() {
		return getStr("partner_trade_no");
	}

	public M setPaymentNo(String paymentNo) {
		set("payment_no", paymentNo);
		return (M)this;
	}
	
	public String getPaymentNo() {
		return getStr("payment_no");
	}

	public M setPaymentTime(String paymentTime) {
		set("payment_time", paymentTime);
		return (M)this;
	}
	
	public String getPaymentTime() {
		return getStr("payment_time");
	}

	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

}
