package com.group.libraryapp.dto.user.request;

public class UserCreateRequest {

  public UserCreateRequest(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  private String name;
  private Integer age;

  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }

}
