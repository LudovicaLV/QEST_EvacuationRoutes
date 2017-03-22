/* StatMCrules.java */
/* Generated By:JavaCC: Do not edit this line. StatMCrules.java */
package ParserStatMC;

import java.util.ArrayList;
import TraceAnalyser.Analyser;

public class StatMCrules implements StatMCrulesConstants {

    public StatMCrules() {
        this(new java.io.StringReader(""));
    }

    public void parseFromString( String modelDef ) throws ParseException, TokenMgrError, NumberFormatException {
        this.ReInit(new java.io.StringReader(modelDef));
        this.Input();
    }

    public void parseFromFile( String filename ) throws ParseException, TokenMgrError, NumberFormatException {
        try { this.ReInit(new java.io.FileReader(filename)); }
        catch(java.io.IOException e) {throw new ParseException("Error while opening file " + filename + ": " + e); }
        this.Input();
    }

/***********************************************
GRAMMAR RULES
***********************************************/
  final public 
void Input() throws ParseException, NumberFormatException, RuntimeException, ParseException {Token x=null, symbol=null, which=null ;
    jj_consume_token(SECTION_PROPERTY);
    jj_consume_token(SEMICOLON);
    which = WhichOptions();
    symbol = SymbolOptions();
    x = jj_consume_token(INT);
    jj_consume_token(SECTION_AGENTS);
    jj_consume_token(SEMICOLON);
    jj_consume_token(LBRAC);
    AgentName();
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case COMMA:{
        ;
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      jj_consume_token(COMMA);
      AgentName();
    }
    jj_consume_token(RBRAC);
    jj_consume_token(0);
int value = Integer.parseInt(x.image);
    TraceAnalyser.Analyser.intProperty = value;
  }

  final public Token WhichOptions() throws ParseException, NumberFormatException, RuntimeException, ParseException {Token whichOne=null;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case SYMBOL_PROP:
    case SYMBOL_PROP_COUNT:{
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case SYMBOL_PROP:{
        whichOne = jj_consume_token(SYMBOL_PROP);
TraceAnalyser.Analyser.whichProperty = whichOne.image;
        break;
        }
      case SYMBOL_PROP_COUNT:{
        whichOne = jj_consume_token(SYMBOL_PROP_COUNT);
TraceAnalyser.Analyser.whichProperty = whichOne.image;
        break;
        }
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    default:
      jj_la1[2] = jj_gen;
      ;
    }
{if ("" != null) return whichOne;}
    throw new Error("Missing return statement in function");
  }

  final public Token SymbolOptions() throws ParseException, NumberFormatException, RuntimeException, ParseException {Token symbol=null;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case KEYWORD_GEQ:
    case KEYWORD_LEQ:
    case ASSIGN:
    case LANG:
    case RANG:{
      if (jj_2_1(2)) {
        symbol = jj_consume_token(RANG);
TraceAnalyser.Analyser.symbolProperty = symbol.image;
      } else if (jj_2_2(2)) {
        symbol = jj_consume_token(KEYWORD_GEQ);
TraceAnalyser.Analyser.symbolProperty = symbol.image;
      } else if (jj_2_3(2)) {
        symbol = jj_consume_token(ASSIGN);
TraceAnalyser.Analyser.symbolProperty = symbol.image;
      } else if (jj_2_4(2)) {
        symbol = jj_consume_token(KEYWORD_LEQ);
TraceAnalyser.Analyser.symbolProperty = symbol.image;
      } else if (jj_2_5(2)) {
        symbol = jj_consume_token(LANG);
TraceAnalyser.Analyser.symbolProperty = symbol.image;
      } else {
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    default:
      jj_la1[3] = jj_gen;
      ;
    }
{if ("" != null) return symbol;}
    throw new Error("Missing return statement in function");
  }

  final public void AgentName() throws ParseException, NumberFormatException, RuntimeException, ParseException {Token name, x=null, y=null, z=null;
    name = jj_consume_token(IDENTIFIER);
    jj_consume_token(LR);
    x = jj_consume_token(INT);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case COMMA:{
      jj_consume_token(COMMA);
      y = jj_consume_token(INT);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case COMMA:{
        jj_consume_token(COMMA);
        z = jj_consume_token(INT);
        break;
        }
      default:
        jj_la1[4] = jj_gen;
        ;
      }
      break;
      }
    default:
      jj_la1[5] = jj_gen;
      ;
    }
    jj_consume_token(RR);
if (y == null && z == null){
    TraceAnalyser.Analyser.namesToCheckList.add(name.image + "(" + x.image + ")");}else{
    if (z == null) {
    TraceAnalyser.Analyser.namesToCheckList.add(name.image + "(" + x.image + "," + y.image + ")");}else{
    TraceAnalyser.Analyser.namesToCheckList.add(name.image + "(" + x.image + "," + y.image + "," + z.image + ")");}}


