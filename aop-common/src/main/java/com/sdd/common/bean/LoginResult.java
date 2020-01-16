package com.sdd.common.bean;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LoginResult {
    @JsonProperty("result_code")
    private String resultCode;
    private String message;
}
