package com.academia.matriculas.Talumno.infrastructure.controller

//import org.springframework.security.access.prepost.PreAuthorize
import com.academia.matriculas.Talumno.application.AlumnoEndPoints
import com.academia.matriculas.Talumno.application.FotoAlumnoEndPoints
import com.academia.matriculas.Talumno.domain.Alumnos
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile
import java.net.URI

@RequestMapping("/api/v1/matriculas")
@RestController

// @PreAuthorize("hasRole('ADMIN')")
class SpringAlumnoController (@Autowired private val alumnoEndpoints: AlumnoEndPoints,
                              @Autowired private val fotoAlumnoEndPoints: FotoAlumnoEndPoints)
 {
     @PostMapping(value= ["/alumno/{userId}/profile-picture"], consumes = [MediaType.MULTIPART_FORM_DATA_VALUE])
     fun setProfilePicture(@PathVariable("userId") dni: String, @RequestParam file: MultipartFile): ResponseEntity<Void> {
         return try {
             fotoAlumnoEndPoints.setProfilePicture(dni, file)
             ResponseEntity
                 .created(URI("/alumno/${dni}/profile-picture"))
                 .build()
         } catch(error: NoSuchElementException){
             ResponseEntity
                 .notFound()
                 .build()
         }
     }
     //@PreAuthorize("hasAuthority('admin:create')")

     //@PreAuthorize("hasAuthority('admin:create')")
     @PostMapping("/alumno")
    fun createAlumno(@RequestBody alumno: Alumnos) =
        alumnoEndpoints.createAlumno(alumno)

    @PutMapping("/alumno/update")
    fun updateAlumno(@RequestBody alumno: Alumnos)=
        alumnoEndpoints.updateAlumno(alumno)

    @GetMapping("/alumno/{id}")
    fun getAlumno(@PathVariable id: Long): Alumnos =
        alumnoEndpoints.getAlumnoById(id)

    @GetMapping("/alumno/dni/{dni}")
    fun getExistAlumno(@PathVariable dni:String): Alumnos =
        alumnoEndpoints.getAlumnoByDni(dni)

    @GetMapping("/alumnos")
    fun getAlumnos(): List<Alumnos> =
        alumnoEndpoints.getAlumnos()

    @GetMapping("/alumnos/order/{field}")
    fun getAlumnosWithSort(@PathVariable field: String): List<Alumnos> =
        alumnoEndpoints.findAlumnosWithSorting(field)

    @GetMapping("/alumnos/pagination/{offset}/{pageSize}")
    fun getAlumnosWithPagination(@PathVariable offset:Int, @PathVariable pageSize:Int) : Page<Alumnos> =
        alumnoEndpoints.findAlumnosWithPagination(offset,pageSize)

    @DeleteMapping("/alumno/{id}")
    fun deleteAlumno(@PathVariable id: Long)=
        alumnoEndpoints.deleteAlumno(id)
}