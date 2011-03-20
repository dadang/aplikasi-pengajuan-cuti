package com.artivisi.aplikasi.pengajuan.cuti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MasterKonfigController {
	
	@RequestMapping("master/konfig/form")
	public ModelMap formKonfig() {
		return new ModelMap();
	}
	
	@RequestMapping("master/konfig/view")
	public ModelMap viewKonfig() {
		return new ModelMap();
	}

}
