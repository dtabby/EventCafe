package com.kkw.EventCafe.DTO;

import lombok.Getter;
import lombok.ToString;

@Getter // getter와 같은 역할을 한다.
@ToString()
public class SiteDTO {
    private Long siteId;
    private String title;
    private String content;
}
