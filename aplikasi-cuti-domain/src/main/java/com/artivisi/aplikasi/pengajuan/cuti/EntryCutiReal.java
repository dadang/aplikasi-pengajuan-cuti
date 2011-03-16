package com.artivisi.aplikasi.pengajuan.cuti;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="entry_cuti_real")
public class EntryCutiReal {
	@Id @GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid")
	private String id;
	
	@Column(name="kode", unique=true)
	private String kode;
	
	@ManyToOne
	private Pegawai idPegawai;
	
	@OneToOne
	private PengajuanCuti pengajuanCuti;
	

	@Temporal(TemporalType.DATE)
	@Column(name="tgl_mulai")
	private Date tglMulai;
	
	@Temporal(TemporalType.DATE)
	@Column(name="tgl_selesai")
	private Date tglSelesai;
	
	@Column(name="keterangan")
	private String keterangan;
	
	@Column(name="lama_cuti")
	private Integer lamaCuti;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getKode() {
		return kode;
	}

	public void setKode(String kode) {
		this.kode = kode;
	}

	public Pegawai getIdPegawai() {
		return idPegawai;
	}

	public void setIdPegawai(Pegawai idPegawai) {
		this.idPegawai = idPegawai;
	}

	public Date getTglMulai() {
		return tglMulai;
	}

	public void setTglMulai(Date tglMulai) {
		this.tglMulai = tglMulai;
	}

	public Date getTglSelesai() {
		return tglSelesai;
	}

	public void setTglSelesai(Date tglSelesai) {
		this.tglSelesai = tglSelesai;
	}

	public String getKeterangan() {
		return keterangan;
	}

	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}

	public Integer getLamaCuti() {
		return lamaCuti;
	}

	public void setLamaCuti(Integer lamaCuti) {
		this.lamaCuti = lamaCuti;
	}
	
	public PengajuanCuti getPengajuanCuti() {
		return pengajuanCuti;
	}
	
	public void setPengajuanCuti(PengajuanCuti pengajuanCuti) {
		this.pengajuanCuti = pengajuanCuti;
	}

}
