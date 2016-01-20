/**
 * FcResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cattsoft.fcconnector.service;

public class FcResult  implements java.io.Serializable {
    private java.lang.String rtCode;

    private java.lang.String rtDesc;

    public FcResult() {
    }

    public FcResult(
           java.lang.String rtCode,
           java.lang.String rtDesc) {
           this.rtCode = rtCode;
           this.rtDesc = rtDesc;
    }


    /**
     * Gets the rtCode value for this FcResult.
     * 
     * @return rtCode
     */
    public java.lang.String getRtCode() {
        return rtCode;
    }


    /**
     * Sets the rtCode value for this FcResult.
     * 
     * @param rtCode
     */
    public void setRtCode(java.lang.String rtCode) {
        this.rtCode = rtCode;
    }


    /**
     * Gets the rtDesc value for this FcResult.
     * 
     * @return rtDesc
     */
    public java.lang.String getRtDesc() {
        return rtDesc;
    }


    /**
     * Sets the rtDesc value for this FcResult.
     * 
     * @param rtDesc
     */
    public void setRtDesc(java.lang.String rtDesc) {
        this.rtDesc = rtDesc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FcResult)) return false;
        FcResult other = (FcResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rtCode==null && other.getRtCode()==null) || 
             (this.rtCode!=null &&
              this.rtCode.equals(other.getRtCode()))) &&
            ((this.rtDesc==null && other.getRtDesc()==null) || 
             (this.rtDesc!=null &&
              this.rtDesc.equals(other.getRtDesc())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRtCode() != null) {
            _hashCode += getRtCode().hashCode();
        }
        if (getRtDesc() != null) {
            _hashCode += getRtDesc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FcResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.fcconnector.cattsoft.com/", "fcResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rtCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rtCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rtDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rtDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
