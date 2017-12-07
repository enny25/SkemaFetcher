/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import entity.Course;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class HtmlString {
    private String CourseString;
    private String HtmlString;
    private ArrayList<Course> CourseList;
    String MondayTime ="";
    String TuesdayTime="";
    String WednesdayTime="";
    String ThursdayTime="";
    String FridayTime="";
    String MondayAfternoon = "class=open><br>OPEN<br>";
    String TuesdayAfternoon = "class=open><br>OPEN<br>";
    String WednesdayAfternoon = "class=open><br>OPEN<br>";
    String ThursdayAfternoon = "class=open><br>OPEN<br>";
    String FridayAfternoon = "class=open><br>OPEN<br>";
    String MondayActivity = "class=open><br>OPEN<br>";
    String TuesdayActivity = "class=open><br>OPEN<br>";
    String WednesdayActivity="class=open><br>OPEN<br>";
    String ThursdayActivity="class=open><br>OPEN<br>";
    String FridayActivity="class=open><br>OPEN<br>";

    public HtmlString(ArrayList<Course> CourseList) {
        this.CourseList = CourseList;
    }
    
    public void setTimeAndActivity(){
        for (Course course : CourseList) {
            System.out.println(" SetTimeAndActivity day of week " + course.dayOfWeek());
            switch(course.dayOfWeek()){
                case "mandag":
                    if(course.getStartTime().equalsIgnoreCase("08:30")){
                    MondayTime = course.dayOfWeek()+" " +course.getStartTime()+"-"+ course.getEndTime()+" "+course.getStartDate();
                    MondayActivity = "class=scheduled >"+course.getCourseName()+"<br />";}
                    if(course.getEndTime().equalsIgnoreCase("16:00")){
                        MondayAfternoon = "class=scheduled >"+course.getCourseName()+"<br />";
                    }
                    
                    break;
                case "tirsdag":
                    if(course.getStartTime().equalsIgnoreCase("08:30")){
                    TuesdayTime = course.dayOfWeek()+" " +course.getStartTime()+"-"+ course.getEndTime()+" "+course.getStartDate();;
                    TuesdayActivity = "class=scheduled >"+course.getCourseName()+"<br />";}
                     if(course.getEndTime().equalsIgnoreCase("16:00")){
                        TuesdayAfternoon = "class=scheduled >"+course.getCourseName()+"<br />";
                    }
                    
                    break;
                case "onsdag":
                    if(course.getStartTime().equalsIgnoreCase("08:30")){
                    WednesdayTime = course.dayOfWeek()+" " +course.getStartTime()+"-"+ course.getEndTime()+" "+course.getStartDate();;
                    WednesdayActivity = "class=scheduled >"+course.getCourseName()+"<br />";}
                      if(course.getEndTime().equalsIgnoreCase("16:00")){
                        WednesdayAfternoon = "class=scheduled >"+course.getCourseName()+"<br />";
                    }
                    break;
                case "torsdag":
                     if(course.getStartTime().equalsIgnoreCase("08:30")){
                    ThursdayTime = course.dayOfWeek()+" " +course.getStartTime()+"-"+ course.getEndTime()+" "+course.getStartDate();;
                    ThursdayActivity = "class=scheduled >"+course.getCourseName()+"<br />";}
                      if(course.getEndTime().equalsIgnoreCase("16:00")){
                        ThursdayAfternoon = "class=scheduled >"+course.getCourseName()+"<br />";
                    }
                     
                     
                    break;
                case "fredag":
                    if(course.getStartTime().equalsIgnoreCase("08:30")){
                    FridayTime = course.dayOfWeek()+" " +course.getStartTime()+"-"+ course.getEndTime()+" "+course.getStartDate();;
                    FridayActivity = "class=scheduled >"+course.getCourseName()+"<br />";}
                     if(course.getEndTime().equalsIgnoreCase("16:00")){
                        FridayAfternoon = "class=scheduled >"+course.getCourseName()+"<br />";
                    }
                    break;
                    
            }
            
            
        }
    }
    
    

    public void setHtmlString() {
        HtmlString  = ("<html><head>\n" +
"<title>My schedule</title>\n" +
"<style>\n" +
" th{background-color:white;font-weight:bold;font-size:10pt}\n" +
" .open{color:red;background-color:white;font-size:10pt}\n" +
" .scheduled{background:lightgrey;font-size:10pt}\n" +
" .office{background:lightblue;font-size:10pt}\n" +
".chapel{color:blue;background-color:yellow;font-size:10pt}\n" +
"</style>\n" +
"</head>\n" +
"<body>\n" +
"<h3>My schedule</h3>\n" +
"\n" +
"<table border=1 width=100%>\n" +
"<tr>\n" +
"\n" +
"<th width=16%>Monday</th>\n" +
"<th width=16%>Tuesday</th>\n" +
"<th width=16%>Wednesday</th>\n" +
"<th width=16%>Thursday</th>\n" +
"<th width=16%>Friday</th>\n" +
"</tr>\n" +
"<tr>\n" +
"<td align=center rowspan=8 "+ MondayActivity +" " +MondayTime+ "</td>\n" +
"<td align=center rowspan=8 "+ TuesdayActivity +" " +TuesdayTime+ "</td>\n" +
"<td align=center rowspan=8 "+ WednesdayActivity +" " +WednesdayTime+ "</td>\n" +
"<td align=center rowspan=8 "+ ThursdayActivity +" " +ThursdayTime+ "</td>\n" +
"<td align=center rowspan=8 "+ FridayActivity +" " + FridayTime+ "</td>\n" +
"</tr>\n" +
"<tr>\n" +
"</tr>\n" +
"<tr>\n" +
"</tr>\n" +
"<tr>\n" +
"</tr>\n" +
"<tr>\n" +
"</tr>\n" +
"<tr>\n" +
"</tr>\n" +
"<tr>\n" +
"</tr>\n" +
"<tr>\n" +
"</tr>\n" +
"<tr>\n" +
"<td align=center rowspan=8" + MondayAfternoon + " " + MondayTime + "</td>\n" +
"<td align=center rowspan=8" + TuesdayAfternoon + " " + TuesdayTime + "</td>\n" +
"<td align=center rowspan=8" + WednesdayAfternoon + " " + WednesdayTime + "</td>\n" +
"<td align=center rowspan=8" + ThursdayAfternoon + " " + ThursdayTime + "</td>\n" +
"<td align=center rowspan=8" + FridayAfternoon + " " + FridayTime + "</td>\n" +
"</tr>\n" +
"<tr>\n" +
"</tr>\n" +
"<tr>\n" +
"</tr>\n" +
"<tr>\n" +
"</tr>\n" +
"<tr>\n" +
"</tr>\n" +
"<tr>\n" +
"</tr>\n" +
"<tr>\n" +
"</tr>\n" +
"<tr>\n" +
"</tr>\n" +
"<tr>\n" +
"</tr>\n" +
"<tr>\n" +
"</tr>\n" +
"<tr>\n" +
"</tr>\n" +
"<tr>\n" +
"</tr>\n" +
"<tr>\n" +
"</tr>\n" +
"<tr>\n" +
"</tr>\n" +
"<tr>\n" +
"</tr>\n" +
"<tr>\n" +
"</tr>\n" +
"<tr>\n" +
"</tr>\n" +
"<tr>\n" +
"</tr>\n" +
"</table>\n" +
"<p>\n" +
"<small>Created using <a href=http://www.stolaf.edu/people/hansonr/mysched>http://www.stolaf.edu/people/hansonr/mysched</a></small>\n" +
"<div style=display:none><pre>\n" +
"\n" +
"1 = Monday 8:00-12:00 Breakfast\n" +
"2 = Tuesday 8:00-12:00 Lunch\n" +
"3 = Wednesday 8:00-12:00 Lunch\n" +
"4 = Thursday 8:00-12:00 Lunch\n" +
"5 = Friday 8:00-12:00 lunch\n" +
"</pre></div>\n" +
"</body>");
    }

    public String getCourseString() {
        return CourseString;
    }

    public String getHtmlString() {
        return HtmlString;
    }
    
    
    
    
    
}
