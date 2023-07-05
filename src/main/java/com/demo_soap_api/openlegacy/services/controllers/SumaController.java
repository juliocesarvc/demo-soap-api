package com.demo_soap_api.openlegacy.services.controllers;

import com.demo_soap_api.openlegacy.services.SumaService;
import com.demo_soap_api.openlegacy.services.SumaService.*;

import com.demo_soap_sdk.openlegacy.Add;
import com.demo_soap_sdk.openlegacy.AddAdd1;
import com.demo_soap_sdk.openlegacy.AddAddResponse;
import com.demo_soap_sdk.openlegacy.AddInputParams;
import com.demo_soap_sdk.openlegacy.AddOutputParams;
import org.openlegacy.core.rpc.RpcSession;

import org.openlegacy.core.annotations.OpenlegacyDesigntime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping(path = "/api/suma", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Suma")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class SumaController {

    @Autowired
    private SumaService sumaService;

    @Operation(summary = "Suma POST operation",
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = SumaOut.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    @PostMapping
    public SumaOut getSuma(@RequestBody SumaIn sumaIn) throws Exception {
        return sumaService.getSuma(sumaIn);
    }
}
