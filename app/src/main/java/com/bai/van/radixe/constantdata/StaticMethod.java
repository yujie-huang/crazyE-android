package com.bai.van.radixe.constantdata;

import android.util.Log;

import com.bai.van.radixe.urlrequests.UserInfRequest;
import com.bai.van.radixe.userdata.UserInformation;

/**
 *
 * @author van
 * @date 2018/1/23
 */

public class StaticMethod {
    public static String semesterTran(String semesterChar){
        String resultStr = "";
        if (UserInformation.userStaYear == 0){
            UserInfRequest.requestUserStatusInf();
        }
//        Log.d("userStaYear", UserInformation.userStaYear + "---" + semesterChar);

        int dValue = -1;
        try {
            dValue = Integer.parseInt(semesterChar.substring(0, 4)) - UserInformation.userStaYear;
        }catch (StringIndexOutOfBoundsException e){
            e.printStackTrace();
        }

        switch (dValue){
            case 0:
                if ("秋".equals(semesterChar.split(" ")[1].substring(0, 1))){
                    resultStr = "大一 上学期";
                }
                break;
            case 1:
                if ("春".equals(semesterChar.split(" ")[1].substring(0, 1))){
                    resultStr = "大一 下学期";
                }else {
                    resultStr = "大二 上学期";
                }
                break;
            case 2:
                if ("春".equals(semesterChar.split(" ")[1].substring(0, 1))){
                    resultStr = "大二 下学期";
                }else {
                    resultStr = "大三 上学期";
                }
                break;
            case 3:
                if ("春".equals(semesterChar.split(" ")[1].substring(0, 1))){
                    resultStr = "大三 下学期";
                }else {
                    resultStr = "大四 上学期";
                }
                break;
            case 4:
                if ("春".equals(semesterChar.split(" ")[1].substring(0, 1))){
                    resultStr = "大四 下学期";
                }else {
                    resultStr = "大五 上学期";
                }
                break;
            case 5:
                if ("春".equals(semesterChar.split(" ")[1].substring(0, 1))){
                    resultStr = "大五 下学期";
                }else {
                    resultStr = "大六 上学期";
                }
                break;
            case 6:
                if ("春".equals(semesterChar.split(" ")[1].substring(0, 1))){
                    resultStr = "大六 下学期";
                }
            default:
        }
        return resultStr;
    }
}