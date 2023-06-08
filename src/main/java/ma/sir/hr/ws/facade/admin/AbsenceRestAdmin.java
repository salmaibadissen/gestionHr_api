package  ma.sir.hr.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.hr.bean.core.Absence;
import ma.sir.hr.bean.core.Departement;
import ma.sir.hr.bean.history.AbsenceHistory;
import ma.sir.hr.dao.criteria.core.AbsenceCriteria;
import ma.sir.hr.dao.criteria.history.AbsenceHistoryCriteria;
import ma.sir.hr.service.facade.admin.AbsenceAdminService;
import ma.sir.hr.ws.converter.AbsenceConverter;
import ma.sir.hr.ws.dto.AbsenceDto;
import ma.sir.hr.zynerator.controller.AbstractController;
import ma.sir.hr.zynerator.dto.AuditEntityDto;
import ma.sir.hr.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.sir.hr.zynerator.process.Result;

import org.springframework.web.multipart.MultipartFile;
import ma.sir.hr.zynerator.dto.FileTempDto;

@Api("Manages absence services")
@RestController
@RequestMapping("/api/admin/absence/")
public class AbsenceRestAdmin  extends AbstractController<Absence, AbsenceDto, AbsenceHistory, AbsenceCriteria, AbsenceHistoryCriteria, AbsenceAdminService, AbsenceConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }
    @ApiOperation("find by employe id")
    @GetMapping("employe/id/{id}")
    public List<Absence> findByEmployeId(@PathVariable Long id){
        return service.findByEmployeId(id);
    }
    @ApiOperation("delete by employe id")
    @DeleteMapping("employe/id/{id}")
    public int deleteByEmployeId(@PathVariable Long id){
        return service.deleteByEmployeId(id);
    }
    @ApiOperation("Finds a list of all absences")
    @GetMapping("")
    public ResponseEntity<List<AbsenceDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a absence by id")
    @GetMapping("id/{id}")
    public ResponseEntity<AbsenceDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  absence")
    @PostMapping("")
    public ResponseEntity<AbsenceDto> save(@RequestBody AbsenceDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  absence")
    @PutMapping("")
    public ResponseEntity<AbsenceDto> update(@RequestBody AbsenceDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of absence")
    @PostMapping("multiple")
    public ResponseEntity<List<AbsenceDto>> delete(@RequestBody List<AbsenceDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified absence")
    @DeleteMapping("")
    public ResponseEntity<AbsenceDto> delete(@RequestBody AbsenceDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified absence")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple absences by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds absences by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<AbsenceDto>> findByCriteria(@RequestBody AbsenceCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated absences by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody AbsenceCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports absences by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody AbsenceCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets absence data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody AbsenceCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets absence history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets absence paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody AbsenceHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports absence history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody AbsenceHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets absence history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody AbsenceHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public AbsenceRestAdmin (AbsenceAdminService service, AbsenceConverter converter) {
        super(service, converter);
    }


}