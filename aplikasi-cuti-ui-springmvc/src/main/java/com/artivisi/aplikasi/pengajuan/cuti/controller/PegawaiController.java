package com.artivisi.aplikasi.pengajuan.cuti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.artivisi.aplikasi.pengajuan.cuti.service.AppService;

@Controller
public class PegawaiController {
	@Autowired AppService appservice;
	
	
	@RequestMapping("master/pegawai/list")
	public ModelMap listPegawai() {
		return new ModelMap().addAttribute("listPegawai", appservice.findAllPegawai());
	}
	
	@RequestMapping("master/pegawai/form")
	public ModelMap formPegawai() {
		return new ModelMap();
	}
	
}
