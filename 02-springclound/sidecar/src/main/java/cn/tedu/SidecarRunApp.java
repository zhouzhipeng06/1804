package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableSidecar
public class SidecarRunApp {
	public static void main(String[] args) {
		SpringApplication.run(SidecarRunApp.class, args);
	}
}
