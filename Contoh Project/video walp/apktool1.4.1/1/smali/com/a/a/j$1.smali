.class Lcom/a/a/j$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/a/a/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/a/a/j;


# direct methods
.method constructor <init>(Lcom/a/a/j;)V
    .locals 0

    iput-object p1, p0, Lcom/a/a/j$1;->a:Lcom/a/a/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/a/a/j$1;->a:Lcom/a/a/j;

    iget-object v0, v0, Lcom/a/a/j;->c:Lcom/a/a/d/h;

    iget-object v1, p0, Lcom/a/a/j$1;->a:Lcom/a/a/j;

    invoke-interface {v0, v1}, Lcom/a/a/d/h;->a(Lcom/a/a/d/i;)V

    return-void
.end method
