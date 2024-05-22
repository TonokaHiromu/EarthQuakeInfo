package com.example.demo;

public class Convert {

	public static String tsunami(String warning){
        switch(warning){
            case "Warning":
              return warning = "警報が発表されている地域があります";
            case "Unknown":
              return warning = "不明";
            case "None":
              return warning = "なし";
            case "Checking":
              return warning = "調査中";
            case "NonEffective":
              return warning = "若干の海面変動";     
            default:
              return warning = "情報のフォーマットに失敗。";
        }
    }
    public static String shindo(int sindo){
        switch(sindo){
            case 10:
            return "1";
            
            case 20:
            return "2";
            
            case 30:
            return "3";
            
            case 40:
            return "4";
            
            case 45:
            return "5弱";
            
            case 50 :
            return "5強";
            
            case 55 :
            return "6弱";
            
            case 60:
            return "6強";
            
            case 70:
            return "7";
            default:
            return "[不明]";
          }
    }
    
    public static String magnitude(double magnitude) {
    	if (magnitude <= 0) {
    		return "[不明]";
    	}else {
    		return Double.toString(magnitude);
    	}
    	
    }
}
