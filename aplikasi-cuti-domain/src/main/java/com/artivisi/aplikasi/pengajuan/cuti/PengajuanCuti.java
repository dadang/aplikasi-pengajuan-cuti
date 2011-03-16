package com.artivisi.aplikasi.pengajuan.cuti;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="m_pegawai")
public class PengajuanCuti {
	@Id @GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid",strategy="uuid")
	private String id;

//ini untuk relasi ke tabel lain
	@ManyToOne
	private Pegawai idPegawai;
	
	@Temporal(TemporalType.DATE)
	@Column(name="tgl_mulai_cuti")
	private Date tglMulaiCuti;
	
	@Temporal(TemporalType.DATE)
	@Column(name="tgl_selesai_cuti")
	private Date tglSelesaiCuti;

	@Column(name="keterangan")
	private String keterangan;
	
//ini untuk membuat nilai angka
	@Column(name="lama_cuti")
	private Integer lamaCuti;

//ini untuk membuat flag "TRUE or FALSE"
	@Column(name="approve")
	private Boolean approve=Boolean.FALSE;
	
	@Temporal(TemporalType.DATE)
	@Column(name="tgl_approve")
	private Date tglApprove;
	
//ini untuk membuat tanggal
	@Temporal(TemporalType.DATE)
	@Column(name="tgl_pengajuan")
	private Date tglPengajuan;
	
	
	public Boolean getApprove() {
		return approve;
	}

	public void setApprove(Boolean approve) {
		this.approve = approve;
	}

	public Date getTglApprove() {
		return tglApprove;
	}

	public void setTglApprove(Date tglApprove) {
		this.tglApprove = tglApprove;
	}

	public Date getTglPengajuan() {
		return tglPengajuan;
	}

	public void setTglPengajuan(Date tglPengajuan) {
		this.tglPengajuan = tglPengajuan;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Pegawai getIdPegawai() {
		return idPegawai;
	}

	public void setIdPegawai(Pegawai idPegawai) {
		this.idPegawai = idPegawai;
	}
	
	public Date getTglMulaiCuti() {
		return tglMulaiCuti;
	}

	public void setTglMulaiCuti(Date tglMulaiCuti) {
		this.tglMulaiCuti = tglMulaiCuti;
	}

	public Date getTglSelesaiCuti() {
		return tglSelesaiCuti;
	}

	public void setTglSelesaiCuti(Date tglSelesaiCuti) {
		this.tglSelesaiCuti = tglSelesaiCuti;
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
	
}
