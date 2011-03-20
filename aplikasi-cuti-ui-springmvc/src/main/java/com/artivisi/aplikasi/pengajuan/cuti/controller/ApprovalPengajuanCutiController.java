package com.artivisi.aplikasi.pengajuan.cuti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApprovalPengajuanCutiController {
	
	@RequestMapping("transaksi/approvalPengajuanCuti/list")
	public ModelMap listApprovalPengajuanCuti() {
		return new ModelMap();
	}

}
