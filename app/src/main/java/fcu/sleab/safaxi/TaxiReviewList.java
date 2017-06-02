package fcu.sleab.safaxi;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sammy on 2017/6/2.
 */

public class TaxiReviewList {

    public enum ReviewType {
        Good, Bad, Neutral;
    }

    private Map<String, ReviewType> taxiList = new HashMap();

    public static TaxiReviewList INSTANCE = new TaxiReviewList();

    public static TaxiReviewList getInstance() {
        return INSTANCE;
    }

    private TaxiReviewList() {
        taxiList.put("159-LD", ReviewType.Bad);
        taxiList.put("330-ET", ReviewType.Good);
        taxiList.put("826-ZN", ReviewType.Good);
        taxiList.put("281-YN", ReviewType.Bad);
        taxiList.put("289-DE", ReviewType.Good);
        taxiList.put("100-E8", ReviewType.Good);
        taxiList.put("039-CG", ReviewType.Bad);
    }

    public ReviewType getReviewe(String plateNum) {
        ReviewType rt = taxiList.get(plateNum);
        if(rt == null) {
            rt = ReviewType.Neutral;
        }
        return rt;
    }

}
