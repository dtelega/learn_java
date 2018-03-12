import java.util.Date;
import java.util.GregorianCalendar;

public class Day{

  public String countDays(Date d){
    Date today = new Date();
    
    long diff = d.getTime() - today.getTime();
    long days = (diff / (1000 * 60 * 60 * 24));
    
    if (days < 0)
      return "The day is in the past!" ;
    else if (days == 0)
      return "Today is the day!";
    else
      return days + " days";
  }
  
}
