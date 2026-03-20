package com.example.datvexemphim.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "phong_chieu")
public class PhongChieu {
    @Id
    @ColumnDefault("newsequentialid()")
    @Column(name = "id", nullable = false)
    private UUID id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "rap_chieu_id", nullable = false)
    private com.example.datvexemphim.entity.RapChieu rapChieu;

    @Size(max = 50)
    @Column(name = "ma", length = 50)
    private String ma;

    @Size(max = 100)
    @NotNull
    @Nationalized
    @Column(name = "ten", nullable = false, length = 100)
    private String ten;

    @ColumnDefault("0")
    @Column(name = "suc_chua")
    private Integer sucChua;

    @ColumnDefault("0")
    @Column(name = "loai_may_chieu")
    private Integer loaiMayChieu;

    @ColumnDefault("1")
    @Column(name = "trang_thai")
    private Integer trangThai;

}