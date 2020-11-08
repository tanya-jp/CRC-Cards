package com.company;

import java.util.ArrayList;

/**
 * This class stores patient's information
 * @author Tanya Djavaherpour
 * @version 1.0 2020
 */
public class Patient {
    private String name;
    private String birthday;
    private String gender;
    private String normalInsurance;
    private String topInsurance;
    private String degree;
    private String location;
    private History history;
    private boolean permission;
    private ArrayList<Doctor> doctors;
    private DrugStore drugStore;
    private ArrayList<String> medicines;

    /**
     * Constructs a new patient
     */
    public Patient()
    {}

    /**
     * Sets patient's name
     */
    private void setName(String)
    {}

    /**
     * Gets patient's name
     * @return
     */
    private String getName()
    {}

    /**
     * Sets patient's date of birth
     */
    private void setBirthday(String)
    {}

    /**
     * Gets patient's date of birth
     * @return
     */
    private String getBirthday()
    {}

    /**
     * Sets patients gender
     */
    private void setGender(String)
    {}

    private String getGender()
    {}

    private void setInsurance(String)
    {}
    private String getInsurance()
    {}

    private void setInsuranceType(String)
    {}
    private String getInsuranceType()
    {}

    private void setDegree(String)
    {}
    private String getDegree()
    {}

    private void setLocation(String)
    {}

    private String getLocation()
    {}

    /**
     * Returns history of patient
     * @return
     */
    public History getHistory()
    {}

    /**
     * Patient permits health center to get their name or not.
     */
    public void setPermission(boolean)
    {}

    /**
     * Finds first trusted doctor
     * @return
     */
    public Doctor trustedDoc()
    {}

    /**
     * If patient needs a new doctor for their illness this method calls
     * and add a new related doctor to trusted list
     */
    public void addDoctor(Doctor)
    {}

    /**
     * Patient can understand what medicines should buy for their illness
     */
    public void buyMedicine(DrugStore)
    {}


}
