package com.test.mongodb.user.entity;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
//@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection = "test_collection")
public class UserEntity {

    @Id
    private String id;
    private String name;
    private String address;

    private UserEntity(
            String id,
            String name,
            String address
    ){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    private UserEntity(
            String name,
            String address
    ){
        this.name = name;
        this.address = address;
    }

    public static UserEntity create(
            String name,
            String address
    ) {
        return new UserEntity(name, address);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("UserEntity{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
