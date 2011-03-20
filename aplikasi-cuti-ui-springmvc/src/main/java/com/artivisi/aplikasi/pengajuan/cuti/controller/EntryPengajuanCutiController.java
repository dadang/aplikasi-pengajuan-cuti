package com.artivisi.aplikasi.pengajuan.cuti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EntryPengajuanCutiController {
	
	@RequestMapping("transaksi/entryPengajuanCuti/form")
	public ModelMap formEntryPengajuanCuti() {
		return new ModelMap();
	}

}
