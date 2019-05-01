.class public Lcom/a/a/c/b/j;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/a/a/c/b/b/h$a;
.implements Lcom/a/a/c/b/l;
.implements Lcom/a/a/c/b/o$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/a/a/c/b/j$b;,
        Lcom/a/a/c/b/j$a;,
        Lcom/a/a/c/b/j$c;,
        Lcom/a/a/c/b/j$d;
    }
.end annotation


# instance fields
.field private final a:Lcom/a/a/c/b/r;

.field private final b:Lcom/a/a/c/b/n;

.field private final c:Lcom/a/a/c/b/b/h;

.field private final d:Lcom/a/a/c/b/j$b;

.field private final e:Lcom/a/a/c/b/x;

.field private final f:Lcom/a/a/c/b/j$c;

.field private final g:Lcom/a/a/c/b/j$a;

.field private final h:Lcom/a/a/c/b/a;


# direct methods
.method constructor <init>(Lcom/a/a/c/b/b/h;Lcom/a/a/c/b/b/a$a;Lcom/a/a/c/b/c/a;Lcom/a/a/c/b/c/a;Lcom/a/a/c/b/c/a;Lcom/a/a/c/b/c/a;Lcom/a/a/c/b/r;Lcom/a/a/c/b/n;Lcom/a/a/c/b/a;Lcom/a/a/c/b/j$b;Lcom/a/a/c/b/j$a;Lcom/a/a/c/b/x;Z)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/a/a/c/b/j;->c:Lcom/a/a/c/b/b/h;

    new-instance v2, Lcom/a/a/c/b/j$c;

    invoke-direct {v2, p2}, Lcom/a/a/c/b/j$c;-><init>(Lcom/a/a/c/b/b/a$a;)V

    iput-object v2, p0, Lcom/a/a/c/b/j;->f:Lcom/a/a/c/b/j$c;

    if-nez p9, :cond_0

    new-instance p9, Lcom/a/a/c/b/a;

    move-object/from16 v0, p9

    move/from16 v1, p13

    invoke-direct {v0, v1}, Lcom/a/a/c/b/a;-><init>(Z)V

    :cond_0
    move-object/from16 v0, p9

    iput-object v0, p0, Lcom/a/a/c/b/j;->h:Lcom/a/a/c/b/a;

    move-object/from16 v0, p9

    invoke-virtual {v0, p0}, Lcom/a/a/c/b/a;->a(Lcom/a/a/c/b/o$a;)V

    if-nez p8, :cond_1

    new-instance p8, Lcom/a/a/c/b/n;

    invoke-direct/range {p8 .. p8}, Lcom/a/a/c/b/n;-><init>()V

    :cond_1
    move-object/from16 v0, p8

    iput-object v0, p0, Lcom/a/a/c/b/j;->b:Lcom/a/a/c/b/n;

    if-nez p7, :cond_2

    new-instance p7, Lcom/a/a/c/b/r;

    invoke-direct {p7}, Lcom/a/a/c/b/r;-><init>()V

    :cond_2
    iput-object p7, p0, Lcom/a/a/c/b/j;->a:Lcom/a/a/c/b/r;

    if-nez p10, :cond_5

    new-instance v2, Lcom/a/a/c/b/j$b;

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object v7, p0

    invoke-direct/range {v2 .. v7}, Lcom/a/a/c/b/j$b;-><init>(Lcom/a/a/c/b/c/a;Lcom/a/a/c/b/c/a;Lcom/a/a/c/b/c/a;Lcom/a/a/c/b/c/a;Lcom/a/a/c/b/l;)V

    :goto_0
    iput-object v2, p0, Lcom/a/a/c/b/j;->d:Lcom/a/a/c/b/j$b;

    if-nez p11, :cond_3

    new-instance p11, Lcom/a/a/c/b/j$a;

    iget-object v2, p0, Lcom/a/a/c/b/j;->f:Lcom/a/a/c/b/j$c;

    move-object/from16 v0, p11

    invoke-direct {v0, v2}, Lcom/a/a/c/b/j$a;-><init>(Lcom/a/a/c/b/g$d;)V

    :cond_3
    move-object/from16 v0, p11

    iput-object v0, p0, Lcom/a/a/c/b/j;->g:Lcom/a/a/c/b/j$a;

    if-nez p12, :cond_4

    new-instance p12, Lcom/a/a/c/b/x;

    invoke-direct/range {p12 .. p12}, Lcom/a/a/c/b/x;-><init>()V

    :cond_4
    move-object/from16 v0, p12

    iput-object v0, p0, Lcom/a/a/c/b/j;->e:Lcom/a/a/c/b/x;

    invoke-interface {p1, p0}, Lcom/a/a/c/b/b/h;->a(Lcom/a/a/c/b/b/h$a;)V

    return-void

    :cond_5
    move-object/from16 v2, p10

    goto :goto_0
