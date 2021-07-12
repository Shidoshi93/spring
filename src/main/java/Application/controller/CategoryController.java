package Application.controller;

import Application.model.Category;
import Application.model.Database;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @RequestMapping("/list")
    public ArrayList<Category> allCategories() {
        ArrayList<Category> categories = new ArrayList<>();
        Category c1 = new Category("1", "Livros");
        Category c2 = new Category("2", "Eletrônicos");
        categories.add(c1);
        categories.add(c2);

        return categories;
    }
    /*public ArrayList<Category> getCategorias(){
        Database db = new Database();
        ArrayList<Category> persistedCategories = db.getCategories();

        return persistedCategories;
    }*/

}
