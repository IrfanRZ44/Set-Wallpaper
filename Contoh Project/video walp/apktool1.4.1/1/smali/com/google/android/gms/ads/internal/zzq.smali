.class public final Lcom/google/android/gms/ads/internal/zzq;
.super Lcom/google/android/gms/ads/internal/zzd;

# interfaces
.implements Lcom/google/android/gms/internal/ads/ats;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation

.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field private k:Z

.field private l:Lcom/google/android/gms/internal/ads/ij;

.field private m:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/zzw;Lcom/google/android/gms/internal/ads/zzjn;Ljava/lang/String;Lcom/google/android/gms/internal/ads/bck;Lcom/google/android/gms/internal/ads/zzang;)V
    .locals 7

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/ads/internal/zzd;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzjn;Ljava/lang/String;Lcom/google/android/gms/internal/ads/bck;Lcom/google/android/gms/internal/ads/zzang;Lcom/google/android/gms/ads/internal/zzw;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzq;->m:Z

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/ads/internal/zzq;)Lcom/google/android/gms/internal/ads/ij;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->l:Lcom/google/android/gms/internal/ads/ij;

    return-object v0
.end method

.method private static a(Lcom/google/android/gms/internal/ads/ik;I)Lcom/google/android/gms/internal/ads/ij;
    .locals 46

    new-instance v2, Lcom/google/android/gms/internal/ads/ij;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/ik;->a:Lcom/google/android/gms/internal/ads/zzaef;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzaef;->c:Lcom/google/android/gms/internal/ads/zzjj;

    const/4 v4, 0x0

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/ik;->b:Lcom/google/android/gms/internal/ads/zzaej;

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzaej;->c:Ljava/util/List;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/ik;->b:Lcom/google/android/gms/internal/ads/zzaej;

    iget-object v7, v6, Lcom/google/android/gms/internal/ads/zzaej;->e:Ljava/util/List;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/ik;->b:Lcom/google/android/gms/internal/ads/zzaej;

    iget-object v8, v6, Lcom/google/android/gms/internal/ads/zzaej;->i:Ljava/util/List;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/ik;->b:Lcom/google/android/gms/internal/ads/zzaej;

    iget v9, v6, Lcom/google/android/gms/internal/ads/zzaej;->k:I

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/ik;->b:Lcom/google/android/gms/internal/ads/zzaej;

    iget-wide v10, v6, Lcom/google/android/gms/internal/ads/zzaej;->j:J

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/ik;->a:Lcom/google/android/gms/internal/ads/zzaef;

    iget-object v12, v6, Lcom/google/android/gms/internal/ads/zzaef;->i:Ljava/lang/String;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/ik;->b:Lcom/google/android/gms/internal/ads/zzaej;

    iget-boolean v13, v6, Lcom/google/android/gms/internal/ads/zzaej;->g:Z

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/ik;->c:Lcom/google/android/gms/internal/ads/bbu;

    move-object/from16 v17, v0

    const/16 v18, 0x0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/ik;->b:Lcom/google/android/gms/internal/ads/zzaej;

    iget-wide v0, v6, Lcom/google/android/gms/internal/ads/zzaej;->h:J

    move-wide/from16 v19, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/ik;->d:Lcom/google/android/gms/internal/ads/zzjn;

    move-object/from16 v21, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/ik;->b:Lcom/google/android/gms/internal/ads/zzaej;

    iget-wide v0, v6, Lcom/google/android/gms/internal/ads/zzaej;->f:J

    move-wide/from16 v22, v0

    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/ik;->f:J

    move-wide/from16 v24, v0

    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/ik;->g:J

    move-wide/from16 v26, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/ik;->b:Lcom/google/android/gms/internal/ads/zzaej;

    iget-object v0, v6, Lcom/google/android/gms/internal/ads/zzaej;->n:Ljava/lang/String;

    move-object/from16 v28, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/ik;->h:Lorg/json/JSONObject;

    move-object/from16 v29, v0

    const/16 v30, 0x0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/ik;->b:Lcom/google/android/gms/internal/ads/zzaej;

    iget-object v0, v6, Lcom/google/android/gms/internal/ads/zzaej;->A:Lcom/google/android/gms/internal/ads/zzaig;

    move-object/from16 v31, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/ik;->b:Lcom/google/android/gms/internal/ads/zzaej;

    iget-object v0, v6, Lcom/google/android/gms/internal/ads/zzaej;->B:Ljava/util/List;

    move-object/from16 v32, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/ik;->b:Lcom/google/android/gms/internal/ads/zzaej;

    iget-object v0, v6, Lcom/google/android/gms/internal/ads/zzaej;->B:Ljava/util/List;

    move-object/from16 v33, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/ik;->b:Lcom/google/android/gms/internal/ads/zzaej;

    iget-boolean v0, v6, Lcom/google/android/gms/internal/ads/zzaej;->D:Z

    move/from16 v34, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/ik;->b:Lcom/google/android/gms/internal/ads/zzaej;

    iget-object v0, v6, Lcom/google/android/gms/internal/ads/zzaej;->E:Lcom/google/android/gms/internal/ads/zzael;

    move-object/from16 v35, v0

    const/16 v36, 0x0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/ik;->b:Lcom/google/android/gms/internal/ads/zzaej;

    iget-object v0, v6, Lcom/google/android/gms/internal/ads/zzaej;->H:Ljava/util/List;

    move-object/from16 v37, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/ik;->b:Lcom/google/android/gms/internal/ads/zzaej;

    iget-object v0, v6, Lcom/google/android/gms/internal/ads/zzaej;->L:Ljava/lang/String;

    move-object/from16 v38, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/ik;->i:Lcom/google/android/gms/internal/ads/amj;

    move-object/from16 v39, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/ik;->b:Lcom/google/android/gms/internal/ads/zzaej;

    iget-boolean v0, v6, Lcom/google/android/gms/internal/ads/zzaej;->O:Z

    move/from16 v40, v0

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/ik;->j:Z

    move/from16 v41, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/ik;->b:Lcom/google/android/gms/internal/ads/zzaej;

    iget-boolean v0, v6, Lcom/google/android/gms/internal/ads/zzaej;->Q:Z

    move/from16 v42, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/ik;->b:Lcom/google/android/gms/internal/ads/zzaej;

    iget-object v0, v6, Lcom/google/android/gms/internal/ads/zzaej;->R:Ljava/util/List;

    move-object/from16 v43, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/ik;->b:Lcom/google/android/gms/internal/ads/zzaej;

    iget-boolean v0, v6, Lcom/google/android/gms/internal/ads/zzaej;->S:Z

    move/from16 v44, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/ik;->b:Lcom/google/android/gms/internal/ads/zzaej;

    iget-object v0, v6, Lcom/google/android/gms/internal/ads/zzaej;->T:Ljava/lang/String;

    move-object/from16 v45, v0

    move/from16 v6, p1

    invoke-direct/range {v2 .. v45}, Lcom/google/android/gms/internal/ads/ij;-><init>(Lcom/google/android/gms/internal/ads/zzjj;Lcom/google/android/gms/internal/ads/qe;Ljava/util/List;ILjava/util/List;Ljava/util/List;IJLjava/lang/String;ZLcom/google/android/gms/internal/ads/bbt;Lcom/google/android/gms/internal/ads/bcn;Ljava/lang/String;Lcom/google/android/gms/internal/ads/bbu;Lcom/google/android/gms/internal/ads/bbx;JLcom/google/android/gms/internal/ads/zzjn;JJJLjava/lang/String;Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/att;Lcom/google/android/gms/internal/ads/zzaig;Ljava/util/List;Ljava/util/List;ZLcom/google/android/gms/internal/ads/zzael;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/ads/amj;ZZZLjava/util/List;ZLjava/lang/String;)V

    return-object v2
