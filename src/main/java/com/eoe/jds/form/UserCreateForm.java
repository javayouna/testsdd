package com.eoe.jds.form;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
public class UserCreateForm {
    @Size(min = 3, max = 10, message = "📌사용자 ID는 3~10자 사이로 입력해주세요.")
    @NotEmpty(message = "📌사용자 ID는 필수항목입니다.")
    @NotBlank(message = "📌사용자 ID는 공백만 들어갈 수 없습니다.")
    @Pattern(regexp="^[ㄱ-ㅎ가-힣a-z0-9-_]{2,10}$", message = "📌사용자 ID는 특수문자를 제외한 3~10자리여야 합니다.")
    private String username;

    @Size(min =8, max =15, message = "📌비밀번호는 8~15자 사이로 입력해주세요.")
    @NotEmpty(message = "📌비밀번호는 필수항목입니다.")
    private String password1;

    @NotEmpty(message = "📌비밀번호 확인은 필수항목입니다.")
    private String password2;

    @NotEmpty(message = "📌이메일은 필수항목입니다.")
    @Email
    private String email;
}