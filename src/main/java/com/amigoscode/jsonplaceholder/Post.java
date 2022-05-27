package com.amigoscode.jsonplaceholder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Post {

    private final Integer userId;
    private final Integer id;
    private final String title;
    private final String body;

}
