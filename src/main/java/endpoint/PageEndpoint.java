package endpoint;

import dto.PageDTO;
import service.PageServiceLocal;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.List;

@Path("/mangas/{manga}/scans/{scan}/pages")
public class PageEndpoint {

    @EJB
    private PageServiceLocal pageService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<PageDTO> getPageDTOList(
            @PathParam("manga") String manga,
            @PathParam("scan") String scan) throws IOException {
        return pageService.getPageDTOList(manga, scan);
    }
}
