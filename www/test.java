class prova {

  private String id;
  private String name;
  private String apell;

	/**
	* Default empty prova constructor
	*/
	public prova() {
	}

	/**
	* Default prova constructor
	*/
	public prova(String id, String name, String apell) {
		this.id = id;
		this.name = name;
		this.apell = apell;
	}




	/**
	* Returns value of id
	* @return
	*/
	public String getId() {
		return id;
	}

	/**
	* Sets new value of id
	* @param
	*/
	public void setId(String id) {
		this.id = id;
	}

	/**
	* Returns value of name
	* @return
	*/
	public String getName() {
		return name;
	}

	/**
	* Sets new value of name
	* @param
	*/
	public void setName(String name) {
		this.name = name;
	}

	/**
	* Returns value of apell
	* @return
	*/
	public String getApell() {
		return apell;
	}

	/**
	* Sets new value of apell
	* @param
	*/
	public void setApell(String apell) {
		this.apell = apell;
	}
}
