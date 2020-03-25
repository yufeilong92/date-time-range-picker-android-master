package com.wisnu.date_range_picker_android;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void settext() {
        Date date = DateTime.now(DateTimeZone.UTC).toDate();
        Calendar instance = Calendar.getInstance();
        instance.set(2018,0,1);
        Date time = instance.getTime();
        System.out.println(date.toString());
        System.out.println(time.toString());
    }
}