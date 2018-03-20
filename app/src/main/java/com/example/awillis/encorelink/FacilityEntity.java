package com.example.awillis.encorelink;

/**
 * Created by BenMorrisRains on 3/17/18.
 */

public class FacilityEntity {

    private String organizationName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipcode;
    private String contactName;
    private String contactJobTitle;
    private String phoneNumber;
    private String emailAddress;

    public FacilityEntity(String organizationName, String streetAddress, String city, String state, String zipcode, String contactName, String contactJobTitle, String phoneNumber, String emailAddress) {
        this.organizationName = organizationName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.contactName = contactName;
        this.contactJobTitle = contactJobTitle;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
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

    public String getState() {
        return state;
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

    @Override
    public String toString() {
        return "FacilityEntity{" +
                "organizationName='" + organizationName + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", contactName='" + contactName + '\'' +
                ", contactJobTitle='" + contactJobTitle + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
