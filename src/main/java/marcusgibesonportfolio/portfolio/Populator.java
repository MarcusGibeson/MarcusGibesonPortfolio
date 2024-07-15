package marcusgibesonportfolio.portfolio;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import marcusgibesonportfolio.portfolio.Models.Project;
import marcusgibesonportfolio.portfolio.Services.ProjectService;

@Component
public class Populator implements CommandLineRunner {
    
    private final ProjectService projectService;

    public Populator(ProjectService projectService) {
        this.projectService = projectService;
    }

    @Override
    public void run(String...args) throws Exception {

        //Projects creation
        Project AsteroidXtreme = new Project("PacMan Xtreme","description here", "IMG URL HERE", "Project Link URL HERE", "GITHUB URL HERE",  )




    }
}
