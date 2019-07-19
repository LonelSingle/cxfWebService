package com.tzmtms.impl;

import com.tzmtms.entity.FwsMpBBipnSoap;
import com.tzmtms.entity.Message;
import com.tzmtms.server.mtmsFromSapServer;
import com.tzmtms.util.JsonMapper;
import com.tzmtms.util.WebServicesUtil;

import javax.jws.WebService;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by Administrator on 2019/7/17 0017.
 */
@WebService
public class mtmsFromSapServerImpl implements mtmsFromSapServer {
    @Override
    public Message getMtMsFromSAPs(List<FwsMpBBipnSoap> fwsMpBBipnSoapList){
        Message message=new Message();
        LinkedHashMap paramMapeqp = new LinkedHashMap();
        paramMapeqp.put("fwsMpBBipnSoapList", JsonMapper.toJsonString(fwsMpBBipnSoapList));
        //  http://192.168.99.130/MESProject/services/   http://localhost:8080/services/
        String result = WebServicesUtil.getResult("mtMsFromSAPWebservice", "saveMtMsFromSAP", paramMapeqp, "http://192.168.99.130/MESProject/services/");
        HashMap resultmap = (HashMap) JsonMapper.fromJsonString(result, HashMap.class);
        message = (Message)JsonMapper.fromJsonString(JsonMapper.toJsonString(resultmap.get("message")),Message.class);

        return message;
    }

}
