package net.inconnection.charge.extend.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class busi_MappingKit {
	
	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("b_map", "id", BMap.class);
		arp.addMapping("card", "id", Card.class);
		arp.addMapping("cardlog", "id", Cardlog.class);
		arp.addMapping("charge", "id", Charge.class);
		arp.addMapping("charge_battery_info", "id", ChargeBatteryInfo.class);
		arp.addMapping("charge_money_info", "id", ChargeMoneyInfo.class);
		arp.addMapping("chargestatus", "id", Chargestatus.class);
		arp.addMapping("claw_book_url", "id", ClawBookUrl.class);
		arp.addMapping("command", "id", Command.class);
		arp.addMapping("config", "id", Config.class);
		arp.addMapping("customer", "id", Customer.class);
		arp.addMapping("device_csq", "id", DeviceCsq.class);
		arp.addMapping("device_location", "id", DeviceLocation.class);
		arp.addMapping("devicelog", "id", Devicelog.class);
		arp.addMapping("devicemsg", "id", Devicemsg.class);
		arp.addMapping("deviceport", "id", Deviceport.class);
		arp.addMapping("droppedlog", "id", Droppedlog.class);
		arp.addMapping("images", "id", Images.class);
		arp.addMapping("lostcard", "id", Lostcard.class);
		arp.addMapping("money_match_activity", "id", MoneyMatchActivity.class);
		arp.addMapping("orders", "id", Orders.class);
		arp.addMapping("pay_log", "id", PayLog.class);
		arp.addMapping("pay_notify", "id", PayNotify.class);
		arp.addMapping("pay_to_agent_req", "id", PayToAgentReq.class);
		arp.addMapping("pay_to_agent_resp", "id", PayToAgentResp.class);
		arp.addMapping("power_device_port", "id", PowerDevicePort.class);
		arp.addMapping("qr_match_device", "id", QrMatchDevice.class);
		arp.addMapping("send_weixin_message", "id", SendWeixinMessage.class);
		arp.addMapping("stock_history_log", "id", StockHistoryLog.class);
		arp.addMapping("tuser", "id", Tuser.class);
		arp.addMapping("tuser_charge", "id", TuserCharge.class);
		arp.addMapping("weixin_token", "id", WeixinToken.class);
		arp.addMapping("yc_charge_pile", "id", ChargePile.class);
		arp.addMapping("yc_charge_socket", "id", ChargeSocket.class);
		arp.addMapping("yc_charge_socket_history", "id", ChargeSocketHistory.class);
		arp.addMapping("yc_company", "id", Company.class);
		arp.addMapping("yc_coupon", "id", Coupon.class);
		arp.addMapping("yc_project", "id", Project.class);
		arp.addMapping("yc_tuser_and_coupon", "id", TuserAndCoupon.class);
		arp.addMapping("yc_chargeprice", "id", Chargeprice.class);
		arp.addMapping("yc_charge_socket_history", "id", ChargeSocketHistory.class);
		arp.addMapping("yc_charge_pile_history", "id", ChargePileHistory.class);
		arp.addMapping("yc_charge_history", "id", ChargeHistory.class);
		arp.addMapping("yc_company_activity", "id", CompanyActivity.class);
	}
}

