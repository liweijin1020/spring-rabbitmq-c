package com.example.rabbitmq.consumer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 消费者：C系统
 * @author norhtking
 */
public class MessageConsumer {
    /**具体执行业务的方法*/
    public void listener(String msg) {
        System.out.println("\n消费者C开始处理消息： " + msg + "\n");
    }
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/rabbitmq-context.xml");
    }
}
