package demo.Controller;
import demo.models.Books;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

import java.util.List;

@RestController
@RequestMapping("/Books")
public class BooksController {
    @GetMapping
    public String CatalogBooks(Model model){
        return "CatalogBooks";
    }
}
