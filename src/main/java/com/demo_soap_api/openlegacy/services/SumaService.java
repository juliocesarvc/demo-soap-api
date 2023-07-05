package com.demo_soap_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.demo_soap_sdk.openlegacy.Add;
import com.demo_soap_sdk.openlegacy.AddAdd1;
import com.demo_soap_sdk.openlegacy.AddAddResponse;
import com.demo_soap_sdk.openlegacy.AddInputParams;
import com.demo_soap_sdk.openlegacy.AddOutputParams;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface SumaService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "Suma")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface SumaService {

    public SumaOut getSuma(SumaIn sumaIn) throws Exception;

    @Getter
    @Setter
    public static class SumaIn {
        
        AddAdd1 add;

    }
    
    @Schema(name = "SumaOut", description = "")
    @Getter
    @Setter
    public static class SumaOut {
        
        @Schema(description = "Add Result")
        Integer addResult;
    }
}
