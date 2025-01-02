package Problems.Car_Rental.Vehicles;

import java.util.Comparator;
import java.util.Date;

public class DateInterval implements Comparator<DateInterval> {
    private Date dateFrom;
    private Date date_to;

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDate_to() {
        return date_to;
    }

    public void setDate_to(Date date_to) {
        this.date_to = date_to;
    }
    @Override
    public int compare(DateInterval o1, DateInterval o2) {
        return o1.getDateFrom().compareTo(o2.getDateFrom());
    }
}
