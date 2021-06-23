package jenkins.webhook.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {desc}
 *
 * @author renhuibo
 * @date 2021/6/23 15:50
 */
@RestController
public class DemoController {

  @GetMapping("ping")
  public String ping(){
    return "pong";
  }

}