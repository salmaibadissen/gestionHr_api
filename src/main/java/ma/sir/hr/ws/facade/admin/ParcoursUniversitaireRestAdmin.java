package  ma.sir.hr.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.hr.bean.core.ParcoursUniversitaire;
import ma.sir.hr.bean.history.ParcoursUniversitaireHistory;
import ma.sir.hr.dao.criteria.core.ParcoursUniversitaireCriteria;
import ma.sir.hr.dao.criteria.history.ParcoursUniversitaireHistoryCriteria;
import ma.sir.hr.service.facade.admin.ParcoursUniversitaireAdminService;
import ma.sir.hr.ws.converter.ParcoursUniversitaireConverter;
import ma.sir.hr.ws.dto.ParcoursUniversitaireDto;
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

@Api("Manages parcoursUniversitaire services")
@RestController
@RequestMapping("/api/admin/parcoursUniversitaire/")
public class ParcoursUniversitaireRestAdmin  extends AbstractController<ParcoursUniversitaire, ParcoursUniversitaireDto, ParcoursUniversitaireHistory, ParcoursUniversitaireCriteria, ParcoursUniversitaireHistoryCriteria, ParcoursUniversitaireAdminService, ParcoursUniversitaireConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all parcoursUniversitaires")
    @GetMapping("")
    public ResponseEntity<List<ParcoursUniversitaireDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a parcoursUniversitaire by id")
    @GetMapping("id/{id}")
    public ResponseEntity<ParcoursUniversitaireDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  parcoursUniversitaire")
    @PostMapping("")
    public ResponseEntity<ParcoursUniversitaireDto> save(@RequestBody ParcoursUniversitaireDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  parcoursUniversitaire")
    @PutMapping("")
    public ResponseEntity<ParcoursUniversitaireDto> update(@RequestBody ParcoursUniversitaireDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of parcoursUniversitaire")
    @PostMapping("multiple")
    public ResponseEntity<List<ParcoursUniversitaireDto>> delete(@RequestBody List<ParcoursUniversitaireDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified parcoursUniversitaire")
    @DeleteMapping("")
    public ResponseEntity<ParcoursUniversitaireDto> delete(@RequestBody ParcoursUniversitaireDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified parcoursUniversitaire")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple parcoursUniversitaires by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds parcoursUniversitaires by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<ParcoursUniversitaireDto>> findByCriteria(@RequestBody ParcoursUniversitaireCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated parcoursUniversitaires by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ParcoursUniversitaireCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports parcoursUniversitaires by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody ParcoursUniversitaireCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets parcoursUniversitaire data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody ParcoursUniversitaireCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets parcoursUniversitaire history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets parcoursUniversitaire paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ParcoursUniversitaireHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports parcoursUniversitaire history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ParcoursUniversitaireHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets parcoursUniversitaire history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ParcoursUniversitaireHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public ParcoursUniversitaireRestAdmin (ParcoursUniversitaireAdminService service, ParcoursUniversitaireConverter converter) {
        super(service, converter);
    }


}