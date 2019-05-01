.class Lcom/naing/b/d$2$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/naing/b/d$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/naing/b/e;

.field final synthetic b:Lcom/naing/b/g;

.field final synthetic c:Lcom/naing/b/d$2;


# direct methods
.method constructor <init>(Lcom/naing/b/d$2;Lcom/naing/b/e;Lcom/naing/b/g;)V
    .locals 0

    iput-object p1, p0, Lcom/naing/b/d$2$1;->c:Lcom/naing/b/d$2;

    iput-object p2, p0, Lcom/naing/b/d$2$1;->a:Lcom/naing/b/e;

    iput-object p3, p0, Lcom/naing/b/d$2$1;->b:Lcom/naing/b/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/naing/b/d$2$1;->c:Lcom/naing/b/d$2;

    iget-object v0, v0, Lcom/naing/b/d$2;->c:Lcom/naing/b/d$c;

    iget-object v1, p0, Lcom/naing/b/d$2$1;->a:Lcom/naing/b/e;

    iget-object v2, p0, Lcom/naing/b/d$2$1;->b:Lcom/naing/b/g;

    invoke-interface {v0, v1, v2}, Lcom/naing/b/d$c;->a(Lcom/naing/b/e;Lcom/naing/b/g;)V

    return-void
.end method
