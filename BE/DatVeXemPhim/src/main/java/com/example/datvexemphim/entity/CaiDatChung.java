package com.example.datvexemphim.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "cai_dat_chung")
public class CaiDatChung {
    @Id
    @ColumnDefault("newsequentialid()")
    @Column(name = "id", nullable = false)
    private UUID id;

    @ColumnDefault("10")
    @Column(name = "thoi_gian_giu_ghe")
    private Integer thoiGianGiuGhe;

    @ColumnDefault("15")
    @Column(name = "thoi_gian_nghi_suat_chieu")
    private Integer thoiGianNghiSuatChieu;

    @ColumnDefault("'08:00:00'")
    @Column(name = "gio_mo_cua")
    private LocalTime gioMoCua;

    @ColumnDefault("'23:30:00'")
    @Column(name = "gio_dong_cua")
    private LocalTime gioDongCua;

    @ColumnDefault("60000")
    @Column(name = "gia_ve_co_ban_mac_dinh", precision = 38, scale = 2)
    private BigDecimal giaVeCoBanMacDinh;

    @ColumnDefault("5")
    @Column(name = "ty_le_tich_diem")
    private Integer tyLeTichDiem;

}