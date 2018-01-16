package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Category;

public interface ICategoryService {
    ServerResponse<Category> addCategory(String categoryName, Integer parentId);
}