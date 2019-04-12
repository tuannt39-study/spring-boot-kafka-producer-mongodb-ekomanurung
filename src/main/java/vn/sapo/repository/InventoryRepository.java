package vn.sapo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import vn.sapo.domain.Inventory;

/**
 * Created by eko.j.manurung on 6/2/2016.
 */
public interface InventoryRepository extends MongoRepository<Inventory, String>, InventoryRepositoryCustom {

}
