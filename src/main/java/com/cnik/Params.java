package com.cnik;

public class Params {
	
	private String pageName="pagename=ASP.brief_default_result_aspx";
	
	private String isinEn="&isinEn=1";
	
	private String dbPrefix="&dbPrefix=SCDB";
	
	private String dbCatalog="&dbCatalog=�й�ѧ��������������ܿ�";
	
	private String ConfigFile="&ConfigFile=SCDBINDEX.xml";
	
	private String rs="&research=off";
	
	private String t="&t=";
	
	private String k_V;
	
	private String KeyValue="&keyValue="+k_V;
	
	private String S="&S=1";
	
	private String sort="&sorttype=";
	
	private String url;

	/*
	 �������� ������ 
	 private String sorttype="(����Ƶ��,'INTEGER')+desc";
	 private String DisplayMode="listmode";
	 
	 ��ض�
	 
	 private String		DisplayMode="listmode";
	 private String		sorttype="(FFD,'RANK')+desc";
	 private String		queryid="13";
	 
	 ����ʱ�䣺
	 
	 private String     sorttype: (����ʱ��,'TIME') desc
     private String     DisplayMode: listmode
	 
	 
	 ����Ƶ��
	 
	 
	 DisplayMode: listmode
	 sorttype: (����Ƶ��,'INTEGER') desc
 	 queryid: 2
	 
	 */
	
	
	public String getUrl() {
		url=this.url+this.pageName+this.isinEn+
				this.dbPrefix+this.dbCatalog+
				this.ConfigFile+this.rs+this.t
				+this.KeyValue+this.S+this.sort;
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getK_V() {
		return k_V;
	}

	public void setK_V(String k_V) {
		this.k_V = k_V;
	}
	
	
	
	
	
}
