package br.com.treinamento.aunteticarusuario.model;

public class JwtResponse {

	private String jwtToken;
	
    public JwtResponse(String token) {
    	this.jwtToken = token;
	}

	public String getJwtToken() {
		return jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}

}
