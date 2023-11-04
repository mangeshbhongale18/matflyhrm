package com.project.matflyhrm.dao;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.matflyhrm.model.permission;
import com.project.matflyhrm.repo.permissionRepo;
import com.project.matflyhrm.service.permissionService;

@Service
public class permissionDao implements permissionService {
	
	@Autowired
	permissionRepo pr;

	@Override
	public void saveOrUpdatePermission(permission p) {
		
		permission existingpermissions=pr.findByEmpid(p.getEmpid());
		if (existingpermissions!=null) {
			existingpermissions.setPermissionstatus(p.getPermissionstatus());
			pr.save(existingpermissions);
			
		}
		else {
			pr.save(p);
		}
		
	}

	

	
}
