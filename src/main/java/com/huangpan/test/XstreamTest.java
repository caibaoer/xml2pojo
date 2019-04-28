package com.huangpan.test;

import com.huangpan.pojo.InsuranceItem;
import com.huangpan.pojo.PolicyFlight;
import com.huangpan.pojo.PolicySchedule;
import com.huangpan.pojo.ResponseBase;
import com.thoughtworks.xstream.XStream;

public class XstreamTest {
	/**
	 * 航联接口返回信息为XML字符串：
<?xml version="1.0" encoding="UTF-8"?><ResponseBase>
  <schedule>
    <ticketNo>7312315702626</ticketNo>
    <transactionCode>TKTS</transactionCode>
    <ticketFare>760.00</ticketFare>
    <currencyType>CNY</currencyType>
    <passengerName>吴春明</passengerName>
    <passengerID>120112198712091313</passengerID>
    <totalPremium>20.0</totalPremium>
    <totalRepay>200.0</totalRepay>
    <insuranceCount>1</insuranceCount>
    <operator>xjpadmin</operator>
    <officeCode>aui098c</officeCode>
    <iataNo>99999999</iataNo>
    <remark></remark>
    <operateTime>20141105165001</operateTime>
    <airlineOrderNo>1410230063580065</airlineOrderNo>
    <ticketType>BSP</ticketType>
    <applicantName>吴春明</applicantName>
    <applicantID>120112198712091313</applicantID>
    <applicantMobile>13598815571</applicantMobile>
    <applicantEmail></applicantEmail>
    <insuredName>吴春明</insuredName>
    <insuredID>120112198712091313</insuredID>
    <insuredMobile>13598815571</insuredMobile>
    <insuredEmail></insuredEmail>
    <cardType></cardType>
    <policyFlights>
      <policyFlight>
        <policyFlightID>8a8637b84964d9cb01497f2575b505e1</policyFlightID>
        <flightOrder>1</flightOrder>
        <carrier>MF</carrier>
        <flightNumber>MF8139</flightNumber>
        <originAirport>TSN</originAirport>
        <destAirport>HAK</destAirport>
        <flightDate>20141126</flightDate>
        <flightTime>0800</flightTime>
        <insuranceItems>
          <insuranceItem>
            <itemID>8a8637b84964d9cb01497f2575b505e3</itemID>
            <itemOrder>0</itemOrder>
            <companyCode>PHDS</companyCode>
            <companyName>中国平安财产保险股份有限公司上海分公司</companyName>
            <premium>20.0</premium>
            <repay>200.0</repay>
            <insuranceCount>0</insuranceCount>
            <benefitorType>4</benefitorType>
            <benefitorName></benefitorName>
            <benefitorID></benefitorID>
            <insuranceProductId>8a8637b8405d8089014095fc83380006</insuranceProductId>
            <productCode>5000001</productCode>
            <insuranceProductName>航班延误险(主)</insuranceProductName>
            <protocolId>99701</protocolId>
            <protocolProductName>航联B2C2小时延误险</protocolProductName>
            <validDate></validDate>
            <invalidDate></invalidDate>
            <remark></remark>
            <insureNo>731231570262610</insureNo>
            <insureDays></insureDays>
            <insuranceInsureNo></insuranceInsureNo>
          </insuranceItem>
        </insuranceItems>
        <flightStatus>OPEN FOR USE</flightStatus>
        <operateTime>20141105165001</operateTime>
      </policyFlight>
    </policyFlights>
  </schedule>
  <result>success</result>
</ResponseBase>	
我们这边接收到该数据之后，想把数据封装到实体类上，那么就需要使用到XStream.jar。	
<dependency>
    <groupId>com.thoughtworks.xstream</groupId>
    <artifactId>xstream</artifactId>
    <version>1.4.10</version>
</dependency>
	 */
	public  static final String  returnXml="<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
			+ "<ResponseBase>\r\n" + 
			"  <schedule>\r\n" + 
			"    <ticketNo>7312315702626</ticketNo>\r\n" + 
			"    <transactionCode>TKTS</transactionCode>\r\n" + 
			"    <ticketFare>760.00</ticketFare>\r\n" + 
			"    <currencyType>CNY</currencyType>\r\n" + 
			"    <passengerName>吴春明</passengerName>\r\n" + 
			"    <passengerID>120112198712091313</passengerID>\r\n" + 
			"    <totalPremium>20.0</totalPremium>\r\n" + 
			"    <totalRepay>200.0</totalRepay>\r\n" + 
			"    <insuranceCount>1</insuranceCount>\r\n" + 
			"    <operator>xjpadmin</operator>\r\n" + 
			"    <officeCode>aui098c</officeCode>\r\n" + 
			"    <iataNo>99999999</iataNo>\r\n" + 
			"    <remark></remark>\r\n" + 
			"    <operateTime>20141105165001</operateTime>\r\n" + 
			"    <airlineOrderNo>1410230063580065</airlineOrderNo>\r\n" + 
			"    <ticketType>BSP</ticketType>\r\n" + 
			"    <applicantName>吴春明</applicantName>\r\n" + 
			"    <applicantID>120112198712091313</applicantID>\r\n" + 
			"    <applicantMobile>13598815571</applicantMobile>\r\n" + 
			"    <applicantEmail></applicantEmail>\r\n" + 
			"    <insuredName>吴春明</insuredName>\r\n" + 
			"    <insuredID>120112198712091313</insuredID>\r\n" + 
			"    <insuredMobile>13598815571</insuredMobile>\r\n" + 
			"    <insuredEmail></insuredEmail>\r\n" + 
			"    <cardType></cardType>\r\n" + 
			"    <policyFlights>\r\n" + 
			"      <policyFlight>\r\n" + 
			"        <policyFlightID>8a8637b84964d9cb01497f2575b505e1</policyFlightID>\r\n" + 
			"        <flightOrder>1</flightOrder>\r\n" + 
			"        <carrier>MF</carrier>\r\n" + 
			"        <flightNumber>MF8139</flightNumber>\r\n" + 
			"        <originAirport>TSN</originAirport>\r\n" + 
			"        <destAirport>HAK</destAirport>\r\n" + 
			"        <flightDate>20141126</flightDate>\r\n" + 
			"        <flightTime>0800</flightTime>\r\n" + 
			"        <insuranceItems>\r\n" + 
			"          <insuranceItem>\r\n" + 
			"            <itemID>8a8637b84964d9cb01497f2575b505e3</itemID>\r\n" + 
			"            <itemOrder>0</itemOrder>\r\n" + 
			"            <companyCode>PHDS</companyCode>\r\n" + 
			"            <companyName>中国平安财产保险股份有限公司上海分公司</companyName>\r\n" + 
			"            <premium>20.0</premium>\r\n" + 
			"            <repay>200.0</repay>\r\n" + 
			"            <insuranceCount>0</insuranceCount>\r\n" + 
			"            <benefitorType>4</benefitorType>\r\n" + 
			"            <benefitorName></benefitorName>\r\n" + 
			"            <benefitorID></benefitorID>\r\n" + 
			"            <insuranceProductId>8a8637b8405d8089014095fc83380006</insuranceProductId>\r\n" + 
			"            <productCode>5000001</productCode>\r\n" + 
			"            <insuranceProductName>航班延误险(主)</insuranceProductName>\r\n" + 
			"            <protocolId>99701</protocolId>\r\n" + 
			"            <protocolProductName>航联B2C2小时延误险</protocolProductName>\r\n" + 
			"            <validDate></validDate>\r\n" + 
			"            <invalidDate></invalidDate>\r\n" + 
			"            <remark></remark>\r\n" + 
			"            <insureNo>731231570262610</insureNo>\r\n" + 
			"            <insureDays></insureDays>\r\n" + 
			"            <insuranceInsureNo></insuranceInsureNo>\r\n" + 
			"          </insuranceItem>\r\n" + 
			"        </insuranceItems>\r\n" + 
			"        <flightStatus>OPEN FOR USE</flightStatus>\r\n" + 
			"        <operateTime>20141105165001</operateTime>\r\n" + 
			"      </policyFlight>\r\n" + 
			"    </policyFlights>\r\n" + 
			"  </schedule>\r\n" + 
			"  <result>success</result>\r\n" + 
			"</ResponseBase>";
	public static void main(String[] args) {
		//1、首先需要把返回报文前面的<?xml version="1.0" encoding="UTF-8"?>使用空字符串替换掉
		String str=returnXml.replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>","");
		//System.out.println(str);
		//2、使用XStream工具类
		XStream xs=new XStream();
		//3、将别名与实体类对应起来:别名就是XML中的类节点名字
		xs.alias("ResponseBase", ResponseBase.class);
		xs.alias("schedule", PolicySchedule.class);//注意：这里的schedule是小写，需要与xml报文里面对应起来。
		xs.alias("policyFlight", PolicyFlight.class);
		xs.alias("insuranceItem", InsuranceItem.class);
		//报文里面的policyFlights   insuranceItems不用管，是集合。
		//4、将字符串类型的xml转换为对象,需要强转
		ResponseBase response=(ResponseBase)xs.fromXML(str);
		System.out.println("转换完成"+response.getResult());
		
		
	}
}
