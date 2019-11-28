package com.yy;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: javabase
 * @description: 数据生成
 * @author: Andy
 * @create: 2019-09-06 14:56
 **/

public class JsonCreate {

    public static void main(String[] args) {
        String orginal="1908120416427601|17630025650|张力川||17630025650|1000|单停维系产品||760005022|766480|0371|76|4003|2019-08-12|2019-08-16|单停维系";
        JsonCreate js=new JsonCreate();
        js.jsonCreate(orginal);
        js.check();
    }


    public String jsonCreate(String orginal){
       String[] list=orginal.split("\\|");
        System.out.println(list[6]);
        StringBuffer sb=new StringBuffer();
        sb.append("\"serialNumber\":\""+list[1]+"\",");
         sb.append("\"offerName\":\""+list[6]+"\",");
         sb.append("\"cityCode\":\""+list[9]+"\",");
         sb.append("\"provinceCode\":\""+list[11]+"\",");
         sb.append("\"remark\":\""+list[15]+"\",");
         sb.append("\"lineTypeCode\":\""+ list[12]+"\",");
         sb.append("\"custName\":\""+list[2]+"\",");
         sb.append("\"extOrderId\":\""+list[0]+"\",");
         sb.append("\"matchDepartId\":\""+"\",");
         sb.append("\"tradeTypCode\":\""+list[12]+"\",");
         sb.append("\"offerId\":\""+list[5]+"\",");
         sb.append("\"departId\":\""+"\",");
         sb.append("\"contactAddress\":\""+"\",");
         sb.append("\"matchGridId\":\""+list[8]+"\",");
         sb.append("\"contactPhone\":\""+list[1]+"\",");
         sb.append("\"inModeCode\":\""+list[12]+"\",");
         sb.append("\"outBatchId\":\""+"999999"+"\",");
         sb.append("\"eparchyCode\":\""+list[10]+"\"");
        System.out.println("{"+sb.toString()+"}");
       return null;
    }

    public boolean check(){
        Map map=new HashMap();
        System.out.println(map.isEmpty());
        return map.isEmpty();
    }

}



//{
//        "serialNumber": "17633902718",
//        "offerName": "单停",
//        "cityCode": "762008",
//        "provinceCode": "76",
//        "remark": "无",
//        "lineTypeCode": "4003",
//        "custName": "龚大钢",
//        "extOrderId": "1908120116162765",
//        "matchDepartId": "",
//        "tradeTypCode": "4003",
//        "offerId": "1000",
//        "departId": "",
//        "contactAddress": "",
//        "matchGridId": "123456",
//        "contactPhone": "17633902718",
//        "inModeCode": "4003",
//        "outBatchId": "610196",
//        "eparchyCode": "0371"
//        }