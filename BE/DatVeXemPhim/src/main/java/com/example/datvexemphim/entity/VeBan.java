package com.example.datvexemphim.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "ve_ban")
public class VeBan {
    @Id
    @ColumnDefault("newsequentialid()")
    @Column(name = "id", nullable = false)
    private UUID id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "suat_chieu_id", nullable = false)
    private SuatChieu suatChieu;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ghe_ngoi_id", nullable = false)
    private GheNgoi gheNgoi;

    @Size(max = 50)
    @Column(name = "ma_ve", length = 50)
    private String maVe;

    @NotNull
    @Column(name = "gia_ve_thuc_te", nullable = false, precision = 38, scale = 2)
    private BigDecimal giaVeThucTe;

    @Column(name = "thoi_gian_check_in")
    private Instant thoiGianCheckIn;

    @ColumnDefault("0")
    @Column(name = "trang_thai")
    private Integer trangThai;

}