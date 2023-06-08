package  ma.sir.hr.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.hr.bean.core.Echelle;
import ma.sir.hr.bean.history.EchelleHistory;
import ma.sir.hr.dao.criteria.core.EchelleCriteria;
import ma.sir.hr.dao.criteria.history.EchelleHistoryCriteria;
import ma.sir.hr.service.facade.admin.EchelleAdminService;
import ma.sir.hr.ws.converter.EchelleConverter;
import ma.sir.hr.ws.dto.EchelleDto;
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

@Api("Manages echelle services")
@RestController
@RequestMapping("/api/admin/echelle/")
public class EchelleRestAdmin  extends AbstractController<Echelle, EchelleDto, EchelleHistory, EchelleCriteria, EchelleHistoryCriteria, EchelleAdminService, EchelleConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all echelles")
    @GetMapping("")
    public ResponseEntity<List<EchelleDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all echelles")
    @GetMapping("optimized")
    public ResponseEntity<List<EchelleDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a echelle by id")
    @GetMapping("id/{id}")
    public ResponseEntity<EchelleDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  echelle")
    @PostMapping("")
    public ResponseEntity<EchelleDto> save(@RequestBody EchelleDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  echelle")
    @PutMapping("")
    public ResponseEntity<EchelleDto> update(@RequestBody EchelleDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of echelle")
    @PostMapping("multiple")
    public ResponseEntity<List<EchelleDto>> delete(@RequestBody List<EchelleDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified echelle")
    @DeleteMapping("")
    public ResponseEntity<EchelleDto> delete(@RequestBody EchelleDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified echelle")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple echelles by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    /* @ApiOperation("find by echelle id")
 @GetMapping("echelle/id/{id}")
   public List<Echelle> findByEchelleId(@PathVariable Long id){
       return service.findByEchelleId(id);
   }
   @ApiOperation("delete by echelle id")
   @DeleteMapping("echelle/id/{id}")
   public int deleteByEchelleId(@PathVariable Long id){
       return service.deleteByEchelleId(id);
   }*/
    @ApiOperation("Finds echelles by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<EchelleDto>> findByCriteria(@RequestBody EchelleCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated echelles by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody EchelleCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports echelles by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody EchelleCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets echelle data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody EchelleCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets echelle history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets echelle paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody EchelleHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports echelle history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody EchelleHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets echelle history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody EchelleHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public EchelleRestAdmin (EchelleAdminService service, EchelleConverter converter) {
        super(service, converter);
    }


}