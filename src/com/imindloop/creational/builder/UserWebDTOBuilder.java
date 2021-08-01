package com.imindloop.creational.builder;

import java.time.LocalDate;
import java.time.Period;

//A concrete builder for UserWebDTO
public class UserWebDTOBuilder implements UserDTOBuilder {

    private String firstName;
    private String lastName;
    private String age;
    private String address;

    private UserWebDTO userWebDTO;


    @Override
    public UserDTOBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthdate(LocalDate date) {
        //This returns not only years for months too, we need years only
        Period ageWithYears = Period.between(date, LocalDate.now());
        age = Integer.toString(ageWithYears.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNumber() + " " + address.getStreet() + " " + address.getCity();
        return this;
    }

    //Once we have handled all the properties making up the User object, we're going to build a UserWEBDTO
    @Override
    public UserWebDTO build() {
        userWebDTO = new UserWebDTO(this.firstName + " " + this.lastName, this.address, this.age);
        return userWebDTO;
    }

    @Override
    public UserWebDTO getUserDTO() {
        return userWebDTO;
    }

    @Override
    public String toString() {
        return "UserWebDTOBuilder{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                ", userWebDTO=" + userWebDTO +
                '}';
    }
}
