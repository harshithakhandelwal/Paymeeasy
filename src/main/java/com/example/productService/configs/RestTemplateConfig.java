//package com.example.productService.configs;
//
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.web.client.RestTemplateBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.client.RestTemplate;
//
//public class RestTemplateConfig {
//
//  @Autowired
//  private RestTemplateBuilder builder;
//
//  @Bean
//  @LoadBalanced
//  public RestTemplate createRestTemplate(){
//    return new RestTemplate();
//  }
//}
