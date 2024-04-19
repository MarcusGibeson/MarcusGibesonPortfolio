package marcusgibesonportfolio.portfolio.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.annotation.Resource;
import marcusgibesonportfolio.portfolio.Services.PortfolioService;

@Controller
public class HomepageController {
    
    @Resource
    private PortfolioService portfolioService;

    public HomepageController(PortfolioService portfolioService) {
        this.portfolioService = portfolioService;
    }

    @GetMapping ({"","/","/homepage"})
    public String Homepage() {
        return "homepage";
    }

    @GetMapping("/skills")
    public String Skills() {
        return "skills";
    }

    @GetMapping("/aboutMe")
    public String AboutMe() {
        return "aboutMe";
    }

    @GetMapping("/projects") 
    public String Projects() {
        return "projects";
    }
    
}
