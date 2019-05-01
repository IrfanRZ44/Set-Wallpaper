.class final Lcom/a/a/c/b/b/j$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/a/a/i/a/a$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/a/a/c/b/b/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field final a:Ljava/security/MessageDigest;

.field private final b:Lcom/a/a/i/a/b;


# direct methods
.method constructor <init>(Ljava/security/MessageDigest;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/a/a/i/a/b;->a()Lcom/a/a/i/a/b;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/c/b/b/j$a;->b:Lcom/a/a/i/a/b;

    iput-object p1, p0, Lcom/a/a/c/b/b/j$a;->a:Ljava/security/MessageDigest;

    return-void
.end method


# virtual methods
.method public a_()Lcom/a/a/i/a/b;
    .locals 1

    iget-object v0, p0, Lcom/a/a/c/b/b/j$a;->b:Lcom/a/a/i/a/b;

    return-object v0
.end method
