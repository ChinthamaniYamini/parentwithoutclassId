package com.g3.spc.service;

import java.util.List;

import com.g3.spc.entities.Concern;
import com.g3.spc.entities.Parent;

public interface IConcernService {
	public Concern addConcern(Concern concern);
	public Concern updateConcern(Concern concern);
	public List<Concern> retrieveAllConcerns();
	public List<Concern> retrieveAllConcernsByParentId(int parentId);
	public List<Concern> retrieveAllUnResolvedConcerns();
    public List<Concern> retrieveAllUnResolvedConcernsByParentId(int parentId);
//	
//	
	
}
