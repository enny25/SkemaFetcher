/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import entity.Course;
import entity.Skema;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author Lenovo
 */
public class SkemaMapper {
    
    public Skema SkemaGetter(String jsonString){
        Map<String, ArrayList> map = new Gson().fromJson(jsonString, new TypeToken<Map<String, Object>>() {
            }.getType());
        ArrayList<Object> arr = map.get("reservations");
        System.out.println(arr.get(0));
        
        Skema skema = new Skema();
        for (int i = 0; i < arr.size()-1; i++) {
            String[] courseStr = arr.get(i).toString().split(", ");
            ArrayList<String> cleanCourseArr = new ArrayList();
            for (String str : courseStr) {
                String cleanStr;
                if(str.contains("[")) {
                    cleanStr = str.substring(str.indexOf("[")+1);
                } else {
                    cleanStr = str.substring(str.indexOf("=")+1);
                }
                cleanCourseArr.add(cleanStr);
            }
            Course course = new Course(cleanCourseArr.get(1), cleanCourseArr.get(2), cleanCourseArr.get(4), cleanCourseArr.get(5), cleanCourseArr.get(6), cleanCourseArr.get(7), cleanCourseArr.get(8));
            skema.addCourse(course);
        }
        System.out.println(skema.getCourses());
        System.out.println(skema.getCourses().size());
        System.out.println(skema.getCourses().get(0));
        return skema;
    }
}
