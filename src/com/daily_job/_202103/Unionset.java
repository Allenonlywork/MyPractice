package com.daily_job._202103;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals,
 * and return an array of the non-overlapping intervals that cover all the intervals in the input.
 *
 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
 */
public class Unionset {

    public List<Interval> merge(List<Interval> intervals){
        //判断区间集合小于等于1则不需要合并
        if(intervals.size() <= 1){
            return intervals;
        }
        //将区间集合进行升序排序
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if(o1.start == o2.start){
                    return o1.end - o2.end;
                }else{
                    return o1.start - o2.start;
                }
            }
        });
        List<Interval> res = new ArrayList<>();
        //将最小的一个区间放入列表
        res.add(intervals.get(0));
        for(int i=1;i<intervals.size();i++){
            Interval cur = intervals.get(i);
            Interval tmp = res.get(res.size()-1);

            if(cur.start > tmp.end){//区间无交集
                res.add(cur);
            }else{
                tmp.end = cur.end;
                res.remove(i-1);
                res.add(tmp);
            }
        }
        return res;
    }

}

class Interval{
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}
