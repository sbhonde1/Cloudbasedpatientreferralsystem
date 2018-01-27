package com.nbn.cloudbasedpatientreferralsystem.pojo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by dudupoo on 22/1/18.
 */

public class PatientProfile implements Serializable
{
    public String name;
    public String contactNo;
    public String email;
    public String dob;
    public String firebaseId;
    public String photoURL;
    public String gender;
    public String disease;

    public PatientProfile()
    {
    }

    @Override
    public String toString()
    {
        return "PatientProfile{" +
                "name='" + name + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", email='" + email + '\'' +
                ", dob='" + dob + '\'' +
                ", firebaseId='" + firebaseId + '\'' +
                ", photoURL='" + photoURL + '\'' +
                ", gender='" + gender + '\'' +
                ", disease='" + disease + '\'' +
                '}';
    }

    public String getDisease()
    {
        return disease;
    }

    public void setDisease(String disease)
    {
        this.disease = disease;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getContactNo()
    {
        return contactNo;
    }

    public void setContactNo(String contactNo)
    {
        this.contactNo = contactNo;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getDob()
    {
        return dob;
    }

    public void setDob(String dob)
    {
        this.dob = dob;
    }

    public String getFirebaseId()
    {
        return firebaseId;
    }

    public void setFirebaseId(String firebaseId)
    {
        this.firebaseId = firebaseId;
    }

    public String getPhotoURL()
    {
        return photoURL;
    }

    public void setPhotoURL(String photoURL)
    {
        this.photoURL = photoURL;
    }
}
