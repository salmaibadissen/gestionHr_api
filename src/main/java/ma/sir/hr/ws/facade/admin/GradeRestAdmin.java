package  ma.sir.hr.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.hr.bean.core.Grade;
import ma.sir.hr.bean.history.GradeHistory;
import ma.sir.hr.dao.criteria.core.GradeCriteria;
import ma.sir.hr.dao.criteria.history.GradeHistoryCriteria;
import ma.sir.hr.service.facade.admin.GradeAdminService;
import ma.sir.hr.ws.converter.GradeConverter;
import ma.sir.hr.ws.dto.GradeDto;
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

@Api("Manages grade services")
@RestController
@RequestMapping("/api/admin/grade/")
public class GradeRestAdmin  extends AbstractController<Grade, GradeDto, GradeHistory, GradeCriteria, GradeHistoryCriteria, GradeAdminService, GradeConverter> {



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
    public ResponseEntity<List<GradeDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all grades")
    @GetMapping("optimized")
    public ResponseEntity<List<GradeDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a grade by id")
    @GetMapping("id/{id}")
    public ResponseEntity<GradeDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  grade")
    @PostMapping("")
    public ResponseEntity<GradeDto> save(@RequestBody GradeDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  grade")
    @PutMapping("")
    public ResponseEntity<GradeDto> update(@RequestBody GradeDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of grade")
    @PostMapping("multiple")
    public ResponseEntity<List<GradeDto>> delete(@RequestBody List<GradeDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified grade")
    @DeleteMapping("")
    public ResponseEntity<GradeDto> delete(@RequestBody GradeDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified grade")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple grades by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds grades by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<GradeDto>> findByCriteria(@RequestBody GradeCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated grades by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody GradeCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports grades by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody GradeCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets grade data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody GradeCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets grade history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets grade paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody GradeHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports grade history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody GradeHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets grade history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody GradeHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public GradeRestAdmin (GradeAdminService service, GradeConverter converter) {
        super(service, converter);
    }


}