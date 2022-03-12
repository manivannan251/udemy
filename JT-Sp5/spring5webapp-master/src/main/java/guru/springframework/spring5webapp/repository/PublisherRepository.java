package guru.springframework.spring5webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.springframework.spring5webapp.domain.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Long>{

}
