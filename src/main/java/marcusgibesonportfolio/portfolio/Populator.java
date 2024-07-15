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

        //Asteroid Xtreme Project
        String[] asteroidTechUsed = {"Java", "LibGDX"};
        String[] asteroidContributors = {"Marcus Gibeson","Joshua Whittington"};
        String[] asteroidTags = {"Game", "Java", "LibGDX"};

        Project AsteroidXtreme = new Project(
            "Asteroid Xtreme",
            "description here", 
            "IMG URL HERE", 
            "Project Link URL HERE", 
            "GITHUB URL HERE",
            asteroidTechUsed,
            "2024-04-15",
            "null",
            "Incomplete",
            asteroidContributors,
            asteroidTags
        );

        projectService.save(AsteroidXtreme);

        //Pacman Xtreme Project
        String[] pacmanTechUsed = {"Java", "LibGDX"};
        String[] pacmanContributors = {"Marcus Gibeson"};
        String[] pacmanTags = {"Game", "Java", "LibGDX"};

        Project PacmanXtreme = new Project(
            "Pacman Xtreme",
            "description here",
            "IMG URL HERE",
            "Project Link URL here",
            "GITHUB URL here",
            pacmanTechUsed,
            "2024-04-07",
            "null",
            "Incomplete",
            pacmanContributors,
            pacmanTags
        );

        projectService.save(PacmanXtreme);
    }
}
