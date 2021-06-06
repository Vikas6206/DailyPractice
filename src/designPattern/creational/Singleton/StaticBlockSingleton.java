package designPattern.creational.Singleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StaticBlockSingleton {
//TODO: vkumar: Need to write the complete logic for this solution
    public static List<String> preprocessDate(List<String> dates){

        for(int i=0;i<dates.size();i++){
            String date[]=dates.get(i).split(" ");
            //6th Oct 2050
            //1st Dec 2018
            String dateValue=date[0].replaceAll("st","").replaceAll("nd","").replaceAll("rd","")
            .replaceAll("th","");
            if (Integer.valueOf(dateValue)<10){
                dateValue="0"+dateValue;
            }

            String months[] = {"January", "February", "March", "April",
                    "May", "June", "July", "August", "September",
                    "October", "November", "December"};

        }

        return Collections.singletonList("abc");
    }
}