.end method

.method private final a(Lcom/google/android/gms/internal/ads/atm;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/jn;->a:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/ads/internal/ar;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/ads/internal/ar;-><init>(Lcom/google/android/gms/ads/internal/zzq;Lcom/google/android/gms/internal/ads/atm;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private final a(Lcom/google/android/gms/internal/ads/ij;Lcom/google/android/gms/internal/ads/ij;)Z
    .locals 23

    const/4 v2, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/ads/internal/zzq;->zzd(Ljava/util/List;)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    invoke-virtual {v2}, Lcom/google/android/gms/ads/internal/zzbw;->zzfo()Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "Native ad does not have custom rendering mode."

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/je;->e(Ljava/lang/String;)V

    const/4 v2, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/ads/internal/zza;->a(I)V

    const/4 v2, 0x0

    :goto_0
    return v2

    :cond_0
    :try_start_0
    move-object/from16 v0, p2

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/ij;->p:Lcom/google/android/gms/internal/ads/bcn;

    if-eqz v2, :cond_1

    move-object/from16 v0, p2

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/ij;->p:Lcom/google/android/gms/internal/ads/bcn;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/bcn;->p()Lcom/google/android/gms/internal/ads/bdd;

    move-result-object v2

    move-object/from16 v22, v2

    :goto_1
    move-object/from16 v0, p2

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/ij;->p:Lcom/google/android/gms/internal/ads/bcn;

    if-eqz v2, :cond_2

    move-object/from16 v0, p2

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/ij;->p:Lcom/google/android/gms/internal/ads/bcn;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/bcn;->h()Lcom/google/android/gms/internal/ads/bcw;

    move-result-object v2

    move-object/from16 v21, v2

    :goto_2
    move-object/from16 v0, p2

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/ij;->p:Lcom/google/android/gms/internal/ads/bcn;

    if-eqz v2, :cond_3

    move-object/from16 v0, p2

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/ij;->p:Lcom/google/android/gms/internal/ads/bcn;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/bcn;->i()Lcom/google/android/gms/internal/ads/bda;

    move-result-object v2

    move-object/from16 v20, v2

    :goto_3
    move-object/from16 v0, p2

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/ij;->p:Lcom/google/android/gms/internal/ads/bcn;

    if-eqz v2, :cond_4

    move-object/from16 v0, p2

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/ij;->p:Lcom/google/android/gms/internal/ads/bcn;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/bcn;->n()Lcom/google/android/gms/internal/ads/avk;

    move-result-object v2

    :goto_4
    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/ads/internal/zzq;->b(Lcom/google/android/gms/internal/ads/ij;)Ljava/lang/String;

    move-result-object v18

    if-eqz v22, :cond_7

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/zzbw;->k:Lcom/google/android/gms/internal/ads/awe;

    if-eqz v3, :cond_7

    new-instance v3, Lcom/google/android/gms/internal/ads/atm;

    invoke-interface/range {v22 .. v22}, Lcom/google/android/gms/internal/ads/bdd;->a()Ljava/lang/String;

    move-result-object v4

    invoke-interface/range {v22 .. v22}, Lcom/google/android/gms/internal/ads/bdd;->b()Ljava/util/List;

    move-result-object v5

    invoke-interface/range {v22 .. v22}, Lcom/google/android/gms/internal/ads/bdd;->c()Ljava/lang/String;

    move-result-object v6

    invoke-interface/range {v22 .. v22}, Lcom/google/android/gms/internal/ads/bdd;->d()Lcom/google/android/gms/internal/ads/aun;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-interface/range {v22 .. v22}, Lcom/google/android/gms/internal/ads/bdd;->d()Lcom/google/android/gms/internal/ads/aun;

    move-result-object v7

    :goto_5
    invoke-interface/range {v22 .. v22}, Lcom/google/android/gms/internal/ads/bdd;->e()Ljava/lang/String;

    move-result-object v8

    invoke-interface/range {v22 .. v22}, Lcom/google/android/gms/internal/ads/bdd;->f()Ljava/lang/String;

    move-result-object v9

    invoke-interface/range {v22 .. v22}, Lcom/google/android/gms/internal/ads/bdd;->g()D

    move-result-wide v10

    invoke-interface/range {v22 .. v22}, Lcom/google/android/gms/internal/ads/bdd;->h()Ljava/lang/String;

    move-result-object v12

    invoke-interface/range {v22 .. v22}, Lcom/google/android/gms/internal/ads/bdd;->i()Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x0

    invoke-interface/range {v22 .. v22}, Lcom/google/android/gms/internal/ads/bdd;->j()Lcom/google/android/gms/internal/ads/aqg;

    move-result-object v15

    invoke-interface/range {v22 .. v22}, Lcom/google/android/gms/internal/ads/bdd;->m()Lcom/google/android/gms/a/a;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-interface/range {v22 .. v22}, Lcom/google/android/gms/internal/ads/bdd;->m()Lcom/google/android/gms/a/a;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/a/b;->a(Lcom/google/android/gms/a/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    move-object/from16 v16, v2

    :goto_6
    invoke-interface/range {v22 .. v22}, Lcom/google/android/gms/internal/ads/bdd;->n()Lcom/google/android/gms/a/a;

    move-result-object v17

    invoke-interface/range {v22 .. v22}, Lcom/google/android/gms/internal/ads/bdd;->o()Landroid/os/Bundle;

    move-result-object v19

    invoke-direct/range {v3 .. v19}, Lcom/google/android/gms/internal/ads/atm;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/ads/aun;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ata;Lcom/google/android/gms/internal/ads/aqg;Landroid/view/View;Lcom/google/android/gms/a/a;Ljava/lang/String;Landroid/os/Bundle;)V

    new-instance v4, Lcom/google/android/gms/internal/ads/atp;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v5, v2, Lcom/google/android/gms/ads/internal/zzbw;->zzrt:Landroid/content/Context;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v7, v2, Lcom/google/android/gms/ads/internal/zzbw;->b:Lcom/google/android/gms/internal/ads/agw;

    move-object/from16 v6, p0

    move-object/from16 v8, v22

    move-object v9, v3

    invoke-direct/range {v4 .. v9}, Lcom/google/android/gms/internal/ads/atp;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ats;Lcom/google/android/gms/internal/ads/agw;Lcom/google/android/gms/internal/ads/bdd;Lcom/google/android/gms/internal/ads/att;)V

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/atm;->a(Lcom/google/android/gms/internal/ads/atq;)V

    move-object/from16 v0, p0

    invoke-direct {v0, v3}, Lcom/google/android/gms/ads/internal/zzq;->a(Lcom/google/android/gms/internal/ads/atm;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_7
    invoke-super/range {p0 .. p2}, Lcom/google/android/gms/ads/internal/zzd;->zza(Lcom/google/android/gms/internal/ads/ij;Lcom/google/android/gms/internal/ads/ij;)Z

    move-result v2

    goto/16 :goto_0

    :cond_1
    const/4 v2, 0x0

    move-object/from16 v22, v2

    goto/16 :goto_1

    :cond_2
    const/4 v2, 0x0

    move-object/from16 v21, v2

    goto/16 :goto_2

    :cond_3
    const/4 v2, 0x0

    move-object/from16 v20, v2

    goto/16 :goto_3

    :cond_4
    const/4 v2, 0x0

    goto/16 :goto_4

    :cond_5
    const/4 v7, 0x0

    goto :goto_5

    :cond_6
    const/16 v16, 0x0

    goto :goto_6

    :cond_7
    if-eqz v21, :cond_a

    :try_start_1
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/zzbw;->k:Lcom/google/android/gms/internal/ads/awe;

    if-eqz v3, :cond_a

    new-instance v3, Lcom/google/android/gms/internal/ads/atm;

    invoke-interface/range {v21 .. v21}, Lcom/google/android/gms/internal/ads/bcw;->a()Ljava/lang/String;

    move-result-object v4

    invoke-interface/range {v21 .. v21}, Lcom/google/android/gms/internal/ads/bcw;->b()Ljava/util/List;

    move-result-object v5

    invoke-interface/range {v21 .. v21}, Lcom/google/android/gms/internal/ads/bcw;->c()Ljava/lang/String;

    move-result-object v6

    invoke-interface/range {v21 .. v21}, Lcom/google/android/gms/internal/ads/bcw;->d()Lcom/google/android/gms/internal/ads/aun;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-interface/range {v21 .. v21}, Lcom/google/android/gms/internal/ads/bcw;->d()Lcom/google/android/gms/internal/ads/aun;

    move-result-object v7

    :goto_8
    invoke-interface/range {v21 .. v21}, Lcom/google/android/gms/internal/ads/bcw;->e()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    invoke-interface/range {v21 .. v21}, Lcom/google/android/gms/internal/ads/bcw;->f()D

    move-result-wide v10

    invoke-interface/range {v21 .. v21}, Lcom/google/android/gms/internal/ads/bcw;->g()Ljava/lang/String;

    move-result-object v12

    invoke-interface/range {v21 .. v21}, Lcom/google/android/gms/internal/ads/bcw;->h()Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x0

    invoke-interface/range {v21 .. v21}, Lcom/google/android/gms/internal/ads/bcw;->m()Lcom/google/android/gms/internal/ads/aqg;

    move-result-object v15

    invoke-interface/range {v21 .. v21}, Lcom/google/android/gms/internal/ads/bcw;->p()Lcom/google/android/gms/a/a;

    move-result-object v2

    if-eqz v2, :cond_9

    invoke-interface/range {v21 .. v21}, Lcom/google/android/gms/internal/ads/bcw;->p()Lcom/google/android/gms/a/a;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/a/b;->a(Lcom/google/android/gms/a/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    move-object/from16 v16, v2

    :goto_9
    invoke-interface/range {v21 .. v21}, Lcom/google/android/gms/internal/ads/bcw;->q()Lcom/google/android/gms/a/a;

    move-result-object v17

    invoke-interface/range {v21 .. v21}, Lcom/google/android/gms/internal/ads/bcw;->l()Landroid/os/Bundle;

    move-result-object v19

    invoke-direct/range {v3 .. v19}, Lcom/google/android/gms/internal/ads/atm;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/ads/aun;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ata;Lcom/google/android/gms/internal/ads/aqg;Landroid/view/View;Lcom/google/android/gms/a/a;Ljava/lang/String;Landroid/os/Bundle;)V

    new-instance v4, Lcom/google/android/gms/internal/ads/atp;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v5, v2, Lcom/google/android/gms/ads/internal/zzbw;->zzrt:Landroid/content/Context;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v7, v2, Lcom/google/android/gms/ads/internal/zzbw;->b:Lcom/google/android/gms/internal/ads/agw;

    move-object/from16 v6, p0

    move-object/from16 v8, v21

    move-object v9, v3

    invoke-direct/range {v4 .. v9}, Lcom/google/android/gms/internal/ads/atp;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ats;Lcom/google/android/gms/internal/ads/agw;Lcom/google/android/gms/internal/ads/bcw;Lcom/google/android/gms/internal/ads/att;)V

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/atm;->a(Lcom/google/android/gms/internal/ads/atq;)V

    move-object/from16 v0, p0

    invoke-direct {v0, v3}, Lcom/google/android/gms/ads/internal/zzq;->a(Lcom/google/android/gms/internal/ads/atm;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_7

    :catch_0
    move-exception v2

    const-string v3, "#007 Could not call remote method."

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/ads/je;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v2, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/ads/internal/zza;->a(I)V

    const/4 v2, 0x0

    goto/16 :goto_0

    :cond_8
    const/4 v7, 0x0

    goto :goto_8

    :cond_9
    const/16 v16, 0x0

    goto :goto_9

    :cond_a
    if-eqz v21, :cond_d

    :try_start_2
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/zzbw;->i:Lcom/google/android/gms/internal/ads/avo;

    if-eqz v3, :cond_d

    new-instance v3, Lcom/google/android/gms/internal/ads/atf;

    invoke-interface/range {v21 .. v21}, Lcom/google/android/gms/internal/ads/bcw;->a()Ljava/lang/String;

    move-result-object v4

    invoke-interface/range {v21 .. v21}, Lcom/google/android/gms/internal/ads/bcw;->b()Ljava/util/List;

    move-result-object v5

    invoke-interface/range {v21 .. v21}, Lcom/google/android/gms/internal/ads/bcw;->c()Ljava/lang/String;

    move-result-object v6

    invoke-interface/range {v21 .. v21}, Lcom/google/android/gms/internal/ads/bcw;->d()Lcom/google/android/gms/internal/ads/aun;

    move-result-object v2

    if-eqz v2, :cond_b

    invoke-interface/range {v21 .. v21}, Lcom/google/android/gms/internal/ads/bcw;->d()Lcom/google/android/gms/internal/ads/aun;

    move-result-object v7

    :goto_a
    invoke-interface/range {v21 .. v21}, Lcom/google/android/gms/internal/ads/bcw;->e()Ljava/lang/String;

    move-result-object v8

    invoke-interface/range {v21 .. v21}, Lcom/google/android/gms/internal/ads/bcw;->f()D

    move-result-wide v9

    invoke-interface/range {v21 .. v21}, Lcom/google/android/gms/internal/ads/bcw;->g()Ljava/lang/String;

    move-result-object v11

    invoke-interface/range {v21 .. v21}, Lcom/google/android/gms/internal/ads/bcw;->h()Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x0

    invoke-interface/range {v21 .. v21}, Lcom/google/android/gms/internal/ads/bcw;->l()Landroid/os/Bundle;

    move-result-object v14

    invoke-interface/range {v21 .. v21}, Lcom/google/android/gms/internal/ads/bcw;->m()Lcom/google/android/gms/internal/ads/aqg;

    move-result-object v15

    invoke-interface/range {v21 .. v21}, Lcom/google/android/gms/internal/ads/bcw;->p()Lcom/google/android/gms/a/a;

    move-result-object v2

    if-eqz v2, :cond_c

    invoke-interface/range {v21 .. v21}, Lcom/google/android/gms/internal/ads/bcw;->p()Lcom/google/android/gms/a/a;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/a/b;->a(Lcom/google/android/gms/a/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    move-object/from16 v16, v2

    :goto_b
    invoke-interface/range {v21 .. v21}, Lcom/google/android/gms/internal/ads/bcw;->q()Lcom/google/android/gms/a/a;

    move-result-object v17

    invoke-direct/range {v3 .. v18}, Lcom/google/android/gms/internal/ads/atf;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/ads/aun;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ata;Landroid/os/Bundle;Lcom/google/android/gms/internal/ads/aqg;Landroid/view/View;Lcom/google/android/gms/a/a;Ljava/lang/String;)V

    new-instance v4, Lcom/google/android/gms/internal/ads/atp;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v5, v2, Lcom/google/android/gms/ads/internal/zzbw;->zzrt:Landroid/content/Context;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v7, v2, Lcom/google/android/gms/ads/internal/zzbw;->b:Lcom/google/android/gms/internal/ads/agw;

    move-object/from16 v6, p0

    move-object/from16 v8, v21

    move-object v9, v3

    invoke-direct/range {v4 .. v9}, Lcom/google/android/gms/internal/ads/atp;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ats;Lcom/google/android/gms/internal/ads/agw;Lcom/google/android/gms/internal/ads/bcw;Lcom/google/android/gms/internal/ads/att;)V

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/atf;->a(Lcom/google/android/gms/internal/ads/atq;)V

    sget-object v2, Lcom/google/android/gms/internal/ads/jn;->a:Landroid/os/Handler;

    new-instance v4, Lcom/google/android/gms/ads/internal/as;

    move-object/from16 v0, p0

    invoke-direct {v4, v0, v3}, Lcom/google/android/gms/ads/internal/as;-><init>(Lcom/google/android/gms/ads/internal/zzq;Lcom/google/android/gms/internal/ads/atf;)V

    invoke-virtual {v2, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_7

    :cond_b
    const/4 v7, 0x0

    goto :goto_a

    :cond_c
    const/16 v16, 0x0

    goto :goto_b

    :cond_d
    if-eqz v20, :cond_10

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/zzbw;->k:Lcom/google/android/gms/internal/ads/awe;

    if-eqz v3, :cond_10

    new-instance v3, Lcom/google/android/gms/internal/ads/atm;

    invoke-interface/range {v20 .. v20}, Lcom/google/android/gms/internal/ads/bda;->a()Ljava/lang/String;

    move-result-object v4

    invoke-interface/range {v20 .. v20}, Lcom/google/android/gms/internal/ads/bda;->b()Ljava/util/List;

    move-result-object v5

    invoke-interface/range {v20 .. v20}, Lcom/google/android/gms/internal/ads/bda;->c()Ljava/lang/String;

    move-result-object v6

    invoke-interface/range {v20 .. v20}, Lcom/google/android/gms/internal/ads/bda;->d()Lcom/google/android/gms/internal/ads/aun;

    move-result-object v2

    if-eqz v2, :cond_e

    invoke-interface/range {v20 .. v20}, Lcom/google/android/gms/internal/ads/bda;->d()Lcom/google/android/gms/internal/ads/aun;

    move-result-object v7

    :goto_c
    invoke-interface/range {v20 .. v20}, Lcom/google/android/gms/internal/ads/bda;->e()Ljava/lang/String;

    move-result-object v8

    invoke-interface/range {v20 .. v20}, Lcom/google/android/gms/internal/ads/bda;->f()Ljava/lang/String;

    move-result-object v9

    const-wide/high16 v10, -0x4010

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-interface/range {v20 .. v20}, Lcom/google/android/gms/internal/ads/bda;->l()Lcom/google/android/gms/internal/ads/aqg;

    move-result-object v15

    invoke-interface/range {v20 .. v20}, Lcom/google/android/gms/internal/ads/bda;->n()Lcom/google/android/gms/a/a;

    move-result-object v2

    if-eqz v2, :cond_f

    invoke-interface/range {v20 .. v20}, Lcom/google/android/gms/internal/ads/bda;->n()Lcom/google/android/gms/a/a;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/a/b;->a(Lcom/google/android/gms/a/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    move-object/from16 v16, v2

    :goto_d
    invoke-interface/range {v20 .. v20}, Lcom/google/android/gms/internal/ads/bda;->o()Lcom/google/android/gms/a/a;

    move-result-object v17

    invoke-interface/range {v20 .. v20}, Lcom/google/android/gms/internal/ads/bda;->j()Landroid/os/Bundle;

    move-result-object v19

    invoke-direct/range {v3 .. v19}, Lcom/google/android/gms/internal/ads/atm;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/ads/aun;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ata;Lcom/google/android/gms/internal/ads/aqg;Landroid/view/View;Lcom/google/android/gms/a/a;Ljava/lang/String;Landroid/os/Bundle;)V

    new-instance v4, Lcom/google/android/gms/internal/ads/atp;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v5, v2, Lcom/google/android/gms/ads/internal/zzbw;->zzrt:Landroid/content/Context;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v7, v2, Lcom/google/android/gms/ads/internal/zzbw;->b:Lcom/google/android/gms/internal/ads/agw;

    move-object/from16 v6, p0

    move-object/from16 v8, v20

    move-object v9, v3

    invoke-direct/range {v4 .. v9}, Lcom/google/android/gms/internal/ads/atp;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ats;Lcom/google/android/gms/internal/ads/agw;Lcom/google/android/gms/internal/ads/bda;Lcom/google/android/gms/internal/ads/att;)V

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/atm;->a(Lcom/google/android/gms/internal/ads/atq;)V

    move-object/from16 v0, p0

    invoke-direct {v0, v3}, Lcom/google/android/gms/ads/internal/zzq;->a(Lcom/google/android/gms/internal/ads/atm;)V

    goto/16 :goto_7

    :cond_e
    const/4 v7, 0x0

    goto :goto_c

    :cond_f
    const/16 v16, 0x0

    goto :goto_d

    :cond_10
    if-eqz v20, :cond_13

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/zzbw;->j:Lcom/google/android/gms/internal/ads/avr;

    if-eqz v3, :cond_13

    new-instance v6, Lcom/google/android/gms/internal/ads/ath;

    invoke-interface/range {v20 .. v20}, Lcom/google/android/gms/internal/ads/bda;->a()Ljava/lang/String;

    move-result-object v7

    invoke-interface/range {v20 .. v20}, Lcom/google/android/gms/internal/ads/bda;->b()Ljava/util/List;

    move-result-object v8

    invoke-interface/range {v20 .. v20}, Lcom/google/android/gms/internal/ads/bda;->c()Ljava/lang/String;

    move-result-object v9

    invoke-interface/range {v20 .. v20}, Lcom/google/android/gms/internal/ads/bda;->d()Lcom/google/android/gms/internal/ads/aun;

    move-result-object v2

    if-eqz v2, :cond_11

    invoke-interface/range {v20 .. v20}, Lcom/google/android/gms/internal/ads/bda;->d()Lcom/google/android/gms/internal/ads/aun;

    move-result-object v10

    :goto_e
    invoke-interface/range {v20 .. v20}, Lcom/google/android/gms/internal/ads/bda;->e()Ljava/lang/String;

    move-result-object v11

    invoke-interface/range {v20 .. v20}, Lcom/google/android/gms/internal/ads/bda;->f()Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x0

    invoke-interface/range {v20 .. v20}, Lcom/google/android/gms/internal/ads/bda;->j()Landroid/os/Bundle;

    move-result-object v14

    invoke-interface/range {v20 .. v20}, Lcom/google/android/gms/internal/ads/bda;->l()Lcom/google/android/gms/internal/ads/aqg;

    move-result-object v15

    invoke-interface/range {v20 .. v20}, Lcom/google/android/gms/internal/ads/bda;->n()Lcom/google/android/gms/a/a;

    move-result-object v2

    if-eqz v2, :cond_12

    invoke-interface/range {v20 .. v20}, Lcom/google/android/gms/internal/ads/bda;->n()Lcom/google/android/gms/a/a;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/a/b;->a(Lcom/google/android/gms/a/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    move-object/from16 v16, v2

    :goto_f
    invoke-interface/range {v20 .. v20}, Lcom/google/android/gms/internal/ads/bda;->o()Lcom/google/android/gms/a/a;

    move-result-object v17

    invoke-direct/range {v6 .. v18}, Lcom/google/android/gms/internal/ads/ath;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/ads/aun;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ata;Landroid/os/Bundle;Lcom/google/android/gms/internal/ads/aqg;Landroid/view/View;Lcom/google/android/gms/a/a;Ljava/lang/String;)V

    new-instance v7, Lcom/google/android/gms/internal/ads/atp;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v8, v2, Lcom/google/android/gms/ads/internal/zzbw;->zzrt:Landroid/content/Context;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v10, v2, Lcom/google/android/gms/ads/internal/zzbw;->b:Lcom/google/android/gms/internal/ads/agw;

    move-object/from16 v9, p0

    move-object/from16 v11, v20

    move-object v12, v6

    invoke-direct/range {v7 .. v12}, Lcom/google/android/gms/internal/ads/atp;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ats;Lcom/google/android/gms/internal/ads/agw;Lcom/google/android/gms/internal/ads/bda;Lcom/google/android/gms/internal/ads/att;)V

    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/ads/ath;->a(Lcom/google/android/gms/internal/ads/atq;)V

    sget-object v2, Lcom/google/android/gms/internal/ads/jn;->a:Landroid/os/Handler;

    new-instance v3, Lcom/google/android/gms/ads/internal/at;

    move-object/from16 v0, p0

    invoke-direct {v3, v0, v6}, Lcom/google/android/gms/ads/internal/at;-><init>(Lcom/google/android/gms/ads/internal/zzq;Lcom/google/android/gms/internal/ads/ath;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_7

    :cond_11
    const/4 v10, 0x0

    goto :goto_e

    :cond_12
    const/16 v16, 0x0

    goto :goto_f

    :cond_13
    if-eqz v2, :cond_14

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/zzbw;->m:Landroid/support/v4/f/m;

    if-eqz v3, :cond_14

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/zzbw;->m:Landroid/support/v4/f/m;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/avk;->l()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/support/v4/f/m;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_14

    sget-object v3, Lcom/google/android/gms/internal/ads/jn;->a:Landroid/os/Handler;

    new-instance v4, Lcom/google/android/gms/ads/internal/au;

    move-object/from16 v0, p0

    invoke-direct {v4, v0, v2}, Lcom/google/android/gms/ads/internal/au;-><init>(Lcom/google/android/gms/ads/internal/zzq;Lcom/google/android/gms/internal/ads/avk;)V

    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_7

    :cond_14
    const-string v2, "No matching mapper/listener for retrieved native ad template."

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/je;->e(Ljava/lang/String;)V

    const/4 v2, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/ads/internal/zza;->a(I)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    const/4 v2, 0x0

    goto/16 :goto_0
.end method

.method private final b(Lcom/google/android/gms/internal/ads/ij;Lcom/google/android/gms/internal/ads/ij;)Z
    .locals 5

    const/4 v3, 0x1

    const/4 v2, 0x0

    invoke-static {p2}, Lcom/google/android/gms/ads/internal/zzas;->zze(Lcom/google/android/gms/internal/ads/ij;)Landroid/view/View;

    move-result-object v4

    if-nez v4, :cond_0

    move v0, v2

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->c:Lcom/google/android/gms/ads/internal/zzbx;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzbx;->getNextView()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_2

    instance-of v0, v1, Lcom/google/android/gms/internal/ads/qe;

    if-eqz v0, :cond_1

    move-object v0, v1

    check-cast v0, Lcom/google/android/gms/internal/ads/qe;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/qe;->destroy()V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->c:Lcom/google/android/gms/ads/internal/zzbx;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/zzbx;->removeView(Landroid/view/View;)V

    :cond_2
    invoke-static {p2}, Lcom/google/android/gms/ads/internal/zzas;->zzf(Lcom/google/android/gms/internal/ads/ij;)Z

    move-result v0

    if-nez v0, :cond_3

    :try_start_0
    invoke-virtual {p0, v4}, Lcom/google/android/gms/ads/internal/zza;->a(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->c:Lcom/google/android/gms/ads/internal/zzbx;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzbx;->getChildCount()I

    move-result v0

    if-le v0, v3, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->c:Lcom/google/android/gms/ads/internal/zzbx;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzbx;->showNext()V

    :cond_4
    if-eqz p1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->c:Lcom/google/android/gms/ads/internal/zzbx;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzbx;->getNextView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzbw;->c:Lcom/google/android/gms/ads/internal/zzbx;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/internal/zzbx;->removeView(Landroid/view/View;)V

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzbw;->zzfn()V

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->c:Lcom/google/android/gms/ads/internal/zzbx;

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zza;->zzbk()Lcom/google/android/gms/internal/ads/zzjn;

    move-result-object v1

    iget v1, v1, Lcom/google/android/gms/internal/ads/zzjn;->f:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/zzbx;->setMinimumWidth(I)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->c:Lcom/google/android/gms/ads/internal/zzbx;

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zza;->zzbk()Lcom/google/android/gms/internal/ads/zzjn;

    move-result-object v1

    iget v1, v1, Lcom/google/android/gms/internal/ads/zzjn;->c:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/zzbx;->setMinimumHeight(I)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->c:Lcom/google/android/gms/ads/internal/zzbx;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzbx;->requestLayout()V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->c:Lcom/google/android/gms/ads/internal/zzbx;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/ads/internal/zzbx;->setVisibility(I)V

    move v0, v3

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzeo()Lcom/google/android/gms/internal/ads/io;

    move-result-object v1

    const-string v3, "AdLoaderManager.swapBannerViews"

    invoke-virtual {v1, v0, v3}, Lcom/google/android/gms/internal/ads/io;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    const-string v1, "Could not add mediation view to view hierarchy."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/je;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    move v0, v2

    goto/16 :goto_0
.end method

.method private final i()Lcom/google/android/gms/internal/ads/bbu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/ij;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/ij;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/ij;->n:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/ij;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/ij;->r:Lcom/google/android/gms/internal/ads/bbu;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method protected final a(Lcom/google/android/gms/a/a;)V
    .locals 2

    if-eqz p1, :cond_1

    invoke-static {p1}, Lcom/google/android/gms/a/b;->a(Lcom/google/android/gms/a/a;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    instance-of v1, v0, Lcom/google/android/gms/internal/ads/atq;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/google/android/gms/internal/ads/atq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/atq;->d()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/ij;

    const/4 v1, 0x0

    invoke-super {p0, v0, v1}, Lcom/google/android/gms/ads/internal/zzd;->b(Lcom/google/android/gms/internal/ads/ij;Z)V

    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected final a(Lcom/google/android/gms/internal/ads/zzjj;Lcom/google/android/gms/internal/ads/ij;Z)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected final d()V
    .locals 2

    invoke-super {p0}, Lcom/google/android/gms/ads/internal/zzd;->d()V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/ij;

    if-eqz v0, :cond_0

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/ij;->o:Lcom/google/android/gms/internal/ads/bbt;

    if-eqz v1, :cond_0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/ij;->o:Lcom/google/android/gms/internal/ads/bbt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bbt;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->q:Lcom/google/android/gms/internal/ads/awb;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->q:Lcom/google/android/gms/internal/ads/awb;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzbw;->zzrt:Landroid/content/Context;

    invoke-static {v1}, Lcom/google/android/gms/a/b;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/a;

    move-result-object v1

    invoke-interface {v0, p0, v1}, Lcom/google/android/gms/internal/ads/awb;->a(Lcom/google/android/gms/internal/ads/apj;Lcom/google/android/gms/a/a;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/ij;

    const/4 v1, 0x0

    invoke-super {p0, v0, v1}, Lcom/google/android/gms/ads/internal/zzd;->b(Lcom/google/android/gms/internal/ads/ij;Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/je;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public final getVideoController()Lcom/google/android/gms/internal/ads/aqg;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final pause()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzq;->m:Z

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Native Ad does not support pause()."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-super {p0}, Lcom/google/android/gms/ads/internal/zzd;->pause()V

    return-void
.end method

.method public final resume()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzq;->m:Z

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Native Ad does not support resume()."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-super {p0}, Lcom/google/android/gms/ads/internal/zzd;->resume()V

    return-void
.end method

.method public final setManualImpressionsEnabled(Z)V
    .locals 1

    const-string v0, "setManualImpressionsEnabled must be called from the main thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->b(Ljava/lang/String;)V

    iput-boolean p1, p0, Lcom/google/android/gms/ads/internal/zzq;->k:Z

    return-void
.end method

.method public final showInterstitial()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Interstitial is not supported by AdLoaderManager."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/asu;)V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "CustomRendering is not supported by AdLoaderManager."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/ato;)V
    .locals 2

    const-string v0, "#005 Unexpected call to an abstract (unimplemented) method."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/mk;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/atq;)V
    .locals 2

    const-string v0, "#005 Unexpected call to an abstract (unimplemented) method."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/mk;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/ik;Lcom/google/android/gms/internal/ads/asn;)V
    .locals 9

    const/4 v4, 0x0

    const/4 v2, 0x0

    iput-object v4, p0, Lcom/google/android/gms/ads/internal/zzq;->l:Lcom/google/android/gms/internal/ads/ij;

    iget v0, p1, Lcom/google/android/gms/internal/ads/ik;->e:I

    const/4 v1, -0x2

    if-eq v0, v1, :cond_1

    iget v0, p1, Lcom/google/android/gms/internal/ads/ik;->e:I

    invoke-static {p1, v0}, Lcom/google/android/gms/ads/internal/zzq;->a(Lcom/google/android/gms/internal/ads/ik;I)Lcom/google/android/gms/internal/ads/ij;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->l:Lcom/google/android/gms/internal/ads/ij;

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->l:Lcom/google/android/gms/internal/ads/ij;

    if-eqz v0, :cond_2

    sget-object v0, Lcom/google/android/gms/internal/ads/jn;->a:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/ads/internal/aq;

    invoke-direct {v1, p0}, Lcom/google/android/gms/ads/internal/aq;-><init>(Lcom/google/android/gms/ads/internal/zzq;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_1
    return-void

    :cond_1
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/ik;->b:Lcom/google/android/gms/internal/ads/zzaej;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzaej;->g:Z

    if-nez v0, :cond_0

    const-string v0, "partialAdState is not mediation"

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->e(Ljava/lang/String;)V

    invoke-static {p1, v2}, Lcom/google/android/gms/ads/internal/zzq;->a(Lcom/google/android/gms/internal/ads/ik;I)Lcom/google/android/gms/internal/ads/ij;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->l:Lcom/google/android/gms/internal/ads/ij;

    goto :goto_0

    :cond_2
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/ik;->d:Lcom/google/android/gms/internal/ads/zzjn;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/ik;->d:Lcom/google/android/gms/internal/ads/zzjn;

    iput-object v1, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzacv:Lcom/google/android/gms/internal/ads/zzjn;

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iput v2, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzadv:I

    iget-object v8, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzej()Lcom/google/android/gms/internal/ads/ao;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzrt:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v3, v1, Lcom/google/android/gms/ads/internal/zzbw;->b:Lcom/google/android/gms/internal/ads/agw;

    iget-object v5, p0, Lcom/google/android/gms/ads/internal/zzq;->j:Lcom/google/android/gms/internal/ads/bck;

    move-object v1, p0

    move-object v2, p1

    move-object v6, p0

    move-object v7, p2

    invoke-static/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/ao;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/zza;Lcom/google/android/gms/internal/ads/ik;Lcom/google/android/gms/internal/ads/agw;Lcom/google/android/gms/internal/ads/qe;Lcom/google/android/gms/internal/ads/bck;Lcom/google/android/gms/internal/ads/ap;Lcom/google/android/gms/internal/ads/asn;)Lcom/google/android/gms/internal/ads/kg;

    move-result-object v0

    iput-object v0, v8, Lcom/google/android/gms/ads/internal/zzbw;->zzacu:Lcom/google/android/gms/internal/ads/kg;

    goto :goto_1
.end method

.method protected final zza(Lcom/google/android/gms/internal/ads/ij;Lcom/google/android/gms/internal/ads/ij;)Z
    .locals 5

    const/4 v1, 0x1

    const/4 v0, 0x0

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    invoke-virtual {v2}, Lcom/google/android/gms/ads/internal/zzbw;->zzfo()Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "AdLoader API does not support custom rendering."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-boolean v2, p2, Lcom/google/android/gms/internal/ads/ij;->n:Z

    if-nez v2, :cond_2

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/internal/zza;->a(I)V

    const-string v1, "newState is not mediation."

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/je;->e(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return v0

    :cond_2
    iget-object v2, p2, Lcom/google/android/gms/internal/ads/ij;->o:Lcom/google/android/gms/internal/ads/bbt;

    if-eqz v2, :cond_8

    iget-object v2, p2, Lcom/google/android/gms/internal/ads/ij;->o:Lcom/google/android/gms/internal/ads/bbt;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/bbt;->a()Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    invoke-virtual {v2}, Lcom/google/android/gms/ads/internal/zzbw;->zzfo()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzbw;->c:Lcom/google/android/gms/ads/internal/zzbx;

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzbw;->c:Lcom/google/android/gms/ads/internal/zzbx;

    invoke-virtual {v2}, Lcom/google/android/gms/ads/internal/zzbx;->zzfr()Lcom/google/android/gms/internal/ads/kh;

    move-result-object v2

    iget-object v3, p2, Lcom/google/android/gms/internal/ads/ij;->A:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/kh;->c(Ljava/lang/String;)V

    :cond_3
    invoke-super {p0, p1, p2}, Lcom/google/android/gms/ads/internal/zzd;->zza(Lcom/google/android/gms/internal/ads/ij;Lcom/google/android/gms/internal/ads/ij;)Z

    move-result v2

    if-nez v2, :cond_5

    move v2, v0

    :goto_1
    if-eqz v2, :cond_1

    iput-boolean v1, p0, Lcom/google/android/gms/ads/internal/zzq;->m:Z

    :cond_4
    new-instance v2, Ljava/util/ArrayList;

    new-array v3, v1, [Ljava/lang/Integer;

    const/4 v4, 0x2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v0

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, v2}, Lcom/google/android/gms/ads/internal/zzq;->zze(Ljava/util/List;)V

    move v0, v1

    goto :goto_0

    :cond_5
    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    invoke-virtual {v2}, Lcom/google/android/gms/ads/internal/zzbw;->zzfo()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/ads/internal/zzq;->b(Lcom/google/android/gms/internal/ads/ij;Lcom/google/android/gms/internal/ads/ij;)Z

    move-result v2

    if-nez v2, :cond_6

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/internal/zza;->a(I)V

    move v2, v0

    goto :goto_1

    :cond_6
    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    invoke-virtual {v2}, Lcom/google/android/gms/ads/internal/zzbw;->zzfp()Z

    move-result v2

    if-nez v2, :cond_7

    invoke-super {p0, p2, v0}, Lcom/google/android/gms/ads/internal/zzd;->a(Lcom/google/android/gms/internal/ads/ij;Z)V

    :cond_7
    move v2, v1

    goto :goto_1

    :cond_8
    iget-object v2, p2, Lcom/google/android/gms/internal/ads/ij;->o:Lcom/google/android/gms/internal/ads/bbt;

    if-eqz v2, :cond_9

    iget-object v2, p2, Lcom/google/android/gms/internal/ads/ij;->o:Lcom/google/android/gms/internal/ads/bbt;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/bbt;->b()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/ads/internal/zzq;->a(Lcom/google/android/gms/internal/ads/ij;Lcom/google/android/gms/internal/ads/ij;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_0

    :cond_9
    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/internal/zza;->a(I)V

    const-string v1, "Response is neither banner nor native."

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/je;->e(Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzjj;)Z
    .locals 22

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzbw;->r:Ljava/util/List;

    if-eqz v2, :cond_0

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzbw;->r:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzbw;->r:Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    :goto_0
    if-eqz v2, :cond_1

    const-string v2, "Requesting only banner Ad from AdLoader or calling loadAd on returned banner is not yet supported"

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/je;->c(Ljava/lang/String;)V

    const/4 v2, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/ads/internal/zza;->a(I)V

    const/4 v2, 0x0

    :goto_1
    return v2

    :cond_0
    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzbw;->q:Lcom/google/android/gms/internal/ads/awb;

    if-eqz v2, :cond_5

    move-object/from16 v0, p1

    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzjj;->h:Z

    move-object/from16 v0, p0

    iget-boolean v3, v0, Lcom/google/android/gms/ads/internal/zzq;->k:Z

    if-ne v2, v3, :cond_2

    :goto_2
    invoke-super/range {p0 .. p1}, Lcom/google/android/gms/ads/internal/zzd;->zzb(Lcom/google/android/gms/internal/ads/zzjj;)Z

    move-result v2

    goto :goto_1

    :cond_2
    new-instance v2, Lcom/google/android/gms/internal/ads/zzjj;

    move-object/from16 v0, p1

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzjj;->a:I

    move-object/from16 v0, p1

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzjj;->b:J

    move-object/from16 v0, p1

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzjj;->c:Landroid/os/Bundle;

    move-object/from16 v0, p1

    iget v7, v0, Lcom/google/android/gms/internal/ads/zzjj;->d:I

    move-object/from16 v0, p1

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzjj;->e:Ljava/util/List;

    move-object/from16 v0, p1

    iget-boolean v9, v0, Lcom/google/android/gms/internal/ads/zzjj;->f:Z

    move-object/from16 v0, p1

    iget v10, v0, Lcom/google/android/gms/internal/ads/zzjj;->g:I

    move-object/from16 v0, p1

    iget-boolean v11, v0, Lcom/google/android/gms/internal/ads/zzjj;->h:Z

    if-nez v11, :cond_3

    move-object/from16 v0, p0

    iget-boolean v11, v0, Lcom/google/android/gms/ads/internal/zzq;->k:Z

    if-eqz v11, :cond_4

    :cond_3
    const/4 v11, 0x1

    :goto_3
    move-object/from16 v0, p1

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzjj;->i:Ljava/lang/String;

    move-object/from16 v0, p1

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzjj;->j:Lcom/google/android/gms/internal/ads/zzmq;

    move-object/from16 v0, p1

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/zzjj;->k:Landroid/location/Location;

    move-object/from16 v0, p1

    iget-object v15, v0, Lcom/google/android/gms/internal/ads/zzjj;->l:Ljava/lang/String;

    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzjj;->m:Landroid/os/Bundle;

    move-object/from16 v16, v0

    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzjj;->n:Landroid/os/Bundle;

    move-object/from16 v17, v0

    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzjj;->o:Ljava/util/List;

    move-object/from16 v18, v0

    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzjj;->p:Ljava/lang/String;

    move-object/from16 v19, v0

    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzjj;->q:Ljava/lang/String;

    move-object/from16 v20, v0

    move-object/from16 v0, p1

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzjj;->r:Z

    move/from16 v21, v0

    invoke-direct/range {v2 .. v21}, Lcom/google/android/gms/internal/ads/zzjj;-><init>(IJLandroid/os/Bundle;ILjava/util/List;ZIZLjava/lang/String;Lcom/google/android/gms/internal/ads/zzmq;Landroid/location/Location;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 p1, v2

    goto :goto_2

    :cond_4
    const/4 v11, 0x0

    goto :goto_3

    :cond_5
    invoke-super/range {p0 .. p1}, Lcom/google/android/gms/ads/internal/zzd;->zzb(Lcom/google/android/gms/internal/ads/zzjj;)Z

    move-result v2

    goto/16 :goto_1
.end method

.method public final zzce()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/ij;

    if-eqz v0, :cond_0

    const-string v0, "com.google.ads.mediation.admob.AdMobAdapter"

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/ij;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/ij;->q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/ij;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/ij;->o:Lcom/google/android/gms/internal/ads/bbt;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/ij;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/ij;->o:Lcom/google/android/gms/internal/ads/bbt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bbt;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zza;->zzbs()V

    :goto_0
    return-void

    :cond_0
    invoke-super {p0}, Lcom/google/android/gms/ads/internal/zzd;->zzce()V

    goto :goto_0
.end method

.method public final zzcj()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/ij;

    if-eqz v0, :cond_0

    const-string v0, "com.google.ads.mediation.admob.AdMobAdapter"

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/ij;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/ij;->q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/ij;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/ij;->o:Lcom/google/android/gms/internal/ads/bbt;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/ij;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/ij;->o:Lcom/google/android/gms/internal/ads/bbt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bbt;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zza;->zzbr()V

    :goto_0
    return-void

    :cond_0
    invoke-super {p0}, Lcom/google/android/gms/ads/internal/zzd;->zzcj()V

    goto :goto_0
.end method

.method public final zzcr()V
    .locals 2

    const-string v0, "#005 Unexpected call to an abstract (unimplemented) method."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/mk;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final zzcs()V
    .locals 2

    const-string v0, "#005 Unexpected call to an abstract (unimplemented) method."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/mk;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final zzct()V
    .locals 2

    const-string v0, "#005 Unexpected call to an abstract (unimplemented) method."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/mk;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final zzcu()Z
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/zzq;->i()Lcom/google/android/gms/internal/ads/bbu;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/zzq;->i()Lcom/google/android/gms/internal/ads/bbu;

    move-result-object v0

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/bbu;->p:Z

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final zzcv()Z
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/zzq;->i()Lcom/google/android/gms/internal/ads/bbu;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/zzq;->i()Lcom/google/android/gms/internal/ads/bbu;

    move-result-object v0

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/bbu;->q:Z

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final zzd(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "setNativeTemplates must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/zzbw;->v:Ljava/util/List;

    return-void
.end method

.method public final zze(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "setAllowedAdTypes must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/zzbw;->r:Ljava/util/List;

    return-void
.end method

.method public final zzi(Landroid/view/View;)V
    .locals 2

    const-string v0, "#005 Unexpected call to an abstract (unimplemented) method."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/mk;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final zzr(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/avv;
    .locals 1

    const-string v0, "getOnCustomClickListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->l:Landroid/support/v4/f/m;

    invoke-virtual {v0, p1}, Landroid/support/v4/f/m;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/avv;

    return-object v0
.end method
