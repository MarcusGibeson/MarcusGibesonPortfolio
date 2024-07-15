package marcusgibesonportfolio.portfolio.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Project {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;
    private String imgUrl;
    private String projectUrl;
    private String repoUrl;
    private String[] technologiesUsed;
    private String StartDate;
    private String EndDate;
    private String status;
    private String[] contributors;
    private String[] tags;

    public Project(String name, String description, String imgUrl, String projectUrl, String repoUrl,
            String[] technologiesUsed, String startDate, String endDate, String status, String[] contributors,
            String[] tags) {
        this.name = name;
        this.description = description;
        this.imgUrl = imgUrl;
        this.projectUrl = projectUrl;
        this.repoUrl = repoUrl;
        this.technologiesUsed = technologiesUsed;
        StartDate = startDate;
        EndDate = endDate;
        this.status = status;
        this.contributors = contributors;
        this.tags = tags;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    public String getProjectUrl() {
        return projectUrl;
    }
    public void setProjectUrl(String projectUrl) {
        this.projectUrl = projectUrl;
    }
    public String getRepoUrl() {
        return repoUrl;
    }
    public void setRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
    }
    public String[] getTechnologiesUsed() {
        return technologiesUsed;
    }
    public void setTechnologiesUsed(String[] technologiesUsed) {
        this.technologiesUsed = technologiesUsed;
    }
    public String getStartDate() {
        return StartDate;
    }
    public void setStartDate(String startDate) {
        StartDate = startDate;
    }
    public String getEndDate() {
        return EndDate;
    }
    public void setEndDate(String endDate) {
        EndDate = endDate;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String[] getContributors() {
        return contributors;
    }
    public void setContributors(String[] contributors) {
        this.contributors = contributors;
    }
    public String[] getTags() {
        return tags;
    }
    public void setTags(String[] tags) {
        this.tags = tags;
    }


    //Getters and Setters
    
}
