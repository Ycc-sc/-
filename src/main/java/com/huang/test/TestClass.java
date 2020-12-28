package com.huang.test;

import java.util.ArrayList;
import java.util.List;

public class TestClass {

    public static List<Long> covertToList(String ids) {
        List<Long> list = new ArrayList<>();
        if (!"".equals(ids) && ids != null) {
            String[] idsArray = ids.split(",");
            for (String s : idsArray) {
                list.add(new Long(s));
            }
        }
        return list;
    }
    public static void main(String[] args) {

        String s = "11,23,24";
        List<Long> longs = covertToList(s);
        for (Long aLong : longs) {
            System.out.println("aLong = " + aLong);
        }
    }
}
