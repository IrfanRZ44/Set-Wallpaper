.class public final Lcom/google/android/gms/internal/ads/et;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation


# static fields
.field private static final a:Ljava/text/SimpleDateFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyyMMdd"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/et;->a:Ljava/text/SimpleDateFormat;

    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzaef;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzaej;
    .locals 54

    :try_start_0
    new-instance v28, Lorg/json/JSONObject;

    move-object/from16 v0, v28

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v4, "ad_base_url"

    const/4 v5, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v4, "ad_url"

    const/4 v5, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v4, "ad_size"

    const/4 v5, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    const-string v4, "ad_slot_size"

    move-object/from16 v0, v28

    move-object/from16 v1, v19

    invoke-virtual {v0, v4, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v43

    if-eqz p1, :cond_4

    move-object/from16 v0, p1

    iget v4, v0, Lcom/google/android/gms/internal/ads/zzaef;->m:I

    if-eqz v4, :cond_4

    const/16 v27, 0x1

    :goto_0
    const-string v4, "ad_json"

    const/4 v5, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_0

    const-string v4, "ad_html"

    const/4 v5, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    :cond_0
    if-nez v5, :cond_1

    const-string v4, "body"

    const/4 v5, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    :cond_1
    if-nez v5, :cond_2

    const-string v4, "ads"

    move-object/from16 v0, v28

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual/range {v28 .. v28}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    :cond_2
    const-wide/16 v20, -0x1

    const-string v4, "debug_dialog"

    const/4 v8, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    const-string v4, "debug_signals"

    const/4 v8, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v45

    const-string v4, "interstitial_timeout"

    move-object/from16 v0, v28

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    const-string v4, "interstitial_timeout"

    move-object/from16 v0, v28

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v8

    const-wide v10, 0x408f400000000000L

    mul-double/2addr v8, v10

    double-to-long v0, v8

    move-wide/from16 v16, v0

    :goto_1
    const-string v4, "orientation"

    const/4 v8, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/16 v18, -0x1

    const-string v8, "portrait"

    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzem()Lcom/google/android/gms/internal/ads/jt;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/jt;->b()I

    move-result v18

    :cond_3
    :goto_2
    const/4 v4, 0x0

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_14

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_14

    move-object/from16 v0, p1

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzaef;->k:Lcom/google/android/gms/internal/ads/zzang;

    iget-object v6, v4, Lcom/google/android/gms/internal/ads/zzang;->a:Ljava/lang/String;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v4, p1

    move-object/from16 v5, p0

    invoke-static/range {v4 .. v12}, Lcom/google/android/gms/internal/ads/eo;->a(Lcom/google/android/gms/internal/ads/zzaef;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/fa;Lcom/google/android/gms/internal/ads/asn;Lcom/google/android/gms/internal/ads/en;)Lcom/google/android/gms/internal/ads/zzaej;

    move-result-object v4

    iget-object v6, v4, Lcom/google/android/gms/internal/ads/zzaej;->a:Ljava/lang/String;

    iget-object v7, v4, Lcom/google/android/gms/internal/ads/zzaej;->b:Ljava/lang/String;

    iget-wide v0, v4, Lcom/google/android/gms/internal/ads/zzaej;->m:J

    move-wide/from16 v20, v0

    :goto_3
    if-nez v7, :cond_7

    new-instance v4, Lcom/google/android/gms/internal/ads/zzaej;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lcom/google/android/gms/internal/ads/zzaej;-><init>(I)V

    :goto_4
    return-object v4

    :cond_4
    const/16 v27, 0x0

    goto/16 :goto_0

    :cond_5
    const-wide/16 v16, -0x1

    goto :goto_1

    :cond_6
    const-string v8, "landscape"

    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzem()Lcom/google/android/gms/internal/ads/jt;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/jt;->a()I

    move-result v18

    goto :goto_2

    :cond_7
    const-string v5, "click_urls"

    move-object/from16 v0, v28

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    if-nez v4, :cond_e

    const/4 v8, 0x0

    :goto_5
    if-eqz v5, :cond_8

    invoke-static {v5, v8}, Lcom/google/android/gms/internal/ads/et;->a(Lorg/json/JSONArray;Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    :cond_8
    const-string v5, "impression_urls"

    move-object/from16 v0, v28

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    if-nez v4, :cond_f

    const/4 v9, 0x0

    :goto_6
    if-eqz v5, :cond_9

    invoke-static {v5, v9}, Lcom/google/android/gms/internal/ads/et;->a(Lorg/json/JSONArray;Ljava/util/List;)Ljava/util/List;

    move-result-object v9

    :cond_9
    const-string v5, "downloaded_impression_urls"

    move-object/from16 v0, v28

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    if-nez v4, :cond_10

    const/16 v51, 0x0

    :goto_7
    if-eqz v5, :cond_a

    move-object/from16 v0, v51

    invoke-static {v5, v0}, Lcom/google/android/gms/internal/ads/et;->a(Lorg/json/JSONArray;Ljava/util/List;)Ljava/util/List;

    move-result-object v51

    :cond_a
    const-string v5, "manual_impression_urls"

    move-object/from16 v0, v28

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    if-nez v4, :cond_11

    const/4 v15, 0x0

    :goto_8
    if-eqz v5, :cond_b

    invoke-static {v5, v15}, Lcom/google/android/gms/internal/ads/et;->a(Lorg/json/JSONArray;Ljava/util/List;)Ljava/util/List;

    move-result-object v15

    :cond_b
    if-eqz v4, :cond_13

    iget v5, v4, Lcom/google/android/gms/internal/ads/zzaej;->k:I

    const/4 v10, -0x1

    if-eq v5, v10, :cond_c

    iget v0, v4, Lcom/google/android/gms/internal/ads/zzaej;->k:I

    move/from16 v18, v0

    :cond_c
    iget-wide v10, v4, Lcom/google/android/gms/internal/ads/zzaej;->f:J

    const-wide/16 v12, 0x0

    cmp-long v5, v10, v12

    if-lez v5, :cond_13

    iget-wide v10, v4, Lcom/google/android/gms/internal/ads/zzaej;->f:J

    :goto_9
    const-string v4, "active_view"

    move-object/from16 v0, v28

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v25

    const/16 v24, 0x0

    const-string v4, "ad_is_javascript"

    const/4 v5, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v23

    if-eqz v23, :cond_d

    const-string v4, "ad_passback_url"

    const/4 v5, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v24

    :cond_d
    const-string v4, "mediation"

    const/4 v5, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v12

    const-string v4, "custom_render_allowed"

    const/4 v5, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v26

    const-string v4, "content_url_opted_out"

    const/4 v5, 0x1

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v29

    const-string v4, "content_vertical_opted_out"

    const/4 v5, 0x1

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v46

    const-string v4, "prefetch"

    const/4 v5, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v30

    const-string v4, "refresh_interval_milliseconds"

    const-wide/16 v16, -0x1

    move-object/from16 v0, v28

    move-wide/from16 v1, v16

    invoke-virtual {v0, v4, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v16

    const-string v4, "mediation_config_cache_time_milliseconds"

    const-wide/16 v32, -0x1

    move-object/from16 v0, v28

    move-wide/from16 v1, v32

    invoke-virtual {v0, v4, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v13

    const-string v4, "gws_query_id"

    const-string v5, ""

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v31

    const-string v4, "height"

    const-string v5, "fluid"

    const-string v32, ""

    move-object/from16 v0, v28

    move-object/from16 v1, v32

    invoke-virtual {v0, v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v32

    const-string v4, "native_express"

    const/4 v5, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v33

    const-string v4, "video_start_urls"

    move-object/from16 v0, v28

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lcom/google/android/gms/internal/ads/et;->a(Lorg/json/JSONArray;Ljava/util/List;)Ljava/util/List;

    move-result-object v35

    const-string v4, "video_complete_urls"

    move-object/from16 v0, v28

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lcom/google/android/gms/internal/ads/et;->a(Lorg/json/JSONArray;Ljava/util/List;)Ljava/util/List;

    move-result-object v36

    const-string v4, "rewards"

    move-object/from16 v0, v28

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzaig;->a(Lorg/json/JSONArray;)Lcom/google/android/gms/internal/ads/zzaig;

    move-result-object v34

    const-string v4, "use_displayed_impression"

    const/4 v5, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v37

    const-string v4, "auto_protection_configuration"

    move-object/from16 v0, v28

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzael;->a(Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/zzael;

    move-result-object v38

    const-string v4, "set_cookie"

    const-string v5, ""

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v40

    const-string v4, "remote_ping_urls"

    move-object/from16 v0, v28

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lcom/google/android/gms/internal/ads/et;->a(Lorg/json/JSONArray;Ljava/util/List;)Ljava/util/List;

    move-result-object v41

    const-string v4, "safe_browsing"

    move-object/from16 v0, v28

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzaiq;->a(Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/zzaiq;

    move-result-object v44

    const-string v4, "render_in_browser"

    move-object/from16 v0, p1

    iget-boolean v5, v0, Lcom/google/android/gms/internal/ads/zzaef;->K:Z

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v42

    const-string v4, "custom_close_blocked"

    move-object/from16 v0, v28

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v48

    const-string v4, "enable_omid"

    const/4 v5, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v50

    const-string v4, "omid_settings"

    const/4 v5, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v53

    const-string v4, "disable_closable_area"

    const/4 v5, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v52

    new-instance v4, Lcom/google/android/gms/internal/ads/zzaej;

    move-object/from16 v0, p1

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzaef;->p:Z

    move/from16 v28, v0

    move-object/from16 v0, p1

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzaef;->G:Z

    move/from16 v39, v0

    move-object/from16 v0, p1

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzaef;->U:Z

    move/from16 v47, v0

    const/16 v49, 0x0

    move-object/from16 v5, p1

    invoke-direct/range {v4 .. v53}, Lcom/google/android/gms/internal/ads/zzaej;-><init>(Lcom/google/android/gms/internal/ads/zzaef;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JZJLjava/util/List;JILjava/lang/String;JLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZZZLjava/lang/String;ZZLcom/google/android/gms/internal/ads/zzaig;Ljava/util/List;Ljava/util/List;ZLcom/google/android/gms/internal/ads/zzael;ZLjava/lang/String;Ljava/util/List;ZLjava/lang/String;Lcom/google/android/gms/internal/ads/zzaiq;Ljava/lang/String;ZZZIZLjava/util/List;ZLjava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_4

    :catch_0
    move-exception v4

    const-string v5, "Could not parse the inline ad response: "

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    if-eqz v6, :cond_12

    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    :goto_a
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/je;->e(Ljava/lang/String;)V

    new-instance v4, Lcom/google/android/gms/internal/ads/zzaej;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lcom/google/android/gms/internal/ads/zzaej;-><init>(I)V

    goto/16 :goto_4

    :cond_e
    :try_start_1
    iget-object v8, v4, Lcom/google/android/gms/internal/ads/zzaej;->c:Ljava/util/List;

    goto/16 :goto_5

    :cond_f
    iget-object v9, v4, Lcom/google/android/gms/internal/ads/zzaej;->e:Ljava/util/List;

    goto/16 :goto_6

    :cond_10
    iget-object v0, v4, Lcom/google/android/gms/internal/ads/zzaej;->R:Ljava/util/List;

    move-object/from16 v51, v0

    goto/16 :goto_7

    :cond_11
    iget-object v15, v4, Lcom/google/android/gms/internal/ads/zzaej;->i:Ljava/util/List;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_8

    :cond_12
    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, v5}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_a

    :cond_13
    move-wide/from16 v10, v16

    goto/16 :goto_9

    :cond_14
    move-object v7, v5

    goto/16 :goto_3
.end method

.method private static a(Z)Ljava/lang/Integer;
    .locals 1

    if-eqz p0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static a(Lorg/json/JSONArray;Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_1

    const/4 p1, 0x0

    :cond_0
    return-object p1

    :cond_1
    if-nez p1, :cond_2

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :cond_2
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-virtual {p0, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private static a(Ljava/util/List;)Lorg/json/JSONArray;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/json/JSONArray;"
        }
    .end annotation

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public static a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/em;)Lorg/json/JSONObject;
    .locals 19

    move-object/from16 v0, p1

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/em;->j:Lcom/google/android/gms/internal/ads/zzaef;

    move-object/from16 v0, p1

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/em;->d:Landroid/location/Location;

    move-object/from16 v0, p1

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/em;->k:Lcom/google/android/gms/internal/ads/fc;

    move-object/from16 v0, p1

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/em;->a:Landroid/os/Bundle;

    move-object/from16 v0, p1

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/em;->l:Lorg/json/JSONObject;

    :try_start_0
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    const-string v2, "extra_caps"

    sget-object v3, Lcom/google/android/gms/internal/ads/asa;->bT:Lcom/google/android/gms/internal/ads/arq;

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->f()Lcom/google/android/gms/internal/ads/ary;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/ary;->a(Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/em;->c:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_0

    const-string v2, "eid"

    const-string v3, ","

    move-object/from16 v0, p1

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/em;->c:Ljava/util/List;

    invoke-static {v3, v4}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->b:Landroid/os/Bundle;

    if-eqz v2, :cond_1

    const-string v2, "ad_pos"

    iget-object v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->b:Landroid/os/Bundle;

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->c:Lcom/google/android/gms/internal/ads/zzjj;

    invoke-static {}, Lcom/google/android/gms/internal/ads/iy;->a()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    const-string v4, "abf"

    invoke-virtual {v10, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-wide v12, v3, Lcom/google/android/gms/internal/ads/zzjj;->b:J

    const-wide/16 v14, -0x1

    cmp-long v2, v12, v14

    if-eqz v2, :cond_3

    const-string v2, "cust_age"

    sget-object v4, Lcom/google/android/gms/internal/ads/et;->a:Ljava/text/SimpleDateFormat;

    new-instance v11, Ljava/util/Date;

    iget-wide v12, v3, Lcom/google/android/gms/internal/ads/zzjj;->b:J

    invoke-direct {v11, v12, v13}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v4, v11}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v10, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzjj;->c:Landroid/os/Bundle;

    if-eqz v2, :cond_4

    const-string v2, "extras"

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzjj;->c:Landroid/os/Bundle;

    invoke-virtual {v10, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    iget v2, v3, Lcom/google/android/gms/internal/ads/zzjj;->d:I

    const/4 v4, -0x1

    if-eq v2, v4, :cond_5

    const-string v2, "cust_gender"

    iget v4, v3, Lcom/google/android/gms/internal/ads/zzjj;->d:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v10, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzjj;->e:Ljava/util/List;

    if-eqz v2, :cond_6

    const-string v2, "kw"

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzjj;->e:Ljava/util/List;

    invoke-virtual {v10, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    iget v2, v3, Lcom/google/android/gms/internal/ads/zzjj;->g:I

    const/4 v4, -0x1

    if-eq v2, v4, :cond_7

    const-string v2, "tag_for_child_directed_treatment"

    iget v4, v3, Lcom/google/android/gms/internal/ads/zzjj;->g:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v10, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    iget-boolean v2, v3, Lcom/google/android/gms/internal/ads/zzjj;->f:Z

    if-eqz v2, :cond_8

    sget-object v2, Lcom/google/android/gms/internal/ads/asa;->dk:Lcom/google/android/gms/internal/ads/arq;

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->f()Lcom/google/android/gms/internal/ads/ary;

    move-result-object v4

    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/ads/ary;->a(Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_14

    const-string v2, "test_request"

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v10, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    :goto_0
    iget v2, v3, Lcom/google/android/gms/internal/ads/zzjj;->a:I

    const/4 v4, 0x2

    if-lt v2, v4, :cond_a

    iget-boolean v2, v3, Lcom/google/android/gms/internal/ads/zzjj;->h:Z

    if-eqz v2, :cond_9

    const-string v2, "d_imp_hdr"

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v10, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzjj;->i:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_a

    const-string v2, "ppid"

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzjj;->i:Ljava/lang/String;

    invoke-virtual {v10, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    iget v2, v3, Lcom/google/android/gms/internal/ads/zzjj;->a:I

    const/4 v4, 0x3

    if-lt v2, v4, :cond_b

    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzjj;->l:Ljava/lang/String;

    if-eqz v2, :cond_b

    const-string v2, "url"

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzjj;->l:Ljava/lang/String;

    invoke-virtual {v10, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    iget v2, v3, Lcom/google/android/gms/internal/ads/zzjj;->a:I

    const/4 v4, 0x5

    if-lt v2, v4, :cond_e

    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzjj;->n:Landroid/os/Bundle;

    if-eqz v2, :cond_c

    const-string v2, "custom_targeting"

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzjj;->n:Landroid/os/Bundle;

    invoke-virtual {v10, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzjj;->o:Ljava/util/List;

    if-eqz v2, :cond_d

    const-string v2, "category_exclusions"

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzjj;->o:Ljava/util/List;

    invoke-virtual {v10, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_d
    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzjj;->p:Ljava/lang/String;

    if-eqz v2, :cond_e

    const-string v2, "request_agent"

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzjj;->p:Ljava/lang/String;

    invoke-virtual {v10, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_e
    iget v2, v3, Lcom/google/android/gms/internal/ads/zzjj;->a:I

    const/4 v4, 0x6

    if-lt v2, v4, :cond_f

    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzjj;->q:Ljava/lang/String;

    if-eqz v2, :cond_f

    const-string v2, "request_pkg"

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzjj;->q:Ljava/lang/String;

    invoke-virtual {v10, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_f
    iget v2, v3, Lcom/google/android/gms/internal/ads/zzjj;->a:I

    const/4 v4, 0x7

    if-lt v2, v4, :cond_10

    const-string v2, "is_designed_for_families"

    iget-boolean v3, v3, Lcom/google/android/gms/internal/ads/zzjj;->r:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_10
    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->d:Lcom/google/android/gms/internal/ads/zzjn;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzjn;->g:[Lcom/google/android/gms/internal/ads/zzjn;

    if-nez v2, :cond_15

    const-string v2, "format"

    iget-object v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->d:Lcom/google/android/gms/internal/ads/zzjn;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzjn;->a:Ljava/lang/String;

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->d:Lcom/google/android/gms/internal/ads/zzjn;

    iget-boolean v2, v2, Lcom/google/android/gms/internal/ads/zzjn;->i:Z

    if-eqz v2, :cond_11

    const-string v2, "fluid"

    const-string v3, "height"

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_11
    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->d:Lcom/google/android/gms/internal/ads/zzjn;

    iget v2, v2, Lcom/google/android/gms/internal/ads/zzjn;->e:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_12

    const-string v2, "smart_w"

    const-string v3, "full"

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_12
    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->d:Lcom/google/android/gms/internal/ads/zzjn;

    iget v2, v2, Lcom/google/android/gms/internal/ads/zzjn;->b:I

    const/4 v3, -0x2

    if-ne v2, v3, :cond_13

    const-string v2, "smart_h"

    const-string v3, "auto"

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_13
    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->d:Lcom/google/android/gms/internal/ads/zzjn;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzjn;->g:[Lcom/google/android/gms/internal/ads/zzjn;

    if-eqz v2, :cond_20

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v3, 0x0

    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->d:Lcom/google/android/gms/internal/ads/zzjn;

    iget-object v12, v2, Lcom/google/android/gms/internal/ads/zzjn;->g:[Lcom/google/android/gms/internal/ads/zzjn;

    array-length v13, v12

    const/4 v2, 0x0

    move v4, v2

    move v2, v3

    :goto_1
    if-ge v4, v13, :cond_1d

    aget-object v14, v12, v4

    iget-boolean v3, v14, Lcom/google/android/gms/internal/ads/zzjn;->i:Z

    if-eqz v3, :cond_19

    const/4 v2, 0x1

    :goto_2
    add-int/lit8 v3, v4, 0x1

    move v4, v3

    goto :goto_1

    :cond_14
    const-string v2, "adtest"

    const-string v4, "on"

    invoke-virtual {v10, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception v2

    const-string v3, "Problem serializing ad request to JSON: "

    invoke-virtual {v2}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_5c

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_3
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/je;->e(Ljava/lang/String;)V

    const/4 v2, 0x0

    :goto_4
    return-object v2

    :cond_15
    const/4 v4, 0x0

    const/4 v3, 0x0

    :try_start_1
    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->d:Lcom/google/android/gms/internal/ads/zzjn;

    iget-object v11, v2, Lcom/google/android/gms/internal/ads/zzjn;->g:[Lcom/google/android/gms/internal/ads/zzjn;

    array-length v12, v11

    const/4 v2, 0x0

    move/from16 v18, v2

    move v2, v3

    move v3, v4

    move/from16 v4, v18

    :goto_5
    if-ge v4, v12, :cond_11

    aget-object v13, v11, v4

    iget-boolean v14, v13, Lcom/google/android/gms/internal/ads/zzjn;->i:Z

    if-nez v14, :cond_16

    if-nez v3, :cond_16

    const-string v3, "format"

    iget-object v14, v13, Lcom/google/android/gms/internal/ads/zzjn;->a:Ljava/lang/String;

    invoke-virtual {v10, v3, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v3, 0x1

    :cond_16
    iget-boolean v13, v13, Lcom/google/android/gms/internal/ads/zzjn;->i:Z

    if-eqz v13, :cond_17

    if-nez v2, :cond_17

    const-string v2, "fluid"

    const-string v13, "height"

    invoke-virtual {v10, v2, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x1

    :cond_17
    if-eqz v3, :cond_18

    if-nez v2, :cond_11

    :cond_18
    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_19
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-eqz v3, :cond_1a

    const-string v3, "|"

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1a
    iget v3, v14, Lcom/google/android/gms/internal/ads/zzjn;->e:I

    const/4 v15, -0x1

    if-ne v3, v15, :cond_1b

    iget v3, v14, Lcom/google/android/gms/internal/ads/zzjn;->f:I

    int-to-float v3, v3

    iget v15, v7, Lcom/google/android/gms/internal/ads/fc;->s:F

    div-float/2addr v3, v15

    float-to-int v3, v3

    :goto_6
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "x"

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v14, Lcom/google/android/gms/internal/ads/zzjn;->b:I

    const/4 v15, -0x2

    if-ne v3, v15, :cond_1c

    iget v3, v14, Lcom/google/android/gms/internal/ads/zzjn;->c:I

    int-to-float v3, v3

    iget v14, v7, Lcom/google/android/gms/internal/ads/fc;->s:F

    div-float/2addr v3, v14

    float-to-int v3, v3

    :goto_7
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto/16 :goto_2

    :cond_1b
    iget v3, v14, Lcom/google/android/gms/internal/ads/zzjn;->e:I

    goto :goto_6

    :cond_1c
    iget v3, v14, Lcom/google/android/gms/internal/ads/zzjn;->b:I

    goto :goto_7

    :cond_1d
    if-eqz v2, :cond_1f

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-eqz v2, :cond_1e

    const/4 v2, 0x0

    const-string v3, "|"

    invoke-virtual {v11, v2, v3}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1e
    const/4 v2, 0x0

    const-string v3, "320x50"

    invoke-virtual {v11, v2, v3}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1f
    const-string v2, "sz"

    invoke-virtual {v10, v2, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_20
    iget v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->m:I

    if-eqz v2, :cond_23

    const-string v2, "native_version"

    iget v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->m:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "native_templates"

    iget-object v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->n:Ljava/util/List;

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "native_image_orientation"

    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->y:Lcom/google/android/gms/internal/ads/zzpl;

    if-nez v2, :cond_25

    const-string v2, "any"

    :goto_8
    invoke-virtual {v10, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->z:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_21

    const-string v2, "native_custom_templates"

    iget-object v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->z:Ljava/util/List;

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_21
    iget v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->a:I

    const/16 v3, 0x18

    if-lt v2, v3, :cond_22

    const-string v2, "max_num_ads"

    iget v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->Y:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_22
    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->W:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    move-result v2

    if-nez v2, :cond_23

    :try_start_2
    const-string v2, "native_advanced_settings"

    new-instance v3, Lorg/json/JSONArray;

    iget-object v4, v5, Lcom/google/android/gms/internal/ads/zzaef;->W:Ljava/lang/String;

    invoke-direct {v3, v4}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    :cond_23
    :goto_9
    :try_start_3
    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->V:Ljava/util/List;

    if-eqz v2, :cond_27

    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->V:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_27

    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->V:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_24
    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_27

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v11, 0x2

    if-ne v4, v11, :cond_26

    const-string v2, "iba"

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v10, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_a

    :cond_25
    iget v2, v2, Lcom/google/android/gms/internal/ads/zzpl;->c:I

    packed-switch v2, :pswitch_data_0

    const-string v2, "not_set"

    goto :goto_8

    :pswitch_0
    const-string v2, "portrait"

    goto :goto_8

    :pswitch_1
    const-string v2, "landscape"

    goto :goto_8

    :pswitch_2
    const-string v2, "any"

    goto :goto_8

    :catch_1
    move-exception v2

    const-string v3, "Problem creating json from native advanced settings"

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/ads/je;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_9

    :cond_26
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v4, 0x1

    if-ne v2, v4, :cond_24

    const-string v2, "ina"

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v10, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_a

    :cond_27
    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->d:Lcom/google/android/gms/internal/ads/zzjn;

    iget-boolean v2, v2, Lcom/google/android/gms/internal/ads/zzjn;->j:Z

    if-eqz v2, :cond_28

    const-string v2, "ene"

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_28
    sget-object v2, Lcom/google/android/gms/internal/ads/asa;->ax:Lcom/google/android/gms/internal/ads/arq;

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->f()Lcom/google/android/gms/internal/ads/ary;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/ary;->a(Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_29

    const-string v2, "xsrve"

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_29
    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->O:Lcom/google/android/gms/internal/ads/zzlu;

    if-eqz v2, :cond_2a

    const-string v2, "is_icon_ad"

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "icon_ad_expansion_behavior"

    iget-object v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->O:Lcom/google/android/gms/internal/ads/zzlu;

    iget v3, v3, Lcom/google/android/gms/internal/ads/zzlu;->a:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2a
    const-string v2, "slotname"

    iget-object v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->e:Ljava/lang/String;

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "pn"

    iget-object v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->f:Landroid/content/pm/ApplicationInfo;

    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->g:Landroid/content/pm/PackageInfo;

    if-eqz v2, :cond_2b

    const-string v2, "vc"

    iget-object v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->g:Landroid/content/pm/PackageInfo;

    iget v3, v3, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2b
    const-string v2, "ms"

    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/em;->h:Ljava/lang/String;

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "seq_num"

    iget-object v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->i:Ljava/lang/String;

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "session_id"

    iget-object v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->j:Ljava/lang/String;

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "js"

    iget-object v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->k:Lcom/google/android/gms/internal/ads/zzang;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzang;->a:Ljava/lang/String;

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/em;->e:Lcom/google/android/gms/internal/ads/fm;

    iget-object v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->M:Landroid/os/Bundle;

    move-object/from16 v0, p1

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/em;->b:Landroid/os/Bundle;

    const-string v11, "am"

    iget v12, v7, Lcom/google/android/gms/internal/ads/fc;->a:I

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v10, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v11, "cog"

    iget-boolean v12, v7, Lcom/google/android/gms/internal/ads/fc;->b:Z

    invoke-static {v12}, Lcom/google/android/gms/internal/ads/et;->a(Z)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v10, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v11, "coh"

    iget-boolean v12, v7, Lcom/google/android/gms/internal/ads/fc;->c:Z

    invoke-static {v12}, Lcom/google/android/gms/internal/ads/et;->a(Z)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v10, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v11, v7, Lcom/google/android/gms/internal/ads/fc;->d:Ljava/lang/String;

    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_2c

    const-string v11, "carrier"

    iget-object v12, v7, Lcom/google/android/gms/internal/ads/fc;->d:Ljava/lang/String;

    invoke-virtual {v10, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2c
    const-string v11, "gl"

    iget-object v12, v7, Lcom/google/android/gms/internal/ads/fc;->e:Ljava/lang/String;

    invoke-virtual {v10, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v11, v7, Lcom/google/android/gms/internal/ads/fc;->f:Z

    if-eqz v11, :cond_2d

    const-string v11, "simulator"

    const/4 v12, 0x1

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v10, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2d
    iget-boolean v11, v7, Lcom/google/android/gms/internal/ads/fc;->g:Z

    if-eqz v11, :cond_2e

    const-string v11, "is_sidewinder"

    const/4 v12, 0x1

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v10, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2e
    const-string v11, "ma"

    iget-boolean v12, v7, Lcom/google/android/gms/internal/ads/fc;->h:Z

    invoke-static {v12}, Lcom/google/android/gms/internal/ads/et;->a(Z)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v10, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v11, "sp"

    iget-boolean v12, v7, Lcom/google/android/gms/internal/ads/fc;->i:Z

    invoke-static {v12}, Lcom/google/android/gms/internal/ads/et;->a(Z)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v10, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v11, "hl"

    iget-object v12, v7, Lcom/google/android/gms/internal/ads/fc;->j:Ljava/lang/String;

    invoke-virtual {v10, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v11, v7, Lcom/google/android/gms/internal/ads/fc;->k:Ljava/lang/String;

    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_2f

    const-string v11, "mv"

    iget-object v12, v7, Lcom/google/android/gms/internal/ads/fc;->k:Ljava/lang/String;

    invoke-virtual {v10, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2f
    const-string v11, "muv"

    iget v12, v7, Lcom/google/android/gms/internal/ads/fc;->m:I

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v10, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v11, v7, Lcom/google/android/gms/internal/ads/fc;->n:I

    const/4 v12, -0x2

    if-eq v11, v12, :cond_30

    const-string v11, "cnt"

    iget v12, v7, Lcom/google/android/gms/internal/ads/fc;->n:I

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v10, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_30
    const-string v11, "gnt"

    iget v12, v7, Lcom/google/android/gms/internal/ads/fc;->o:I

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v10, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v11, "pt"

    iget v12, v7, Lcom/google/android/gms/internal/ads/fc;->p:I

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v10, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v11, "rm"

    iget v12, v7, Lcom/google/android/gms/internal/ads/fc;->q:I

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v10, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v11, "riv"

    iget v12, v7, Lcom/google/android/gms/internal/ads/fc;->r:I

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v10, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v11, Landroid/os/Bundle;

    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    const-string v12, "build_build"

    iget-object v13, v7, Lcom/google/android/gms/internal/ads/fc;->z:Ljava/lang/String;

    invoke-virtual {v11, v12, v13}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v12, "build_device"

    iget-object v13, v7, Lcom/google/android/gms/internal/ads/fc;->A:Ljava/lang/String;

    invoke-virtual {v11, v12, v13}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v12, Landroid/os/Bundle;

    invoke-direct {v12}, Landroid/os/Bundle;-><init>()V

    const-string v13, "is_charging"

    iget-boolean v14, v7, Lcom/google/android/gms/internal/ads/fc;->w:Z

    invoke-virtual {v12, v13, v14}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v13, "battery_level"

    iget-wide v14, v7, Lcom/google/android/gms/internal/ads/fc;->v:D

    invoke-virtual {v12, v13, v14, v15}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    const-string v13, "battery"

    invoke-virtual {v11, v13, v12}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    new-instance v12, Landroid/os/Bundle;

    invoke-direct {v12}, Landroid/os/Bundle;-><init>()V

    const-string v13, "active_network_state"

    iget v14, v7, Lcom/google/android/gms/internal/ads/fc;->y:I

    invoke-virtual {v12, v13, v14}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v13, "active_network_metered"

    iget-boolean v14, v7, Lcom/google/android/gms/internal/ads/fc;->x:Z

    invoke-virtual {v12, v13, v14}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    if-eqz v2, :cond_31

    new-instance v13, Landroid/os/Bundle;

    invoke-direct {v13}, Landroid/os/Bundle;-><init>()V

    const-string v14, "predicted_latency_micros"

    iget v15, v2, Lcom/google/android/gms/internal/ads/fm;->a:I

    invoke-virtual {v13, v14, v15}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v14, "predicted_down_throughput_bps"

    iget-wide v0, v2, Lcom/google/android/gms/internal/ads/fm;->b:J

    move-wide/from16 v16, v0

    move-wide/from16 v0, v16

    invoke-virtual {v13, v14, v0, v1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v14, "predicted_up_throughput_bps"

    iget-wide v0, v2, Lcom/google/android/gms/internal/ads/fm;->c:J

    move-wide/from16 v16, v0

    move-wide/from16 v0, v16

    invoke-virtual {v13, v14, v0, v1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v2, "predictions"

    invoke-virtual {v12, v2, v13}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_31
    const-string v2, "network"

    invoke-virtual {v11, v2, v12}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v12, "is_browser_custom_tabs_capable"

    iget-boolean v13, v7, Lcom/google/android/gms/internal/ads/fc;->B:Z

    invoke-virtual {v2, v12, v13}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v12, "browser"

    invoke-virtual {v11, v12, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    if-eqz v3, :cond_33

    const-string v12, "android_mem_info"

    new-instance v13, Landroid/os/Bundle;

    invoke-direct {v13}, Landroid/os/Bundle;-><init>()V

    const-string v2, "runtime_free"

    const-string v14, "runtime_free_memory"

    const-wide/16 v16, -0x1

    move-wide/from16 v0, v16

    invoke-virtual {v3, v14, v0, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v2, v14}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "runtime_max"

    const-string v14, "runtime_max_memory"

    const-wide/16 v16, -0x1

    move-wide/from16 v0, v16

    invoke-virtual {v3, v14, v0, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v2, v14}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "runtime_total"

    const-string v14, "runtime_total_memory"

    const-wide/16 v16, -0x1

    move-wide/from16 v0, v16

    invoke-virtual {v3, v14, v0, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v2, v14}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "web_view_count"

    const-string v14, "web_view_count"

    const/4 v15, 0x0

    invoke-virtual {v3, v14, v15}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v14

    invoke-static {v14}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v2, v14}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "debug_memory_info"

    invoke-virtual {v3, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Landroid/os/Debug$MemoryInfo;

    if-eqz v2, :cond_32

    const-string v3, "debug_info_dalvik_private_dirty"

    iget v14, v2, Landroid/os/Debug$MemoryInfo;->dalvikPrivateDirty:I

    invoke-static {v14}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v3, v14}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "debug_info_dalvik_pss"

    iget v14, v2, Landroid/os/Debug$MemoryInfo;->dalvikPss:I

    invoke-static {v14}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v3, v14}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "debug_info_dalvik_shared_dirty"

    iget v14, v2, Landroid/os/Debug$MemoryInfo;->dalvikSharedDirty:I

    invoke-static {v14}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v3, v14}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "debug_info_native_private_dirty"

    iget v14, v2, Landroid/os/Debug$MemoryInfo;->nativePrivateDirty:I

    invoke-static {v14}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v3, v14}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "debug_info_native_pss"

    iget v14, v2, Landroid/os/Debug$MemoryInfo;->nativePss:I

    invoke-static {v14}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v3, v14}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "debug_info_native_shared_dirty"

    iget v14, v2, Landroid/os/Debug$MemoryInfo;->nativeSharedDirty:I

    invoke-static {v14}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v3, v14}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "debug_info_other_private_dirty"

    iget v14, v2, Landroid/os/Debug$MemoryInfo;->otherPrivateDirty:I

    invoke-static {v14}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v3, v14}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "debug_info_other_pss"

    iget v14, v2, Landroid/os/Debug$MemoryInfo;->otherPss:I

    invoke-static {v14}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v3, v14}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "debug_info_other_shared_dirty"

    iget v2, v2, Landroid/os/Debug$MemoryInfo;->otherSharedDirty:I

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v13, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_32
    invoke-virtual {v11, v12, v13}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_33
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "parental_controls"

    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object v3, v7, Lcom/google/android/gms/internal/ads/fc;->l:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_34

    const-string v3, "package_version"

    iget-object v4, v7, Lcom/google/android/gms/internal/ads/fc;->l:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_34
    const-string v3, "play_store"

    invoke-virtual {v11, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    const-string v2, "device"

    invoke-virtual {v10, v2, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    const-string v2, "doritos"

    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/em;->f:Ljava/lang/String;

    invoke-virtual {v4, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "doritos_v2"

    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/em;->g:Ljava/lang/String;

    invoke-virtual {v4, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v2, Lcom/google/android/gms/internal/ads/asa;->aJ:Lcom/google/android/gms/internal/ads/arq;

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->f()Lcom/google/android/gms/internal/ads/ary;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/ary;->a(Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_36

    const/4 v3, 0x0

    const/4 v2, 0x0

    move-object/from16 v0, p1

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/em;->i:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    if-eqz v11, :cond_35

    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/em;->i:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    invoke-virtual {v2}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/em;->i:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    invoke-virtual {v2}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->isLimitAdTrackingEnabled()Z

    move-result v2

    :cond_35
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_4e

    const-string v11, "rdid"

    invoke-virtual {v4, v11, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "is_lat"

    invoke-virtual {v4, v3, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v2, "idtype"

    const-string v3, "adid"

    invoke-virtual {v4, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_36
    :goto_b
    const-string v2, "pii"

    invoke-virtual {v10, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "platform"

    sget-object v3, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "submodel"

    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v6, :cond_4f

    invoke-static {v10, v6}, Lcom/google/android/gms/internal/ads/et;->a(Ljava/util/HashMap;Landroid/location/Location;)V

    :cond_37
    :goto_c
    iget v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->a:I

    const/4 v3, 0x2

    if-lt v2, v3, :cond_38

    const-string v2, "quality_signals"

    iget-object v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->l:Landroid/os/Bundle;

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_38
    iget v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->a:I

    const/4 v3, 0x4

    if-lt v2, v3, :cond_39

    iget-boolean v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->p:Z

    if-eqz v2, :cond_39

    const-string v2, "forceHttps"

    iget-boolean v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->p:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_39
    if-eqz v8, :cond_3a

    const-string v2, "content_info"

    invoke-virtual {v10, v2, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3a
    iget v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->a:I

    const/4 v3, 0x5

    if-lt v2, v3, :cond_50

    const-string v2, "u_sd"

    iget v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->s:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "sh"

    iget v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->r:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "sw"

    iget v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->q:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_d
    iget v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->a:I

    const/4 v3, 0x6

    if-lt v2, v3, :cond_3c

    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->t:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    move-result v2

    if-nez v2, :cond_3b

    :try_start_4
    const-string v2, "view_hierarchy"

    new-instance v3, Lorg/json/JSONObject;

    iget-object v4, v5, Lcom/google/android/gms/internal/ads/zzaef;->t:Ljava/lang/String;

    invoke-direct {v3, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_2

    :cond_3b
    :goto_e
    :try_start_5
    const-string v2, "correlation_id"

    iget-wide v6, v5, Lcom/google/android/gms/internal/ads/zzaef;->u:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3c
    iget v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->a:I

    const/4 v3, 0x7

    if-lt v2, v3, :cond_3d

    const-string v2, "request_id"

    iget-object v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->v:Ljava/lang/String;

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3d
    iget v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->a:I

    const/16 v3, 0xc

    if-lt v2, v3, :cond_3e

    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->B:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3e

    const-string v2, "anchor"

    iget-object v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->B:Ljava/lang/String;

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3e
    iget v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->a:I

    const/16 v3, 0xd

    if-lt v2, v3, :cond_3f

    const-string v2, "android_app_volume"

    iget v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->C:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3f
    iget v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->a:I

    const/16 v3, 0x12

    if-lt v2, v3, :cond_40

    const-string v2, "android_app_muted"

    iget-boolean v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->I:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_40
    iget v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->a:I

    const/16 v3, 0xe

    if-lt v2, v3, :cond_41

    iget v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->D:I

    if-lez v2, :cond_41

    const-string v2, "target_api"

    iget v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->D:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_41
    iget v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->a:I

    const/16 v3, 0xf

    if-lt v2, v3, :cond_42

    const-string v3, "scroll_index"

    iget v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->E:I

    const/4 v4, -0x1

    if-ne v2, v4, :cond_51

    const/4 v2, -0x1

    :goto_f
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v10, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_42
    iget v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->a:I

    const/16 v3, 0x10

    if-lt v2, v3, :cond_43

    const-string v2, "_activity_context"

    iget-boolean v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->F:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_43
    iget v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->a:I

    const/16 v3, 0x12

    if-lt v2, v3, :cond_45

    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->J:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_0

    move-result v2

    if-nez v2, :cond_44

    :try_start_6
    const-string v2, "app_settings"

    new-instance v3, Lorg/json/JSONObject;

    iget-object v4, v5, Lcom/google/android/gms/internal/ads/zzaef;->J:Ljava/lang/String;

    invoke-direct {v3, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_3

    :cond_44
    :goto_10
    :try_start_7
    const-string v2, "render_in_browser"

    iget-boolean v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->K:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_45
    iget v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->a:I

    const/16 v3, 0x12

    if-lt v2, v3, :cond_46

    const-string v2, "android_num_video_cache_tasks"

    iget v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->L:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_46
    iget-object v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->k:Lcom/google/android/gms/internal/ads/zzang;

    iget-boolean v4, v5, Lcom/google/android/gms/internal/ads/zzaef;->Z:Z

    move-object/from16 v0, p1

    iget-boolean v6, v0, Lcom/google/android/gms/internal/ads/em;->m:Z

    iget-boolean v7, v5, Lcom/google/android/gms/internal/ads/zzaef;->ab:Z

    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v11, "cl"

    const-string v12, "193400285"

    invoke-virtual {v2, v11, v12}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v11, "rapid_rc"

    const-string v12, "dev"

    invoke-virtual {v2, v11, v12}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v11, "rapid_rollup"

    const-string v12, "HEAD"

    invoke-virtual {v2, v11, v12}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v11, "build_meta"

    invoke-virtual {v8, v11, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    const-string v11, "mf"

    sget-object v2, Lcom/google/android/gms/internal/ads/asa;->bV:Lcom/google/android/gms/internal/ads/arq;

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->f()Lcom/google/android/gms/internal/ads/ary;

    move-result-object v12

    invoke-virtual {v12, v2}, Lcom/google/android/gms/internal/ads/ary;->a(Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v11, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "instant_app"

    invoke-virtual {v8, v2, v4}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v2, "lite"

    iget-boolean v3, v3, Lcom/google/android/gms/internal/ads/zzang;->e:Z

    invoke-virtual {v8, v2, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v2, "local_service"

    invoke-virtual {v8, v2, v6}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v2, "is_privileged_process"

    invoke-virtual {v8, v2, v7}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v2, "sdk_env"

    invoke-virtual {v10, v2, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "cache_state"

    invoke-virtual {v10, v2, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->a:I

    const/16 v3, 0x13

    if-lt v2, v3, :cond_47

    const-string v2, "gct"

    iget-object v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->N:Ljava/lang/String;

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_47
    iget v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->a:I

    const/16 v3, 0x15

    if-lt v2, v3, :cond_48

    iget-boolean v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->P:Z

    if-eqz v2, :cond_48

    const-string v2, "de"

    const-string v3, "1"

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_48
    sget-object v2, Lcom/google/android/gms/internal/ads/asa;->aT:Lcom/google/android/gms/internal/ads/arq;

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->f()Lcom/google/android/gms/internal/ads/ary;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/ary;->a(Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_4a

    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->d:Lcom/google/android/gms/internal/ads/zzjn;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzjn;->a:Ljava/lang/String;

    const-string v3, "interstitial_mb"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_49

    const-string v3, "reward_mb"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_52

    :cond_49
    const/4 v2, 0x1

    move v3, v2

    :goto_11
    iget-object v4, v5, Lcom/google/android/gms/internal/ads/zzaef;->Q:Landroid/os/Bundle;

    if-eqz v4, :cond_53

    const/4 v2, 0x1

    :goto_12
    if-eqz v3, :cond_4a

    if-eqz v2, :cond_4a

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "interstitial_pool"

    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    const-string v3, "counters"

    invoke-virtual {v10, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4a
    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->R:Ljava/lang/String;

    if-eqz v2, :cond_4b

    const-string v2, "gmp_app_id"

    iget-object v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->R:Ljava/lang/String;

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4b
    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->S:Ljava/lang/String;

    if-eqz v2, :cond_55

    const-string v2, "TIME_OUT"

    iget-object v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->S:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_54

    const-string v2, "sai_timeout"

    sget-object v3, Lcom/google/android/gms/internal/ads/asa;->av:Lcom/google/android/gms/internal/ads/arq;

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->f()Lcom/google/android/gms/internal/ads/ary;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/ary;->a(Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_13
    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->T:Ljava/lang/String;

    if-eqz v2, :cond_4c

    const-string v2, "fbs_aeid"

    iget-object v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->T:Ljava/lang/String;

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4c
    iget v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->a:I

    const/16 v3, 0x18

    if-lt v2, v3, :cond_4d

    const-string v2, "disable_ml"

    iget-boolean v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->aa:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4d
    sget-object v2, Lcom/google/android/gms/internal/ads/asa;->E:Lcom/google/android/gms/internal/ads/arq;

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->f()Lcom/google/android/gms/internal/ads/ary;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/ary;->a(Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_57

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_57

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    sget-object v3, Lcom/google/android/gms/internal/ads/asa;->F:Lcom/google/android/gms/internal/ads/arq;

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->f()Lcom/google/android/gms/internal/ads/ary;

    move-result-object v6

    invoke-virtual {v6, v3}, Lcom/google/android/gms/internal/ads/ary;->a(Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-lt v4, v3, :cond_57

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    const-string v4, ","

    invoke-virtual {v2, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    array-length v6, v4

    const/4 v2, 0x0

    :goto_14
    if-ge v2, v6, :cond_56

    aget-object v7, v4, v2

    invoke-static {v7}, Lcom/google/android/gms/internal/ads/lx;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v8

    invoke-virtual {v3, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_14

    :cond_4e
    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->a()Lcom/google/android/gms/internal/ads/lz;

    invoke-static/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/lz;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "pdid"

    invoke-virtual {v4, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "pdidtype"

    const-string v3, "ssaid"

    invoke-virtual {v4, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_b

    :cond_4f
    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->c:Lcom/google/android/gms/internal/ads/zzjj;

    iget v2, v2, Lcom/google/android/gms/internal/ads/zzjj;->a:I

    const/4 v3, 0x2

    if-lt v2, v3, :cond_37

    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->c:Lcom/google/android/gms/internal/ads/zzjj;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzjj;->k:Landroid/location/Location;

    if-eqz v2, :cond_37

    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->c:Lcom/google/android/gms/internal/ads/zzjj;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzjj;->k:Landroid/location/Location;

    invoke-static {v10, v2}, Lcom/google/android/gms/internal/ads/et;->a(Ljava/util/HashMap;Landroid/location/Location;)V

    goto/16 :goto_c

    :cond_50
    const-string v2, "u_sd"

    iget v3, v7, Lcom/google/android/gms/internal/ads/fc;->s:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "sh"

    iget v3, v7, Lcom/google/android/gms/internal/ads/fc;->u:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "sw"

    iget v3, v7, Lcom/google/android/gms/internal/ads/fc;->t:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_d

    :catch_2
    move-exception v2

    const-string v3, "Problem serializing view hierarchy to JSON"

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/ads/je;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_e

    :cond_51
    iget v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->E:I

    goto/16 :goto_f

    :catch_3
    move-exception v2

    const-string v3, "Problem creating json from app settings"

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/ads/je;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_10

    :cond_52
    const/4 v2, 0x0

    move v3, v2

    goto/16 :goto_11

    :cond_53
    const/4 v2, 0x0

    goto/16 :goto_12

    :cond_54
    const-string v2, "fbs_aiid"

    iget-object v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->S:Ljava/lang/String;

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_13

    :cond_55
    const-string v2, "fbs_aiid"

    const-string v3, ""

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_13

    :cond_56
    const-string v2, "video_decoders"

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_57
    sget-object v2, Lcom/google/android/gms/internal/ads/asa;->dg:Lcom/google/android/gms/internal/ads/arq;

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->f()Lcom/google/android/gms/internal/ads/ary;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/ary;->a(Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_58

    const-string v2, "omid_v"

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzfa()Lcom/google/android/gms/internal/ads/p;

    move-result-object v3

    move-object/from16 v0, p0

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/p;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_58
    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->ac:Ljava/util/ArrayList;

    if-eqz v2, :cond_59

    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzaef;->ac:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_59

    const-string v2, "android_permissions"

    iget-object v3, v5, Lcom/google/android/gms/internal/ads/zzaef;->ac:Ljava/util/ArrayList;

    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_59
    const/4 v2, 0x2

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/je;->a(I)Z

    move-result v2

    if-eqz v2, :cond_5a

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzek()Lcom/google/android/gms/internal/ads/jn;

    move-result-object v2

    invoke-virtual {v2, v10}, Lcom/google/android/gms/internal/ads/jn;->a(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v2

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->toString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Ad Request JSON: "

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_5b

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_15
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/je;->a(Ljava/lang/String;)V

    :cond_5a
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzek()Lcom/google/android/gms/internal/ads/jn;

    move-result-object v2

    invoke-virtual {v2, v10}, Lcom/google/android/gms/internal/ads/jn;->a(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v2

    goto/16 :goto_4

    :cond_5b
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V
    :try_end_7
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_0

    goto :goto_15

    :cond_5c
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto/16 :goto_3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static a(Lcom/google/android/gms/internal/ads/zzaej;)Lorg/json/JSONObject;
    .locals 8

    const-wide/16 v6, -0x1

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaej;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v0, "ad_base_url"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->a:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaej;->l:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v0, "ad_size"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->l:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    const-string v0, "native"

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->s:Z

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaej;->s:Z

    if-eqz v0, :cond_12

    const-string v0, "ad_json"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->b:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaej;->n:Ljava/lang/String;

    if-eqz v0, :cond_2

    const-string v0, "debug_dialog"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->n:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaej;->L:Ljava/lang/String;

    if-eqz v0, :cond_3

    const-string v0, "debug_signals"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->L:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_3
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->f:J

    cmp-long v0, v2, v6

    if-eqz v0, :cond_4

    const-string v0, "interstitial_timeout"

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->f:J

    long-to-double v2, v2

    const-wide v4, 0x408f400000000000L

    div-double/2addr v2, v4

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaej;->k:I

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzem()Lcom/google/android/gms/internal/ads/jt;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/jt;->b()I

    move-result v2

    if-ne v0, v2, :cond_13

    const-string v0, "orientation"

    const-string v2, "portrait"

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_5
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaej;->c:Ljava/util/List;

    if-eqz v0, :cond_6

    const-string v0, "click_urls"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->c:Ljava/util/List;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/et;->a(Ljava/util/List;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaej;->e:Ljava/util/List;

    if-eqz v0, :cond_7

    const-string v0, "impression_urls"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->e:Ljava/util/List;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/et;->a(Ljava/util/List;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaej;->R:Ljava/util/List;

    if-eqz v0, :cond_8

    const-string v0, "downloaded_impression_urls"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->R:Ljava/util/List;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/et;->a(Ljava/util/List;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaej;->i:Ljava/util/List;

    if-eqz v0, :cond_9

    const-string v0, "manual_impression_urls"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->i:Ljava/util/List;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/et;->a(Ljava/util/List;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaej;->q:Ljava/lang/String;

    if-eqz v0, :cond_a

    const-string v0, "active_view"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->q:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_a
    const-string v0, "ad_is_javascript"

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->o:Z

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaej;->p:Ljava/lang/String;

    if-eqz v0, :cond_b

    const-string v0, "ad_passback_url"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->p:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_b
    const-string v0, "mediation"

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->g:Z

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v0, "custom_render_allowed"

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->r:Z

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v0, "content_url_opted_out"

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->u:Z

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v0, "content_vertical_opted_out"

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->M:Z

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v0, "prefetch"

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->v:Z

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->j:J

    cmp-long v0, v2, v6

    if-eqz v0, :cond_c

    const-string v0, "refresh_interval_milliseconds"

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->j:J

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    :cond_c
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->h:J

    cmp-long v0, v2, v6

    if-eqz v0, :cond_d

    const-string v0, "mediation_config_cache_time_milliseconds"

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->h:J

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    :cond_d
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaej;->x:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_e

    const-string v0, "gws_query_id"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->x:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_e
    const-string v2, "fluid"

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaej;->y:Z

    if-eqz v0, :cond_14

    const-string v0, "height"

    :goto_2
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "native_express"

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->z:Z

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaej;->B:Ljava/util/List;

    if-eqz v0, :cond_f

    const-string v0, "video_start_urls"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->B:Ljava/util/List;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/et;->a(Ljava/util/List;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_f
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaej;->C:Ljava/util/List;

    if-eqz v0, :cond_10

    const-string v0, "video_complete_urls"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->C:Ljava/util/List;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/et;->a(Ljava/util/List;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_10
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaej;->A:Lcom/google/android/gms/internal/ads/zzaig;

    if-eqz v0, :cond_11

    const-string v0, "rewards"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->A:Lcom/google/android/gms/internal/ads/zzaig;

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    const-string v4, "rb_type"

    iget-object v5, v2, Lcom/google/android/gms/internal/ads/zzaig;->a:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v4, "rb_amount"

    iget v2, v2, Lcom/google/android/gms/internal/ads/zzaig;->b:I

    invoke-virtual {v3, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    invoke-virtual {v2, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_11
    const-string v0, "use_displayed_impression"

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->D:Z

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v0, "auto_protection_configuration"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->E:Lcom/google/android/gms/internal/ads/zzael;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "render_in_browser"

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->I:Z

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v0, "disable_closable_area"

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->S:Z

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    return-object v1

    :cond_12
    const-string v0, "ad_html"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaej;->b:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_0

    :cond_13
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaej;->k:I

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzem()Lcom/google/android/gms/internal/ads/jt;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/jt;->a()I

    move-result v2

    if-ne v0, v2, :cond_5

    const-string v0, "orientation"

    const-string v2, "landscape"

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_1

    :cond_14
    const-string v0, ""

    goto/16 :goto_2
.end method

.method private static a(Ljava/util/HashMap;Landroid/location/Location;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Landroid/location/Location;",
            ")V"
        }
    .end annotation

    const-wide v6, 0x416312d000000000L

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result v1

    const/high16 v2, 0x447a

    mul-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1}, Landroid/location/Location;->getTime()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v4

    mul-double/2addr v4, v6

    double-to-long v4, v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v4

    mul-double/2addr v4, v6

    double-to-long v4, v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const-string v5, "radius"

    invoke-virtual {v0, v5, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "lat"

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "long"

    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "time"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "uule"

    invoke-virtual {p0, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
