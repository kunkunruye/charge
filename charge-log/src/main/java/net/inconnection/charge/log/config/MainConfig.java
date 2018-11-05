package net.inconnection.charge.log.config;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.kit.PathKit;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.dialect.MysqlDialect;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;
import net.inconnection.charge.log.action.IndexAction;
import net.inconnection.charge.log.bean.CardLog;
import net.inconnection.charge.log.bean.Customer;
import net.inconnection.charge.log.bean.DeviceLog;
import net.inconnection.charge.log.bean.QrDevice;
import net.inconnection.charge.log.plugin.ActiveMQ;
import net.inconnection.charge.log.plugin.ActiveMQPlugin;
import net.inconnection.charge.log.plugin.Destination;
import net.inconnection.charge.log.plugin.JmsReceiver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jms.JMSException;
import java.io.File;

public class MainConfig extends JFinalConfig {
    private static final Logger logger = LoggerFactory.getLogger(MainConfig.class);

    public MainConfig() {
    }

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
        arp.addMapping("qr_match_device", QrDevice.class);
        arp.addMapping("customer", Customer.class);
        arp.addMapping("cardlog", CardLog.class);
        arp.addMapping("devicelog", DeviceLog.class);
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
    public void afterJFinalStart() {
        logger.info("charge-log 开始启动");
        try {
            ActiveMQ.addReceiver(new JmsReceiver("testReceiver1", ActiveMQ.getConnection(), Destination.Queue, PropKit.get("mqsubject")));
        } catch (JMSException e) {
            e.printStackTrace();
        }
        logger.info("charge-log 启动完成");

    }


    public static void main(String[] args) {
        C3p0Plugin c3p0Plugin = new C3p0Plugin("jdbc:mysql://gjd.henankejue.com:3306/zcurd_busi?characterEncoding=utf8&zeroDateTimeBehavior=convertToNull", "root", "x5");
        ActiveRecordPlugin arp = new ActiveRecordPlugin("zcurd", c3p0Plugin);
        arp.setShowSql(true);
        arp.setDialect(new MysqlDialect());
        arp.addMapping("qr_match_device", QrDevice.class);
        arp.addMapping("customer", Customer.class);
        arp.addMapping("cardlog", CardLog.class);
        arp.addMapping("devicelog", DeviceLog.class);
        c3p0Plugin.start();
        arp.start();
        QrDevice qrDevice = (QrDevice)QrDevice.me.findFirst("select * from qr_match_device where match_num=?", new Object[]{"356566070765938"});
        String a = (String)qrDevice.get("area");
        System.out.println(a);
    }
}

