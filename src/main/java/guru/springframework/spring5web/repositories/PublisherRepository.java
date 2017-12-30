package guru.springframework.spring5web.repositories;

import guru.springframework.spring5web.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
