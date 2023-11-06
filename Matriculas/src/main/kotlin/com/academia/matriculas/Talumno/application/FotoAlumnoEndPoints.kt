package com.academia.matriculas.Talumno.application

import org.springframework.web.multipart.MultipartFile

class FotoAlumnoEndPoints (private val fotoAlumnoService: FotoAlumnoService) {
    fun setProfilePicture(dni: String, file: MultipartFile): Unit =
        fotoAlumnoService.subirFotoAlumno(dni,file)
}


