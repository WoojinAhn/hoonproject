	package com.zebra.common;

import com.zebra.business.craw.domain.ExpPattenBO;
import com.zebra.common.util.PattenUtil;

public class BaseConstants {
	
		//고정값
	
		public static final String	CRAWL_STORAGE_FOLDER = "d:\\crawlStorage\\";
		public static final String	CRAWL_AGENT = "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/34.0.1847.116 Safari/537.36";
		public static final String	SPLIT_REG = "@";
		// 패턴 타입 CD000
		public static final String	PT			= "CD000";		// 패턴 타입 C
		public static final String	PT_REGEXP 	= 	"PT_01"; 	//	정규식 패턴
		public static final String  PT_HTML_SEL	= 	"PT_02";	//  html select 값
	
		// 패턴종류 CD001
		public static final String PK			= "CD001";	// 패턴종류
		public static final String PK_VISIT_URL_PATTEN		= "PK_010";		// 방문URL 패턴
		public static final String PK_VISIT_SITE_PATTEN 	= "PK_020"; 	// 방문사이트 패턴
		public static final String PK_GOODS_URL_PATTEN 		= "PK_030"; 	// 상품URL
		public static final String PK_GOODS_NO_PATTEN 		= "PK_040";		// 상품번호 만 뽑아오는 패턴
		public static final String PK_GOODS_NAME_PATTEN 	= "PK_050"; 	// 파싱한 페이지 내의 상품명 패턴
		public static final String PK_GOODS_PRICE_PATTEN	= "PK_060"; 	// 파싱한 페이지 내의 상품판매가 패턴
		public static final String PK_GOODS_IMG_PATTEN		= "PK_070"; 	// 파싱한 페이지 내의 상품 이미지 패턴
		public static final String PK_CATE1_PATTEN 			= "PK_080";	 	// 파싱한 페이지 내의 대카 패턴
		public static final String PK_CATE2_PATTEN  		= "PK_090";		// 파싱한 페이지 내의 중카 패턴
		public static final String PK_CATE3_PATTEN  		= "PK_100"; 	// 파싱한 페이지 내의 소카 패턴
		public static final String PK_GOODS_DISC_PATTEN  	= "PK_110"; 	// 할인율
		public static final String PK_GOODS_ISBUY_PATTEN  	= "PK_120"; 	// 구매버튼 패턴(구매가능여부)
		
		//상태코드 CD002
		public static final String ST		= "CD002"; // 상태코드
		public static final String ST_FIRST	="01";	//접수
		public static final String ST_OK	="02"; 	//완료
		public static final String ST_END   ="03";   //중지  
		public static final String ST_DEL   ="04";   //삭제  
		
		// 가격동향 CD003
		public static final String PRICE_CODE		="CD003"; //가격동향
		public static final String PRICE_CODE_THIS	="01";	//현재
		public static final String PRICE_CODE_LOW	="02";	//최저
		public static final String PRICE_CODE_MAX	="03";	//최고
		public static final String PRICE_CODE_AVE	="04";	//평균

}

