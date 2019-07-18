package com.kedi.older.timer;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kedi.older.servie.SubscribeService;
import com.kedi.older.utill.Subscribeutill;
@Slf4j
@Component
@Async
public class ScheduledService {
	@Autowired
	SubscribeService subscribeService;
	
	/*@Scheduled(cron = "0/10 * * * * *")
    public void scheduled(){
		 subscribeService.creatSubscribe(creatSubscribe());
    }*/
	
	@Scheduled(cron = "0 59 23 ? * SUN")
	public void scheduled2(){
		subscribeService.creatSubscribe(creatSubscribe());
	}
	
	private List<Map> creatSubscribe(){
		int ran2 = Subscribeutill.random(21, 24);
		int busNum=28-ran2;
		ArrayList<Object> list = new ArrayList<>();
		while(true){
			list.add(Subscribeutill.random(1, 28));
			if(busNum==list.size()){
				break;
			}
			
		}
		ArrayList<Map> list2 = new ArrayList<Map>();
		   for(int i=0;i<4;i++){
			   HashMap<Object,Object> map = new HashMap<>();
			   if(list.contains((i*7)+1)){map.put("state_wake_one", 0);}else{map.put("state_wake_one", 1);}
			   if(list.contains((i*7)+2)){map.put("state_wake_two", 0);}else{map.put("state_wake_two", 1);}
			   if(list.contains((i*7)+3)){map.put("state_wake_three", 0);}else{map.put("state_wake_three", 1);}
			   if(list.contains((i*7)+4)){map.put("state_wake_four", 0);}else{map.put("state_wake_four", 1);}
			   if(list.contains((i*7)+5)){map.put("state_wake_five", 0);}else{map.put("state_wake_five", 1);}
			   if(list.contains((i*7)+6)){map.put("state_wake_six", 0);}else{map.put("state_wake_six", 1);}
			   if(list.contains((i*7)+7)){map.put("state_wake_seven", 0);}else{map.put("state_wake_seven", 1);}
			   if(i==0){
				   map.put("date_string", "8:00-10:00");
				   }else if(i==1){
					   map.put("date_string", "10:00-12:00"); 
				   }else if(i==2){
					   map.put("date_string", "14:00-16:00");
				   }else if(i==3){
					   map.put("date_string", "16:00-18:00");  
				   }
			   
			   map.put("status", 1);
			   map.put("borth_time", new Date());
			   list2.add(map);
		   }
		return list2;
		
	} 
  

}
