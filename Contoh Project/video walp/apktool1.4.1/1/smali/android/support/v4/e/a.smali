.class public final Landroid/support/v4/e/a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/e/a$b;,
        Landroid/support/v4/e/a$a;
    }
.end annotation


# static fields
.field private static a:Landroid/support/v4/e/c;

.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/lang/String;

.field private static final d:Landroid/support/v4/e/a;

.field private static final e:Landroid/support/v4/e/a;


# instance fields
.field private final f:Z

.field private final g:I

.field private final h:Landroid/support/v4/e/c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v3, 0x2

    sget-object v0, Landroid/support/v4/e/d;->c:Landroid/support/v4/e/c;

    sput-object v0, Landroid/support/v4/e/a;->a:Landroid/support/v4/e/c;

    const/16 v0, 0x200e

    invoke-static {v0}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroid/support/v4/e/a;->b:Ljava/lang/String;

    const/16 v0, 0x200f

    invoke-static {v0}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroid/support/v4/e/a;->c:Ljava/lang/String;

    new-instance v0, Landroid/support/v4/e/a;

    const/4 v1, 0x0

    sget-object v2, Landroid/support/v4/e/a;->a:Landroid/support/v4/e/c;

    invoke-direct {v0, v1, v3, v2}, Landroid/support/v4/e/a;-><init>(ZILandroid/support/v4/e/c;)V

    sput-object v0, Landroid/support/v4/e/a;->d:Landroid/support/v4/e/a;

    new-instance v0, Landroid/support/v4/e/a;

    const/4 v1, 0x1

    sget-object v2, Landroid/support/v4/e/a;->a:Landroid/support/v4/e/c;

    invoke-direct {v0, v1, v3, v2}, Landroid/support/v4/e/a;-><init>(ZILandroid/support/v4/e/c;)V

    sput-object v0, Landroid/support/v4/e/a;->e:Landroid/support/v4/e/a;

    return-void
.end method

