package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import application.repository.GeneroRepository;
import application.model.Genero;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.Optional;


@Controller
@RequestMapping(value = {"/generos", "/"})
public class GeneroController {

    @Autowired
    private GeneroRepository generoRepo;

    @RequestMapping(value = {"/list", ""})
    public String select(Model ui) {
        ui.addAttribute("generos", generoRepo.findAll());
        return "list";
    }

    //adicionar
    @RequestMapping("/insert")
    public String insert() {
        return "FormInsert";
    }
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(@RequestParam("nome") String nome) {
        Genero genero = new Genero();
        genero.setNome(nome);
        generoRepo.save(genero);
        return "redirect:/generos/list";
    }

    //update
    @RequestMapping("/update")
    public String update(@RequestParam("id") long id, Model ui) {
        Optional<Genero> resultado = generoRepo.findById(id);
        if (resultado.isPresent()) {
            ui.addAttribute("genero", resultado.get());
            return "FormUpdate";
        }
        return "redirect:/generos/list";
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@RequestParam("id") long id, @RequestParam("nome") String nome) {
        Optional<Genero> resultado = generoRepo.findById(id);
        if (resultado.isPresent()) {
            resultado.get().setNome(nome);
            generoRepo.save(resultado.get());
        }
        return "redirect:/generos/list";
    }
    
    //delete
    @RequestMapping("/delete")
    public String delete(@RequestParam("id") long id, Model ui) {
        Optional<Genero> resultado = generoRepo.findById(id);
        if (resultado.isPresent()) {
            ui.addAttribute("genero", resultado.get());
            return "FormDelete";
        }
        return "redirect:/generos/list";
    }
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String delete(@RequestParam("id") long id) {
        generoRepo.deleteById(id);
        return "redirect:/generos/list";
    }

    
}