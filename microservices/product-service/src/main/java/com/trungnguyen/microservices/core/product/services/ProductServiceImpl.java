package com.trungnguyen.microservices.core.product.services;

import com.trungnguyen.api.core.product.Product;
import com.trungnguyen.api.core.product.ProductService;
import com.trungnguyen.api.exceptions.InvalidInputException;
import com.trungnguyen.api.exceptions.NotFoundException;
import com.trungnguyen.util.http.ServiceUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
  private final ServiceUtil serviceUtil;

  @Override
  public Product getProduct(int productId) {
    log.debug("/product return the found product for productId={}", productId);

    if (productId < 1) {
      throw new InvalidInputException("Invalid productId: " + productId);
    }

    if (productId == 13) {
      throw new NotFoundException("No product found for productId: " + productId);
    }

    return new Product(productId, "name-" + productId, 123, serviceUtil.getServiceAddress());
  }
}
