package com.jobquest.backend.repository;

import com.jobquest.backend.model.Candidate;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CandidateRepository extends MongoRepository<Candidate, ObjectId> {
    Optional<Candidate> findByEmail(String email);
}
