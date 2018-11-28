/**
 * betahouse.us
 * CopyRight (c) 2012 - 2018
 */
package us.betahouse.haetae.serviceimpl.activity.model;

import us.betahouse.util.utils.CollectionUtils;

import java.util.List;


/**
 * 志愿活动记录
 *
 * @author dango.yxm
 * @version : VolunteerActivityStampRecord.java 2018/11/26 10:42 PM dango.yxm
 */
public class DurationStampRecord extends StampRecord {

    private static final long serialVersionUID = 543493486999019429L;

    /**
     * 统计时长
     */
    private double volunteerTotalTime = 0;

    public DurationStampRecord(List<ActivityStamp> activityStamps) {
        super(activityStamps);
    }


    /**
     * 计算志愿时长
     */
    public void countVolunteerTotalTime() {
        double totalTime = 0;
        if (!CollectionUtils.isEmpty(getActivityStamps())) {
            for (ActivityStamp activityStamp : getActivityStamps()) {
                if (activityStamp.getActivityTime() != null) {
                    totalTime += activityStamp.getActivityTime();
                }
            }
        }
        volunteerTotalTime = totalTime;
    }

    public double getVolunteerTotalTime() {
        return volunteerTotalTime;
    }

    public void setVolunteerTotalTime(double volunteerTotalTime) {
        this.volunteerTotalTime = volunteerTotalTime;
    }
}