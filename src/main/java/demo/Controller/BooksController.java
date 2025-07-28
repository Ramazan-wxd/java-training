package demo.Controller;
import demo.models.Books;
import demo.repositories.BooksRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class BooksController {
    @Autowired
    private BooksRepository booksRepository;

    @GetMapping("/books")
    public String CatalogBooks(Model model){
        Iterable<Books> booksList = booksRepository.findAll();
        model.addAttribute("booksList", booksList);
        return "CatalogBooks";
    }
}
