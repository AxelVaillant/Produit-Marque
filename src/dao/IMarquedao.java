package dao;

import java.util.List;

import model.Marque;

public interface IMarquedao {
public int saveMarque(Marque m);
public List<Marque> getMarques();
}
