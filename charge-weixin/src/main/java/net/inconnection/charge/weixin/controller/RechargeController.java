package net.inconnection.charge.weixin.controller;

import com.jfinal.core.Controller;
import com.jfinal.log.Log;
import net.inconnection.charge.weixin.bean.resp.HnKejueResponse;
import net.inconnection.charge.weixin.service.ChargeMoneyService;
import net.inconnection.charge.weixin.service.MoneyMatchActivityService;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class RechargeController extends Controller {
    private static Log log = Log.getLog(RechargeController.class);
    private static MoneyMatchActivityService activityService = new MoneyMatchActivityService();
    private static ChargeMoneyService chargeMoneyService = new ChargeMoneyService();

    public RechargeController() {
    }

    public void index() {
        String type = this.getPara("type");
        log.info("跳转到扫码充值页面  type=" + type);
        this.setAttr("type", type);
        this.render("recharge/startRecharge.html");
    }

    public void rechargeInfo() {
        log.info("跳转到充值记录页面");
        this.render("recharge/rechargeInfo.html");
    }

    public void recharge() {
        this.setAttr("deviceId", this.getPara("deviceId"));
        this.setAttr("activityId", this.getPara("activityId"));
        this.setAttr("type", this.getPara("type"));
        String decode = "";

        try {
            decode = URLDecoder.decode(this.getPara("area"), "UTF-8");
            this.setAttr("area", decode);
        } catch (UnsupportedEncodingException var3) {
            log.error("转码错误" + var3);
        }

        log.info("跳转到我要充值界面,deviceId=" + this.getPara("deviceId") + ",type=" + this.getPara("type") + ",activityId=" + this.getPara("activityId") + ",area=" + decode);
        this.render("recharge/recharge.html");
    }

    public void queryActivityInfo() {
        String activityId = this.getPara("activityId");
        log.info("根据充值类型和优惠编号查询详情开始,activityId=" + this.getPara("activityId"));
        HnKejueResponse response = activityService.queryActivityByType(activityId);
        log.info("查询优惠信息结束：" + response);
        this.renderJson(response);
    }

    public void addChargeMoney() {
        String openId = this.getPara("openId");
        String chargeType = this.getPara("type");
        String money = this.getPara("money");
        String chargeNum = this.getPara("chargeNum");
        String coupon = this.getPara("coupon");
        String deviceId = this.getPara("deviceId");
        String walletAccount = this.getPara("walletAccount");
        String cardNumber = this.getPara("cardNumber");
        log.info("新增充值信息结束开始 openId=" + openId + ",deviceId=" + deviceId + ",type=" + chargeType + ",money=" + money + ",入帐金额=" + chargeNum + ",入帐赠送金额=" + coupon + ",电卡卡号=" + cardNumber);
        HnKejueResponse response = chargeMoneyService.addRechargInfo(openId, deviceId, chargeType, walletAccount, money, chargeNum, coupon, cardNumber);
        log.info("新增充值信息结束：" + response);
        this.renderJson(response);
    }

    public void queryRechargeInfo() {
        String openId = this.getPara("openId");
        String pageNumber = this.getPara("pageNumber");
        String pageSize = this.getPara("pageSize");
        log.info("分页查询充值记录开始 openId=" + openId + ",pageNumber=" + pageNumber + ",pageSize=" + pageSize);
        HnKejueResponse resp = chargeMoneyService.queryAllByOpenId(openId, pageNumber, pageSize);
        log.info("分页查询充值记录结束" + resp);
        this.renderJson(resp);
    }
}

