package net.inconnection.charge.extend.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseTuser<M extends BaseTuser<M>> extends Model<M> implements IBean {

	public M setId(Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public Integer getId() {
		return getInt("id");
	}

	public M setOpenId(String openId) {
		set("openId", openId);
		return (M)this;
	}
	
	public String getOpenId() {
		return getStr("openId");
	}

	public M setNickName(String nickName) {
		set("nickName", nickName);
		return (M)this;
	}
	
	public String getNickName() {
		return getStr("nickName");
	}

	public M setHeadimgurl(String headimgurl) {
		set("headimgurl", headimgurl);
		return (M)this;
	}
	
	public String getHeadimgurl() {
		return getStr("headimgurl");
	}

	public M setSex(Integer sex) {
		set("sex", sex);
		return (M)this;
	}
	
	public Integer getSex() {
		return getInt("sex");
	}

	public M setUnionid(String unionid) {
		set("unionid", unionid);
		return (M)this;
	}
	
	public String getUnionid() {
		return getStr("unionid");
	}

	public M setPrivilege(String privilege) {
		set("privilege", privilege);
		return (M)this;
	}
	
	public String getPrivilege() {
		return getStr("privilege");
	}

	public M setCity(String city) {
		set("city", city);
		return (M)this;
	}
	
	public String getCity() {
		return getStr("city");
	}

	public M setCountry(String country) {
		set("country", country);
		return (M)this;
	}
	
	public String getCountry() {
		return getStr("country");
	}

	public M setProvince(String province) {
		set("province", province);
		return (M)this;
	}
	
	public String getProvince() {
		return getStr("province");
	}

	public M setEmail(String email) {
		set("email", email);
		return (M)this;
	}
	
	public String getEmail() {
		return getStr("email");
	}

	public M setTel(String tel) {
		set("tel", tel);
		return (M)this;
	}
	
	public String getTel() {
		return getStr("tel");
	}

	public M setPassword(String password) {
		set("password", password);
		return (M)this;
	}
	
	public String getPassword() {
		return getStr("password");
	}

	public M setPassword2(String password2) {
		set("password2", password2);
		return (M)this;
	}
	
	public String getPassword2() {
		return getStr("password2");
	}

	public M setRemember(String remember) {
		set("remember", remember);
		return (M)this;
	}
	
	public String getRemember() {
		return getStr("remember");
	}

	public M setRegisterDate(java.util.Date registerDate) {
		set("registerDate", registerDate);
		return (M)this;
	}
	
	public java.util.Date getRegisterDate() {
		return get("registerDate");
	}

	public M setLastLoginDate(java.util.Date lastLoginDate) {
		set("lastLoginDate", lastLoginDate);
		return (M)this;
	}
	
	public java.util.Date getLastLoginDate() {
		return get("lastLoginDate");
	}

	public M setLevel(Integer level) {
		set("level", level);
		return (M)this;
	}
	
	public Integer getLevel() {
		return getInt("level");
	}

	public M setCardNumber(String cardNumber) {
		set("cardNumber", cardNumber);
		return (M)this;
	}
	
	public String getCardNumber() {
		return getStr("cardNumber");
	}

	public M setPhyCardNumber(String phyCardNumber) {
		set("phyCardNumber", phyCardNumber);
		return (M)this;
	}
	
	public String getPhyCardNumber() {
		return getStr("phyCardNumber");
	}

	public M setCardAccount(Integer cardAccount) {
		set("cardAccount", cardAccount);
		return (M)this;
	}
	
	public Integer getCardAccount() {
		return getInt("cardAccount");
	}

	public M setBand(String band) {
		set("band", band);
		return (M)this;
	}
	
	public String getBand() {
		return getStr("band");
	}

	public M setStatus(String status) {
		set("status", status);
		return (M)this;
	}
	
	public String getStatus() {
		return getStr("status");
	}

	public M setWalletNumber(String walletNumber) {
		set("walletNumber", walletNumber);
		return (M)this;
	}
	
	public String getWalletNumber() {
		return getStr("walletNumber");
	}

	public M setWalletAccount(Integer walletAccount) {
		set("walletAccount", walletAccount);
		return (M)this;
	}
	
	public Integer getWalletAccount() {
		return getInt("walletAccount");
	}

	public M setUpdateTime(java.util.Date updateTime) {
		set("updateTime", updateTime);
		return (M)this;
	}
	
	public java.util.Date getUpdateTime() {
		return get("updateTime");
	}

}