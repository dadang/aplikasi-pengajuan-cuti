package com.artivisi.aplikasi.pengajuan.cuti.service;

import java.util.List;

import com.artivisi.aplikasi.pengajuan.cuti.EntryCutiReal;
import com.artivisi.aplikasi.pengajuan.cuti.MasterHariLibur;
import com.artivisi.aplikasi.pengajuan.cuti.MasterKonfig;
import com.artivisi.aplikasi.pengajuan.cuti.Pegawai;
import com.artivisi.aplikasi.pengajuan.cuti.PengajuanCuti;

public interface AppService {
	public void savePegawai(Pegawai p);

//service untuk perintah delete
	public void deletePegawai(Pegawai p);

//service untuk mencari 1 daftar pegawai By ID
	public Pegawai findPegawaiById(String id);
	
//service untuk mencari semua daftar pegawai
	public List<Pegawai> findAllPegawai();
	
	public void saveMasterKonfig(MasterKonfig mk);
	
	public MasterKonfig findMasterKonfigById(String id);
	
	public MasterKonfig getKonfig();
	
	public void saveMasterHariLibur(MasterHariLibur mhl);
	
	public void deleteMasterHariLibur(MasterHariLibur mhl);
	
	public MasterHariLibur findMasterHariLiburById(String id);
	
	public List<MasterHariLibur> findAllMasterHariLibur();
	
	public void savePengajuanCuti(PengajuanCuti pc);
	
	public PengajuanCuti findPengajuanCutiById(String id);
	
	public List<PengajuanCuti> findAllPengajuanCuti();
	
	public void saveEntryCutiReal(EntryCutiReal ecr);
	
	public EntryCutiReal findEntryCutiRealById(String id);
	
	public List<EntryCutiReal> findAllEntryCutiReal();
	
	public List<PengajuanCuti> findPengajuanCutiApproved();
	
}