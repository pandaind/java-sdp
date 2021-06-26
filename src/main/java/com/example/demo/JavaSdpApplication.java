package com.example.demo;

import com.example.demo.adapter.EarPhoneAdapter;
import com.example.demo.adapter.EarPhonePlug;
import com.example.demo.adapter.phone.Iphone;
import com.example.demo.adapter.phone.OnePlus;
import com.example.demo.bridge.BridgeClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaSdpApplication implements CommandLineRunner {
  private final Logger log = LoggerFactory.getLogger(this.getClass());

  public static void main(String[] args) {
    SpringApplication.run(JavaSdpApplication.class, args);
  }

  @Override
  public void run(String... args) {

    log.info("********** adapter **********");
    Iphone iphone = new Iphone();
    OnePlus onePlus = new OnePlus();
    EarPhonePlug earPhonePlug = new EarPhonePlug();
    EarPhoneAdapter adapter = new EarPhoneAdapter();

    earPhonePlug.takeSoundInput(iphone.getSoundOutput());
    earPhonePlug.takeSoundInput(adapter.convertSoundSignal(onePlus.getSoundOutput()));

    log.info("********** bridge **********");
    BridgeClient.run();
  }
}
