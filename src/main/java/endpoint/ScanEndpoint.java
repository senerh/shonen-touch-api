package endpoint;

import dto.ScanDTO;
import service.ScanServiceLocal;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.List;

@Path("/mangas/{manga}/scans")
public class ScanEndpoint {

    @EJB
    private ScanServiceLocal scanService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ScanDTO> getScanDTOList(@PathParam("manga") String manga) throws IOException {
        return scanService.getScanDTOList(manga);
    }

    @GET
    @Path("/last")
    @Produces(MediaType.APPLICATION_JSON)
    public ScanDTO getLastScanDTO(@PathParam("manga") String manga) throws IOException {
        return scanService.getLastScanDTO(manga);
    }

}