    if (y == null && z == null){
    int xValue = Integer.parseInt(x.image);
    ArrayList<Integer> xValueList = new ArrayList<Integer>();
    xValueList.add(xValue);
    TraceAnalyser.Analyser.namesToCheckListArray.add(xValueList);}else{
    if (z == null) {
    int xValue = Integer.parseInt(x.image);
    int yValue = Integer.parseInt(y.image);
    ArrayList<Integer> xyValues = new ArrayList<Integer>();
    xyValues.add(xValue);
    xyValues.add(yValue);
    TraceAnalyser.Analyser.namesToCheckListArray.add(xyValues);}else{
    int xValue = Integer.parseInt(x.image);
    int yValue = Integer.parseInt(y.image);
    int zValue = Integer.parseInt(z.image);
    ArrayList<Integer> xyzValues = new ArrayList<Integer>();
    xyzValues.add(xValue);
    xyzValues.add(yValue);
    xyzValues.add(zValue);
    TraceAnalyser.Analyser.namesToCheckListArray.add(xyzValues);}}
  }

  private boolean jj_2_1(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  private boolean jj_2_2(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  private boolean jj_2_3(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_3(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  private boolean jj_2_4(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_4(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(3, xla); }
  }

  private boolean jj_2_5(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_5(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(4, xla); }
  }

  private boolean jj_3_2()
 {
    if (jj_scan_token(KEYWORD_GEQ)) return true;
    return false;
  }

  private boolean jj_3_4()
 {
    if (jj_scan_token(KEYWORD_LEQ)) return true;
    return false;
  }

  private boolean jj_3_1()
 {
    if (jj_scan_token(RANG)) return true;
    return false;
  }

  private boolean jj_3_3()
 {
    if (jj_scan_token(ASSIGN)) return true;
    return false;
  }

  private boolean jj_3_5()
 {
    if (jj_scan_token(LANG)) return true;
    return false;
  }

  /** Generated Token Manager. */
  public StatMCrulesTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private Token jj_scanpos, jj_lastpos;
  private int jj_la;
  private int jj_gen;
  final private int[] jj_la1 = new int[6];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x0,0x30000,0x30000,0x20c0000,0x0,0x0,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x8,0x0,0x0,0x30,0x8,0x8,};
   }
  final private JJCalls[] jj_2_rtns = new JJCalls[5];
  private boolean jj_rescan = false;
  private int jj_gc = 0;

  /** Constructor with InputStream. */
  public StatMCrules(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public StatMCrules(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new StatMCrulesTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 6; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 6; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public StatMCrules(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new StatMCrulesTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 6; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 6; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public StatMCrules(StatMCrulesTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 6; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(StatMCrulesTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 6; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  @SuppressWarnings("serial")
  static private final class LookaheadSuccess extends java.lang.Error { }
  final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;
  private int[] jj_lasttokens = new int[100];
  private int jj_endpos;

  private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      jj_entries_loop: for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              continue jj_entries_loop;
            }
          }
          jj_expentries.add(jj_expentry);
          break jj_entries_loop;
        }
      }
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[53];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 6; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 53; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

  private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 5; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
            case 2: jj_3_3(); break;
            case 3: jj_3_4(); break;
            case 4: jj_3_5(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}
