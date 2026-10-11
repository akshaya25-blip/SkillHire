package com.skillhire.repository;
import com.skillhire.model.Proposal;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProposalRepository extends JpaRepository<Proposal, Long> {
    List<Proposal> findByProjectId(Long projectId);
}
