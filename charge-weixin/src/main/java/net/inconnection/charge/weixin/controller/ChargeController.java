package net.inconnection.charge.weixin.controller;

import com.jfinal.core.Controller;
import com.jfinal.log.Log;
import net.inconnection.charge.weixin.bean.resp.HnKejueResponse;
import net.inconnection.charge.weixin.service.ChargeInfoBatteryService;

public class ChargeController extends Controller {
    private static Log log = Log.getLog(ChargeController.class);
    private static ChargeInfoBatteryService chargeBatteryService = new ChargeInfoBatteryService();

    public ChargeController() {
    }

    public void index() {
        log.info("跳转到我要充电页面 ");
        this.render("charging/startCharging.html");
    }

    public void chargingInfo() {
        log.info("跳转到充电记录页面 ");
        this.render("charging/chargingInfo.html");
    }

    public void queryChargingInfo() {
        String openId = this.getPara("openId");
        String pageNum = this.getPara("pageNumber");
        String pageSize = this.getPara("pageSize");
        log.info("分页查询充电记录开始 openId=" + openId + ",pageNumber=" + pageNum + ",pageSize=" + pageSize);
        HnKejueResponse resp = chargeBatteryService.queryAllByOpenId(openId, pageNum, pageSize);
        log.info("分页查询充电记录结束" + resp);
        this.renderJson(resp);
    }

    public void choosePortAndTime() {
        this.setAttr("activityId", this.getPara("activityId"));
        this.setAttr("deviceId", this.getPara("deviceId"));
        String type = this.getPara("type");
        log.info("跳转到选择时间插座页面  activityId=" + this.getPara("activityId") + ",deviceId=" + this.getPara("deviceId") + ",type=" + type);
        if (type != null && type.equals("L")) {
            log.info("跳转到大功率选择插座页面");
            this.render("charging/hPowerOption.html");
        } else {
            log.info("跳转到小功率选择插座页面");
            this.render("charging/option.html");
        }
    }

    public void startHttpCharging() {
        String openId = this.getPara("openId");
        String deviceId = this.getPara("deviceId");
        String devicePort = this.getPara("devicePort");
        String time = this.getPara("time");
        String type = this.getPara("type");
        String money = this.getPara("money");
        String walletAccount = this.getPara("walletAccount");
        String operType = this.getPara("operType");
        HnKejueResponse resp = chargeBatteryService.startHttpCharging(openId, deviceId, devicePort, time, type, money, walletAccount, operType);
        log.info("调用服务器充电结束：" + resp);
        this.renderJson(resp);
    }

    public void charging() {
        this.setAttr("deviceId", this.getPara("deviceId"));
        this.setAttr("chargePort", this.getPara("chargePort"));
        this.setAttr("time", this.getPara("time"));
        log.info("跳转到正在充电页面deviceId=" + this.getPara("deviceId") + ",chargePort=" + this.getPara("chargePort"));
        this.render("charging/charging.html");
    }
}

