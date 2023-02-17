package com.xiaochen.akka;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;

import java.io.IOException;

/**
 * @author Chenyufeng
 * @date 2023/2/14
 */
public class IotMain {

    public static void main(String[] args) throws IOException {

        ActorSystem system = ActorSystem.create("iot-system");
        try {
            // Create top level supervisor
            ActorRef supervisor = system.actorOf(IotSupervisor.props(), "iot-supervisor");
            System.out.println("Press ENTER to exit the system");
            System.in.read();
        } finally {
            system.terminate();
        }
    }

}
