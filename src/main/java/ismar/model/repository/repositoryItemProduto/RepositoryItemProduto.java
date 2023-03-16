package ismar.model.repository.repositoryItemProduto;

import ismar.model.entity.itemProduto.ItemProduto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class RepositoryItemProduto {

    @PersistenceContext
    private EntityManager em;

    public List<ItemProduto> itemProdutos() {
        Query query = em.createQuery("from ItemProduto");
        return query.getResultList();
    }
}