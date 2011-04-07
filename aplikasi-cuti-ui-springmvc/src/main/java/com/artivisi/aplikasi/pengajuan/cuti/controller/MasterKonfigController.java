package com.artivisi.aplikasi.pengajuan.cuti.controller;

import java.lang.reflect.Method;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.artivisi.aplikasi.pengajuan.cuti.MasterKonfig;
import com.artivisi.aplikasi.pengajuan.cuti.Pegawai;
import com.artivisi.aplikasi.pengajuan.cuti.service.AppService;


@Controller
public class MasterKonfigController {
	@Autowired private AppService appservice;
	
	@RequestMapping(value="master/konfig/form", method=RequestMethod.GET)
	public ModelMap formKonfig(@RequestParam(value="id", required=false) String id) {
		//Jika Parameter id == null
		//maka bikin object konfig baru
		//Jika tidak maka cari konfig di database berdasarkan parameter id		
		MasterKonfig mk = null;
		if(id==null) {
			mk = new MasterKonfig();
		} else {
			mk = appservice.findMasterKonfigById(id);
		}
		
		//setelah dapat object konfig maka ditambahkan ke ModelMap		
		ModelMap mm = new ModelMap();
		if(mk!=null) {
			mm.addAttribute(mk);
		}
		return mm;
	}
	
	//Method untuk simpan data	
	@RequestMapping(value="master/konfig/form", method=RequestMethod.POST)
	public String process(@Valid MasterKonfig konfig, BindingResult result) {
		if(result.hasErrors()) {
			return "master/konfig/form";
		} else {
			appservice.saveMasterKonfig(konfig);
			return "redirect:view";
		}
	}
	
	@RequestMapping("master/konfig/view")
	public ModelMap viewKonfig() {
		return new ModelMap().addAttribute("konfig", appservice.getKonfig());
	}

}
