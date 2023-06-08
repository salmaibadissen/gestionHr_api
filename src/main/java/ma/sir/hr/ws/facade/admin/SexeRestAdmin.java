package  ma.sir.hr.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.hr.bean.core.Sexe;
import ma.sir.hr.bean.history.SexeHistory;
import ma.sir.hr.dao.criteria.core.SexeCriteria;
import ma.sir.hr.dao.criteria.history.SexeHistoryCriteria;
import ma.sir.hr.service.facade.admin.SexeAdminService;
import ma.sir.hr.ws.converter.SexeConverter;
import ma.sir.hr.ws.dto.SexeDto;
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

@Api("Manages sexe services")
@RestController
@RequestMapping("/api/admin/sexe/")
public class SexeRestAdmin  extends AbstractController<Sexe, SexeDto, SexeHistory, SexeCriteria, SexeHistoryCriteria, SexeAdminService, SexeConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all sexes")
    @GetMapping("")
    public ResponseEntity<List<SexeDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all sexes")
    @GetMapping("optimized")
    public ResponseEntity<List<SexeDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a sexe by id")
    @GetMapping("id/{id}")
    public ResponseEntity<SexeDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  sexe")
    @PostMapping("")
    public ResponseEntity<SexeDto> save(@RequestBody SexeDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  sexe")
    @PutMapping("")
    public ResponseEntity<SexeDto> update(@RequestBody SexeDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of sexe")
    @PostMapping("multiple")
    public ResponseEntity<List<SexeDto>> delete(@RequestBody List<SexeDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified sexe")
    @DeleteMapping("")
    public ResponseEntity<SexeDto> delete(@RequestBody SexeDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified sexe")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple sexes by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds sexes by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<SexeDto>> findByCriteria(@RequestBody SexeCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated sexes by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody SexeCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports sexes by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody SexeCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets sexe data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody SexeCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets sexe history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets sexe paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody SexeHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports sexe history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody SexeHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets sexe history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody SexeHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public SexeRestAdmin (SexeAdminService service, SexeConverter converter) {
        super(service, converter);
    }


}