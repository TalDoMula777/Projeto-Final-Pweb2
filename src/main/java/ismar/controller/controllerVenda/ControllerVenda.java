package ismar.controller.controllerVenda;

import ismar.model.repository.repositoryVenda.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Transactional
@Controller
@RequestMapping("venda")
public class ControllerVenda {

  @Autowired
  VendaRepository vendaRepository;

  @GetMapping("/list")
  public String list(ModelMap modelMap){
    modelMap.addAttribute("vendas", vendaRepository.vendas());
    return "/venda/list";
  }
}