package  ma.sir.hr.ws.converter;

import ma.sir.hr.bean.core.Local;
import ma.sir.hr.ws.dto.SituationFamilialeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.hr.bean.core.Departement;

import ma.sir.hr.zynerator.util.StringUtil;
import ma.sir.hr.zynerator.converter.AbstractConverter;
import ma.sir.hr.zynerator.util.DateUtil;
import ma.sir.hr.bean.history.EmployeHistory;
import ma.sir.hr.bean.core.Employe;
import ma.sir.hr.ws.dto.EmployeDto;

@Component
public class EmployeConverter extends AbstractConverter<Employe, EmployeDto, EmployeHistory> {


    @Autowired
    private DepartementConverter departementConverter ;
    @Autowired
    private PromotionConverter promotionConverter  ;
    @Autowired
    private NotationConverter notationConverter ;
    @Autowired
    private SexeConverter sexeConverter ;
    @Autowired
    private LocalConverter localConverter;
    @Autowired
    private ParcoursUniversitaireConverter parcoursUniversitaireConverter;
    @Autowired
    private SituationFamilialeConverter situationFamilialeConverter;
    private boolean sexe;
    private boolean local;
    private boolean parcoursUniversitaire;
    private boolean departement;
    private boolean poste;
    private boolean notation;
    private boolean Promotion;
    private boolean situationFamiliale;
  /*  private boolean echelle;
    private boolean echelon;
    private boolean grade;*/

    public  EmployeConverter(){
        super(Employe.class, EmployeDto.class, EmployeHistory.class);
    }

    @Override
    public Employe toItem(EmployeDto dto) {
        if (dto == null) {
            return null;
        } else {
        Employe item = new Employe();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getUsername()))
                item.setUsername(dto.getUsername());
            if(StringUtil.isNotEmpty(dto.getPassword()))
                item.setPassword(dto.getPassword());
            if(StringUtil.isNotEmpty(dto.getPrenom()))
                item.setPrenom(dto.getPrenom());
            if(StringUtil.isNotEmpty(dto.getNom()))
                item.setNom(dto.getNom());
            if(StringUtil.isNotEmpty(dto.getNomArabe()))
                item.setNomArabe(dto.getNomArabe());


            if(StringUtil.isNotEmpty(dto.getDateDeNaissance()))
                item.setDateDeNaissance(DateUtil.stringEnToDate(dto.getDateDeNaissance()));
            if(StringUtil.isNotEmpty(dto.getLieuDeNaissance()))
                item.setLieuDeNaissance(dto.getLieuDeNaissance());
            if(StringUtil.isNotEmpty(dto.getAdresse()))
                item.setAdresse(dto.getAdresse());
            if(StringUtil.isNotEmpty(dto.getCin()))
                item.setCin(dto.getCin());
            if(StringUtil.isNotEmpty(dto.getTel()))
                item.setTel(dto.getTel());
            if(StringUtil.isNotEmpty(dto.getDateEmbauche()))
                item.setDateEmbauche(DateUtil.stringEnToDate(dto.getDateEmbauche()));
            if(StringUtil.isNotEmpty(dto.getMatricule()))
                item.setMatricule(dto.getMatricule());
            if(StringUtil.isNotEmpty(dto.getAdressEmail()))
                item.setAdressEmail(dto.getAdressEmail());
            if(StringUtil.isNotEmpty(dto.getCompteBancaire()))
                item.setCompteBancaire(dto.getCompteBancaire());
            if(StringUtil.isNotEmpty(dto.getPoste()))
                item.setPoste(dto.getPoste());

            if(this.local && dto.getLocal()!=null)
                item.setLocal(localConverter.toItem(dto.getLocal()));


            if(this.sexe && dto.getSexe()!=null)
                item.setSexe(sexeConverter.toItem(dto.getSexe())) ;
            if(this.departement && dto.getDepartement()!=null)
                item.setDepartement(departementConverter.toItem(dto.getDepartement())); ;
            if(this.parcoursUniversitaire && dto.getParcoursUniversitaire()!=null)
                item.setParcoursUniversitaire(parcoursUniversitaireConverter.toItem(dto.getParcoursUniversitaire()));
            if(this.situationFamiliale && dto.getSituationFamiliale()!=null)
                item.setSituationFamiliale(situationFamilialeConverter.toItem(dto.getSituationFamiliale()));


            if(this.notation && dto.getNotation()!=null)
                item.setNotation(notationConverter.toItem(dto.getNotation())) ;

            if(this.Promotion && dto.getPromotion()!=null)
                item.setPromotion(promotionConverter.toItem(dto.getPromotion())); ;


