/**
 * PersonPicBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cattsoft.fcconnector.service;

public class PersonPicBean  extends com.cattsoft.fcconnector.service.FcResult  implements java.io.Serializable {
    private java.lang.String code;

    private java.lang.String groupID;

    private java.lang.String id;

    private java.lang.String personSSID;

    private long picIdx;

    private java.lang.String picture;

    private java.lang.String thumbnail;

    private java.lang.String timestp;

    private java.lang.String uuID;

    private java.lang.String videoID;

    public PersonPicBean() {
    }

    public PersonPicBean(
           java.lang.String rtCode,
           java.lang.String rtDesc,
           java.lang.String code,
           java.lang.String groupID,
           java.lang.String id,
           java.lang.String personSSID,
           long picIdx,
           java.lang.String picture,
           java.lang.String thumbnail,
           java.lang.String timestp,
           java.lang.String uuID,
           java.lang.String videoID) {
        super(
            rtCode,
            rtDesc);
        this.code = code;
        this.groupID = groupID;
        this.id = id;
        this.personSSID = personSSID;
        this.picIdx = picIdx;
        this.picture = picture;
        this.thumbnail = thumbnail;
        this.timestp = timestp;
        this.uuID = uuID;
        this.videoID = videoID;
    }


    /**
     * Gets the code value for this PersonPicBean.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this PersonPicBean.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the groupID value for this PersonPicBean.
     * 
     * @return groupID
     */
    public java.lang.String getGroupID() {
        return groupID;
    }


    /**
     * Sets the groupID value for this PersonPicBean.
     * 
     * @param groupID
     */
    public void setGroupID(java.lang.String groupID) {
        this.groupID = groupID;
    }


    /**
     * Gets the id value for this PersonPicBean.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this PersonPicBean.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the personSSID value for this PersonPicBean.
     * 
     * @return personSSID
     */
    public java.lang.String getPersonSSID() {
        return personSSID;
    }


    /**
     * Sets the personSSID value for this PersonPicBean.
     * 
     * @param personSSID
     */
    public void setPersonSSID(java.lang.String personSSID) {
        this.personSSID = personSSID;
    }


    /**
     * Gets the picIdx value for this PersonPicBean.
     * 
     * @return picIdx
     */
    public long getPicIdx() {
        return picIdx;
    }


    /**
     * Sets the picIdx value for this PersonPicBean.
     * 
     * @param picIdx
     */
    public void setPicIdx(long picIdx) {
        this.picIdx = picIdx;
    }


    /**
     * Gets the picture value for this PersonPicBean.
     * 
     * @return picture
     */
    public java.lang.String getPicture() {
        return picture;
    }


    /**
     * Sets the picture value for this PersonPicBean.
     * 
     * @param picture
     */
    public void setPicture(java.lang.String picture) {
        this.picture = picture;
    }


    /**
     * Gets the thumbnail value for this PersonPicBean.
     * 
     * @return thumbnail
     */
    public java.lang.String getThumbnail() {
        return thumbnail;
    }


    /**
     * Sets the thumbnail value for this PersonPicBean.
     * 
     * @param thumbnail
     */
    public void setThumbnail(java.lang.String thumbnail) {
        this.thumbnail = thumbnail;
    }


    /**
     * Gets the timestp value for this PersonPicBean.
     * 
     * @return timestp
     */
    public java.lang.String getTimestp() {
        return timestp;
    }


    /**
     * Sets the timestp value for this PersonPicBean.
     * 
     * @param timestp
     */
    public void setTimestp(java.lang.String timestp) {
        this.timestp = timestp;
    }


    /**
     * Gets the uuID value for this PersonPicBean.
     * 
     * @return uuID
     */
    public java.lang.String getUuID() {
        return uuID;
    }


    /**
     * Sets the uuID value for this PersonPicBean.
     * 
     * @param uuID
     */
    public void setUuID(java.lang.String uuID) {
        this.uuID = uuID;
    }


    /**
     * Gets the videoID value for this PersonPicBean.
     * 
     * @return videoID
     */
    public java.lang.String getVideoID() {
        return videoID;
    }


    /**
     * Sets the videoID value for this PersonPicBean.
     * 
     * @param videoID
     */
    public void setVideoID(java.lang.String videoID) {
        this.videoID = videoID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonPicBean)) return false;
        PersonPicBean other = (PersonPicBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.groupID==null && other.getGroupID()==null) || 
             (this.groupID!=null &&
              this.groupID.equals(other.getGroupID()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.personSSID==null && other.getPersonSSID()==null) || 
             (this.personSSID!=null &&
              this.personSSID.equals(other.getPersonSSID()))) &&
            this.picIdx == other.getPicIdx() &&
            ((this.picture==null && other.getPicture()==null) || 
             (this.picture!=null &&
              this.picture.equals(other.getPicture()))) &&
            ((this.thumbnail==null && other.getThumbnail()==null) || 
             (this.thumbnail!=null &&
              this.thumbnail.equals(other.getThumbnail()))) &&
            ((this.timestp==null && other.getTimestp()==null) || 
             (this.timestp!=null &&
              this.timestp.equals(other.getTimestp()))) &&
            ((this.uuID==null && other.getUuID()==null) || 
             (this.uuID!=null &&
              this.uuID.equals(other.getUuID()))) &&
            ((this.videoID==null && other.getVideoID()==null) || 
             (this.videoID!=null &&
              this.videoID.equals(other.getVideoID())));
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
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getGroupID() != null) {
            _hashCode += getGroupID().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getPersonSSID() != null) {
            _hashCode += getPersonSSID().hashCode();
        }
        _hashCode += new Long(getPicIdx()).hashCode();
        if (getPicture() != null) {
            _hashCode += getPicture().hashCode();
        }
        if (getThumbnail() != null) {
            _hashCode += getThumbnail().hashCode();
        }
        if (getTimestp() != null) {
            _hashCode += getTimestp().hashCode();
        }
        if (getUuID() != null) {
            _hashCode += getUuID().hashCode();
        }
        if (getVideoID() != null) {
            _hashCode += getVideoID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonPicBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.fcconnector.cattsoft.com/", "personPicBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "code"));
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
        elemField.setFieldName("personSSID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "personSSID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("picIdx");
        elemField.setXmlName(new javax.xml.namespace.QName("", "picIdx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("picture");
        elemField.setXmlName(new javax.xml.namespace.QName("", "picture"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thumbnail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "thumbnail"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uuID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "videoID"));
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
