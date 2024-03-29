package com.tyss.talenthunt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.talenthunt.dao.AddRequirmentDAO;
import com.tyss.talenthunt.dto.AddRequirment;
import com.tyss.talenthunt.dto.CandidateCreation;

@Service
public class AddRequirmentServiceImpl implements AddRequirmentServiceInterface{
@Autowired
	private AddRequirmentDAO dao;
	@Override
	public AddRequirment addrequirement(AddRequirment reqinfo) {
	
		return dao.addrequirement(reqinfo);
	}

	@Override
	public boolean updateRequirment(AddRequirment reqinfo) {
		return dao.updateRequirment(reqinfo);
	}

	@Override
	public List<AddRequirment> getAllRequirements() {
		return dao.getAllRequirements();
	}

	@Override
	public CandidateCreation addCandidate(CandidateCreation candidateInfo) {
		return dao.addCandidate(candidateInfo);
	}

	@Override
	public List<CandidateCreation> getAllCandidate() {
		return dao.getCandidate();
	}
	

}
