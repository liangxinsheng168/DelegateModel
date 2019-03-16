package com.gupaoedu.designPattern.delegateModel;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class delegateModelTest {

    public static void main(String[] args) {
        Leader leader = new Leader();
        Boss boss = new Boss(leader);
        boss.sendMission("program");
        boss.sendMission("design");
        boss.sendMission("artist");
        boss.sendMission("test");
    }

}
