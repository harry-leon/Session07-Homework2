package com.se191116.mvc.homework1.candidate;

import org.springframework.stereotype.Service;

@Service
public class CandidateServiceImpl implements CandidateService {

    private final CandidateRepository candidateRepository;

    public CandidateServiceImpl(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    @Override
    public Candidate create(CandidateCreateDTO dto) {
        Candidate candidate = Candidate.builder()
                .fullName(dto.getFullName())
                .email(dto.getEmail())
                .age(dto.getAge())
                .yearsOfExperience(dto.getYearsOfExperience())
                .build();
        return candidateRepository.save(candidate);
    }
}
