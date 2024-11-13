package com.test_6.Prouduct.service;


import com.test_6.Prouduct.DTO.ProuductDTO;
import com.test_6.Prouduct.model.Prouduct;
import com.test_6.Prouduct.repository.ProductRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ProuductService {
    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<ProuductDTO> getAllProducts() {
        List<Prouduct>productList = productRepo.findAll();
        return modelMapper.map(productList, new TypeToken<List<ProuductDTO>>(){}.getType());
    }

    public ProuductDTO saveProduct(ProuductDTO productDTO) {
        productRepo.save(modelMapper.map(productDTO, Prouduct.class));
        return productDTO;
    }

    public ProuductDTO updateProduct(ProuductDTO productDTO) {
        productRepo.save(modelMapper.map(productDTO, Prouduct.class));
        return productDTO;
    }

    public String deleteProduct(Integer productId) {
        productRepo.deleteById(productId);
        return "Product deleted";
    }

    public ProuductDTO getProductById(Integer productId) {
        Prouduct product = productRepo.getProductById(productId);
        return modelMapper.map(product, ProuductDTO.class);
    }
}