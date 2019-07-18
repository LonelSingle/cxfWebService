package com.tzmtms.server;

import com.tzmtms.entity.FwsMpBBipnSoap;
import com.tzmtms.entity.Message;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by Administrator on 2019/7/17 0017.
 */
@WebService
public interface mtmsFromSapServer {
    public Message getMtMsFromSAPs(@WebParam(name = "fwsMpBBipnSoaps") List<FwsMpBBipnSoap> fwsMpBBipnSoaps);
}
