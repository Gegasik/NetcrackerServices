package com.nc.service.impl;

import com.nc.models.Category;
import com.nc.service.CategoryService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Value("${backend.server.url}api")
    private String backendServerUrl;

    @Override
    public Category save(Category category) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(backendServerUrl + "/categories", category, Category.class);
    }

    @Override
    public void delete(Long idCategory) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(backendServerUrl + "/categories/" + idCategory);
    }


    @Override
    public List getAll() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(backendServerUrl + "/categories", List.class);
    }
}

