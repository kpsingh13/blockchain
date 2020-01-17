package noobchain;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.cfg.Configuration;

import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name="admin_pers_mast")

public class Userdetail {
 
	@Id
	@Column(name="emp_code")
	public int empcode;
	
	@Column(name="desg_code")
	public int desigcode;
	
	@Column(name="div_code")
	public String divcode;
	
	@Column(name="cadre_service_no")
	public String cadreserviceno;
	
	@Column(name="cadre_service")
	public String cadreservice;
	
	@Column(name="emp_title")
	public String emptitle;
	
	@Column(name="emp_name")
	public String empname;
	
	@Column(name="full_name")
	public String fullname;
	
	@Column(name="emp_sname")
	public String empsname;
	
	@Column(name="sur_chg_date")
	public String surchgdate;
	
	@Column(name="proj_code")
	public String projcode;
	
	@Column(name="join_govt")
	public String joingovt;
	
	@Column(name="join_nic")
	public String joinnic;
	
	@Column(name="ro_code")
	public String ro_code;
	
	@Column(name="dio_flag")
	public String dioflag;
	
	@Column(name="emp_status")
	public String empstatus;
	
	@Column(name="st_date")
	public String stdate;
	
	@Column(name="st_ord")
	public String stord;
	
	@Column(name="st_ord_date")
	public String storddate;
	
	@Column(name="retire_date")
	public String retiredate;
	
	@Column(name="jdate_pre_div")
	public String jdateprediv;
	
	@Column(name="unique_id")
	public String uniqueid;
	
	@Column(name="status_change_draft")
	public String statuschangedraft;
	
	@Column(name="emp_name_hindi")
	public String empnamehindi;
	
	@Column(name="inopr_post")
	public String inoprpost;
	
	@Column(name="posting_date")
	public String postingdate;
	
	@Column(name="superannuation_date")
	public String superannuationdate;
	
	@Column(name="fcs")
	public String fcs;
	
	@Column(name="dout_flag")
	public String doutflag;
	
	@Column(name="ndc_flag")
	public String ndcflag;
	
	@Column(name="sdc")
	public String sdc;
	
	@Column(name="rocode")
	public int rocode;
	
	@Column(name="core_central")
	public String corecentral;
	
	@Column(name="action_by")
	public int actionby;
	
	@Column(name="old_fcs")
	public String oldfcs;
	
	@Column(name="service_book_state")
	public String servicebookstate;
	
	@Column(name="emp_name_hindi_title")
	public String empnamehindititle;
	
	@Column(name="emp_name_hindi_name")
	public String empnamehindiname;
	
	@Column(name="st_signed_by")
	public int stsignedby;
	
	@Column(name="name_verify_hindi")
	public int nameverifyhindi;
	
	@Column(name="name_verify_by")
	public int nameverifyby;
	
	@Column(name="name_verify_by_date")
	public String nameverifybydate;
	
	@Column(name="name_verify_by_ip")
	public String nameverifybyip;
	public Userdetail() {
		
		//constructor using fields
	}
	public Userdetail(int desigcode, String divcode, String cadreserviceno, String cadreservice, String emptitle,
			String empname, String fullname, String empsname, String surchgdate, String projcode, String joingovt,
			String joinnic, String ro_code, String dioflag, String empstatus, String stdate, String stord,
			String storddate, String retiredate, String jdateprediv, String uniqueid, String statuschangedraft,
			String empnamehindi, String inoprpost, String postingdate, String superannuationdate, String fcs,
			String doutflag, String ndcflag, String sdc, int rocode, String corecentral, int actionby, String oldfcs,
			String servicebookstate, String empnamehindititle, String empnamehindiname, int stsignedby,
			int nameverifyhindi, int nameverifyby, String nameverifybydate, String nameverifybyip) {
		//super();
		this.desigcode = desigcode;
		this.divcode = divcode;
		this.cadreserviceno = cadreserviceno;
		this.cadreservice = cadreservice;
		this.emptitle = emptitle;
		this.empname = empname;
		this.fullname = fullname;
		this.empsname = empsname;
		this.surchgdate = surchgdate;
		this.projcode = projcode;
		this.joingovt = joingovt;
		this.joinnic = joinnic;
		this.ro_code = ro_code;
		this.dioflag = dioflag;
		this.empstatus = empstatus;
		this.stdate = stdate;
		this.stord = stord;
		this.storddate = storddate;
		this.retiredate = retiredate;
		this.jdateprediv = jdateprediv;
		this.uniqueid = uniqueid;
		this.statuschangedraft = statuschangedraft;
		this.empnamehindi = empnamehindi;
		this.inoprpost = inoprpost;
		this.postingdate = postingdate;
		this.superannuationdate = superannuationdate;
		this.fcs = fcs;
		this.doutflag = doutflag;
		this.ndcflag = ndcflag;
		this.sdc = sdc;
		this.rocode = rocode;
		this.corecentral = corecentral;
		this.actionby = actionby;
		this.oldfcs = oldfcs;
		this.servicebookstate = servicebookstate;
		this.empnamehindititle = empnamehindititle;
		this.empnamehindiname = empnamehindiname;
		this.stsignedby = stsignedby;
		this.nameverifyhindi = nameverifyhindi;
		this.nameverifyby = nameverifyby;
		this.nameverifybydate = nameverifybydate;
		this.nameverifybyip = nameverifybyip;
	}
	
