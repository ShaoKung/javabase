package com.yy;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @program: javabase
 * @description: 1.8新特性Stream
 * @author: Andy
 * @create: 2019-08-28 15:12
 **/

public class StreamTest {

    public static void main(String args[]){
        sub();

    }

    private static int getCountEmptyStringUsingJava7(List<String> strings){
        int count = 0;

        for(String string: strings){

            if(string.isEmpty()){
                count++;
            }
        }
        return count;
    }

    private static int getCountLength3UsingJava7(List<String> strings){
        int count = 0;

        for(String string: strings){

            if(string.length() == 3){
                count++;
            }
        }
        return count;
    }

    private static List<String> deleteEmptyStringsUsingJava7(List<String> strings){
        List<String> filteredList = new ArrayList<String>();

        for(String string: strings){

            if(!string.isEmpty()){
                filteredList.add(string);
            }
        }
        return filteredList;
    }

    private static String getMergedStringUsingJava7(List<String> strings, String separator){
        StringBuilder stringBuilder = new StringBuilder();

        for(String string: strings){

            if(!string.isEmpty()){
                stringBuilder.append(string);
                stringBuilder.append(separator);
            }
        }
        String mergedString = stringBuilder.toString();
        return mergedString.substring(0, mergedString.length()-2);
    }

    private static List<Integer> getSquares(List<Integer> numbers){
        List<Integer> squaresList = new ArrayList<Integer>();

        for(Integer number: numbers){
            Integer square = new Integer(number.intValue() * number.intValue());

            if(!squaresList.contains(square)){
                squaresList.add(square);
            }
        }
        return squaresList;
    }

    private static int getMax(List<Integer> numbers){
        int max = numbers.get(0);

        for(int i=1;i < numbers.size();i++){

            Integer number = numbers.get(i);

            if(number.intValue() > max){
                max = number.intValue();
            }
        }
        return max;
    }

    private static int getMin(List<Integer> numbers){
        int min = numbers.get(0);

        for(int i=1;i < numbers.size();i++){
            Integer number = numbers.get(i);

            if(number.intValue() < min){
                min = number.intValue();
            }
        }
        return min;
    }

    private static int getSum(List numbers){
        int sum = (int)(numbers.get(0));

        for(int i=1;i < numbers.size();i++){
            sum += (int)numbers.get(i);
        }
        return sum;
    }

    private static int getAverage(List<Integer> numbers){
        return getSum(numbers) / numbers.size();
    }


    private static void conLong(){
        String feeCb="3000";
        System.out.println(Long.parseLong(feeCb));
    }

    private static void sub(){
        String feeCb="075900305762";
        System.out.println(feeCb.substring(0,4));
    }

    private static void fee(){
        String feeCb="075900305762";
        long cbFee=0;
        List<Map<String,Object>> nf=new ArrayList<>();
        Map<String,Object> nMap1=new HashMap<>();
        nMap1.put("MONEY","100");
        Map<String,Object> nMap2=new HashMap<>();
        nMap2.put("MONEY","200");
        Map<String,Object> nMap3=new HashMap<>();
        nMap3.put("MONEY","300");
        nf.add(nMap1);
        nf.add(nMap2);
        nf.add(nMap3);
        for(Map<String,Object> iMap:nf){
            cbFee=Long.valueOf((String)iMap.get("MONEY"));
        }

        System.out.println(feeCb.substring(0,4));
    }
}
