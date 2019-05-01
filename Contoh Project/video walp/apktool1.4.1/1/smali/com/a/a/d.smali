.class public final Lcom/a/a/d;
.super Ljava/lang/Object;


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<*>;",
            "Lcom/a/a/k",
            "<**>;>;"
        }
    .end annotation
.end field

.field private b:Lcom/a/a/c/b/j;

.field private c:Lcom/a/a/c/b/a/e;

.field private d:Lcom/a/a/c/b/a/b;

.field private e:Lcom/a/a/c/b/b/h;

.field private f:Lcom/a/a/c/b/c/a;

.field private g:Lcom/a/a/c/b/c/a;

.field private h:Lcom/a/a/c/b/b/a$a;

.field private i:Lcom/a/a/c/b/b/i;

.field private j:Lcom/a/a/d/d;

.field private k:I

.field private l:Lcom/a/a/g/e;

.field private m:Lcom/a/a/d/l$a;

.field private n:Lcom/a/a/c/b/c/a;

.field private o:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/support/v4/f/a;

    invoke-direct {v0}, Landroid/support/v4/f/a;-><init>()V

    iput-object v0, p0, Lcom/a/a/d;->a:Ljava/util/Map;

    const/4 v0, 0x4

    iput v0, p0, Lcom/a/a/d;->k:I

    new-instance v0, Lcom/a/a/g/e;

    invoke-direct {v0}, Lcom/a/a/g/e;-><init>()V

    iput-object v0, p0, Lcom/a/a/d;->l:Lcom/a/a/g/e;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Lcom/a/a/c;
    .locals 11

    iget-object v0, p0, Lcom/a/a/d;->f:Lcom/a/a/c/b/c/a;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/a/a/c/b/c/a;->b()Lcom/a/a/c/b/c/a;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/d;->f:Lcom/a/a/c/b/c/a;

    :cond_0
    iget-object v0, p0, Lcom/a/a/d;->g:Lcom/a/a/c/b/c/a;

    if-nez v0, :cond_1

    invoke-static {}, Lcom/a/a/c/b/c/a;->a()Lcom/a/a/c/b/c/a;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/d;->g:Lcom/a/a/c/b/c/a;

    :cond_1
    iget-object v0, p0, Lcom/a/a/d;->n:Lcom/a/a/c/b/c/a;

    if-nez v0, :cond_2

    invoke-static {}, Lcom/a/a/c/b/c/a;->d()Lcom/a/a/c/b/c/a;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/d;->n:Lcom/a/a/c/b/c/a;

    :cond_2
    iget-object v0, p0, Lcom/a/a/d;->i:Lcom/a/a/c/b/b/i;

    if-nez v0, :cond_3

    new-instance v0, Lcom/a/a/c/b/b/i$a;

    invoke-direct {v0, p1}, Lcom/a/a/c/b/b/i$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/a/a/c/b/b/i$a;->a()Lcom/a/a/c/b/b/i;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/d;->i:Lcom/a/a/c/b/b/i;

    :cond_3
    iget-object v0, p0, Lcom/a/a/d;->j:Lcom/a/a/d/d;

    if-nez v0, :cond_4

    new-instance v0, Lcom/a/a/d/f;

    invoke-direct {v0}, Lcom/a/a/d/f;-><init>()V

    iput-object v0, p0, Lcom/a/a/d;->j:Lcom/a/a/d/d;

    :cond_4
    iget-object v0, p0, Lcom/a/a/d;->c:Lcom/a/a/c/b/a/e;

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/a/a/d;->i:Lcom/a/a/c/b/b/i;

    invoke-virtual {v0}, Lcom/a/a/c/b/b/i;->b()I

    move-result v0

    if-lez v0, :cond_a

    new-instance v1, Lcom/a/a/c/b/a/k;

    int-to-long v2, v0

    invoke-direct {v1, v2, v3}, Lcom/a/a/c/b/a/k;-><init>(J)V

    iput-object v1, p0, Lcom/a/a/d;->c:Lcom/a/a/c/b/a/e;

    :cond_5
    :goto_0
    iget-object v0, p0, Lcom/a/a/d;->d:Lcom/a/a/c/b/a/b;

    if-nez v0, :cond_6

    new-instance v0, Lcom/a/a/c/b/a/j;

    iget-object v1, p0, Lcom/a/a/d;->i:Lcom/a/a/c/b/b/i;

    invoke-virtual {v1}, Lcom/a/a/c/b/b/i;->c()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/a/a/c/b/a/j;-><init>(I)V

    iput-object v0, p0, Lcom/a/a/d;->d:Lcom/a/a/c/b/a/b;

    :cond_6
    iget-object v0, p0, Lcom/a/a/d;->e:Lcom/a/a/c/b/b/h;

    if-nez v0, :cond_7

    new-instance v0, Lcom/a/a/c/b/b/g;

    iget-object v1, p0, Lcom/a/a/d;->i:Lcom/a/a/c/b/b/i;

    invoke-virtual {v1}, Lcom/a/a/c/b/b/i;->a()I

    move-result v1

    int-to-long v2, v1

    invoke-direct {v0, v2, v3}, Lcom/a/a/c/b/b/g;-><init>(J)V

    iput-object v0, p0, Lcom/a/a/d;->e:Lcom/a/a/c/b/b/h;

    :cond_7
    iget-object v0, p0, Lcom/a/a/d;->h:Lcom/a/a/c/b/b/a$a;

    if-nez v0, :cond_8

    new-instance v0, Lcom/a/a/c/b/b/f;

    invoke-direct {v0, p1}, Lcom/a/a/c/b/b/f;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/a/a/d;->h:Lcom/a/a/c/b/b/a$a;

    :cond_8
    iget-object v0, p0, Lcom/a/a/d;->b:Lcom/a/a/c/b/j;

    if-nez v0, :cond_9

    new-instance v0, Lcom/a/a/c/b/j;

    iget-object v1, p0, Lcom/a/a/d;->e:Lcom/a/a/c/b/b/h;

    iget-object v2, p0, Lcom/a/a/d;->h:Lcom/a/a/c/b/b/a$a;

    iget-object v3, p0, Lcom/a/a/d;->g:Lcom/a/a/c/b/c/a;

    iget-object v4, p0, Lcom/a/a/d;->f:Lcom/a/a/c/b/c/a;

    invoke-static {}, Lcom/a/a/c/b/c/a;->c()Lcom/a/a/c/b/c/a;

    move-result-object v5

    invoke-static {}, Lcom/a/a/c/b/c/a;->d()Lcom/a/a/c/b/c/a;

    move-result-object v6

    iget-boolean v7, p0, Lcom/a/a/d;->o:Z

    invoke-direct/range {v0 .. v7}, Lcom/a/a/c/b/j;-><init>(Lcom/a/a/c/b/b/h;Lcom/a/a/c/b/b/a$a;Lcom/a/a/c/b/c/a;Lcom/a/a/c/b/c/a;Lcom/a/a/c/b/c/a;Lcom/a/a/c/b/c/a;Z)V

    iput-object v0, p0, Lcom/a/a/d;->b:Lcom/a/a/c/b/j;

    :cond_9
    new-instance v6, Lcom/a/a/d/l;

    iget-object v0, p0, Lcom/a/a/d;->m:Lcom/a/a/d/l$a;

    invoke-direct {v6, v0}, Lcom/a/a/d/l;-><init>(Lcom/a/a/d/l$a;)V

    new-instance v0, Lcom/a/a/c;

    iget-object v2, p0, Lcom/a/a/d;->b:Lcom/a/a/c/b/j;

    iget-object v3, p0, Lcom/a/a/d;->e:Lcom/a/a/c/b/b/h;

    iget-object v4, p0, Lcom/a/a/d;->c:Lcom/a/a/c/b/a/e;

    iget-object v5, p0, Lcom/a/a/d;->d:Lcom/a/a/c/b/a/b;

    iget-object v7, p0, Lcom/a/a/d;->j:Lcom/a/a/d/d;

    iget v8, p0, Lcom/a/a/d;->k:I

    iget-object v1, p0, Lcom/a/a/d;->l:Lcom/a/a/g/e;

    invoke-virtual {v1}, Lcom/a/a/g/e;->h()Lcom/a/a/g/e;

    move-result-object v9

    iget-object v10, p0, Lcom/a/a/d;->a:Ljava/util/Map;

    move-object v1, p1

    invoke-direct/range {v0 .. v10}, Lcom/a/a/c;-><init>(Landroid/content/Context;Lcom/a/a/c/b/j;Lcom/a/a/c/b/b/h;Lcom/a/a/c/b/a/e;Lcom/a/a/c/b/a/b;Lcom/a/a/d/l;Lcom/a/a/d/d;ILcom/a/a/g/e;Ljava/util/Map;)V

    return-object v0

    :cond_a
    new-instance v0, Lcom/a/a/c/b/a/f;

    invoke-direct {v0}, Lcom/a/a/c/b/a/f;-><init>()V

    iput-object v0, p0, Lcom/a/a/d;->c:Lcom/a/a/c/b/a/e;

    goto :goto_0
.end method

.method a(Lcom/a/a/d/l$a;)V
    .locals 0

    iput-object p1, p0, Lcom/a/a/d;->m:Lcom/a/a/d/l$a;

    return-void
.end method
