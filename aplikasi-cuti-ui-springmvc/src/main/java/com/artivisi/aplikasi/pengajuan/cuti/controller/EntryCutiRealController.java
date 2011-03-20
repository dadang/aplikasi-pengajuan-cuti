package com.artivisi.aplikasi.pengajuan.cuti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EntryCutiRealController {
	
	@RequestMapping("transaksi/entryCutiReal/form")
	public ModelMap formEntryCutiReal() {
		return new ModelMap();
	}
	
	@RequestMapping("transaksi/entryCutiReal/list")
	public ModelMap listEntryCutiReal() {
		return new ModelMap();
	}

}
