package com.kkw.EventCafe.DTO;

import lombok.Getter;
import lombok.ToString;

@Getter // getter와 같은 역할을 한다.
@ToString(exclude = "password") // exclude에 해당하는 필드 값은 출력되지 않는다.
public class UserDTO {
    private Long userId;
    private String id;
    private String password;
    private String name;
}
