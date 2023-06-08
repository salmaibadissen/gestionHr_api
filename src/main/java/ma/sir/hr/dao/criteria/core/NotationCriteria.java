package  ma.sir.hr.dao.criteria.core;


import ma.sir.hr.zynerator.criteria.BaseCriteria;

import java.time.LocalDateTime;
import java.time.Year;
import java.util.List;

public class NotationCriteria extends  BaseCriteria  {

    private String premierNote;
    private String premierNoteMin;
    private String premierNoteMax;
    private String deusiemeNote;
    private String deusiemeNoteMin;
    private String deusiemeNoteMax;
    private String troisiemeNote;
    private String troisiemeNoteMin;
    private String troisiemeNoteMax;
    private String quatriemeNote;
    private String quatriemeNoteMin;
    private String quatriemeNoteMax;
    private String cinquiemeNote;
    private String cinquiemeNoteMin;
    private String cinquiemeNoteMax;
    private String sommeDesNotes;
    private String sommeDesNotesMin;
    private String sommeDesNotesMax;
    private Year annee;
    private Year anneeFrom;
    private Year anneeTo;
    private EmployeCriteria employe ;
    private List<EmployeCriteria> employes ;



    public NotationCriteria(){}

    public String getPremierNote(){
        return this.premierNote;
    }
    public void setPremierNote(String premierNote){
        this.premierNote = premierNote;
    }   
    public String getPremierNoteMin(){
        return this.premierNoteMin;
    }
    public void setPremierNoteMin(String premierNoteMin){
        this.premierNoteMin = premierNoteMin;
    }
    public String getPremierNoteMax(){
        return this.premierNoteMax;
    }
    public void setPremierNoteMax(String premierNoteMax){
        this.premierNoteMax = premierNoteMax;
    }
      
    public String getDeusiemeNote(){
        return this.deusiemeNote;
    }
    public void setDeusiemeNote(String deusiemeNote){
        this.deusiemeNote = deusiemeNote;
    }   
    public String getDeusiemeNoteMin(){
        return this.deusiemeNoteMin;
    }
    public void setDeusiemeNoteMin(String deusiemeNoteMin){
        this.deusiemeNoteMin = deusiemeNoteMin;
    }
    public String getDeusiemeNoteMax(){
        return this.deusiemeNoteMax;
    }
    public void setDeusiemeNoteMax(String deusiemeNoteMax){
        this.deusiemeNoteMax = deusiemeNoteMax;
    }
      
    public String getTroisiemeNote(){
        return this.troisiemeNote;
    }
    public void setTroisiemeNote(String troisiemeNote){
        this.troisiemeNote = troisiemeNote;
    }   
    public String getTroisiemeNoteMin(){
        return this.troisiemeNoteMin;
    }
    public void setTroisiemeNoteMin(String troisiemeNoteMin){
        this.troisiemeNoteMin = troisiemeNoteMin;
    }
    public String getTroisiemeNoteMax(){
        return this.troisiemeNoteMax;
    }
    public void setTroisiemeNoteMax(String troisiemeNoteMax){
        this.troisiemeNoteMax = troisiemeNoteMax;
    }
      
    public String getQuatriemeNote(){
        return this.quatriemeNote;
    }
    public void setQuatriemeNote(String quatriemeNote){
        this.quatriemeNote = quatriemeNote;
    }   
    public String getQuatriemeNoteMin(){
        return this.quatriemeNoteMin;
    }
    public void setQuatriemeNoteMin(String quatriemeNoteMin){
        this.quatriemeNoteMin = quatriemeNoteMin;
    }
    public String getQuatriemeNoteMax(){
        return this.quatriemeNoteMax;
    }
    public void setQuatriemeNoteMax(String quatriemeNoteMax){
        this.quatriemeNoteMax = quatriemeNoteMax;
    }
      
    public String getCinquiemeNote(){
        return this.cinquiemeNote;
    }
    public void setCinquiemeNote(String cinquiemeNote){
        this.cinquiemeNote = cinquiemeNote;
    }   
    public String getCinquiemeNoteMin(){
        return this.cinquiemeNoteMin;
    }
    public void setCinquiemeNoteMin(String cinquiemeNoteMin){
        this.cinquiemeNoteMin = cinquiemeNoteMin;
    }
    public String getCinquiemeNoteMax(){
        return this.cinquiemeNoteMax;
    }
    public void setCinquiemeNoteMax(String cinquiemeNoteMax){
        this.cinquiemeNoteMax = cinquiemeNoteMax;
    }
      
    public String getSommeDesNotes(){
        return this.sommeDesNotes;
    }
    public void setSommeDesNotes(String sommeDesNotes){
        this.sommeDesNotes = sommeDesNotes;
    }   
    public String getSommeDesNotesMin(){
        return this.sommeDesNotesMin;
    }
    public void setSommeDesNotesMin(String sommeDesNotesMin){
        this.sommeDesNotesMin = sommeDesNotesMin;
    }
    public String getSommeDesNotesMax(){
        return this.sommeDesNotesMax;
    }
    public void setSommeDesNotesMax(String sommeDesNotesMax){
        this.sommeDesNotesMax = sommeDesNotesMax;
    }

    public Year getAnnee() {
        return annee;
    }

    public void setAnnee(Year annee) {
        this.annee = annee;
    }

    public Year getAnneeFrom() {
        return anneeFrom;
    }

    public void setAnneeFrom(Year anneeFrom) {
        this.anneeFrom = anneeFrom;
    }

    public Year getAnneeTo() {
        return anneeTo;
    }

    public void setAnneeTo(Year anneeTo) {
        this.anneeTo = anneeTo;
    }

    public EmployeCriteria getEmploye() {
        return employe;
    }

    public void setEmploye(EmployeCriteria employe) {
        this.employe = employe;
    }

    public List<EmployeCriteria> getEmployes() {
        return employes;
    }

    public void setEmployes(List<EmployeCriteria> employes) {
        this.employes = employes;
    }
}
