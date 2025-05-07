package com.isaacbcdev.springweb.dto;

import com.isaacbcdev.springweb.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    // This class will be used to transfer data between the client and server
    // It will contain the user details that will be sent in the response
    // private String fullname; // This will be used to store the user's full name

    private User user; // This will be used to store the user object
}