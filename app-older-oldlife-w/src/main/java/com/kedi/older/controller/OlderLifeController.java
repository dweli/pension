package com.kedi.older.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.kedi.older.servie.OldLifeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RequestMapping("oldfile")
@RestController
public class OlderLifeController {
    @Autowired
    OldLifeService oldLifeService;



    @RequestMapping(value = "/selectUser")
    public List<Map<String, Object>> selectUser(String name) throws Throwable, IOException {
        System.out.println("进入了方法");
        List<Map<String, Object>> users = oldLifeService.findByName();
        for (Map<String, Object> map : users) {
            for (Map.Entry<String, Object> m : map.entrySet()) {
                if ("Introduction".equals(m.getKey())) {
                    byte[] b = (byte[]) m.getValue();
                    m.setValue(new String(b));
                }
            }

        }
        return users;
        }

        @RequestMapping(value="/updatePraise")
        public int increasePraise(@RequestParam("id") Integer id){
            if(id<0) {
                throw new RuntimeException("传入的类型为负数");
            }


            return oldLifeService.updatePraise(id);
        }

    @RequestMapping("/updateCollection")
    public int increaseCollection(@RequestParam("id") Integer id){
        if(id<0) {
            throw new RuntimeException("传入的类型为负数");
        }
        return oldLifeService.updateCollection(id);
    }






}