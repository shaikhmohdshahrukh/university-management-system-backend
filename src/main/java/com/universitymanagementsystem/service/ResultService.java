package com.universitymanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.universitymanagementsystem.doas.ResultDao;
import com.universitymanagementsystem.entity.Result;

@Service
public class ResultService {


	@Autowired	
	protected ResultDao resultRepository;

	public Long createResult(Result result) {
		result = resultRepository.save(result);
		return result.getResultId();
	}

	public Result updateResult(Result result) {
		return resultRepository.save(result);
	}

	public void deleteResult(Long resultId) {
		resultRepository.deleteById(resultId);
	}

	public Optional<Result> findResultById(Long resultId) {
		return resultRepository.findById(resultId);
	}

	public List<Result> findAllResult() {
		return resultRepository.findAll();
	}

	public Optional<Result> findAllByUser(Long userId) {
		return resultRepository.findById(userId);
	}
}