.end method

.method public constructor <init>(Lcom/a/a/c/b/b/h;Lcom/a/a/c/b/b/a$a;Lcom/a/a/c/b/c/a;Lcom/a/a/c/b/c/a;Lcom/a/a/c/b/c/a;Lcom/a/a/c/b/c/a;Z)V
    .locals 14

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move/from16 v13, p7

    invoke-direct/range {v0 .. v13}, Lcom/a/a/c/b/j;-><init>(Lcom/a/a/c/b/b/h;Lcom/a/a/c/b/b/a$a;Lcom/a/a/c/b/c/a;Lcom/a/a/c/b/c/a;Lcom/a/a/c/b/c/a;Lcom/a/a/c/b/c/a;Lcom/a/a/c/b/r;Lcom/a/a/c/b/n;Lcom/a/a/c/b/a;Lcom/a/a/c/b/j$b;Lcom/a/a/c/b/j$a;Lcom/a/a/c/b/x;Z)V

    return-void
.end method

.method private a(Lcom/a/a/c/h;)Lcom/a/a/c/b/o;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/a/a/c/h;",
            ")",
            "Lcom/a/a/c/b/o",
            "<*>;"
        }
    .end annotation

    const/4 v2, 0x1

    iget-object v0, p0, Lcom/a/a/c/b/j;->c:Lcom/a/a/c/b/b/h;

    invoke-interface {v0, p1}, Lcom/a/a/c/b/b/h;->a(Lcom/a/a/c/h;)Lcom/a/a/c/b/u;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    instance-of v1, v0, Lcom/a/a/c/b/o;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/a/a/c/b/o;

    goto :goto_0

    :cond_1
    new-instance v1, Lcom/a/a/c/b/o;

    invoke-direct {v1, v0, v2, v2}, Lcom/a/a/c/b/o;-><init>(Lcom/a/a/c/b/u;ZZ)V

    move-object v0, v1

    goto :goto_0
.end method

.method private a(Lcom/a/a/c/h;Z)Lcom/a/a/c/b/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/a/a/c/h;",
            "Z)",
            "Lcom/a/a/c/b/o",
            "<*>;"
        }
    .end annotation

    if-nez p2, :cond_1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/a/a/c/b/j;->h:Lcom/a/a/c/b/a;

    invoke-virtual {v0, p1}, Lcom/a/a/c/b/a;->b(Lcom/a/a/c/h;)Lcom/a/a/c/b/o;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/a/a/c/b/o;->g()V

    goto :goto_0
.end method

