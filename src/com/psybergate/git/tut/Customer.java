public Customer{
	private String name;

	private Date dateOfBirth;

	private long custNum;

	public String toString() {
		return (custNum + name);
	}
}