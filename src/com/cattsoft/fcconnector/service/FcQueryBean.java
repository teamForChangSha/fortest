/**
 * FcQueryBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cattsoft.fcconnector.service;

public class FcQueryBean  implements java.io.Serializable {
    private java.lang.String endTime;

    private com.cattsoft.fcconnector.service.PersonBean person;

    private java.lang.String pfType;

    private java.lang.String startTime;

    public FcQueryBean() {
    }

    public FcQueryBean(
           java.lang.String endTime,
           com.cattsoft.fcconnector.service.PersonBean person,
           java.lang.String pfType,
           java.lang.String startTime) {
           this.endTime = endTime;
           this.person = person;
           this.pfType = pfType;
           this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this FcQueryBean.
     * 
     * @return endTime
     */
    public java.lang.String getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this FcQueryBean.
     * 
     * @param endTime
     */
    public void setEndTime(java.lang.String endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the person value for this FcQueryBean.
     * 
     * @return person
     */
    public com.cattsoft.fcconnector.service.PersonBean getPerson() {
        return person;
    }


    /**
     * Sets the person value for this FcQueryBean.
     * 
     * @param person
     */
    public void setPerson(com.cattsoft.fcconnector.service.PersonBean person) {
        this.person = person;
    }


    /**
     * Gets the pfType value for this FcQueryBean.
     * 
     * @return pfType
     */
    public java.lang.String getPfType() {
        return pfType;
    }


    /**
     * Sets the pfType value for this FcQueryBean.
     * 
     * @param pfType
     */
    public void setPfType(java.lang.String pfType) {
        this.pfType = pfType;
    }


    /**
     * Gets the startTime value for this FcQueryBean.
     * 
     * @return startTime
     */
    public java.lang.String getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this FcQueryBean.
     * 
     * @param startTime
     */
    public void setStartTime(java.lang.String startTime) {
        this.startTime = startTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FcQueryBean)) return false;
        FcQueryBean other = (FcQueryBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.person==null && other.getPerson()==null) || 
             (this.person!=null &&
              this.person.equals(other.getPerson()))) &&
            ((this.pfType==null && other.getPfType()==null) || 
             (this.pfType!=null &&
              this.pfType.equals(other.getPfType()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime())));
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
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getPerson() != null) {
            _hashCode += getPerson().hashCode();
        }
        if (getPfType() != null) {
            _hashCode += getPfType().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FcQueryBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.fcconnector.cattsoft.com/", "fcQueryBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("person");
        elemField.setXmlName(new javax.xml.namespace.QName("", "person"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.fcconnector.cattsoft.com/", "personBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pfType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pfType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startTime"));
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
