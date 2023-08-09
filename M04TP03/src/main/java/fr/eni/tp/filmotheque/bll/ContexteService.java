package fr.eni.tp.filmotheque.bll;

import java.util.List;

import fr.eni.tp.filmotheque.bo.Membre;

public interface ContexteService {

	public abstract Membre charger(String email);

	public abstract List<Membre> charger();

}
