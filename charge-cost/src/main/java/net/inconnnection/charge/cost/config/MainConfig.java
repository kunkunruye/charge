package net.inconnnection.charge.cost.config;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;
import com.jfinal.kit.PathKit;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.dialect.MysqlDialect;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;
import net.inconnnection.charge.cost.action.IndexAction;
import net.inconnnection.charge.cost.model.ChargeBatteryInfo;
import net.inconnnection.charge.cost.model.ChargeHistory;
import net.inconnnection.charge.cost.model.TUser;
import net.inconnnection.charge.cost.plugin.ActiveMQ;
import net.inconnnection.charge.cost.plugin.ActiveMQPlugin;
import net.inconnnection.charge.cost.plugin.Destination;
import net.inconnnection.charge.cost.plugin.JmsReceiver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jms.JMSException;
import java.io.File;

public class MainConfig extends JFinalConfig {

    private static final Logger logger = LoggerFactory.getLogger(MainConfig.class);


    public void configConstant(Constants me) {
        PropKit.use("config.properties");
        me.setDevMode(PropKit.getBoolean("devMode"));
        me.setEncoding("utf-8");
        me.setBaseUploadPath(PathKit.getWebRootPath() + File.separator + "myupload");
        me.setViewType(ViewType.JSP);
    }

    public void configRoute(Routes me) {
        me.add("/", IndexAction.class);
    }

    public void configPlugin(Plugins me) {
        C3p0Plugin c3p0Plugin = new C3p0Plugin(PropKit.get("jdbcUrl"), PropKit.get("user"), PropKit.get("password"));
        ActiveRecordPlugin arp = new ActiveRecordPlugin(c3p0Plugin);
        arp.setShowSql(PropKit.getBoolean("devMode"));
        arp.setDialect(new MysqlDialect());
        arp.addMapping("charge_battery_info", ChargeBatteryInfo.class);
        arp.addMapping("tuser", TUser.class);
        arp.addMapping("yc_charge_history", ChargeHistory.class);
        me.add(c3p0Plugin);
        me.add(arp);
        ActiveMQPlugin p = new ActiveMQPlugin(PropKit.get("mqaddress"));
        p.start();
        me.add(p);




    }

    public void configInterceptor(Interceptors me) {
    }

    public void configHandler(Handlers me) {
    }

    @Override
    public void  afterJFinalStart(){
        ChargeHistory odSZL1TUi4xri0UYvd20HhAbqKfE = ChargeHistory.dao.findFirst("356566077059970", "1",
                "odSZL1TUi4xri0UYvd20HhAbqKfE");

        logger.info("charge-cost 开始启动");
        try {
            ActiveMQ.addReceiver(new JmsReceiver("testReceiver1", ActiveMQ.getConnection(), Destination.Queue, PropKit.get("mqsubject")));
        } catch (JMSException e) {
            e.printStackTrace();
        }
        logger.info("charge-cost 启动完成");
    }

    public static void main(String[] args) {
        JFinal.start("src/main/webapp", 8080, "/", 5);
    }
}

