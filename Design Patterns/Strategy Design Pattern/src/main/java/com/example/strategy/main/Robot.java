package com.example.strategy.main;

import com.example.strategy.abstract_classes.RobotTemplate;
import com.example.strategy.concrete_classes.FastReadable;
import com.example.strategy.concrete_classes.FastWalkable;
import com.example.strategy.concrete_classes.SlowTalkable;
import com.example.strategy.interfaces.Readable;
import com.example.strategy.interfaces.Tallkable;
import com.example.strategy.interfaces.Walkable;

public class Robot extends RobotTemplate {

    public Robot(Readable readable, Tallkable talkable, Walkable walkable) {
        super(readable, talkable, walkable);
    }

    public static void main(String[] args) {
        RobotTemplate robot = new Robot(new FastReadable(), new SlowTalkable(), new FastWalkable());
        System.out.println(robot.read());
        System.out.println(robot.talk());
        System.out.println(robot.walk());
                
    }

    @Override
    public void projection() {
        System.out.println("okay i am robot class and i am overriding the robotTemplate abstract class's method projection");
    }

}
