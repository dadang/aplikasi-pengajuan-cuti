package com.artivisi.aplikasi.pengajuan.cuti;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="m_konfig")
public class MasterKonfig {
	@Id @GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid")
	private String id;
	
	@Column(name="cuti_pertahun")
	private String cutiPertahun;
	
	@Column(name="hangus_pertanggal")
	private String hangusPertanggal;
	
	@Column(name="maks_cuti")
	private String maksCuti;
	
	@Column(name="cuti_selanjutnya_setelah")
	private String cutiSelanjutnyaSetelah;
	
	@Column(name="min_pengajuan_sebelum")
	private String minPengajuanSebelum;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCutiPertahun() {
		return cutiPertahun;
	}

	public void setCutiPertahun(String cutiPertahun) {
		this.cutiPertahun = cutiPertahun;
	}

	public String getHangusPertanggal() {
		return hangusPertanggal;
	}

	public void setHangusPertanggal(String hangusPertanggal) {
		this.hangusPertanggal = hangusPertanggal;
	}

	public String getMaksCuti() {
		return maksCuti;
	}

	public void setMaksCuti(String maksCuti) {
		this.maksCuti = maksCuti;
	}

	public String getCutiSelanjutnyaSetelah() {
		return cutiSelanjutnyaSetelah;
	}

	public void setCutiSelanjutnyaSetelah(String cutiSelanjutnyaSetelah) {
		this.cutiSelanjutnyaSetelah = cutiSelanjutnyaSetelah;
	}

	public String getMinPengajuanSebelum() {
		return minPengajuanSebelum;
	}

	public void setMinPengajuanSebelum(String minPengajuanSebelum) {
		this.minPengajuanSebelum = minPengajuanSebelum;
	}
	
}
