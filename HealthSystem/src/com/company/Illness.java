package com.company;

import java.util.ArrayList;

/**
 * This class sets patient's information of a specific illness
 * @author Tanya Djavaherpour
 * @version 1.0 2020
 */
public class Illness {
    //name of illness
    private String kindOfIllness;
    //How is patient
    private String patientState;
    //what doctor says
    private String doctorDiagnosis;
    //importance of illness
    private int illnessState;
    //medicines
    private ArrayList<String> medicines;
    //first day
    private String startDate;
    //last day
    private String lastDate;
    //who is doctor
    private String doctorName;

    /**
     * Constructs a new illness
     */
    public Illness()
    {}

    /**
     * Sets name of illness
     */
    private void setKindOfIllness(String)
    {}

    /**
     * returns name of illness
     * @return
     */
    private String getKindOfIllness()
    {}

    /**
     * Sets state of patient
     */
    private void setPatientState(String)
    {}

    /**
     * returns state of patient
     * @return
     */
    private String getPatientState()
    {}

    /**
     * Sets doctor's idea
     */
    private void setDoctorDiagnosis(String)
    {}

    /**
     * returns doctor's idea
     * @return
     */
    private String getDoctorDiagnosis()
    {}

    /**
     * Sets sate of an illness
     * Illness has 3 state. Dangerous illness has greater state.
     */
    private void setIllnessState(int)
    {}

    /**
     * Sets first date of illness
     */
    private void setStartDate(String)
    {}

    /**
     * returns first date of illness
     * @return
     */
    private String getStartDate()
    {}

    /**
     * Sets last date of illness
     */
    private void setLastDate(String)
    {}

    /**
     * Returns last date of illness
     * @return
     */
    private String getLastDate()
    {}

    /**
     * Sets related doctor's name
     */
    private void setDoctorName(String)
    {}

    /**
     * Returns medicines that should be used for this illness
     * @return
     */
    private ArrayList<String> getMedicines()
    {}


}
