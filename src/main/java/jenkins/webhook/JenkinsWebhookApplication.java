package jenkins.webhook;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * {desc}
 *
 * @author renhuibo
 * @date 2021/6/23 15:46
 */
@Slf4j
@SpringBootApplication
public class JenkinsWebhookApplication {

  public static void main(String[] args) {
    SpringApplication.run(JenkinsWebhookApplication.class,args);
    log.info("启动成功");
  }

}
