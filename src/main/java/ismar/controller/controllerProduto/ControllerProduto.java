package ismar.controller.controllerProduto;

import ismar.model.repository.repositoryProduto.RepositoryProduto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.transaction.Transactional;

@Transactional
@Controller
@RequestMapping("produto")
public class ControllerProduto {

  @Autowired
  RepositoryProduto repositoryProduto;

  @GetMapping("/list")
  public String list(ModelMap modelMap){
    modelMap.addAttribute("produto", repositoryProduto.produtos());
    return "produto/list";
  }
}