package org.tyaa.projectbuilders.demos.gradle.java;

import java.util.Date;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello Gradle for Java!");
        Order o1 = new Order(1, new Date());
        Gson gson = new Gson();
        String orderString1 = gson.toJson(o1);
        System.out.println(orderString1);
    }
}
