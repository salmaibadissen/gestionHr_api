package  ma.sir.hr.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.hr.bean.core.Promotion;
import ma.sir.hr.bean.history.PromotionHistory;
import ma.sir.hr.dao.criteria.core.PromotionCriteria;
import ma.sir.hr.dao.criteria.history.PromotionHistoryCriteria;
import ma.sir.hr.service.facade.admin.PromotionAdminService;
import ma.sir.hr.ws.converter.PromotionConverter;
import ma.sir.hr.ws.dto.PromotionDto;
import ma.sir.hr.zynerator.controller.AbstractController;
import ma.sir.hr.zynerator.dto.AuditEntityDto;
import ma.sir.hr.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;
import ma.sir.hr.zynerator.dto.FileTempDto;

@Api("Manages grade services")
@RestController
@RequestMapping("/api/admin/promotion/")
public class PromotionRestAdmin extends AbstractController<Promotion, PromotionDto, PromotionHistory, PromotionCriteria, PromotionHistoryCriteria, PromotionAdminService, PromotionConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all grades")
    @GetMapping("")
    public ResponseEntity<List<PromotionDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all grades")
    @GetMapping("optimized")
    public ResponseEntity<List<PromotionDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a promotion by id")
    @GetMapping("id/{id}")
    public ResponseEntity<PromotionDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  promotion")
    @PostMapping("")
    public ResponseEntity<PromotionDto> save(@RequestBody PromotionDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  promotion")
    @PutMapping("")
    public ResponseEntity<PromotionDto> update(@RequestBody PromotionDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of promotion")
    @PostMapping("multiple")
    public ResponseEntity<List<PromotionDto>> delete(@RequestBody List<PromotionDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified promotion")
    @DeleteMapping("")
    public ResponseEntity<PromotionDto> delete(@RequestBody PromotionDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified promotion")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple promotion by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds promotions by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<PromotionDto>> findByCriteria(@RequestBody PromotionCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated promotions by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PromotionCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports promotions by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody PromotionCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets promotion data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody PromotionCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets promotion history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets promotion paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody PromotionHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports promotion history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody PromotionHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets promotion history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody PromotionHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public PromotionRestAdmin(PromotionAdminService service, PromotionConverter converter) {
        super(service, converter);
    }


}