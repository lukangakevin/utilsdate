package com.iduyatech.utilsdate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class UtisDateLib {

    public  static String convert(Long timestamp)
    {
        long time_stamp = timestamp;
        //convert seconds to milliseconds
        Date date = new Date(time_stamp);
        // format of the date
        SimpleDateFormat jdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss z");
        jdf.setTimeZone(TimeZone.getTimeZone("GMT+1"));
        String my_date = jdf.format(date);

        return  my_date;
    }

    public  static  long convertToTimestamp(String value)
    {
        long dat=0;  //declare timestamp

        try {
            DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
            dat=df.parse(value).getTime();
        }
        catch (ParseException e)
        {

        }

        return dat;
    }

    public  static  long convertToTimestamp(String value, String format)
    {
        long dat=0;  //declare timestamp

        try {
            DateFormat df = new SimpleDateFormat(format);
            dat=df.parse(value).getTime();
        }
        catch (ParseException e)
        {

        }

        return dat;
    }

    public  static String getTime()
    {

        //convert seconds to milliseconds
        Date date = new Date();
        // format of the date
        SimpleDateFormat jdf = new SimpleDateFormat("dd-MM-yyyy 00:00:00 z");
        jdf.setTimeZone(TimeZone.getTimeZone("GMT+1"));
        String my_date = jdf.format(date);

        return  my_date;
    }

    public  static String getDate()
    {

        //convert seconds to milliseconds
        Date date = new Date();
        // format of the date
        SimpleDateFormat jdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String my_date = jdf.format(date);

        return  my_date;
    }



    public static Date getDate(String format, String value) {
        Date date = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            date = sdf.parse(value);
            /*if (!value.equals(sdf.format(date))) {
                date = null;
            }*/
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return date;
    }

    public  static Long getTimeStamp()
    {
        String time= UtisDateLib.getTime();
        Long time_stamp=UtisDateLib.getDate("dd-MM-yyyy HH:mm:ss z",time).getTime();

        return  time_stamp;
    }

    public  static Long getTimeStampDayAdd(Long date)
    {
        Long time_stamp= date + 86400000;
        return  time_stamp;
    }


    public static String getMoth(int value, String langue)
    {
        if(langue.trim().toUpperCase().equals("FR"))
        {
            switch (value)
            {
                case 1:
                    return "Janvier";

                case 2:
                    return "Février";
                case 3:
                    return "Mars";
                case 4:
                    return "Avril";
                case 5:
                    return "Mai";
                case 6:
                    return "Juin";
                case 7:
                    return "Juillet";
                case 8:
                    return "Août";
                case 9:
                    return "Septembre";
                case 10:
                    return "Octobre";
                case 11:
                    return "Novembre";
                case 12:
                    return "Décembre";

                default:

                    break;

            }
        }
        else if(langue.trim().toUpperCase().equals("EN"))
        {
            switch (value)
            {
                case 1:
                    return "January";

                case 2:
                    return "February";
                case 3:
                    return "March";
                case 4:
                    return "April";
                case 5:
                    return "May";
                case 6:
                    return "June";
                case 7:
                    return "July";
                case 8:
                    return "August";
                case 9:
                    return "September";
                case 10:
                    return "October";
                case 11:
                    return "November";
                case 12:
                    return "December";

                default:

                    break;

            }
        }


        return "";
    }

    public static int getMothNumber(String value, String langue)
    {
        if(langue.trim().toUpperCase().equals("FR"))
        {
            switch (value.trim())
            {
                case "Janvier":
                    return 1;

                case "Février":
                    return 2;
                case "Mars":
                    return 3;
                case "Avril":
                    return 4;
                case "Mai":
                    return 5;
                case "Juin":
                    return 6;
                case "Juillet":
                    return 7;
                case "Août":
                    return 8;
                case "Septembre":
                    return 9;
                case "Octobre":
                    return 10;
                case "Novembre":
                    return 11;
                case "Décembre":
                    return 12;

                default:

                    break;

            }
        }
        else if(langue.trim().toUpperCase().equals("EN"))
        {
            switch (value.trim())
            {
                case "January":
                    return 1;

                case "February":
                    return 2;
                case "March":
                    return 3;
                case "April":
                    return 4;
                case "May":
                    return 5;
                case "June":
                    return 6;
                case "July":
                    return 7;
                case "August":
                    return 8;
                case "September":
                    return 9;
                case "October":
                    return 10;
                case "November":
                    return 11;
                case "December":
                    return 12;

                default:

                    break;

            }
        }


        return 0;
    }
}
