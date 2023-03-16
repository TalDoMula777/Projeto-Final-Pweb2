package ismar.model.entity.venda;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ismar.model.entity.itemProduto.ItemProduto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Venda implements Serializable {
 
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id 
  private Long id;
  private LocalDate data;
  @OneToMany(mappedBy = "venda")
  private List<ItemProduto> itensProdutos;
  Venda(){
    itensProdutos = new ArrayList<ItemProduto>();
  }

  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public LocalDate getData() {
    return data;
  }
  public void setData(LocalDate data) {
    this.data = data;
  }
  public List<ItemProduto> getItensProdutos() {
    return itensProdutos;
  }
  public void setItensProdutos(List<ItemProduto> itensProdutos) {
    this.itensProdutos = itensProdutos;
  }
  public double totalVenda(){
    double total = 0;
    for (ItemProduto itens:  itensProdutos) { total += itens.getQuantidadeProduto(); } return total;
  }
}