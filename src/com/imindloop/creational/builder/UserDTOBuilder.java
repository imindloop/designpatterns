package com.imindloop.creational.builder;

import java.time.LocalDate;

public interface UserDTOBuilder {

    UserDTOBuilder withFirstName(String firstName);

    UserDTOBuilder withLastName(String lastName);

    UserDTOBuilder withBirthdate(LocalDate date);

    UserDTOBuilder withAddress(Address address);

    //A method to build a User DTO based on the received parameters
    UserWebDTO build();

    //A method to return a built User DTO
    UserWebDTO getUserDTO();

}
