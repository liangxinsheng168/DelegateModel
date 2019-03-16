package com.gupaoedu.designPattern.delegateModel;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class Boss {

    Leader leader = null;

    public Boss (Leader leader) {

        this.leader = leader;

    }

    public void sendMission(String missionName) {

        leader.doMission(missionName);

    }

}