.method private constructor <init>(ZILandroid/support/v4/e/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Landroid/support/v4/e/a;->f:Z

    iput p2, p0, Landroid/support/v4/e/a;->g:I

    iput-object p3, p0, Landroid/support/v4/e/a;->h:Landroid/support/v4/e/c;

    return-void
.end method

.method synthetic constructor <init>(ZILandroid/support/v4/e/c;Landroid/support/v4/e/a$1;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroid/support/v4/e/a;-><init>(ZILandroid/support/v4/e/c;)V

    return-void
.end method

.method public static a()Landroid/support/v4/e/a;
    .locals 1

    new-instance v0, Landroid/support/v4/e/a$a;

    invoke-direct {v0}, Landroid/support/v4/e/a$a;-><init>()V

    invoke-virtual {v0}, Landroid/support/v4/e/a$a;->a()Landroid/support/v4/e/a;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/CharSequence;Landroid/support/v4/e/c;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-interface {p2, p1, v0, v1}, Landroid/support/v4/e/c;->a(Ljava/lang/CharSequence;II)Z

    move-result v0

    iget-boolean v1, p0, Landroid/support/v4/e/a;->f:Z

    if-nez v1, :cond_1

    if-nez v0, :cond_0

    invoke-static {p1}, Landroid/support/v4/e/a;->b(Ljava/lang/CharSequence;)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    :cond_0
    sget-object v0, Landroid/support/v4/e/a;->b:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_1
    iget-boolean v1, p0, Landroid/support/v4/e/a;->f:Z

    if-eqz v1, :cond_3

    if-eqz v0, :cond_2

    invoke-static {p1}, Landroid/support/v4/e/a;->b(Ljava/lang/CharSequence;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_3

    :cond_2
    sget-object v0, Landroid/support/v4/e/a;->c:Ljava/lang/String;

    goto :goto_0

    :cond_3
    const-string v0, ""

    goto :goto_0
.end method

.method static synthetic a(Ljava/util/Locale;)Z
    .locals 1

    invoke-static {p0}, Landroid/support/v4/e/a;->b(Ljava/util/Locale;)Z

    move-result v0

    return v0
.end method

.method private static b(Ljava/lang/CharSequence;)I
    .locals 2

    new-instance v0, Landroid/support/v4/e/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroid/support/v4/e/a$b;-><init>(Ljava/lang/CharSequence;Z)V

    invoke-virtual {v0}, Landroid/support/v4/e/a$b;->b()I

    move-result v0

    return v0
.end method

.method private b(Ljava/lang/CharSequence;Landroid/support/v4/e/c;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-interface {p2, p1, v0, v1}, Landroid/support/v4/e/c;->a(Ljava/lang/CharSequence;II)Z

    move-result v0

    iget-boolean v1, p0, Landroid/support/v4/e/a;->f:Z

    if-nez v1, :cond_1

    if-nez v0, :cond_0

    invoke-static {p1}, Landroid/support/v4/e/a;->c(Ljava/lang/CharSequence;)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    :cond_0
    sget-object v0, Landroid/support/v4/e/a;->b:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_1
    iget-boolean v1, p0, Landroid/support/v4/e/a;->f:Z

    if-eqz v1, :cond_3

    if-eqz v0, :cond_2

    invoke-static {p1}, Landroid/support/v4/e/a;->c(Ljava/lang/CharSequence;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_3

    :cond_2
    sget-object v0, Landroid/support/v4/e/a;->c:Ljava/lang/String;

    goto :goto_0

    :cond_3
    const-string v0, ""

    goto :goto_0
.end method

.method private static b(Ljava/util/Locale;)Z
    .locals 2

    const/4 v0, 0x1

    invoke-static {p0}, Landroid/support/v4/e/e;->a(Ljava/util/Locale;)I

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static c(Ljava/lang/CharSequence;)I
    .locals 2

    new-instance v0, Landroid/support/v4/e/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroid/support/v4/e/a$b;-><init>(Ljava/lang/CharSequence;Z)V

    invoke-virtual {v0}, Landroid/support/v4/e/a$b;->a()I

    move-result v0

    return v0
.end method

.method static synthetic c()Landroid/support/v4/e/c;
    .locals 1

    sget-object v0, Landroid/support/v4/e/a;->a:Landroid/support/v4/e/c;

    return-object v0
.end method

.method static synthetic d()Landroid/support/v4/e/a;
    .locals 1

    sget-object v0, Landroid/support/v4/e/a;->e:Landroid/support/v4/e/a;

    return-object v0
.end method

.method static synthetic e()Landroid/support/v4/e/a;
    .locals 1

    sget-object v0, Landroid/support/v4/e/a;->d:Landroid/support/v4/e/a;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 2

    iget-object v0, p0, Landroid/support/v4/e/a;->h:Landroid/support/v4/e/c;

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Landroid/support/v4/e/a;->a(Ljava/lang/CharSequence;Landroid/support/v4/e/c;Z)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/CharSequence;Landroid/support/v4/e/c;Z)Ljava/lang/CharSequence;
    .locals 3

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-interface {p2, p1, v0, v1}, Landroid/support/v4/e/c;->a(Ljava/lang/CharSequence;II)Z

    move-result v2

    new-instance v1, Landroid/text/SpannableStringBuilder;

    invoke-direct {v1}, Landroid/text/SpannableStringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/support/v4/e/a;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p3, :cond_1

    if-eqz v2, :cond_3

    sget-object v0, Landroid/support/v4/e/d;->b:Landroid/support/v4/e/c;

    :goto_1
    invoke-direct {p0, p1, v0}, Landroid/support/v4/e/a;->b(Ljava/lang/CharSequence;Landroid/support/v4/e/c;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    :cond_1
    iget-boolean v0, p0, Landroid/support/v4/e/a;->f:Z

    if-eq v2, v0, :cond_5

    if-eqz v2, :cond_4

    const/16 v0, 0x202b

    :goto_2
    invoke-virtual {v1, v0}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    invoke-virtual {v1, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    const/16 v0, 0x202c

    invoke-virtual {v1, v0}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    :goto_3
    if-eqz p3, :cond_2

    if-eqz v2, :cond_6

    sget-object v0, Landroid/support/v4/e/d;->b:Landroid/support/v4/e/c;

    :goto_4
    invoke-direct {p0, p1, v0}, Landroid/support/v4/e/a;->a(Ljava/lang/CharSequence;Landroid/support/v4/e/c;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    :cond_2
    move-object v0, v1

    goto :goto_0

    :cond_3
    sget-object v0, Landroid/support/v4/e/d;->a:Landroid/support/v4/e/c;

    goto :goto_1

    :cond_4
    const/16 v0, 0x202a

    goto :goto_2

    :cond_5
    invoke-virtual {v1, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    goto :goto_3

    :cond_6
    sget-object v0, Landroid/support/v4/e/d;->a:Landroid/support/v4/e/c;

    goto :goto_4
.end method

.method public b()Z
    .locals 1

    iget v0, p0, Landroid/support/v4/e/a;->g:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
