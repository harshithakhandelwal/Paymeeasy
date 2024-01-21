package com.example.productService.controllers;

import com.example.productService.models.Product;
import com.example.productService.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
//
//  @Autowired
//  private RestTemplate restTemplate;
  @GetMapping("/details")
  public Product getProductDetails(@RequestParam("user_id") Long userId, @RequestParam("product_id") Long productId){
    Product p = new Product();
    p.setId(10);
    p.setCategory("Bag");
    p.setTitle("clutch");
    p.setPrice(100);
    //ResponseEntity<User> response = restTemplate.getForEntity("yhh",User.class);
  //  User user = response.getBody();
    return p;
  }
}
