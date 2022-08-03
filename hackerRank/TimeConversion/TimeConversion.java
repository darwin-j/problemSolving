package hackerRank.TimeConversion;

/**
 * https://www.hackerrank.com/challenges/time-conversion/
 */

class TimeConversion {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
      String timeWithOutMeridiem = s.substring(0,8);
      String hrs = s.substring(0,2); 
      String meridiem = s.substring(8,10);//am pm
      String minAndSec = s.substring(2,8);
      
      if(hrs.equals("12")){
          if(meridiem.equals("PM")){
              return timeWithOutMeridiem;
          }else {
              return "00"+minAndSec;
          }
      }else if(meridiem.equals("PM")) {
          int hr = Integer.parseInt(hrs); 
          return Integer.toString(hr+12)+minAndSec;
      } else {
          return timeWithOutMeridiem;
      }

    }

}