.method private static a(Ljava/lang/String;JLcom/a/a/c/h;)V
    .locals 5

    const-string v0, "Engine"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " in "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1, p2}, Lcom/a/a/i/d;->a(J)D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "ms, key: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private b(Lcom/a/a/c/h;Z)Lcom/a/a/c/b/o;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/a/a/c/h;",
            "Z)",
            "Lcom/a/a/c/b/o",
            "<*>;"
        }
    .end annotation

    if-nez p2, :cond_1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    invoke-direct {p0, p1}, Lcom/a/a/c/b/j;->a(Lcom/a/a/c/h;)Lcom/a/a/c/b/o;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/a/a/c/b/o;->g()V

    iget-object v1, p0, Lcom/a/a/c/b/j;->h:Lcom/a/a/c/b/a;

    invoke-virtual {v1, p1, v0}, Lcom/a/a/c/b/a;->a(Lcom/a/a/c/h;Lcom/a/a/c/b/o;)V

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/a/a/e;Ljava/lang/Object;Lcom/a/a/c/h;IILjava/lang/Class;Ljava/lang/Class;Lcom/a/a/g;Lcom/a/a/c/b/i;Ljava/util/Map;ZZLcom/a/a/c/j;ZZZZLcom/a/a/g/f;)Lcom/a/a/c/b/j$d;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/a/a/e;",
            "Ljava/lang/Object;",
            "Lcom/a/a/c/h;",
            "II",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/Class",
            "<TR;>;",
            "Lcom/a/a/g;",
            "Lcom/a/a/c/b/i;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<*>;",
            "Lcom/a/a/c/m",
            "<*>;>;ZZ",
            "Lcom/a/a/c/j;",
            "ZZZZ",
            "Lcom/a/a/g/f;",
            ")",
            "Lcom/a/a/c/b/j$d;"
        }
    .end annotation

    invoke-static {}, Lcom/a/a/i/i;->a()V

    invoke-static {}, Lcom/a/a/i/d;->a()J

    move-result-wide v22

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/a/a/c/b/j;->b:Lcom/a/a/c/b/n;

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p10

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p13

    invoke-virtual/range {v2 .. v10}, Lcom/a/a/c/b/n;->a(Ljava/lang/Object;Lcom/a/a/c/h;IILjava/util/Map;Ljava/lang/Class;Ljava/lang/Class;Lcom/a/a/c/j;)Lcom/a/a/c/b/m;

    move-result-object v3

    move-object/from16 v0, p0

    move/from16 v1, p14

    invoke-direct {v0, v3, v1}, Lcom/a/a/c/b/j;->a(Lcom/a/a/c/h;Z)Lcom/a/a/c/b/o;

    move-result-object v2

    if-eqz v2, :cond_1

    sget-object v4, Lcom/a/a/c/a;->e:Lcom/a/a/c/a;

    move-object/from16 v0, p18

    invoke-interface {v0, v2, v4}, Lcom/a/a/g/f;->a(Lcom/a/a/c/b/u;Lcom/a/a/c/a;)V

    const-string v2, "Engine"

    const/4 v4, 0x2

    invoke-static {v2, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "Loaded resource from active resources"

    move-wide/from16 v0, v22

    invoke-static {v2, v0, v1, v3}, Lcom/a/a/c/b/j;->a(Ljava/lang/String;JLcom/a/a/c/h;)V

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return-object v2

    :cond_1
    move-object/from16 v0, p0

    move/from16 v1, p14

    invoke-direct {v0, v3, v1}, Lcom/a/a/c/b/j;->b(Lcom/a/a/c/h;Z)Lcom/a/a/c/b/o;

    move-result-object v2

    if-eqz v2, :cond_3

    sget-object v4, Lcom/a/a/c/a;->e:Lcom/a/a/c/a;

    move-object/from16 v0, p18

    invoke-interface {v0, v2, v4}, Lcom/a/a/g/f;->a(Lcom/a/a/c/b/u;Lcom/a/a/c/a;)V

    const-string v2, "Engine"

    const/4 v4, 0x2

    invoke-static {v2, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "Loaded resource from cache"

    move-wide/from16 v0, v22

    invoke-static {v2, v0, v1, v3}, Lcom/a/a/c/b/j;->a(Ljava/lang/String;JLcom/a/a/c/h;)V

    :cond_2
    const/4 v2, 0x0

    goto :goto_0

    :cond_3
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/a/a/c/b/j;->a:Lcom/a/a/c/b/r;

    move/from16 v0, p17

    invoke-virtual {v2, v3, v0}, Lcom/a/a/c/b/r;->a(Lcom/a/a/c/h;Z)Lcom/a/a/c/b/k;

    move-result-object v4

    if-eqz v4, :cond_5

    move-object/from16 v0, p18

    invoke-virtual {v4, v0}, Lcom/a/a/c/b/k;->a(Lcom/a/a/g/f;)V

    const-string v2, "Engine"

    const/4 v5, 0x2

    invoke-static {v2, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_4

    const-string v2, "Added to existing load"

    move-wide/from16 v0, v22

    invoke-static {v2, v0, v1, v3}, Lcom/a/a/c/b/j;->a(Ljava/lang/String;JLcom/a/a/c/h;)V

    :cond_4
    new-instance v2, Lcom/a/a/c/b/j$d;

    move-object/from16 v0, p18

    invoke-direct {v2, v0, v4}, Lcom/a/a/c/b/j$d;-><init>(Lcom/a/a/g/f;Lcom/a/a/c/b/k;)V

    goto :goto_0

    :cond_5
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/a/a/c/b/j;->d:Lcom/a/a/c/b/j$b;

    move/from16 v4, p14

    move/from16 v5, p15

    move/from16 v6, p16

    move/from16 v7, p17

    invoke-virtual/range {v2 .. v7}, Lcom/a/a/c/b/j$b;->a(Lcom/a/a/c/h;ZZZZ)Lcom/a/a/c/b/k;

    move-result-object v20

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/a/a/c/b/j;->g:Lcom/a/a/c/b/j$a;

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move-object v7, v3

    move-object/from16 v8, p3

    move/from16 v9, p4

    move/from16 v10, p5

    move-object/from16 v11, p6

    move-object/from16 v12, p7

    move-object/from16 v13, p8

    move-object/from16 v14, p9

    move-object/from16 v15, p10

    move/from16 v16, p11

    move/from16 v17, p12

    move/from16 v18, p17

    move-object/from16 v19, p13

    invoke-virtual/range {v4 .. v20}, Lcom/a/a/c/b/j$a;->a(Lcom/a/a/e;Ljava/lang/Object;Lcom/a/a/c/b/m;Lcom/a/a/c/h;IILjava/lang/Class;Ljava/lang/Class;Lcom/a/a/g;Lcom/a/a/c/b/i;Ljava/util/Map;ZZZLcom/a/a/c/j;Lcom/a/a/c/b/g$a;)Lcom/a/a/c/b/g;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/a/a/c/b/j;->a:Lcom/a/a/c/b/r;

    move-object/from16 v0, v20

    invoke-virtual {v4, v3, v0}, Lcom/a/a/c/b/r;->a(Lcom/a/a/c/h;Lcom/a/a/c/b/k;)V

    move-object/from16 v0, v20

    move-object/from16 v1, p18

    invoke-virtual {v0, v1}, Lcom/a/a/c/b/k;->a(Lcom/a/a/g/f;)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Lcom/a/a/c/b/k;->b(Lcom/a/a/c/b/g;)V

    const-string v2, "Engine"

    const/4 v4, 0x2

    invoke-static {v2, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_6

    const-string v2, "Started new load"

    move-wide/from16 v0, v22

    invoke-static {v2, v0, v1, v3}, Lcom/a/a/c/b/j;->a(Ljava/lang/String;JLcom/a/a/c/h;)V

    :cond_6
    new-instance v2, Lcom/a/a/c/b/j$d;

    move-object/from16 v0, p18

    move-object/from16 v1, v20

    invoke-direct {v2, v0, v1}, Lcom/a/a/c/b/j$d;-><init>(Lcom/a/a/g/f;Lcom/a/a/c/b/k;)V

    goto/16 :goto_0
.end method

.method public a(Lcom/a/a/c/b/k;Lcom/a/a/c/h;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/a/a/c/b/k",
            "<*>;",
            "Lcom/a/a/c/h;",
            ")V"
        }
    .end annotation

    invoke-static {}, Lcom/a/a/i/i;->a()V

    iget-object v0, p0, Lcom/a/a/c/b/j;->a:Lcom/a/a/c/b/r;

    invoke-virtual {v0, p2, p1}, Lcom/a/a/c/b/r;->b(Lcom/a/a/c/h;Lcom/a/a/c/b/k;)V

    return-void
.end method

.method public a(Lcom/a/a/c/b/k;Lcom/a/a/c/h;Lcom/a/a/c/b/o;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/a/a/c/b/k",
            "<*>;",
            "Lcom/a/a/c/h;",
            "Lcom/a/a/c/b/o",
            "<*>;)V"
        }
    .end annotation

    invoke-static {}, Lcom/a/a/i/i;->a()V

    if-eqz p3, :cond_0

    invoke-virtual {p3, p2, p0}, Lcom/a/a/c/b/o;->a(Lcom/a/a/c/h;Lcom/a/a/c/b/o$a;)V

    invoke-virtual {p3}, Lcom/a/a/c/b/o;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/a/a/c/b/j;->h:Lcom/a/a/c/b/a;

    invoke-virtual {v0, p2, p3}, Lcom/a/a/c/b/a;->a(Lcom/a/a/c/h;Lcom/a/a/c/b/o;)V

    :cond_0
    iget-object v0, p0, Lcom/a/a/c/b/j;->a:Lcom/a/a/c/b/r;

    invoke-virtual {v0, p2, p1}, Lcom/a/a/c/b/r;->b(Lcom/a/a/c/h;Lcom/a/a/c/b/k;)V

    return-void
.end method

.method public a(Lcom/a/a/c/b/u;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/a/a/c/b/u",
            "<*>;)V"
        }
    .end annotation

    invoke-static {}, Lcom/a/a/i/i;->a()V

    instance-of v0, p1, Lcom/a/a/c/b/o;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/a/a/c/b/o;

    invoke-virtual {p1}, Lcom/a/a/c/b/o;->h()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot release anything but an EngineResource"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a(Lcom/a/a/c/h;Lcom/a/a/c/b/o;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/a/a/c/h;",
            "Lcom/a/a/c/b/o",
            "<*>;)V"
        }
    .end annotation

    invoke-static {}, Lcom/a/a/i/i;->a()V

    iget-object v0, p0, Lcom/a/a/c/b/j;->h:Lcom/a/a/c/b/a;

    invoke-virtual {v0, p1}, Lcom/a/a/c/b/a;->a(Lcom/a/a/c/h;)V

    invoke-virtual {p2}, Lcom/a/a/c/b/o;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/a/a/c/b/j;->c:Lcom/a/a/c/b/b/h;

    invoke-interface {v0, p1, p2}, Lcom/a/a/c/b/b/h;->b(Lcom/a/a/c/h;Lcom/a/a/c/b/u;)Lcom/a/a/c/b/u;

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/a/a/c/b/j;->e:Lcom/a/a/c/b/x;

    invoke-virtual {v0, p2}, Lcom/a/a/c/b/x;->a(Lcom/a/a/c/b/u;)V

    goto :goto_0
.end method

.method public b(Lcom/a/a/c/b/u;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/a/a/c/b/u",
            "<*>;)V"
        }
    .end annotation

    invoke-static {}, Lcom/a/a/i/i;->a()V

    iget-object v0, p0, Lcom/a/a/c/b/j;->e:Lcom/a/a/c/b/x;

    invoke-virtual {v0, p1}, Lcom/a/a/c/b/x;->a(Lcom/a/a/c/b/u;)V

    return-void
.end method
