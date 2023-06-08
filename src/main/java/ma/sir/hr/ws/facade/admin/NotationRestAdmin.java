package  ma.sir.hr.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.hr.bean.core.Absence;
import ma.sir.hr.bean.core.Notation;
import ma.sir.hr.bean.history.NotationHistory;
import ma.sir.hr.dao.criteria.core.NotationCriteria;
import ma.sir.hr.dao.criteria.history.NotationHistoryCriteria;
import ma.sir.hr.service.facade.admin.NotationAdminService;
import ma.sir.hr.service.impl.admin.NotationAdminServiceImpl;
import ma.sir.hr.ws.converter.NotationConverter;
import ma.sir.hr.ws.dto.NotationDto;
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

@Api("Manages notation services")
@RestController
@RequestMapping("/api/admin/notation/")
public class NotationRestAdmin  extends AbstractController<Notation, NotationDto, NotationHistory, NotationCriteria, NotationHistoryCriteria, NotationAdminService, NotationConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all notations")
    @GetMapping("")
    public ResponseEntity<List<NotationDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a notation by id")
    @GetMapping("id/{id}")
    public ResponseEntity<NotationDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  notation")
    @PostMapping("")
    public ResponseEntity<NotationDto> save(@RequestBody NotationDto dto) throws Exception {
        return notationAdminService.save(dto);
    }

    @ApiOperation("Updates the specified  notation")
    @PutMapping("")
    public ResponseEntity<NotationDto> update(@RequestBody NotationDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of notation")
    @PostMapping("multiple")
    public ResponseEntity<List<NotationDto>> delete(@RequestBody List<NotationDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified notation")
    @DeleteMapping("")
    public ResponseEntity<NotationDto> delete(@RequestBody NotationDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified notation")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple notations by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds notations by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<NotationDto>> findByCriteria(@RequestBody NotationCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated notations by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody NotationCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports notations by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody NotationCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets notation data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody NotationCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets notation history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets notation paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody NotationHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports notation history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody NotationHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }
    @ApiOperation("find by employes id")
    @GetMapping("employe/id/{id}")
    public Notation findByEmployeId(@PathVariable Long id){
        return service.findByEmployeId(id);
    }
    @ApiOperation("delete by employe id")
    @DeleteMapping("employe/id/{id}")
    public int deleteByEmployeId(@PathVariable Long id){
        return service.deleteByEmployeId(id);
    }

    @ApiOperation("Gets notation history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody NotationHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public NotationRestAdmin (NotationAdminService service, NotationConverter converter) {
        super(service, converter);
    }
    @Autowired
    private NotationAdminServiceImpl notationAdminService;


}