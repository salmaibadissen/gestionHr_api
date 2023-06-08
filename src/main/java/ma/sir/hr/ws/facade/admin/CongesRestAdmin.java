package  ma.sir.hr.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.hr.bean.core.Conges;
import ma.sir.hr.bean.history.CongesHistory;
import ma.sir.hr.dao.criteria.core.CongesCriteria;
import ma.sir.hr.dao.criteria.history.CongesHistoryCriteria;
import ma.sir.hr.service.facade.admin.CongesAdminService;
import ma.sir.hr.service.impl.admin.CongesAdminServiceImpl;
import ma.sir.hr.ws.converter.CongesConverter;
import ma.sir.hr.ws.dto.CongesDto;
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

@Api("Manages conges services")
@RestController
@RequestMapping("/api/admin/conges/")
public class CongesRestAdmin  extends AbstractController<Conges, CongesDto, CongesHistory, CongesCriteria, CongesHistoryCriteria, CongesAdminService, CongesConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all congess")
    @GetMapping("")
    public ResponseEntity<List<CongesDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a conges by id")
    @GetMapping("id/{id}")
    public ResponseEntity<CongesDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  conges")
    @PostMapping("")
    public ResponseEntity<CongesDto> save(@RequestBody CongesDto dto) throws Exception {
        return congesAdminService.save(dto);
    }

    @ApiOperation("Updates the specified  conges")
    @PutMapping("")
    public ResponseEntity<CongesDto> update(@RequestBody CongesDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of conges")
    @PostMapping("multiple")
    public ResponseEntity<List<CongesDto>> delete(@RequestBody List<CongesDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified conges")
    @DeleteMapping("")
    public ResponseEntity<CongesDto> delete(@RequestBody CongesDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified conges")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple congess by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds congess by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<CongesDto>> findByCriteria(@RequestBody CongesCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated congess by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody CongesCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports congess by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody CongesCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets conges data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody CongesCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets conges history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets conges paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody CongesHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports conges history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody CongesHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets conges history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody CongesHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public CongesRestAdmin (CongesAdminService service, CongesConverter converter) {
        super(service, converter);
    }
    @Autowired
    private CongesAdminServiceImpl congesAdminService;


}