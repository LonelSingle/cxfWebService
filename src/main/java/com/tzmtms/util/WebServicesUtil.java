package com.tzmtms.util;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/7/16 0016.
 */
public class WebServicesUtil {
    public static String getResult(String serviceName, String method, Map param, String url){
        List<String> pamlist =new ArrayList<String>();
        List<String> valuelist =new ArrayList<String>();
        Iterator iterator = param.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            pamlist.add(String.valueOf(entry.getKey()));
            valuelist.add(String.valueOf(entry.getValue()));
        }
        try {
            // 指出service所在完整的URL
            String soapaction = url +serviceName+"?wsdl";
            //所调用接口的方法method
            // 创建一个服务(service)调用(call)
            Service service = new Service();
            Call call = (Call) service.createCall();// 通过service创建call对象
            // 设置service所在URL
            call.setTargetEndpointAddress(new java.net.URL(soapaction));
            call.setOperationName(new QName(soapaction, method));
            call.setUseSOAPAction(true);
            //变量最好只是用String类型，其他类型会报错
            for(String para:pamlist){
                call.addParameter(new QName(soapaction, para), org.apache.axis.encoding.XMLType.XSD_STRING,javax.xml.rpc.ParameterMode.IN);//设置参数名 state  第二个参数表示String类型,第三个参数表示入参
            }
            call.setReturnType(org.apache.axis.encoding.XMLType.XSD_STRING);// 设置返回类型
            String jsonString = (String) call.invoke(valuelist.toArray());//此处为数组，有几个变量传几个变量
            return jsonString;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
