package com.artivisi.aplikasi.pengajuan.cuti.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.artivisi.aplikasi.pengajuan.cuti.Pegawai;
import com.artivisi.aplikasi.pengajuan.cuti.service.AppService;

@Controller
public class PegawaiController {
	@Autowired private AppService appservice;
	
	
	@RequestMapping("master/pegawai/list")
	public ModelMap listPegawai() {
		return new ModelMap().addAttribute("listPegawai", appservice.findAllPegawai());
	}
	
	@RequestMapping(value="master/pegawai/form", method=RequestMethod.GET)
	public ModelMap formPegawai(@RequestParam(value="id", required=false) String id) {
		//Jika Parameter id == null
		//maka bikin object pegawai baru
		//Jika tidak maka cari pegawai di database berdasarkan parameter id		
		Pegawai p = null;
		if(id==null) {
			p = new Pegawai();
		} else {
			p = appservice.findPegawaiById(id);
		}
		
		//setelah dapat object pegawai maka ditambahkan ke ModelMap		
		ModelMap mm = new ModelMap();
		if(p!=null) {
			mm.addAttribute(p);
		}
		return mm;
	}
	
	//Method untuk simpan data	
	@RequestMapping(value="master/pegawai/form", method=RequestMethod.POST)
	public String process(@Valid Pegawai pegawai, BindingResult result) {
		if(result.hasErrors()) {
			return "master/pegawai/form";
		} else {
			appservice.savePegawai(pegawai);
			return "redirect:list";
		}
	}
	
	//Method untuk delete data
	@RequestMapping(value="master/pegawai/delete", method=RequestMethod.GET)
	public String delete(@RequestParam(value="id", required=true) String id) {
		//Cari pegawai berdasarkan parameter id
		//kalo udah ketemu baru di delete
		Pegawai p = appservice.findPegawaiById(id);
		appservice.deletePegawai(p);
		return "redirect:list";
	}
	
}
