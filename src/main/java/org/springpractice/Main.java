package org.springpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springpractice.config.Config;
import org.springpractice.logic.BubbleSort;
import org.springpractice.logic.Sort;
import org.springpractice.service.SortService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        SortService sortService = context.getBean(SortService.class);




        System.out.println("[result] " + sortService.doSort(Arrays.asList(args)));
    }
}