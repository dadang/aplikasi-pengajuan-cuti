package com.artivisi.aplikasi.pengajuan.cuti.service.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.artivisi.aplikasi.pengajuan.cuti.EntryCutiReal;
import com.artivisi.aplikasi.pengajuan.cuti.MasterHariLibur;
import com.artivisi.aplikasi.pengajuan.cuti.MasterKonfig;
import com.artivisi.aplikasi.pengajuan.cuti.Pegawai;
import com.artivisi.aplikasi.pengajuan.cuti.PengajuanCuti;
import com.artivisi.aplikasi.pengajuan.cuti.service.AppService;

@Transactional
@Service("appService")
public class AppServiceImpl implements AppService {
	@Autowired private SessionFactory sessionFactory;
	
	@Override
	public void savePegawai(Pegawai p) {
		sessionFactory.getCurrentSession().saveOrUpdate(p);
		
	}

	@Override
	public void deletePegawai(Pegawai p) {
		sessionFactory.getCurrentSession().delete(p);
		
	}

	@Override
	public Pegawai findPegawaiById(String id) {
		return (Pegawai) sessionFactory.getCurrentSession()
		.createQuery("From Pegawai p where p.id=:id")
		.setParameter("id", id)
		.uniqueResult();
		
	}

	@Override
	public List<Pegawai> findAllPegawai() {
		return sessionFactory.getCurrentSession()
		.createQuery("From Pegawai p")
		.list();
		
	}

	@Override
	public void saveMasterKonfig(MasterKonfig mk) {
		sessionFactory.getCurrentSession().saveOrUpdate(mk);
		
	}

	@Override
	public MasterKonfig findMasterKonfigById(String id) {
		return (MasterKonfig) sessionFactory.getCurrentSession()
		.createQuery("From MasterKonfig mk where mk.id=:id")
		.setParameter("id", id)
		.uniqueResult();
		
	}

	@Override
	public void saveMasterHariLibur(MasterHariLibur mhl) {
		sessionFactory.getCurrentSession().saveOrUpdate(mhl);
		
	}

	@Override
	public void deleteMasterHariLibur(MasterHariLibur mhl) {
		sessionFactory.getCurrentSession().delete(mhl);
		
	}

	@Override
	public MasterHariLibur findMasterHariLiburById(String id) {
		return (MasterHariLibur) sessionFactory.getCurrentSession()
		.createQuery("From MasterHariLibur mhl where mhl.id=:id")
		.setParameter("id", id)
		.uniqueResult();
		
	}

	@Override
	public List<MasterHariLibur> findAllMasterHariLibur() {
		return sessionFactory.getCurrentSession()
		.createQuery("From MasterHariLibur mhl")
		.list();
		
	}

	@Override
	public void savePengajuanCuti(PengajuanCuti pc) {
		sessionFactory.getCurrentSession().saveOrUpdate(pc);
		
	}

	@Override
	public PengajuanCuti findPengajuanCutiById(String id) {
		return (PengajuanCuti) sessionFactory.getCurrentSession()
		.createQuery("From PengajuanCuti pc where pc.id=:id")
		.setParameter("id", id)
		.uniqueResult();
		
	}

	@Override
	public List<PengajuanCuti> findAllPengajuanCuti() {
		return sessionFactory.getCurrentSession()
		.createQuery("From PengajuanCuti pc")
		.list();
		
	}

	@Override
	public void saveEntryCutiReal(EntryCutiReal ecr) {
		sessionFactory.getCurrentSession().saveOrUpdate(ecr);
		
	}

	@Override
	public EntryCutiReal findEntryCutiRealById(String id) {
		return (EntryCutiReal) sessionFactory.getCurrentSession()
		.createQuery("From EntryCutiReal ecr where ecr.id=:id")
		.setParameter("id", id)
		.uniqueResult();
		
	}

	@Override
	public List<EntryCutiReal> findAllEntryCutiReal() {
		return sessionFactory.getCurrentSession()
		.createQuery("From EntryCutiReal ecr")
		.list();
		
	}

	@Override
	public List<PengajuanCuti> findPengajuanCutiApproved() {
		return sessionFactory.getCurrentSession()
		.createQuery("From PengajuanCuti pc where pc.approve=true")
		.list();
		
	}

	@Override
	public MasterKonfig getKonfig() {
		return (MasterKonfig) sessionFactory.getCurrentSession()
		.createQuery("From MasterKonfig mk")
		.setMaxResults(1)
		.uniqueResult();
	}

}
