package com.artivisi.aplikasi.pengajuan.cuti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LaporanPengajuanCutiPerPegawaiController {
	
	@RequestMapping("laporan/pengajuanCutiPerPegawai/form")
	public ModelMap formPengajuanCutiPerPegawai() {
		return new ModelMap();
	}

}
