<wsdl:definitions targetNamespace="http://tempuri.org/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:tns="http://tempuri.org/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
    <wsdl:types>
        <s:schema elementFormDefault="qualified" targetNamespace="http://tempuri.org/">
            <s:element name="GetDuyurular_XML">
                <s:complexType/>
            </s:element>
            <s:element name="GetDuyurular_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetDuyurular_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetDuyurular_json">
                <s:complexType/>
            </s:element>
            <s:element name="GetDuyurular_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetDuyurular_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
        </s:schema>
    </wsdl:types>
    <wsdl:message name="GetDuyurular_XMLSoapIn">
        <wsdl:part element="tns:GetDuyurular_XML" name="parameters"/>
    </wsdl:message>
    <wsdl:message name="GetDuyurular_XMLSoapOut">
        <wsdl:part element="tns:GetDuyurular_XMLResponse" name="parameters"/>
    </wsdl:message>
    <wsdl:message name="GetDuyurular_jsonSoapIn">
        <wsdl:part element="tns:GetDuyurular_json" name="parameters"/>
    </wsdl:message>
    <wsdl:message name="GetDuyurular_jsonSoapOut">
        <wsdl:part element="tns:GetDuyurular_jsonResponse" name="parameters"/>
    </wsdl:message>
    <wsdl:portType name="DuyurularSoap">
        <wsdl:operation name="GetDuyurular_XML">
            <wsdl:input message="tns:GetDuyurular_XMLSoapIn"/>
            <wsdl:output message="tns:GetDuyurular_XMLSoapOut"/>
        </wsdl:operation>
        <wsdl:operation name="GetDuyurular_json">
            <wsdl:input message="tns:GetDuyurular_jsonSoapIn"/>
            <wsdl:output message="tns:GetDuyurular_jsonSoapOut"/>
        </wsdl:operation>
    </wsdl:portType>
    <wsdl:binding name="DuyurularSoap" type="tns:DuyurularSoap">
        <soap:binding transport="http://schemas.xmlsoap.org/soap/http"/>
        <wsdl:operation name="GetDuyurular_XML">
            <soap:operation soapAction="http://tempuri.org/GetDuyurular_XML" style="document"/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="GetDuyurular_json">
            <soap:operation soapAction="http://tempuri.org/GetDuyurular_json" style="document"/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
    </wsdl:binding>
    
    <wsdl:service name="Duyurular">
        <wsdl:port binding="tns:DuyurularSoap" name="DuyurularSoap">
            <soap:address location="https://api.ibb.gov.tr/iett/UlasimDinamikVeri/Duyurular.asmx"/>
        </wsdl:port>
    </wsdl:service>
</wsdl:definitions>