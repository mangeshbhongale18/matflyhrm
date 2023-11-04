package com.project.matflyhrm.service;

import com.project.matflyhrm.model.clientinfo;

public interface clientinfoService {

	void saveclientinfo(clientinfo ci);
	long totalactiveclinet(String clientstatus);
	long allclinets();
}
