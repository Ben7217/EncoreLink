package com.example.awillis.encorelink;

/**
 * Created by BenMorrisRains on 3/17/18.
 */

public class FacilityEntity {

    private String organizationName;
    private String streetAddress;
    private String city;
    private String zipcode;
    private String contactName;
    private String contactJobTitle;
    private String phoneNumber;
    private String emailAddress;
    private String userId;

    public FacilityEntity(String userId, String organizationName, String streetAddress, String city, String zipcode, String contactName, String contactJobTitle, String phoneNumber, String emailAddress) {
        this.organizationName = organizationName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.zipcode = zipcode;
        this.contactName = contactName;
        this.contactJobTitle = contactJobTitle;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.userId = userId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactJobTitle() {
        return contactJobTitle;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }


}
