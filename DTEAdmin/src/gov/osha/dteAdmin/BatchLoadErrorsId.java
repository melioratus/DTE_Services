package gov.osha.dteAdmin;

// Generated Nov 21, 2012 11:24:52 AM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BatchLoadErrorsId generated by hbm2java
 */
@Embeddable
public class BatchLoadErrorsId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 493292613698022687L;
	private String title;
	private String edCenter;
	private String state;
	private String location;
	private String address;
	private String errorMessage;

	public BatchLoadErrorsId() {
	}

	public BatchLoadErrorsId(String title, String edCenter, String state,
			String location, String address, String errorMessage) {
		this.title = title;
		this.edCenter = edCenter;
		this.state = state;
		this.location = location;
		this.address = address;
		this.errorMessage = errorMessage;
	}

	@Column(name = "TITLE", length = 250)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "ED_CENTER", length = 100)
	public String getEdCenter() {
		return this.edCenter;
	}

	public void setEdCenter(String edCenter) {
		this.edCenter = edCenter;
	}

	@Column(name = "STATE", length = 30)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "LOCATION", length = 100)
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Column(name = "ADDRESS", length = 100)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "ERROR_MESSAGE", length = 2000)
	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BatchLoadErrorsId))
			return false;
		BatchLoadErrorsId castOther = (BatchLoadErrorsId) other;

		return ((this.getTitle() == castOther.getTitle()) || (this.getTitle() != null
				&& castOther.getTitle() != null && this.getTitle().equals(
				castOther.getTitle())))
				&& ((this.getEdCenter() == castOther.getEdCenter()) || (this
						.getEdCenter() != null
						&& castOther.getEdCenter() != null && this
						.getEdCenter().equals(castOther.getEdCenter())))
				&& ((this.getState() == castOther.getState()) || (this
						.getState() != null && castOther.getState() != null && this
						.getState().equals(castOther.getState())))
				&& ((this.getLocation() == castOther.getLocation()) || (this
						.getLocation() != null
						&& castOther.getLocation() != null && this
						.getLocation().equals(castOther.getLocation())))
				&& ((this.getAddress() == castOther.getAddress()) || (this
						.getAddress() != null && castOther.getAddress() != null && this
						.getAddress().equals(castOther.getAddress())))
				&& ((this.getErrorMessage() == castOther.getErrorMessage()) || (this
						.getErrorMessage() != null
						&& castOther.getErrorMessage() != null && this
						.getErrorMessage().equals(castOther.getErrorMessage())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTitle() == null ? 0 : this.getTitle().hashCode());
		result = 37 * result
				+ (getEdCenter() == null ? 0 : this.getEdCenter().hashCode());
		result = 37 * result
				+ (getState() == null ? 0 : this.getState().hashCode());
		result = 37 * result
				+ (getLocation() == null ? 0 : this.getLocation().hashCode());
		result = 37 * result
				+ (getAddress() == null ? 0 : this.getAddress().hashCode());
		result = 37
				* result
				+ (getErrorMessage() == null ? 0 : this.getErrorMessage()
						.hashCode());
		return result;
	}

}
