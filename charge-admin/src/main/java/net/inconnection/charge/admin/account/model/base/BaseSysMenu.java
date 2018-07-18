package net.inconnection.charge.admin.account.model.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSysMenu<M extends BaseSysMenu<M>> extends Model<M> implements IBean {

	public M setId(Integer id) {
		set("id", id);
		return (M)this;
	}

	public Integer getId() {
		return get("id");
	}

	public M setMenuName(String menuName) {
		set("menu_name", menuName);
		return (M)this;
	}

	public String getMenuName() {
		return get("menu_name");
	}

	public M setMenuUrl(String menuUrl) {
		set("menu_url", menuUrl);
		return (M)this;
	}

	public String getMenuUrl() {
		return get("menu_url");
	}

	public M setParentId(Integer parentId) {
		set("parent_id", parentId);
		return (M)this;
	}

	public Integer getParentId() {
		return get("parent_id");
	}

	public M setIcon(String icon) {
		set("icon", icon);
		return (M)this;
	}

	public String getIcon() {
		return get("icon");
	}

	public M setOrderNum(Integer orderNum) {
		set("order_num", orderNum);
		return (M)this;
	}

	public Integer getOrderNum() {
		return get("order_num");
	}

	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

}
