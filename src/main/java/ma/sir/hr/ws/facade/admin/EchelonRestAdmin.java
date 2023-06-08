package  ma.sir.hr.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.hr.bean.core.Echelon;
import ma.sir.hr.bean.history.EchelonHistory;
import ma.sir.hr.dao.criteria.core.EchelonCriteria;
import ma.sir.hr.dao.criteria.history.EchelonHistoryCriteria;
import ma.sir.hr.service.facade.admin.EchelonAdminService;
import ma.sir.hr.ws.converter.EchelonConverter;
import ma.sir.hr.ws.dto.EchelonDto;
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

@Api("Manages echelon services")
@RestController
@RequestMapping("/api/admin/echelon/")
public class EchelonRestAdmin  extends AbstractController<Echelon, EchelonDto, EchelonHistory, EchelonCriteria, EchelonHistoryCriteria, EchelonAdminService, EchelonConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all echelons")
    @GetMapping("")
    public ResponseEntity<List<EchelonDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all echelons")
    @GetMapping("optimized")
    public ResponseEntity<List<EchelonDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a echelon by id")
    @GetMapping("id/{id}")
    public ResponseEntity<EchelonDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  echelon")
    @PostMapping("")
    public ResponseEntity<EchelonDto> save(@RequestBody EchelonDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  echelon")
    @PutMapping("")
    public ResponseEntity<EchelonDto> update(@RequestBody EchelonDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of echelon")
    @PostMapping("multiple")
    public ResponseEntity<List<EchelonDto>> delete(@RequestBody List<EchelonDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified echelon")
    @DeleteMapping("")
    public ResponseEntity<EchelonDto> delete(@RequestBody EchelonDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified echelon")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple echelons by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("Finds echelons by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<EchelonDto>> findByCriteria(@RequestBody EchelonCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated echelons by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody EchelonCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports echelons by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody EchelonCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets echelon data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody EchelonCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets echelon history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets echelon paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody EchelonHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports echelon history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody EchelonHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets echelon history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody EchelonHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public EchelonRestAdmin (EchelonAdminService service, EchelonConverter converter) {
        super(service, converter);
    }


}