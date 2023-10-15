// 6410406631 Thanyamas Chancharoen

package ku.cs.kafe.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ku.cs.kafe.entity.Category;
import ku.cs.kafe.model.CategoryRequest;
import ku.cs.kafe.repository.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public void createCategory(CategoryRequest request) {
        Category record = modelMapper.map(request, Category.class);
        categoryRepository.save(record);
    }
}
