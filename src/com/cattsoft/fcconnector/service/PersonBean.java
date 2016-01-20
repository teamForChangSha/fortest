/**
 * PersonBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cattsoft.fcconnector.service;

public class PersonBean  extends com.cattsoft.fcconnector.service.FcResult  implements java.io.Serializable {
    private java.lang.String aacID;

    private java.lang.String birthday;

    private java.lang.String groupID;

    private java.lang.String id;

    private java.lang.String idCard;

    private java.lang.String name;

    private java.lang.String phone1;

    private long picCount;

    private long recCount;

    private java.lang.String sex;

    private java.lang.String ssid;

    private java.lang.String timestp;

    public PersonBean() {
    }

    public PersonBean(
           java.lang.String rtCode,
           java.lang.String rtDesc,
           java.lang.String aacID,
           java.lang.String birthday,
           java.lang.String groupID,
           java.lang.String id,
           java.lang.String idCard,
           java.lang.String name,
           java.lang.String phone1,
           long picCount,
           long recCount,
           java.lang.String sex,
           java.lang.String ssid,
           java.lang.String timestp) {
        super(
            rtCode,
            rtDesc);
        this.aacID = aacID;
        this.birthday = birthday;
        this.groupID = groupID;
        this.id = id;
        this.idCard = idCard;
        this.name = name;
        this.phone1 = phone1;
        this.picCount = picCount;
        this.recCount = recCount;
        this.sex = sex;
        this.ssid = ssid;
        this.timestp = timestp;
    }


    /**
     * Gets the aacID value for this PersonBean.
     * 
     * @return aacID
     */
    public java.lang.String getAacID() {
        return aacID;
    }


    /**
     * Sets the aacID value for this PersonBean.
     * 
     * @param aacID
     */
    public void setAacID(java.lang.String aacID) {
        this.aacID = aacID;
    }


    /**
     * Gets the birthday value for this PersonBean.
     * 
     * @return birthday
     */
    public java.lang.String getBirthday() {
        return birthday;
    }


    /**
     * Sets the birthday value for this PersonBean.
     * 
     * @param birthday
     */
    public void setBirthday(java.lang.String birthday) {
        this.birthday = birthday;
    }


    /**
     * Gets the groupID value for this PersonBean.
     * 
     * @return groupID
     */
    public java.lang.String getGroupID() {
        return groupID;
    }


    /**
     * Sets the groupID value for this PersonBean.
     * 
     * @param groupID
     */
    public void setGroupID(java.lang.String groupID) {
        this.groupID = groupID;
    }


    /**
     * Gets the id value for this PersonBean.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this PersonBean.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the idCard value for this PersonBean.
     * 
     * @return idCard
     */
    public java.lang.String getIdCard() {
        return idCard;
    }


    /**
     * Sets the idCard value for this PersonBean.
     * 
     * @param idCard
     */
    public void setIdCard(java.lang.String idCard) {
        this.idCard = idCard;
    }


    /**
     * Gets the name value for this PersonBean.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this PersonBean.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the phone1 value for this PersonBean.
     * 
     * @return phone1
     */
    public java.lang.String getPhone1() {
        return phone1;
    }


    /**
     * Sets the phone1 value for this PersonBean.
     * 
     * @param phone1
     */
    public void setPhone1(java.lang.String phone1) {
        this.phone1 = phone1;
    }


    /**
     * Gets the picCount value for this PersonBean.
     * 
     * @return picCount
     */
    public long getPicCount() {
        return picCount;
    }


    /**
     * Sets the picCount value for this PersonBean.
     * 
     * @param picCount
     */
    public void setPicCount(long picCount) {
        this.picCount = picCount;
    }


    /**
     * Gets the recCount value for this PersonBean.
     * 
     * @return recCount
     */
    public long getRecCount() {
        return recCount;
    }


    /**
     * Sets the recCount value for this PersonBean.
     * 
     * @param recCount
     */
    public void setRecCount(long recCount) {
        this.recCount = recCount;
    }


    /**
     * Gets the sex value for this PersonBean.
     * 
     * @return sex
     */
    public java.lang.String getSex() {
        return sex;
    }


    /**
     * Sets the sex value for this PersonBean.
     * 
     * @param sex
     */
    public void setSex(java.lang.String sex) {
        this.sex = sex;
    }


    /**
     * Gets the ssid value for this PersonBean.
     * 
     * @return ssid
     */
    public java.lang.String getSsid() {
        return ssid;
    }


    /**
     * Sets the ssid value for this PersonBean.
     * 
     * @param ssid
     */
    public void setSsid(java.lang.String ssid) {
        this.ssid = ssid;
    }


    /**
     * Gets the timestp value for this PersonBean.
     * 
     * @return timestp
     */
    public java.lang.String getTimestp() {
        return timestp;
    }


    /**
     * Sets the timestp value for this PersonBean.
     * 
     * @param timestp
     */
    public void setTimestp(java.lang.String timestp) {
        this.timestp = timestp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonBean)) return false;
        PersonBean other = (PersonBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.aacID==null && other.getAacID()==null) || 
             (this.aacID!=null &&
              this.aacID.equals(other.getAacID()))) &&
            ((this.birthday==null && other.getBirthday()==null) || 
             (this.birthday!=null &&
              this.birthday.equals(other.getBirthday()))) &&
            ((this.groupID==null && other.getGroupID()==null) || 
             (this.groupID!=null &&
              this.groupID.equals(other.getGroupID()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.idCard==null && other.getIdCard()==null) || 
             (this.idCard!=null &&
              this.idCard.equals(other.getIdCard()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.phone1==null && other.getPhone1()==null) || 
             (this.phone1!=null &&
              this.phone1.equals(other.getPhone1()))) &&
            this.picCount == other.getPicCount() &&
            this.recCount == other.getRecCount() &&
            ((this.sex==null && other.getSex()==null) || 
             (this.sex!=null &&
              this.sex.equals(other.getSex()))) &&
            ((this.ssid==null && other.getSsid()==null) || 
             (this.ssid!=null &&
              this.ssid.equals(other.getSsid()))) &&
            ((this.timestp==null && other.getTimestp()==null) || 
             (this.timestp!=null &&
              this.timestp.equals(other.getTimestp())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAacID() != null) {
            _hashCode += getAacID().hashCode();
        }
        if (getBirthday() != null) {
            _hashCode += getBirthday().hashCode();
        }
        if (getGroupID() != null) {
            _hashCode += getGroupID().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getIdCard() != null) {
            _hashCode += getIdCard().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPhone1() != null) {
            _hashCode += getPhone1().hashCode();
        }
        _hashCode += new Long(getPicCount()).hashCode();
        _hashCode += new Long(getRecCount()).hashCode();
        if (getSex() != null) {
            _hashCode += getSex().hashCode();
        }
        if (getSsid() != null) {
            _hashCode += getSsid().hashCode();
        }
        if (getTimestp() != null) {
            _hashCode += getTimestp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.fcconnector.cattsoft.com/", "personBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aacID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aacID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthday");
        elemField.setXmlName(new javax.xml.namespace.QName("", "birthday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCard");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("picCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "picCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ssid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timestp"));
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
