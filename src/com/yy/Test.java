package com.yy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * @program: javabase
 * @description: 1
 * @author: Andy
 * @create: 2019-08-15 23:21
 **/

public class Test {


    public void DistinctList(){
        List<Map<String,String>> oList=new ArrayList<>();
        List<Map<String,String>> inList=new ArrayList<>();
        Map<String,Object> rMap=new HashMap<>();
        Map<String,String> inMap1=new HashMap<>();
        inMap1.put("MAIL","3130");
        Map<String,String> inMap2=new HashMap<>();
        inMap2.put("MAIL","3131");
        Map<String,String> inMap3=new HashMap<>();
        inMap3.put("MAIL","3130");
        Map<String,String> inMap4=new HashMap<>();
        inMap4.put("MAIL","3130");
        Map<String,String> inMap5=new HashMap<>();
        inMap5.put("MAIL","3130");
        Map<String,String> inMap6=new HashMap<>();
        inMap6.put("MAIL","3133");
        oList.add(inMap1);
        oList.add(inMap2);
        oList.add(inMap3);
        oList.add(inMap4);
        oList.add(inMap5);
        oList.add(inMap6);
        int size=oList.size();
        for(int i=0;i<size;i++) {
            Map<String,String> forMap=oList.get(i);
            System.out.println(forMap.get("MAIL"));
            if(!forMap.get("MAIL").equals(rMap.get("MAIL"))){
                rMap.put(forMap.get("MAIL"),"MAIL");
            }
        }
        System.out.println(rMap);
    }

    public void StringSplit(){
        String eparchyCode="768,760,767,764,765,769,776,777,762,761,763,774,773,770,766,771,772,775";
        String [] array=eparchyCode.split(",");
        System.out.println(array);
    }


    public void forRound(){
        List inList=new ArrayList();
        for(int st=0;st<18;st++){
            inList.add(st);
        }

        int count=0;
        int re=0;
        for(Object in:inList){
            int en=Integer.parseInt(in.toString());
            re=re+en;
            count++;
             if(count==10){
                 System.out.println(re);
                 count=0;
             }
        }

        System.out.println(re);


    }

    public void patt(){
        //
        String input="Emini";
        String regular=".*Emini.*";
        boolean result= Pattern.matches(regular,input);
        System.out.println(result);
    }

    public void spit(){
        String orgStr="114.865994, 33.617553;114.85816, 33.627458;114.845603, 33.635035;114.837396, 33.661222;114.839889, 33.672253;114.828748, 33.687375;114.827318, 33.696697;114.80261, 33.69319;114.781203, 33.666909;114.77232, 33.685098;114.763104, 33.692697;114.759521, 33.703768;114.752118, 33.706655;114.751369, 33.714809;114.7262, 33.716733;114.707467, 33.70881;114.685274, 33.708116;114.681137, 33.723044;114.657209, 33.710494;114.663074, 33.7005;114.648006, 33.698659;114.645609, 33.683134;114.637322, 33.682278;114.628507, 33.685351;114.621455, 33.68075;114.60666, 33.693845;114.597927, 33.693772;114.594944, 33.682872;114.603587, 33.681399;114.600384, 33.672772;114.608045, 33.666583;114.614307, 33.666186;114.605281, 33.656521;114.616057, 33.65317;114.617525, 33.638263;114.589975, 33.62587;114.590565, 33.613901;114.586251, 33.610298;114.593197, 33.610255;114.596699, 33.606052;114.58679, 33.601655;114.587913, 33.596392;114.603858, 33.584937;114.615137, 33.592436;114.634486, 33.588773;114.638837, 33.584811;114.639155, 33.568724;114.656203, 33.561214;114.674293, 33.570496;114.675589, 33.577044;114.701661, 33.578188;114.707477, 33.568947;114.719681, 33.563685;114.724603, 33.553256;114.749476, 33.553807;114.765483, 33.549631;114.774962, 33.522703;114.793263, 33.503643;114.812734, 33.516948;114.816114, 33.524076;114.816419, 33.541305;114.842267, 33.565729;114.82803, 33.567472;114.82225, 33.574403;114.843125, 33.593623;114.849728, 33.609069;114.865715, 33.610989;114.865994, 33.617553";
        String covStr="";
        covStr=orgStr.replace(",",",\"lat\":").replace(";","},{\"lng\":");
        covStr="[{\"lng\":"+covStr+"}]";
        System.out.println(covStr);
    }

    public Test(){
        System.out.println("test3");
    }


    public void StrValue(){
        String hi="hello";
        String he="he"+new String("llo");
        System.out.println(hi==he);
    }

    public static void pattern() {
        String regu=".*SR.*|.*Emini.*";
        String[] regList=regu.split("\\|");
        boolean devFlag=false;
        for(String s:regList){
            //System.out.println(Pattern.matches(s,"SR"));
            if(Pattern.matches(s,"SR")){
                devFlag=true;
            }
        }
        System.out.println(devFlag);

    }


    public static void main(String[] args) {

        //Test test=new Test();
        //test.forRound();
        //test.spit();
        //test.StrValue();
        pattern();
    }


}
