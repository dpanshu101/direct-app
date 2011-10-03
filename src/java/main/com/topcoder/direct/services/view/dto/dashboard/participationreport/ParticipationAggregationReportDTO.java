/*
 * Copyright (C) 2011 TopCoder Inc., All Rights Reserved.
 */
package com.topcoder.direct.services.view.dto.dashboard.participationreport;

import java.io.Serializable;

/**
 * <p>
 * The DTO stores the aggregation participation metrics report data.
 * </p>
 *
 * @author TCSASSEMBER
 * @version  1.0 (TC Cockpit Participation Metrics Report Part One Assembly 1)
 */
public class ParticipationAggregationReportDTO implements Serializable {

    /**
     * Represents the serial version unique id.
     */
    private static final long serialVersionUID = -3985093109381162149L;

    /**
     * Represents the name of aggregation group.
     */
    private String groupName;
    
    /**
     * Represents the number of total registrants of the aggregation group.
     */
    private int totalRegistrants;
    
    /**
     * Represents the number of unique registrants of the aggregation group.
     */
    private int uniqueRegistrants;
    
    /**
     * Represents the number of registrant countries of the aggregation group.
     */
    private int registrantCountries;
    
    /**
     * Represents the number of total submitters of the aggregation group.
     */
    private int totalSubmitters;
    
    /**
     * Represents the number of unique submitters of the aggregation group.
     */
    private int uniqueSubmitters;
    
    /**
     * Represents the number of submitter countries of the aggregation group.
     */
    private int submitterContries;
    
    /**
     * Represents the number of total winners of the aggregation group.
     */
    private int totalWinners;
    
    /**
     * Represents the number of winner countries of the aggregation group.
     */
    private int winnerCountries;
    
    /**
     * Empty constructor.
     */
    public ParticipationAggregationReportDTO() {
        
    }

    /**
     * Gets the name of aggregation group.
     * 
     * @return the name of aggregation group.
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the name of aggregation group.
     * 
     * @param groupName the name of aggregation group.
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * Gets the number of total registrants of the aggregation group.
     * 
     * @return the number of total registrants of the aggregation group.
     */
    public int getTotalRegistrants() {
        return totalRegistrants;
    }

    /**
     * Sets the number of total registrants of the aggregation group.
     * 
     * @param totalRegistrants the number of total registrants of the aggregation group.
     */
    public void setTotalRegistrants(int totalRegistrants) {
        this.totalRegistrants = totalRegistrants;
    }

    /**
     * Gets the number of unique registrants of the aggregation group.
     * @return the number of unique registrants of the aggregation group.
     */
    public int getUniqueRegistrants() {
        return uniqueRegistrants;
    }

    /**
     * Sets the number of unique registrants of the aggregation group.
     * 
     * @param uniqueRegistrants the number of unique registrants of the aggregation group.
     */
    public void setUniqueRegistrants(int uniqueRegistrants) {
        this.uniqueRegistrants = uniqueRegistrants;
    }

    /**
     * Gets the number of registrant countries of the aggregation group.
     * 
     * @return the number of registrant countries of the aggregation group.
     */
    public int getRegistrantCountries() {
        return registrantCountries;
    }

    /**
     * Sets the number of registrant countries of the aggregation group.
     * 
     * @param registrantCountries the number of registrant countries of the aggregation group.
     */
    public void setRegistrantCountries(int registrantCountries) {
        this.registrantCountries = registrantCountries;
    }

    /**
     * Gets the number of total submitters of the aggregation group.
     * 
     * @return the number of total submitters of the aggregation group.
     */
    public int getTotalSubmitters() {
        return totalSubmitters;
    }

    /**
     * Sets the number of total submitters of the aggregation group.
     * 
     * @param totalSubmitters the number of total submitters of the aggregation group.
     */
    public void setTotalSubmitters(int totalSubmitters) {
        this.totalSubmitters = totalSubmitters;
    }

    /**
     * Gets the number of unique submitters of the aggregation group.
     * 
     * @return the number of unique submitters of the aggregation group.
     */
    public int getUniqueSubmitters() {
        return uniqueSubmitters;
    }

    /**
     * Sets the number of unique submitters of the aggregation group.
     * 
     * @param uniqueSubmitters the number of unique submitters of the aggregation group.
     */
    public void setUniqueSubmitters(int uniqueSubmitters) {
        this.uniqueSubmitters = uniqueSubmitters;
    }

    /**
     * Gets the number of submitter countries of the aggregation group.
     * 
     * @return the number of submitter countries of the aggregation group.
     */
    public int getSubmitterContries() {
        return submitterContries;
    }

    /**
     * Sets the number of submitter countries of the aggregation group.
     * 
     * @param submitterContries the number of submitter countries of the aggregation group.
     */
    public void setSubmitterContries(int submitterContries) {
        this.submitterContries = submitterContries;
    }

    /**
     * Gets the number of total winners of the aggregation group.
     * 
     * @return the number of total winners of the aggregation group.
     */
    public int getTotalWinners() {
        return totalWinners;
    }

    /**
     * Sets the number of total winners of the aggregation group.
     * 
     * @param totalWinners the number of total winners of the aggregation group.
     */
    public void setTotalWinners(int totalWinners) {
        this.totalWinners = totalWinners;
    }

    /**
     * Gets the number of winner countries of the aggregation group.
     * 
     * @return the number of winner countries of the aggregation group.
     */
    public int getWinnerCountries() {
        return winnerCountries;
    }

    /**
     * Sets the number of winner countries of the aggregation group.
     * 
     * @param winnerCountries the number of winner countries of the aggregation group.
     */
    public void setWinnerCountries(int winnerCountries) {
        this.winnerCountries = winnerCountries;
    }
    
    
}