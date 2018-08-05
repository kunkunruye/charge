package net.inconnection.charge.weixin.controller;

import com.jfinal.core.Controller;
import net.inconnection.charge.weixin.utils.TokenCheckUtils;

public class TokenCheckController extends Controller {

    public TokenCheckController() {
    }

    public void index() {

        String echostr = getPara("echostr");

        if(echostr != null){
            String signature = getPara("signature");
            String timestamp = getPara("timestamp");
            String nonce = getPara("nonce");

            System.out.println("signature: " + signature);

            echostr = TokenCheckUtils.tokenCheck(signature,timestamp, nonce, echostr);

            this.renderText(echostr);

        }

    }


}