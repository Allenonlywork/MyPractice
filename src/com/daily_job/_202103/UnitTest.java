package com.daily_job._202103;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class UnitTest {
    @Test
    public void testUnionset(){
        Interval i1 = new Interval(1,3);
        Interval i2 = new Interval(2,6);
        Interval i3 = new Interval(8,10);
        Interval i4 = new Interval(15,18);

        List<Interval> list = new ArrayList<>();
        list.add(i1);
        list.add(i2);
        list.add(i3);
        list.add(i4);
        Unionset unionset = new Unionset();
        List<Interval> intervals = unionset.merge(list);
        for(Interval interval: intervals){
            System.out.println("[" + interval.start + "," + interval.end + "]");
        }
    }
    @Test
    public void testJumpToFinal(){
        int[] arr = {2,3,1,1,4};
        System.out.println(JumpToFinal.canJump(arr));
    }
}
