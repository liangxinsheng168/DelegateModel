package com.gupaoedu.designPattern.delegateModel;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class Leader {

    private static Map<String, employee> map = new HashMap<>();

    static {
        map.put(missionType.PROGRAM.getMissionName(), new programer());
        map.put(missionType.ARTIST.getMissionName(), new artister());
        map.put(missionType.DESIGN.getMissionName(), new designer());
        map.put(missionType.TEST.getMissionName(), new tester());
    }

    public void doMission(String missionName) {
        employee role =  map.get(missionName);
        role.doMission(missionName);
    }

}
