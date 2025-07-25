package demo.Controller;
import demo.models.Books;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class BooksController {
    @GetMapping("/books")
    public String CatalogBooks(Model model){
        model.addAttribute("title", "Каталог Книг");
        return "CatalogBooks";
    }
}
