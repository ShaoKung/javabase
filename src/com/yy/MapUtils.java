package com.yy;

import com.sun.tools.javac.util.Assert;

import java.util.*;

/**
 * @program: javabase
 * @description: Map工具类
 * @author: Andy
 * @create: 2019-08-13 22:51
 **/

public class MapUtils {

    public static void main(String[] args) {
        MapUtils mu=new MapUtils();
        List<Map<String,Object>> inList=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Map<String,Object> inMap=new HashMap<>();
            inMap.put("name","King"+i);
            inMap.put("value",Math.random()*100);
            inList.add(inMap);
        }
        mu.mapSum(inList);

    }

    public Map<String,Object> mapSum(List<Map<String,Object>> inList){
        Map<String,Object> mMap=new HashMap<>();
        for (Map<String,Object> forMap:
             inList) {
            String name=(String)forMap.get("name");
            if(forMap.containsKey(name)){
                mMap.put(name,Long.parseLong(forMap.get(name).toString())+Long.parseLong(mMap.get(name).toString()));
            }else {
                mMap.put(name,forMap.get("value"));
            }
        }
        return mMap ;
    }

}
