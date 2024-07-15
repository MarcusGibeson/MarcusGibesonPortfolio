package marcusgibesonportfolio.portfolio.Repositories;

import org.springframework.data.repository.CrudRepository;

import marcusgibesonportfolio.portfolio.Models.Project;

public interface ProjectRepository extends CrudRepository<Project, Long> {
    
}
