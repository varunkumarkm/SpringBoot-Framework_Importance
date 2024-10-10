package com.eazybytes.accounts.Dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @NotEmpty(message = "AccountNumber can not be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number must be 10 digits")
    @Schema(
            description = "Account Number of Eazy Bank account", example = "1234567890"
    )
    private Long accountNumber;

    @NotEmpty(message = "AccountType cannot be a null or empty")
    @Schema(
            description = "Account type for Eazy Bank account", example = "Savings"
    )
    private String accountType;

    @NotEmpty(message = "BranchAddress can not be a null or empty")
    @Schema(
            description = "Eazy bank branch address", example = "123 Main Street, San Francisco, CA 94105"
    )
    private String branchAddress;
}
