package com.ibm.microservices.wfd;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.stereotype.Component;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.beans.factory.annotation.Autowired;

import com.ibm.microservices.wfd.model.Entree;

@RestController
@EnableConfigurationProperties
@ResponseBody
public class EntreeController {

    @Autowired
    private EntreeConfiguration config;

    @RequestMapping("/menu")
    public Entree getMealMenu() {
        Entree local = new Entree();
        local.setMenu(this.config.getMenu());
        local.setType(this.config.getType());
        local.setOrder(this.config.getOrder());
        return local;
    }

}
