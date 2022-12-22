package com.dracodia.users;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserData {
    private String firstName;
    private String lastName;
    private int age;
    private BigDecimal accountBalance;
    private UserType type;
}
