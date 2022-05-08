package baith2.Controller;

import baith2.Product.Product;
import baith2.repository.ProducRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller
public class ProductController {
    @GetMapping("/")
    public String showIndex(){
        return "index";
    }
    @Autowired
    private ProducRepository producRepository;
    @GetMapping("/products")
    public String getProduct(Model model) {
        List<Product> productList = producRepository.findAll();
        model.addAttribute("listProduct", productList);
        return "product";
    }
}
