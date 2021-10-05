package application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import application.respositories.LivroRepository;
import org.springframework.ui.Model;

@Controller
@ResquestMapping("/livro")
public class LivroController {
    @Autowired
    private LivroRepository livrosRepo;
    @RequestMapping("/list")
    public String list(Model model){
        model.addAttribute("livros", livrosRepo.findAll());
        return "list.jsp";
    }
    
}
