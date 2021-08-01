package com.imindloop.creational.builder;

import java.time.LocalDate;

public class UserClient {

    public static void main(String[] args) {
        User user = createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();

        UserWebDTO dto = directBuild(builder, user);

        System.out.println(dto.toString());

    }

    private static UserWebDTO directBuild(UserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withBirthdate(user.getBirthday())
                .build();

    }

    public static User createUser() {
        User user = new User();
        user.setBirthday(LocalDate.of(1988,6,11));
        user.setFirstName("Celina");
        user.setLastName("Gonzalez");

        Address address = new Address();
        address.setHouseNumber("7105");
        address.setStreet("Grape Arbor Dr");
        address.setCity("Corpus Christi");
        address.setState("Texas");
        address.setZipCode("78414");

        user.setAddress(address);

        return user;
    }


}
