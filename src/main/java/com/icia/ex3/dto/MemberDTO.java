package com.icia.ex3.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberDTO {

    private Long id;
    private String email;
    private String password;
    private String name;

    private String mobile;

    //필드에 배열 리스트 등등 다 선언이 가능함 !
    private String gender;
    private String city;
    private String[] lang;


}
