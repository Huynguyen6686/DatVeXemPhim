package com.example.datvexemphim.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "khuyen_mai")
public class KhuyenMai {
    @Id
    @ColumnDefault("newsequentialid()")
    @Column(name = "id", nullable = false)
    private UUID id;

    @Size(max = 50)
    @NotNull
    @Column(name = "ma_code", nullable = false, length = 50)
    private String maCode;

    @Size(max = 100)
    @NotNull
    @Nationalized
    @Column(name = "ten", nullable = false, length = 100)
    private String ten;

    @ColumnDefault("0")
    @Column(name = "phan_tram_giam")
    private Integer phanTramGiam;

    @ColumnDefault("0")
    @Column(name = "giam_toi_da", precision = 38, scale = 2)
    private BigDecimal giamToiDa;

    @ColumnDefault("0")
    @Column(name = "so_luong")
    private Integer soLuong;

    @NotNull
    @Column(name = "thoi_gian_bat_dau", nullable = false)
    private Instant thoiGianBatDau;

    @NotNull
    @Column(name = "thoi_gian_ket_thuc", nullable = false)
    private Instant thoiGianKetThuc;

    @Size(max = 255)
    @Nationalized
    @Column(name = "mo_ta")
    private String moTa;

    @ColumnDefault("1")
    @Column(name = "trang_thai")
    private Integer trangThai;

}