package de.nicolasharrje.dtos;

import java.util.Map;

public class FacetteBeruf {
    private Map<String, Integer> counts;
    private int maxCount;

    public Map<String, Integer> getCounts() {return counts;}
    public void setCounts(Map<String, Integer> counts) {this.counts = counts;}

    public int getMaxCount() {return maxCount;}
    public void setMaxCount(int maxCount) {this.maxCount = maxCount;}
}
