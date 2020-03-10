package dao;

import model.Login;

public interface ILogindao {
public int saveLogin(Login login);
public boolean ident(Login login);

}
