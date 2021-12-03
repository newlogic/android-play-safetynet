package com.example.android.common.service;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Attestation {

    @SerializedName("apkCertificateDigestSha256")
    @Expose
    private List<String> apkCertificateDigestSha256 = null;
    @SerializedName("apkDigestSha256")
    @Expose
    private String apkDigestSha256;
    @SerializedName("apkPackageName")
    @Expose
    private String apkPackageName;
    @SerializedName("basicIntegrity")
    @Expose
    private Boolean basicIntegrity;
    @SerializedName("ctsProfileMatch")
    @Expose
    private Boolean ctsProfileMatch;
    @SerializedName("evaluationType")
    @Expose
    private String evaluationType;
    @SerializedName("nonce")
    @Expose
    private String nonce;
    @SerializedName("timestampMs")
    @Expose
    private Long timestampMs;

    public List<String> getApkCertificateDigestSha256() {
        return apkCertificateDigestSha256;
    }

    public void setApkCertificateDigestSha256(List<String> apkCertificateDigestSha256) {
        this.apkCertificateDigestSha256 = apkCertificateDigestSha256;
    }

    public String getApkDigestSha256() {
        return apkDigestSha256;
    }

    public void setApkDigestSha256(String apkDigestSha256) {
        this.apkDigestSha256 = apkDigestSha256;
    }

    public String getApkPackageName() {
        return apkPackageName;
    }

    public void setApkPackageName(String apkPackageName) {
        this.apkPackageName = apkPackageName;
    }

    public Boolean getBasicIntegrity() {
        return basicIntegrity;
    }

    public void setBasicIntegrity(Boolean basicIntegrity) {
        this.basicIntegrity = basicIntegrity;
    }

    public Boolean getCtsProfileMatch() {
        return ctsProfileMatch;
    }

    public void setCtsProfileMatch(Boolean ctsProfileMatch) {
        this.ctsProfileMatch = ctsProfileMatch;
    }

    public String getEvaluationType() {
        return evaluationType;
    }

    public void setEvaluationType(String evaluationType) {
        this.evaluationType = evaluationType;
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public Long getTimestampMs() {
        return timestampMs;
    }

    public void setTimestampMs(Long timestampMs) {
        this.timestampMs = timestampMs;
    }

    @Override
    public String toString() {
        return "Attestation{" +
                "apkCertificateDigestSha256=" + apkCertificateDigestSha256 +
                ", apkDigestSha256='" + apkDigestSha256 + '\'' +
                ", apkPackageName='" + apkPackageName + '\'' +
                ", basicIntegrity=" + basicIntegrity +
                ", ctsProfileMatch=" + ctsProfileMatch +
                ", evaluationType='" + evaluationType + '\'' +
                ", nonce='" + nonce + '\'' +
                ", timestampMs=" + timestampMs +
                '}';
    }
}