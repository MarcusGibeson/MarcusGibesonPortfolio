package marcusgibesonportfolio.portfolio.Services;

import org.springframework.stereotype.Service;

import marcusgibesonportfolio.portfolio.Models.Project;
import marcusgibesonportfolio.portfolio.Repositories.ProjectRepository;

@Service
public class ProjectService {
    private final ProjectRepository projectRepo;

    public ProjectService(ProjectRepository projectRepo) {
        this.projectRepo = projectRepo;
    }

    public Project save(Project project) {
        return projectRepo.save(project);
    }

    public Project retrieveProjectById(Long id) throws Exception {
        try {
            return projectRepo.findById(id).get();
        } catch(Exception e) {
            throw new Exception("Project not found.");
        }
    }

    public void delete(Long id) throws Exception {
        if(!projectRepo.existsById(id)) {
            throw new Exception("Project not found.");
        }
    }

    public Iterable<Project> getAllProjects() {
        return projectRepo.findAll();
    }
}
