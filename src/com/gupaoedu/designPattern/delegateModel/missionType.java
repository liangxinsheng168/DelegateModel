package com.gupaoedu.designPattern.delegateModel;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public enum missionType {

    PROGRAM("program"),TEST("test"),DESIGN("design"),ARTIST("artist");

    private String missionName;

    private missionType(String missionName) {

        this.missionName = missionName;

    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }
}
