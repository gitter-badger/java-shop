package lv.javaguru.shop.controller.admin;

import lv.javaguru.shop.domain.Category;
import lv.javaguru.shop.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin/categories")
public class CategoryController {
    private CategoryRepository categoryRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String showAll(Model model) {
        model.addAttribute("categories", categoryRepository.findAll());
        return "admin_categories_list";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String add(@Validated @ModelAttribute Category category) {
        category.setId(null);
        categoryRepository.save(category);
        return "redirect:/admin/categories";
    }

    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
}
