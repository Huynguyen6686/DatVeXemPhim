package com.example.datvexemphim.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "ghe_ngoi")
public class GheNgoi {
    @Id
    @ColumnDefault("newsequentialid()")
    @Column(name = "id", nullable = false)
    private UUID id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "phong_chieu_id", nullable = false)
    private com.example.datvexemphim.entity.PhongChieu phongChieu;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "loai_ghe_id", nullable = false)
    private com.example.datvexemphim.entity.LoaiGhe loaiGhe;

    @Size(max = 20)
    @NotNull
    @Column(name = "ma_ghe", nullable = false, length = 20)
    private String maGhe;

    @Size(max = 10)
    @NotNull
    @Column(name = "hang_ghe", nullable = false, length = 10)
    private String hangGhe;

    @NotNull
    @Column(name = "so_thu_tu", nullable = false)
    private Integer soThuTu;

    @ColumnDefault("1")
    @Column(name = "trang_thai")
    private Integer trangThai;

}