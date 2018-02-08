package com.veiveid.web;

import com.veiveid.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/dubbo")
public class ComputeCtl {

    @Autowired
    private ComputeService computeService;

    @RequestMapping(value = "/result.json")
    public Map<String,Object> getResult(){
        int res = computeService.add(1,200);
        Map<String,Object> map = new HashMap<String,Object>();
        Map<String,Object> data = new HashMap<String,Object>();
        map.put("resCode",200);
        map.put("resCon",data);
        data.put("addres",res);
        return map;
    }
}