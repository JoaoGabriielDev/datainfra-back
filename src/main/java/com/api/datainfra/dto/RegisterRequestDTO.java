package com.api.datainfra.dto;

public record RegisterRequestDTO (String name, String email, String cpf, String phone, String cep, String password){
}