	//getters and setters
	public int getEmpcode() {
		return empcode;
	}
	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}
	public int getDesigcode() {
		return desigcode;
	}
	public void setDesigcode(int desigcode) {
		this.desigcode = desigcode;
	}
	public String getDivcode() {
		return divcode;
	}
	public void setDivcode(String divcode) {
		this.divcode = divcode;
	}
	public String getCadreserviceno() {
		return cadreserviceno;
	}
	public void setCadreserviceno(String cadreserviceno) {
		this.cadreserviceno = cadreserviceno;
	}
	public String getCadreservice() {
		return cadreservice;
	}
	public void setCadreservice(String cadreservice) {
		this.cadreservice = cadreservice;
	}
	public String getEmptitle() {
		return emptitle;
	}
	public void setEmptitle(String emptitle) {
		this.emptitle = emptitle;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmpsname() {
		return empsname;
	}
	public void setEmpsname(String empsname) {
		this.empsname = empsname;
	}
	public String getSurchgdate() {
		return surchgdate;
	}
	public void setSurchgdate(String surchgdate) {
		this.surchgdate = surchgdate;
	}
	public String getProjcode() {
		return projcode;
	}
	public void setProjcode(String projcode) {
		this.projcode = projcode;
	}
	public String getJoingovt() {
		return joingovt;
	}
	public void setJoingovt(String joingovt) {
		this.joingovt = joingovt;
	}
	public String getJoinnic() {
		return joinnic;
	}
	public void setJoinnic(String joinnic) {
		this.joinnic = joinnic;
	}
	public String getRo_code() {
		return ro_code;
	}
	public void setRo_code(String ro_code) {
		this.ro_code = ro_code;
	}
	public String getDioflag() {
		return dioflag;
	}
	public void setDioflag(String dioflag) {
		this.dioflag = dioflag;
	}
	public String getEmpstatus() {
		return empstatus;
	}
	public void setEmpstatus(String empstatus) {
		this.empstatus = empstatus;
	}
	public String getStdate() {
		return stdate;
	}
	public void setStdate(String stdate) {
		this.stdate = stdate;
	}
	public String getStord() {
		return stord;
	}
	public void setStord(String stord) {
		this.stord = stord;
	}
	public String getStorddate() {
		return storddate;
	}
	public void setStorddate(String storddate) {
		this.storddate = storddate;
	}
	public String getRetiredate() {
		return retiredate;
	}
	public void setRetiredate(String retiredate) {
		this.retiredate = retiredate;
	}
	public String getJdateprediv() {
		return jdateprediv;
	}
	public void setJdateprediv(String jdateprediv) {
		this.jdateprediv = jdateprediv;
	}
	public String getUniqueid() {
		return uniqueid;
	}
	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}
	public String getStatuschangedraft() {
		return statuschangedraft;
	}
	public void setStatuschangedraft(String statuschangedraft) {
		this.statuschangedraft = statuschangedraft;
	}
	public String getEmpnamehindi() {
		return empnamehindi;
	}
	public void setEmpnamehindi(String empnamehindi) {
		this.empnamehindi = empnamehindi;
	}
	public String getInoprpost() {
		return inoprpost;
	}
	public void setInoprpost(String inoprpost) {
		this.inoprpost = inoprpost;
	}
	public String getPostingdate() {
		return postingdate;
	}
	public void setPostingdate(String postingdate) {
		this.postingdate = postingdate;
	}
	public String getSuperannuationdate() {
		return superannuationdate;
	}
	public void setSuperannuationdate(String superannuationdate) {
		this.superannuationdate = superannuationdate;
	}
	public String getFcs() {
		return fcs;
	}
	public void setFcs(String fcs) {
		this.fcs = fcs;
	}
	public String getDoutflag() {
		return doutflag;
	}
	public void setDoutflag(String doutflag) {
		this.doutflag = doutflag;
	}
	public String getNdcflag() {
		return ndcflag;
	}
	public void setNdcflag(String ndcflag) {
		this.ndcflag = ndcflag;
	}
	public String getSdc() {
		return sdc;
	}
	public void setSdc(String sdc) {
		this.sdc = sdc;
	}
	public int getRocode() {
		return rocode;
	}
	public void setRocode(int rocode) {
		this.rocode = rocode;
	}
	public String getCorecentral() {
		return corecentral;
	}
	public void setCorecentral(String corecentral) {
		this.corecentral = corecentral;
	}
	public int getActionby() {
		return actionby;
	}
	public void setActionby(int actionby) {
		this.actionby = actionby;
	}
	public String getOldfcs() {
		return oldfcs;
	}
	public void setOldfcs(String oldfcs) {
		this.oldfcs = oldfcs;
	}
	public String getServicebookstate() {
		return servicebookstate;
	}
	public void setServicebookstate(String servicebookstate) {
		this.servicebookstate = servicebookstate;
	}
	public String getEmpnamehindititle() {
		return empnamehindititle;
	}
	public void setEmpnamehindititle(String empnamehindititle) {
		this.empnamehindititle = empnamehindititle;
	}
	public String getEmpnamehindiname() {
		return empnamehindiname;
	}
	public void setEmpnamehindiname(String empnamehindiname) {
		this.empnamehindiname = empnamehindiname;
	}
	public int getStsignedby() {
		return stsignedby;
	}
	public void setStsignedby(int stsignedby) {
		this.stsignedby = stsignedby;
	}
	public int getNameverifyhindi() {
		return nameverifyhindi;
	}
	public void setNameverifyhindi(int nameverifyhindi) {
		this.nameverifyhindi = nameverifyhindi;
	}
	public int getNameverifyby() {
		return nameverifyby;
	}
	public void setNameverifyby(int nameverifyby) {
		this.nameverifyby = nameverifyby;
	}
	public String getNameverifybydate() {
		return nameverifybydate;
	}
	public void setNameverifybydate(String nameverifybydate) {
		this.nameverifybydate = nameverifybydate;
	}
	public String getNameverifybyip() {
		return nameverifybyip;
	}
	public void setNameverifybyip(String nameverifybyip) {
		this.nameverifybyip = nameverifybyip;
	}
	
	//generate to string
	@Override
	public String toString() {
		return "Userdetail [empcode=" + empcode + ", desigcode=" + desigcode + ", divcode=" + divcode
				+ ", cadreserviceno=" + cadreserviceno + ", cadreservice=" + cadreservice + ", emptitle=" + emptitle
				+ ", empname=" + empname + ", fullname=" + fullname + ", empsname=" + empsname + ", surchgdate="
				+ surchgdate + ", projcode=" + projcode + ", joingovt=" + joingovt + ", joinnic=" + joinnic
				+ ", ro_code=" + ro_code + ", dioflag=" + dioflag + ", empstatus=" + empstatus + ", stdate=" + stdate
				+ ", stord=" + stord + ", storddate=" + storddate + ", retiredate=" + retiredate + ", jdateprediv="
				+ jdateprediv + ", uniqueid=" + uniqueid + ", statuschangedraft=" + statuschangedraft
				+ ", empnamehindi=" + empnamehindi + ", inoprpost=" + inoprpost + ", postingdate=" + postingdate
				+ ", superannuationdate=" + superannuationdate + ", fcs=" + fcs + ", doutflag=" + doutflag
				+ ", ndcflag=" + ndcflag + ", sdc=" + sdc + ", rocode=" + rocode + ", corecentral=" + corecentral
				+ ", actionby=" + actionby + ", oldfcs=" + oldfcs + ", servicebookstate=" + servicebookstate
				+ ", empnamehindititle=" + empnamehindititle + ", empnamehindiname=" + empnamehindiname
				+ ", stsignedby=" + stsignedby + ", nameverifyhindi=" + nameverifyhindi + ", nameverifyby="
				+ nameverifyby + ", nameverifybydate=" + nameverifybydate + ", nameverifybyip=" + nameverifybyip + "]";
	}
	
	
	
	
	
	
}
