package com.skillhire.model;

import jakarta.persistence.*;

@Entity
@Table(name = "proposals")
public class Proposal {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long projectId;
    private String freelancerName;
    private String amount;
    private String deliveryTime;
    @Column(length = 2000) private String coverLetter;

    public Proposal() {}
    public Proposal(Long projectId, String freelancerName, String amount, String deliveryTime, String coverLetter) {
        this.projectId = projectId; this.freelancerName = freelancerName; this.amount = amount; this.deliveryTime = deliveryTime; this.coverLetter = coverLetter;
    }
    public Long getId() { return id; }
    public Long getProjectId() { return projectId; }
    public void setProjectId(Long projectId) { this.projectId = projectId; }
    public String getFreelancerName() { return freelancerName; }
    public void setFreelancerName(String freelancerName) { this.freelancerName = freelancerName; }
    public String getAmount() { return amount; }
    public void setAmount(String amount) { this.amount = amount; }
    public String getDeliveryTime() { return deliveryTime; }
    public void setDeliveryTime(String deliveryTime) { this.deliveryTime = deliveryTime; }
    public String getCoverLetter() { return coverLetter; }
    public void setCoverLetter(String coverLetter) { this.coverLetter = coverLetter; }
}
