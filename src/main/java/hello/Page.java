package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Page {
  /*Members*/
  private String name;
  private String about;
  private String phone;
  private String website;

  /*Getters*/
  public String getName() {
    return name;
  }
  public String getAbout() {
    return about;
  }
  public String getPhone() {
    return phone;
  }
  public String getWebsite() {
    return website;
  }
}
