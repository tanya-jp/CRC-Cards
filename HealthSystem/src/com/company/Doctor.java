package com.company;

/**
 *This class find related doctor for specific illness, based on patient's trusted doctors.
 * @author Tanya Djavaherpour
 * @version 1.0 2020
 */
public class Doctor {
    //patient's history
    private History history;
    //patient's specific illness
    private Illness illness;
    //there are two types. 1. doctor has access to complete history 2. doctor has access to specific part
    private String accessType;
    //type of illness
    private String illnessType;
    //doctor's name
    private String name;

    /**
     * Constructs a new doctor
     */
     public Doctor()
     {}

    /**
     * Checks kind of illness and finds problem
     */
     public void checkIllness()
     {}

    /**
     * Checks if the illness is related to trusted doctor
     * @return
     */
     public boolean isRelated()
     {}

    /**
     * If illness is related doctor makes a new history and starts treatments
     */
     public void makeNewHistory()
     {}

    /**
     * If illness was not related to this doctor, reference to a new correct doctor
     */
     public void referenceToNewDoc()
     {}

    /**
     * If new doctor was needed, this method calls and add a new related doctor
     */
     public void setName()
     {}

    /**
     * Tells new doctor's name
     * @return
     */
     public String getName()
     {}

    /**
     * Define access type for new doctor
     */
    public void defineAccess(String)
    {}

}
