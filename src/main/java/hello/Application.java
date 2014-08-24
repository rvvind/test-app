package hello;

import org.springframework.web.client.RestTemplate;

public class Application {
  public static void main(String[] args) {
    /* RestTemplate to serialize JSON */
    RestTemplate restTemplate = new RestTemplate();
    /* RestTemplate making GET call and applying response to the Page.class object */
    Page page = restTemplate.getForObject("http://graph.facebook.com/pivotalsoftware", Page.class);
    System.out.println("Name:    " + page.getName());
    System.out.println("About:   " + page.getAbout());
    System.out.println("Phone:   " + page.getPhone());
    System.out.println("Website: " + page.getWebsite());
  }
}
