package com.example.administrator.xueyayi;

import android.support.annotation.NonNull;

import java.util.Date;

import cn.bmob.v3.BmobObject;

/**
 * Created by Administrator on 2018/11/20.
 */

public class Reservation_Record extends BmobObject implements Comparable<Reservation_Record>{
    private String UserId;
    private Date Time_Start;
    private Date Time_End;
    private int Machine_Number;

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public Date getTime_Start() {
        return Time_Start;
    }

    public void setTime_Start(Date time_Start) {
        Time_Start = time_Start;
    }

    public Date getTime_End() {
        return Time_End;
    }

    public void setTime_End(Date time_End) {
        Time_End = time_End;
    }

    public int getMachine_Number() {
        return Machine_Number;
    }

    public void setMachine_Number(int machine_Number) {
        Machine_Number = machine_Number;
    }

    @Override
    public int compareTo(@NonNull Reservation_Record o) {
        if(o.getTime_Start().compareTo(this.getTime_Start()) == 1){
            return -1;
        }else{
            return 1;
        }
    }
}
