package com.artivisi.aplikasi.pengajuan.cuti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HariLiburController {
	
	@RequestMapping("master/hariLibur/form")
	public ModelMap formHariLibur() {
		return new ModelMap();
	}
	
	@RequestMapping("master/hariLibur/list")
	public ModelMap listHariLibur() {
		return new ModelMap();
	}
}