        return item;
        }
    }

    @Override
    public EmployeDto toDto(Employe item) {
        if (item == null) {
            return null;
        } else {
            EmployeDto dto = new EmployeDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getUsername()))
                dto.setUsername(item.getUsername());
            if(StringUtil.isNotEmpty(item.getPassword()))
                dto.setPassword(item.getPassword());
            if(StringUtil.isNotEmpty(item.getPrenom()))
                dto.setPrenom(item.getPrenom());
            if(StringUtil.isNotEmpty(item.getNom()))
                dto.setNom(item.getNom());
            if(StringUtil.isNotEmpty(item.getNomArabe()))
                dto.setNomArabe(item.getNomArabe());
            if(item.getDateDeNaissance()!=null)
                dto.setDateDeNaissance(DateUtil.dateTimeToString(item.getDateDeNaissance()));
            if(StringUtil.isNotEmpty(item.getLieuDeNaissance()))
                dto.setLieuDeNaissance(item.getLieuDeNaissance());
            if(StringUtil.isNotEmpty(item.getAdresse()))
                dto.setAdresse(item.getAdresse());
            if(StringUtil.isNotEmpty(item.getCin()))
                dto.setCin(item.getCin());
            if(StringUtil.isNotEmpty(item.getTel()))
                dto.setTel(item.getTel());
            if(item.getDateEmbauche()!=null)
                dto.setDateEmbauche(DateUtil.dateTimeToString(item.getDateEmbauche()));
            if(StringUtil.isNotEmpty(item.getMatricule()))
                dto.setMatricule(item.getMatricule());
            if(StringUtil.isNotEmpty(item.getAdressEmail()))
                dto.setAdressEmail(item.getAdressEmail());
            if(StringUtil.isNotEmpty(item.getCompteBancaire()))
                dto.setCompteBancaire(item.getCompteBancaire());
            if(StringUtil.isNotEmpty(item.getPoste()))
                dto.setPoste(item.getPoste());
            if(this.local && item.getLocal()!=null)
                dto.setLocal(localConverter.toDto(item.getLocal()));
            if(this.departement && item.getDepartement()!=null)
                dto.setDepartement(departementConverter.toDto(item.getDepartement())); ;

            if(this.sexe && item.getSexe()!=null)
                dto.setSexe(sexeConverter.toDto(item.getSexe())) ;
            if(this.parcoursUniversitaire && item.getParcoursUniversitaire()!=null)
                dto.setParcoursUniversitaire(parcoursUniversitaireConverter.toDto(item.getParcoursUniversitaire()));
            if(this.situationFamiliale && item.getSituationFamiliale()!=null)
                dto.setSituationFamiliale(situationFamilialeConverter.toDto(item.getSituationFamiliale()));
       /* if(this.departement && item.getDepartement()!=null) {
            departementConverter.setEmploye(false);
            dto.setDepartement(departementConverter.toDto(item.getDepartement())) ;
            departementConverter.setEmploye(true);
        }*/
        if(this.notation && item.getNotation()!=null) {
            dto.setNotation(notationConverter.toDto(item.getNotation())) ;
        }
        if(this.Promotion && item.getPromotion()!=null) {
            dto.setPromotion(promotionConverter.toDto(item.getPromotion())); ;
        }

        return dto;
        }
    }


    public void initObject(boolean value) {
        this.parcoursUniversitaire = value;
        this.departement = value;
        this.poste = value;
        this.notation = value;
        this.Promotion = value;
        this.local = value;
        this.sexe=value;
        this.situationFamiliale=value;
    }


    public DepartementConverter getDepartementConverter(){
        return this.departementConverter;
    }
    public void setDepartementConverter(DepartementConverter departementConverter ){
        this.departementConverter = departementConverter;
    }

    public PromotionConverter getPromotionConverter(){
        return this.promotionConverter;
    }
    public void setPromotionConverter(PromotionConverter promotionConverter ){this.promotionConverter = promotionConverter;
    }
    public NotationConverter getNotationConverter(){
        return this.notationConverter;
    }
    public void setNotationConverter(NotationConverter notationConverter ){
        this.notationConverter = notationConverter;
    }

    public SexeConverter getSexeConverter() {
        return sexeConverter;
    }

    public void setSexeConverter(SexeConverter sexeConverter) {
        this.sexeConverter = sexeConverter;
    }

    public boolean  isDepartement(){
        return this.departement;
    }
    public void  setDepartement(boolean departement){
        this.departement = departement;
    }
    public boolean  isPoste(){
        return this.poste;
    }
    public void  setPoste(boolean poste){
        this.poste = poste;
    }
    public boolean  isNotation(){
        return this.notation;
    }
    public void  setNotation(boolean notation){
        this.notation = notation;
    }
    public boolean  isPromotion(){
        return this.Promotion;
    }
    public void  setPromotion(boolean promotion){
        this.Promotion = promotion;
    }
    public boolean  isSexe(){
        return this.sexe;
    }
    public void  setSexe(boolean sexe){
        this.sexe = sexe;
    }

    public LocalConverter getLocalConverter() {
        return localConverter;
    }

    public void setLocalConverter(LocalConverter localConverter) {
        this.localConverter = localConverter;
    }

    public boolean isLocal() {
        return local;
    }

    public void setLocal(boolean local) {
        this.local = local;
    }

    public ParcoursUniversitaireConverter getParcoursUniversitaireConverter() {
        return parcoursUniversitaireConverter;
    }

    public void setParcoursUniversitaireConverter(ParcoursUniversitaireConverter parcoursUniversitaireConverter) {
        this.parcoursUniversitaireConverter = parcoursUniversitaireConverter;
    }

    public boolean isParcoursUniversitaire() {
        return parcoursUniversitaire;
    }

    public void setParcoursUniversitaire(boolean parcoursUniversitaire) {
        this.parcoursUniversitaire = parcoursUniversitaire;
    }

    public SituationFamilialeConverter getSituationFamilialeConverter() {
        return situationFamilialeConverter;
    }

    public void setSituationFamilialeConverter(SituationFamilialeConverter situationFamilialeConverter) {
        this.situationFamilialeConverter = situationFamilialeConverter;
    }

    public boolean isSituationFamiliale() {
        return situationFamiliale;
    }

    public void setSituationFamiliale(boolean situationFamiliale) {
        this.situationFamiliale = situationFamiliale;
    }
}
