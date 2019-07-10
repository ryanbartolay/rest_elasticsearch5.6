/**
 * Copyright Plover Bay Technologies Ltd
 */
package com.ryan.tutorials.elasticsearch56.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Keno San Pedro
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ticket implements Serializable {

    private static final long serialVersionUID = 1L;
    private String m_action;
    private String m_allowChanges;
    private String m_apn;
    private String m_attachmentUniqueId;
    private String m_camundaOperation;
    private String m_camundaProcessInstanceId;
    private String m_camundaTaskId;
    private String m_ccRecipients;
    private Date m_closedDate;
    private String m_country;
    private String m_countryProvider;
    private Integer m_createdBy;
    private Date m_creationDate;
    private String m_deploymentStatus;
    private Boolean m_directCreationFlowInd;
    private Date m_dueDate;
    private Boolean m_elasticSearchInd;
    private String m_email;
    private Integer m_escalationSettingId;
    private String m_forumURL;
    private String m_inquiryDetail;
    private Integer m_inquiryTypeId;
    private Date m_lastContactDate;
    private Integer m_lastUpdateBy;
    private Date m_lastUpdateDate;
    private Boolean m_latestFirmwareInd;
    private String m_mailMessageId;
    private Boolean m_mailgunInd;
    private List<String> m_mergedTicketIds;
    private String m_modelNumber;
    private String m_modemManufacturer;
    private String m_name;
    private String m_nameProvider;
    private Date m_openedDate;
    private Integer m_ownerId;
    private String m_pointOfPurchase;
    private Boolean m_prerequisiteStepsInd;
    private String m_previousStatus;
    private Integer m_priorityId;
    private String m_quotedInquiryDetail;
    private String m_recaptchaHostIp;
    private String m_recaptchaResponse;
    private Integer[] m_removeEscalationGroups;
    private Integer m_requestorId;
    private Boolean m_requireLoginInd;
    private String m_rmaLink;
    private Boolean m_simLockedInd;
    private Date m_slaDate;
    private Date m_startedDate;
    private String m_status;
    private String m_subject;
    private String[] m_tags;
    private int m_tagsLength;
    private String m_ticketId;
    private Integer m_ticketMessageId;
    private boolean m_ticketVisibilityInd;
    private Integer m_version;
    private Boolean m_ringingTicketToggle;
    public String getAction() {
        return m_action;
    }
    public void setAction(String action) {
        m_action = action;
    }
    public String getAllowChanges() {
        return m_allowChanges;
    }
    public void setAllowChanges(String allowChanges) {
        m_allowChanges = allowChanges;
    }
    public String getApn() {
        return m_apn;
    }
    public void setApn(String apn) {
        m_apn = apn;
    }
    public String getAttachmentUniqueId() {
        return m_attachmentUniqueId;
    }
    public void setAttachmentUniqueId(String attachmentUniqueId) {
        m_attachmentUniqueId = attachmentUniqueId;
    }
    public String getCamundaOperation() {
        return m_camundaOperation;
    }
    public void setCamundaOperation(String camundaOperation) {
        m_camundaOperation = camundaOperation;
    }
    public String getCamundaProcessInstanceId() {
        return m_camundaProcessInstanceId;
    }
    public void setCamundaProcessInstanceId(String camundaProcessInstanceId) {
        m_camundaProcessInstanceId = camundaProcessInstanceId;
    }
    public String getCamundaTaskId() {
        return m_camundaTaskId;
    }
    public void setCamundaTaskId(String camundaTaskId) {
        m_camundaTaskId = camundaTaskId;
    }
    public String getCcRecipients() {
        return m_ccRecipients;
    }
    public void setCcRecipients(String ccRecipients) {
        m_ccRecipients = ccRecipients;
    }
    public Date getClosedDate() {
        return m_closedDate;
    }
    public void setClosedDate(Date closedDate) {
        m_closedDate = closedDate;
    }
    public String getCountry() {
        return m_country;
    }
    public void setCountry(String country) {
        m_country = country;
    }
    public String getCountryProvider() {
        return m_countryProvider;
    }
    public void setCountryProvider(String countryProvider) {
        m_countryProvider = countryProvider;
    }
    public Integer getCreatedBy() {
        return m_createdBy;
    }
    public void setCreatedBy(Integer createdBy) {
        m_createdBy = createdBy;
    }
    public Date getCreationDate() {
        return m_creationDate;
    }
    public void setCreationDate(Date creationDate) {
        m_creationDate = creationDate;
    }
    public String getDeploymentStatus() {
        return m_deploymentStatus;
    }
    public void setDeploymentStatus(String deploymentStatus) {
        m_deploymentStatus = deploymentStatus;
    }
    public Boolean getDirectCreationFlowInd() {
        return m_directCreationFlowInd;
    }
    public void setDirectCreationFlowInd(Boolean directCreationFlowInd) {
        m_directCreationFlowInd = directCreationFlowInd;
    }
    public Date getDueDate() {
        return m_dueDate;
    }
    public void setDueDate(Date dueDate) {
        m_dueDate = dueDate;
    }
    public Boolean getElasticSearchInd() {
        return m_elasticSearchInd;
    }
    public void setElasticSearchInd(Boolean elasticSearchInd) {
        m_elasticSearchInd = elasticSearchInd;
    }
    public String getEmail() {
        return m_email;
    }
    public void setEmail(String email) {
        m_email = email;
    }
    public Integer getEscalationSettingId() {
        return m_escalationSettingId;
    }
    public void setEscalationSettingId(Integer escalationSettingId) {
        m_escalationSettingId = escalationSettingId;
    }
    public String getForumURL() {
        return m_forumURL;
    }
    public void setForumURL(String forumURL) {
        m_forumURL = forumURL;
    }
    public String getInquiryDetail() {
        return m_inquiryDetail;
    }
    public void setInquiryDetail(String inquiryDetail) {
        m_inquiryDetail = inquiryDetail;
    }
    public Integer getInquiryTypeId() {
        return m_inquiryTypeId;
    }
    public void setInquiryTypeId(Integer inquiryTypeId) {
        m_inquiryTypeId = inquiryTypeId;
    }
    public Date getLastContactDate() {
        return m_lastContactDate;
    }
    public void setLastContactDate(Date lastContactDate) {
        m_lastContactDate = lastContactDate;
    }
    public Integer getLastUpdateBy() {
        return m_lastUpdateBy;
    }
    public void setLastUpdateBy(Integer lastUpdateBy) {
        m_lastUpdateBy = lastUpdateBy;
    }
    public Date getLastUpdateDate() {
        return m_lastUpdateDate;
    }
    public void setLastUpdateDate(Date lastUpdateDate) {
        m_lastUpdateDate = lastUpdateDate;
    }
    public Boolean getLatestFirmwareInd() {
        return m_latestFirmwareInd;
    }
    public void setLatestFirmwareInd(Boolean latestFirmwareInd) {
        m_latestFirmwareInd = latestFirmwareInd;
    }
    public String getMailMessageId() {
        return m_mailMessageId;
    }
    public void setMailMessageId(String mailMessageId) {
        m_mailMessageId = mailMessageId;
    }
    public Boolean getMailgunInd() {
        return m_mailgunInd;
    }
    public void setMailgunInd(Boolean mailgunInd) {
        m_mailgunInd = mailgunInd;
    }
    public List<String> getMergedTicketIds() {
        return m_mergedTicketIds;
    }
    public void setMergedTicketIds(List<String> mergedTicketIds) {
        m_mergedTicketIds = mergedTicketIds;
    }
    public String getModelNumber() {
        return m_modelNumber;
    }
    public void setModelNumber(String modelNumber) {
        m_modelNumber = modelNumber;
    }
    public String getModemManufacturer() {
        return m_modemManufacturer;
    }
    public void setModemManufacturer(String modemManufacturer) {
        m_modemManufacturer = modemManufacturer;
    }
    public String getName() {
        return m_name;
    }
    public void setName(String name) {
        m_name = name;
    }
    public String getNameProvider() {
        return m_nameProvider;
    }
    public void setNameProvider(String nameProvider) {
        m_nameProvider = nameProvider;
    }
    public Date getOpenedDate() {
        return m_openedDate;
    }
    public void setOpenedDate(Date openedDate) {
        m_openedDate = openedDate;
    }
    public Integer getOwnerId() {
        return m_ownerId;
    }
    public void setOwnerId(Integer ownerId) {
        m_ownerId = ownerId;
    }
    public String getPointOfPurchase() {
        return m_pointOfPurchase;
    }
    public void setPointOfPurchase(String pointOfPurchase) {
        m_pointOfPurchase = pointOfPurchase;
    }
    public Boolean getPrerequisiteStepsInd() {
        return m_prerequisiteStepsInd;
    }
    public void setPrerequisiteStepsInd(Boolean prerequisiteStepsInd) {
        m_prerequisiteStepsInd = prerequisiteStepsInd;
    }
    public String getPreviousStatus() {
        return m_previousStatus;
    }
    public void setPreviousStatus(String previousStatus) {
        m_previousStatus = previousStatus;
    }
    public Integer getPriorityId() {
        return m_priorityId;
    }
    public void setPriorityId(Integer priorityId) {
        m_priorityId = priorityId;
    }
    public String getQuotedInquiryDetail() {
        return m_quotedInquiryDetail;
    }
    public void setQuotedInquiryDetail(String quotedInquiryDetail) {
        m_quotedInquiryDetail = quotedInquiryDetail;
    }
    public String getRecaptchaHostIp() {
        return m_recaptchaHostIp;
    }
    public void setRecaptchaHostIp(String recaptchaHostIp) {
        m_recaptchaHostIp = recaptchaHostIp;
    }
    public String getRecaptchaResponse() {
        return m_recaptchaResponse;
    }
    public void setRecaptchaResponse(String recaptchaResponse) {
        m_recaptchaResponse = recaptchaResponse;
    }
    public Integer[] getRemoveEscalationGroups() {
        return m_removeEscalationGroups;
    }
    public void setRemoveEscalationGroups(Integer[] removeEscalationGroups) {
        m_removeEscalationGroups = removeEscalationGroups;
    }
    public Integer getRequestorId() {
        return m_requestorId;
    }
    public void setRequestorId(Integer requestorId) {
        m_requestorId = requestorId;
    }
    public Boolean getRequireLoginInd() {
        return m_requireLoginInd;
    }
    public void setRequireLoginInd(Boolean requireLoginInd) {
        m_requireLoginInd = requireLoginInd;
    }
    public String getRmaLink() {
        return m_rmaLink;
    }
    public void setRmaLink(String rmaLink) {
        m_rmaLink = rmaLink;
    }
    public Boolean getSimLockedInd() {
        return m_simLockedInd;
    }
    public void setSimLockedInd(Boolean simLockedInd) {
        m_simLockedInd = simLockedInd;
    }
    public Date getSlaDate() {
        return m_slaDate;
    }
    public void setSlaDate(Date slaDate) {
        m_slaDate = slaDate;
    }
    public Date getStartedDate() {
        return m_startedDate;
    }
    public void setStartedDate(Date startedDate) {
        m_startedDate = startedDate;
    }
    public String getStatus() {
        return m_status;
    }
    public void setStatus(String status) {
        m_status = status;
    }
    public String getSubject() {
        return m_subject;
    }
    public void setSubject(String subject) {
        m_subject = subject;
    }
    public String[] getTags() {
        return m_tags;
    }
    public void setTags(String[] tags) {
        m_tags = tags;
    }
    public int getTagsLength() {
        return m_tagsLength;
    }
    public void setTagsLength(int tagsLength) {
        m_tagsLength = tagsLength;
    }
    public String getTicketId() {
        return m_ticketId;
    }
    public void setTicketId(String ticketId) {
        m_ticketId = ticketId;
    }
    public Integer getTicketMessageId() {
        return m_ticketMessageId;
    }
    public void setTicketMessageId(Integer ticketMessageId) {
        m_ticketMessageId = ticketMessageId;
    }
    public boolean isTicketVisibilityInd() {
        return m_ticketVisibilityInd;
    }
    public void setTicketVisibilityInd(boolean ticketVisibilityInd) {
        m_ticketVisibilityInd = ticketVisibilityInd;
    }
    public Integer getVersion() {
        return m_version;
    }
    public void setVersion(Integer version) {
        m_version = version;
    }
    public Boolean getRingingTicketToggle() {
        return m_ringingTicketToggle;
    }
    public void setRingingTicketToggle(Boolean ringingTicketToggle) {
        m_ringingTicketToggle = ringingTicketToggle;
    }

}