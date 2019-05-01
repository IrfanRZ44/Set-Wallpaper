.class Lcom/a/a/c/d/a/s$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/a/a/c/d/a/k$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/a/a/c/d/a/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/a/a/c/d/a/q;

.field private final b:Lcom/a/a/i/c;


# direct methods
.method constructor <init>(Lcom/a/a/c/d/a/q;Lcom/a/a/i/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/a/a/c/d/a/s$a;->a:Lcom/a/a/c/d/a/q;

    iput-object p2, p0, Lcom/a/a/c/d/a/s$a;->b:Lcom/a/a/i/c;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/a/a/c/d/a/s$a;->a:Lcom/a/a/c/d/a/q;

    invoke-virtual {v0}, Lcom/a/a/c/d/a/q;->a()V

    return-void
.end method

.method public a(Lcom/a/a/c/b/a/e;Landroid/graphics/Bitmap;)V
    .locals 1

    iget-object v0, p0, Lcom/a/a/c/d/a/s$a;->b:Lcom/a/a/i/c;

    invoke-virtual {v0}, Lcom/a/a/i/c;->a()Ljava/io/IOException;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    invoke-interface {p1, p2}, Lcom/a/a/c/b/a/e;->a(Landroid/graphics/Bitmap;)V

    :cond_0
    throw v0

    :cond_1
    return-void
.end method
