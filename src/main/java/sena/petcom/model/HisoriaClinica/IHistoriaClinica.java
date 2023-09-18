package sena.petcom.model.HisoriaClinica;

import java.util.List;


public interface IHistoriaClinica {
    public void save (HistoriaClinica histo);
    public List<HistoriaClinica> findAll();
    public HistoriaClinica findOne(Integer idHistoriaClinica);
    public void delete(Integer idHistoriaClinica);
}
