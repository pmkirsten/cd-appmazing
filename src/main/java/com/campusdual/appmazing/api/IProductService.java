package com.campusdual.appmazing.api;

import com.campusdual.appmazing.model.Product;
import com.campusdual.appmazing.model.dto.ProductDTO;

import java.math.BigDecimal;
import java.util.List;

public interface IProductService {

    ProductDTO queryProduct(ProductDTO productDTO);
    List<ProductDTO> queryAllProducts();
    int insertProduct(ProductDTO productDTO);
    int updateProduct(ProductDTO productDTO);
    int deleteProduct(ProductDTO productDTO);
    int buyProduct(ProductDTO product, int quantity);
    BigDecimal calculateTotalPrice(ProductDTO product, int quantity);
}