package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    private String nombre;
    private String apellido;
    private String edad;

    public Cliente(String nombre, String apellido) {

    }

}
