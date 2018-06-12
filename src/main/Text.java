package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Pitcher on 2017/8/6 0006
 * Email:943990494@qq.com
 */
public class Text {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        People h = (People) ctx.getBean("people");
        h.getHello().say();
        System.out.println(h.getAge());
        h.setAge(19);
        System.out.print(h.getHello().getName());
        System.out.println(h.getGreedList().toString());
        System.out.println(h.getGradeMap().toString());
        System.out.println(h.getFavoriteSet().toString());
        People h2 = (People) ctx.getBean("people");
        System.out.println(h2.getAge()); //返回的年龄是19，说明spring 管理的类都是单例的

        AutoDojo autoDojo= (AutoDojo) ctx.getBean("autoDojo");
        autoDojo.auto();


    }
}
