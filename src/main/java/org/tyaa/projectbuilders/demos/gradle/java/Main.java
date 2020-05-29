package org.tyaa.projectbuilders.demos.gradle.java;

import java.util.Date;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args){

        // Gson gson = new Gson();
        Gson gson =
            new GsonBuilder()
                .setDateFormat("dd/MM/yyyy")
                .create();

        System.out.println("Hello Gradle for Java!");
        Order o1 = new Order(1, new Date());

        String orderString1 = gson.toJson(o1);
        System.out.println(orderString1);

        Order o2 = gson.fromJson(orderString1, Order.class);
        System.out.println(o2);
    }
}
