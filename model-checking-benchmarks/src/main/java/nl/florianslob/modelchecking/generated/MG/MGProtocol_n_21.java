/* !!! IMPORTANT !!!
 * !!! This code is generated from a protocol definition. !!!
 * !!! Any Changes made to this code could be overridden. !!!
 * !!! If you want to change the protocol, change its definition and regenerate this code. !!!
 **/
package nl.florianslob.modelchecking.generated;

// Import types from the API
import nl.florianslob.modelchecking.base.api.v2.*;

import java.util.Optional;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MGProtocol_n_21 implements IProtocol {
	private volatile int state = 0;
	private final Object monitor = this;
	
	private final BlockingQueue<Object> queueFromresid_15_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_7_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_8_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_11_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_4_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_6_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_5_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_20_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_16_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_3_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_16_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_20_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_4_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_17_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_7_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_14_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_0_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_19_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_3_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_6_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_7_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_11_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_4_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_20_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_19_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_1_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_15_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_15_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_16_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_11_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_17_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_5_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_13_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_19_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_7_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_15_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_15_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_3_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_9_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_19_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_11_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_5_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_16_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_6_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_12_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_7_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_4_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_3_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_18_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_10_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_20_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_0_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_20_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_4_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_10_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_15_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_18_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_8_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_3_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_16_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_4_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_5_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_5_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_12_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_17_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_11_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_2_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_0_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_14_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_16_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_12_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_16_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_2_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_4_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_19_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_12_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_15_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_16_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_8_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_6_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_17_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_2_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_3_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_6_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_13_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_9_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_20_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_12_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_13_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_10_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_12_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_1_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_1_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_8_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_2_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_5_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_20_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_18_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_9_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_3_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_7_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_2_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_13_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_20_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_8_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_19_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_3_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_12_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_13_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_1_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_13_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_7_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_17_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_11_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_17_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_17_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_13_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_9_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_17_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_5_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_2_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_18_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_9_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_1_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_14_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_5_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_10_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_8_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_9_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_7_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_14_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_11_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_14_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_2_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_12_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_6_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_19_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_1_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_1_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_1_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_10_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_9_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_6_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_8_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_10_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_18_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_0_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_13_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_2_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_15_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_14_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_11_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_6_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_10_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_18_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_18_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_8_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_14_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_14_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_9_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_19_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_4_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_10_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_18_Tomaster = new LinkedBlockingQueue<>(); 
	
	@Override
	public IEnvironment getEnvironment(String environmentName) throws Exception{
		switch (environmentName){
			case "interpd_0_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 2 :
						case 3 :
						case 4 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 1:
							if (queueFrommasterTointerpd_0_.peek() != null ) {
								monitor.notifyAll();
								state = 6;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_0_.take());
							}
							monitor.wait();
							break;
						case 5:
							if (queueFrommasterTointerpd_0_.peek() != null ) {
								monitor.notifyAll();
								state = 89;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_0_.take());
							}
							monitor.wait();
							break;
						case 46:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 47;
									queueFrominterpd_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 89:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 90;
									queueFrominterpd_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 444:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 445;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_10_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 25:
							if (queueFrommasterTointerpd_10_.peek() != null ) {
								monitor.notifyAll();
								state = 26;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_10_.take());
							}
							monitor.wait();
							break;
						case 66:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 67;
									queueFrominterpd_10_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 248:
							if (queueFrommasterTointerpd_10_.peek() != null ) {
								monitor.notifyAll();
								state = 249;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_10_.take());
							}
							monitor.wait();
							break;
						case 249:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 250;
									queueFrominterpd_10_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 454:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 455;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_11_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 27:
							if (queueFrommasterTointerpd_11_.peek() != null ) {
								monitor.notifyAll();
								state = 28;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_11_.take());
							}
							monitor.wait();
							break;
						case 68:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 69;
									queueFrominterpd_11_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 264:
							if (queueFrommasterTointerpd_11_.peek() != null ) {
								monitor.notifyAll();
								state = 265;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_11_.take());
							}
							monitor.wait();
							break;
						case 265:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 266;
									queueFrominterpd_11_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 455:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 456;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_12_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 29:
							if (queueFrommasterTointerpd_12_.peek() != null ) {
								monitor.notifyAll();
								state = 30;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_12_.take());
							}
							monitor.wait();
							break;
						case 70:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 71;
									queueFrominterpd_12_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 280:
							if (queueFrommasterTointerpd_12_.peek() != null ) {
								monitor.notifyAll();
								state = 281;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_12_.take());
							}
							monitor.wait();
							break;
						case 281:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 282;
									queueFrominterpd_12_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 456:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 457;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_13_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 31:
							if (queueFrommasterTointerpd_13_.peek() != null ) {
								monitor.notifyAll();
								state = 32;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_13_.take());
							}
							monitor.wait();
							break;
						case 72:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 73;
									queueFrominterpd_13_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 296:
							if (queueFrommasterTointerpd_13_.peek() != null ) {
								monitor.notifyAll();
								state = 297;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_13_.take());
							}
							monitor.wait();
							break;
						case 297:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 298;
									queueFrominterpd_13_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 457:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 458;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_14_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 33:
							if (queueFrommasterTointerpd_14_.peek() != null ) {
								monitor.notifyAll();
								state = 34;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_14_.take());
							}
							monitor.wait();
							break;
						case 74:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 75;
									queueFrominterpd_14_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 312:
							if (queueFrommasterTointerpd_14_.peek() != null ) {
								monitor.notifyAll();
								state = 313;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_14_.take());
							}
							monitor.wait();
							break;
						case 313:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 314;
									queueFrominterpd_14_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 458:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 459;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_15_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 35:
							if (queueFrommasterTointerpd_15_.peek() != null ) {
								monitor.notifyAll();
								state = 36;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_15_.take());
							}
							monitor.wait();
							break;
						case 76:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 77;
									queueFrominterpd_15_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 328:
							if (queueFrommasterTointerpd_15_.peek() != null ) {
								monitor.notifyAll();
								state = 329;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_15_.take());
							}
							monitor.wait();
							break;
						case 329:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 330;
									queueFrominterpd_15_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 459:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 460;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_16_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 37:
							if (queueFrommasterTointerpd_16_.peek() != null ) {
								monitor.notifyAll();
								state = 38;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_16_.take());
							}
							monitor.wait();
							break;
						case 78:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 79;
									queueFrominterpd_16_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 344:
							if (queueFrommasterTointerpd_16_.peek() != null ) {
								monitor.notifyAll();
								state = 345;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_16_.take());
							}
							monitor.wait();
							break;
						case 345:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 346;
									queueFrominterpd_16_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 460:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 461;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_17_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 39:
							if (queueFrommasterTointerpd_17_.peek() != null ) {
								monitor.notifyAll();
								state = 40;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_17_.take());
							}
							monitor.wait();
							break;
						case 80:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 81;
									queueFrominterpd_17_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 360:
							if (queueFrommasterTointerpd_17_.peek() != null ) {
								monitor.notifyAll();
								state = 361;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_17_.take());
							}
							monitor.wait();
							break;
						case 361:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 362;
									queueFrominterpd_17_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 461:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 462;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_18_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 41:
							if (queueFrommasterTointerpd_18_.peek() != null ) {
								monitor.notifyAll();
								state = 42;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_18_.take());
							}
							monitor.wait();
							break;
						case 82:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 83;
									queueFrominterpd_18_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 376:
							if (queueFrommasterTointerpd_18_.peek() != null ) {
								monitor.notifyAll();
								state = 377;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_18_.take());
							}
							monitor.wait();
							break;
						case 377:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 378;
									queueFrominterpd_18_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 462:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 463;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_19_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 43:
							if (queueFrommasterTointerpd_19_.peek() != null ) {
								monitor.notifyAll();
								state = 44;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_19_.take());
							}
							monitor.wait();
							break;
						case 84:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 85;
									queueFrominterpd_19_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 392:
							if (queueFrommasterTointerpd_19_.peek() != null ) {
								monitor.notifyAll();
								state = 393;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_19_.take());
							}
							monitor.wait();
							break;
						case 393:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 394;
									queueFrominterpd_19_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 463:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 464;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_1_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 7:
							if (queueFrommasterTointerpd_1_.peek() != null ) {
								monitor.notifyAll();
								state = 8;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_1_.take());
							}
							monitor.wait();
							break;
						case 48:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 49;
									queueFrominterpd_1_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 104:
							if (queueFrommasterTointerpd_1_.peek() != null ) {
								monitor.notifyAll();
								state = 105;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_1_.take());
							}
							monitor.wait();
							break;
						case 105:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 106;
									queueFrominterpd_1_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 445:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 446;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_20_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 45:
							if (queueFrommasterTointerpd_20_.peek() != null ) {
								monitor.notifyAll();
								state = 46;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_20_.take());
							}
							monitor.wait();
							break;
						case 86:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 87;
									queueFrominterpd_20_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 408:
							if (queueFrommasterTointerpd_20_.peek() != null ) {
								monitor.notifyAll();
								state = 409;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_20_.take());
							}
							monitor.wait();
							break;
						case 409:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 410;
									queueFrominterpd_20_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 464:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 465;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_2_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 9:
							if (queueFrommasterTointerpd_2_.peek() != null ) {
								monitor.notifyAll();
								state = 10;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_2_.take());
							}
							monitor.wait();
							break;
						case 50:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 51;
									queueFrominterpd_2_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 120:
							if (queueFrommasterTointerpd_2_.peek() != null ) {
								monitor.notifyAll();
								state = 121;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_2_.take());
							}
							monitor.wait();
							break;
						case 121:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 122;
									queueFrominterpd_2_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 446:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 447;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_3_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 11:
							if (queueFrommasterTointerpd_3_.peek() != null ) {
								monitor.notifyAll();
								state = 12;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_3_.take());
							}
							monitor.wait();
							break;
						case 52:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 53;
									queueFrominterpd_3_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 136:
							if (queueFrommasterTointerpd_3_.peek() != null ) {
								monitor.notifyAll();
								state = 137;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_3_.take());
							}
							monitor.wait();
							break;
						case 137:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 138;
									queueFrominterpd_3_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 447:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 448;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_4_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 13:
							if (queueFrommasterTointerpd_4_.peek() != null ) {
								monitor.notifyAll();
								state = 14;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_4_.take());
							}
							monitor.wait();
							break;
						case 54:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 55;
									queueFrominterpd_4_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 152:
							if (queueFrommasterTointerpd_4_.peek() != null ) {
								monitor.notifyAll();
								state = 153;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_4_.take());
							}
							monitor.wait();
							break;
						case 153:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 154;
									queueFrominterpd_4_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 448:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 449;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_5_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 15:
							if (queueFrommasterTointerpd_5_.peek() != null ) {
								monitor.notifyAll();
								state = 16;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_5_.take());
							}
							monitor.wait();
							break;
						case 56:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 57;
									queueFrominterpd_5_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 168:
							if (queueFrommasterTointerpd_5_.peek() != null ) {
								monitor.notifyAll();
								state = 169;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_5_.take());
							}
							monitor.wait();
							break;
						case 169:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 170;
									queueFrominterpd_5_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 449:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 450;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_6_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 17:
							if (queueFrommasterTointerpd_6_.peek() != null ) {
								monitor.notifyAll();
								state = 18;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_6_.take());
							}
							monitor.wait();
							break;
						case 58:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 59;
									queueFrominterpd_6_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 184:
							if (queueFrommasterTointerpd_6_.peek() != null ) {
								monitor.notifyAll();
								state = 185;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_6_.take());
							}
							monitor.wait();
							break;
						case 185:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 186;
									queueFrominterpd_6_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 450:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 451;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_7_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 19:
							if (queueFrommasterTointerpd_7_.peek() != null ) {
								monitor.notifyAll();
								state = 20;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_7_.take());
							}
							monitor.wait();
							break;
						case 60:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 61;
									queueFrominterpd_7_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 200:
							if (queueFrommasterTointerpd_7_.peek() != null ) {
								monitor.notifyAll();
								state = 201;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_7_.take());
							}
							monitor.wait();
							break;
						case 201:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 202;
									queueFrominterpd_7_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 451:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 452;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_8_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 21:
							if (queueFrommasterTointerpd_8_.peek() != null ) {
								monitor.notifyAll();
								state = 22;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_8_.take());
							}
							monitor.wait();
							break;
						case 62:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 63;
									queueFrominterpd_8_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 216:
							if (queueFrommasterTointerpd_8_.peek() != null ) {
								monitor.notifyAll();
								state = 217;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_8_.take());
							}
							monitor.wait();
							break;
						case 217:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 218;
									queueFrominterpd_8_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 452:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 453;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_9_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 23:
							if (queueFrommasterTointerpd_9_.peek() != null ) {
								monitor.notifyAll();
								state = 24;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_9_.take());
							}
							monitor.wait();
							break;
						case 64:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 65;
									queueFrominterpd_9_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 232:
							if (queueFrommasterTointerpd_9_.peek() != null ) {
								monitor.notifyAll();
								state = 233;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_9_.take());
							}
							monitor.wait();
							break;
						case 233:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 234;
									queueFrominterpd_9_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 453:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 454;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "master": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 7 :
						case 9 :
						case 11 :
						case 13 :
						case 15 :
						case 17 :
						case 19 :
						case 21 :
						case 23 :
						case 25 :
						case 27 :
						case 29 :
						case 31 :
						case 33 :
						case 35 :
						case 37 :
						case 39 :
						case 41 :
						case 43 :
						case 45 :
						case 46 :
						case 48 :
						case 50 :
						case 52 :
						case 54 :
						case 56 :
						case 58 :
						case 60 :
						case 62 :
						case 64 :
						case 66 :
						case 68 :
						case 70 :
						case 72 :
						case 74 :
						case 76 :
						case 78 :
						case 80 :
						case 82 :
						case 84 :
						case 86 :
						case 89 :
						case 92 :
						case 93 :
						case 96 :
						case 97 :
						case 100 :
						case 101 :
						case 104 :
						case 105 :
						case 108 :
						case 109 :
						case 112 :
						case 113 :
						case 116 :
						case 117 :
						case 120 :
						case 121 :
						case 124 :
						case 125 :
						case 128 :
						case 129 :
						case 132 :
						case 133 :
						case 136 :
						case 137 :
						case 140 :
						case 141 :
						case 144 :
						case 145 :
						case 148 :
						case 149 :
						case 152 :
						case 153 :
						case 156 :
						case 157 :
						case 160 :
						case 161 :
						case 164 :
						case 165 :
						case 168 :
						case 169 :
						case 172 :
						case 173 :
						case 176 :
						case 177 :
						case 180 :
						case 181 :
						case 184 :
						case 185 :
						case 188 :
						case 189 :
						case 192 :
						case 193 :
						case 196 :
						case 197 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_0_";
								}
								if (receiver.equals("psinv_0_")) {
									monitor.notifyAll();
									state = 2;
									queueFrommasterTopsinv_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_0_";
								}
								if (receiver.equals("interpd_0_")) {
									monitor.notifyAll();
									state = 5;
									queueFrommasterTointerpd_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_0_";
								}
								if (receiver.equals("interpd_0_")) {
									monitor.notifyAll();
									state = 1;
									queueFrommasterTointerpd_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_0_";
								}
								if (receiver.equals("rprj_0_")) {
									monitor.notifyAll();
									state = 3;
									queueFrommasterTorprj_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_0_";
								}
								if (receiver.equals("resid_0_")) {
									monitor.notifyAll();
									state = 4;
									queueFrommasterToresid_0_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 6:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_1_";
								}
								if (receiver.equals("interpd_1_")) {
									monitor.notifyAll();
									state = 7;
									queueFrommasterTointerpd_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 8:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_2_";
								}
								if (receiver.equals("interpd_2_")) {
									monitor.notifyAll();
									state = 9;
									queueFrommasterTointerpd_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 10:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_3_";
								}
								if (receiver.equals("interpd_3_")) {
									monitor.notifyAll();
									state = 11;
									queueFrommasterTointerpd_3_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 12:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_4_";
								}
								if (receiver.equals("interpd_4_")) {
									monitor.notifyAll();
									state = 13;
									queueFrommasterTointerpd_4_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 14:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_5_";
								}
								if (receiver.equals("interpd_5_")) {
									monitor.notifyAll();
									state = 15;
									queueFrommasterTointerpd_5_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 16:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_6_";
								}
								if (receiver.equals("interpd_6_")) {
									monitor.notifyAll();
									state = 17;
									queueFrommasterTointerpd_6_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 18:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_7_";
								}
								if (receiver.equals("interpd_7_")) {
									monitor.notifyAll();
									state = 19;
									queueFrommasterTointerpd_7_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 20:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_8_";
								}
								if (receiver.equals("interpd_8_")) {
									monitor.notifyAll();
									state = 21;
									queueFrommasterTointerpd_8_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 22:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_9_";
								}
								if (receiver.equals("interpd_9_")) {
									monitor.notifyAll();
									state = 23;
									queueFrommasterTointerpd_9_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 24:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_10_";
								}
								if (receiver.equals("interpd_10_")) {
									monitor.notifyAll();
									state = 25;
									queueFrommasterTointerpd_10_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 26:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_11_";
								}
								if (receiver.equals("interpd_11_")) {
									monitor.notifyAll();
									state = 27;
									queueFrommasterTointerpd_11_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 28:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_12_";
								}
								if (receiver.equals("interpd_12_")) {
									monitor.notifyAll();
									state = 29;
									queueFrommasterTointerpd_12_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 30:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_13_";
								}
								if (receiver.equals("interpd_13_")) {
									monitor.notifyAll();
									state = 31;
									queueFrommasterTointerpd_13_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 32:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_14_";
								}
								if (receiver.equals("interpd_14_")) {
									monitor.notifyAll();
									state = 33;
									queueFrommasterTointerpd_14_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 34:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_15_";
								}
								if (receiver.equals("interpd_15_")) {
									monitor.notifyAll();
									state = 35;
									queueFrommasterTointerpd_15_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 36:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_16_";
								}
								if (receiver.equals("interpd_16_")) {
									monitor.notifyAll();
									state = 37;
									queueFrommasterTointerpd_16_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 38:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_17_";
								}
								if (receiver.equals("interpd_17_")) {
									monitor.notifyAll();
									state = 39;
									queueFrommasterTointerpd_17_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 40:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_18_";
								}
								if (receiver.equals("interpd_18_")) {
									monitor.notifyAll();
									state = 41;
									queueFrommasterTointerpd_18_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 42:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_19_";
								}
								if (receiver.equals("interpd_19_")) {
									monitor.notifyAll();
									state = 43;
									queueFrommasterTointerpd_19_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 44:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_20_";
								}
								if (receiver.equals("interpd_20_")) {
									monitor.notifyAll();
									state = 45;
									queueFrommasterTointerpd_20_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 47:
							if (queueFrominterpd_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 48;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 49:
							if (queueFrominterpd_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 50;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 51:
							if (queueFrominterpd_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 52;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 53:
							if (queueFrominterpd_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 54;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 55:
							if (queueFrominterpd_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 56;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 57:
							if (queueFrominterpd_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 58;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 59:
							if (queueFrominterpd_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 60;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 61:
							if (queueFrominterpd_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 62;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 63:
							if (queueFrominterpd_8_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 64;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 65:
							if (queueFrominterpd_9_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 66;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_9_Tomaster.take());
							}
							monitor.wait();
							break;
						case 67:
							if (queueFrominterpd_10_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 68;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 69:
							if (queueFrominterpd_11_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 70;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_11_Tomaster.take());
							}
							monitor.wait();
							break;
						case 71:
							if (queueFrominterpd_12_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 72;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_12_Tomaster.take());
							}
							monitor.wait();
							break;
						case 73:
							if (queueFrominterpd_13_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 74;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_13_Tomaster.take());
							}
							monitor.wait();
							break;
						case 75:
							if (queueFrominterpd_14_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 76;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_14_Tomaster.take());
							}
							monitor.wait();
							break;
						case 77:
							if (queueFrominterpd_15_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 78;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_15_Tomaster.take());
							}
							monitor.wait();
							break;
						case 79:
							if (queueFrominterpd_16_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 80;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_16_Tomaster.take());
							}
							monitor.wait();
							break;
						case 81:
							if (queueFrominterpd_17_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 82;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_17_Tomaster.take());
							}
							monitor.wait();
							break;
						case 83:
							if (queueFrominterpd_18_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 84;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_18_Tomaster.take());
							}
							monitor.wait();
							break;
						case 85:
							if (queueFrominterpd_19_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 86;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_19_Tomaster.take());
							}
							monitor.wait();
							break;
						case 87:
							if (queueFrominterpd_20_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 88;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_20_Tomaster.take());
							}
							monitor.wait();
							break;
						case 88:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_0_";
								}
								if (receiver.equals("interpd_0_")) {
									monitor.notifyAll();
									state = 1;
									queueFrommasterTointerpd_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_0_";
								}
								if (receiver.equals("rprj_0_")) {
									monitor.notifyAll();
									state = 3;
									queueFrommasterTorprj_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_0_";
								}
								if (receiver.equals("psinv_0_")) {
									monitor.notifyAll();
									state = 2;
									queueFrommasterTopsinv_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_0_";
								}
								if (receiver.equals("interpd_0_")) {
									monitor.notifyAll();
									state = 5;
									queueFrommasterTointerpd_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_0_";
								}
								if (receiver.equals("resid_0_")) {
									monitor.notifyAll();
									state = 4;
									queueFrommasterToresid_0_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 90:
							if (queueFrominterpd_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 91;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 91:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_0_";
								}
								if (receiver.equals("psinv_0_")) {
									monitor.notifyAll();
									state = 92;
									queueFrommasterTopsinv_0_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 94:
							if (queueFrompsinv_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 95;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 95:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_0_";
								}
								if (receiver.equals("rprj_0_")) {
									monitor.notifyAll();
									state = 96;
									queueFrommasterTorprj_0_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 98:
							if (queueFromrprj_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 99;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 99:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_0_";
								}
								if (receiver.equals("resid_0_")) {
									monitor.notifyAll();
									state = 100;
									queueFrommasterToresid_0_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 102:
							if (queueFromresid_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 103;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 103:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_1_";
								}
								if (receiver.equals("interpd_1_")) {
									monitor.notifyAll();
									state = 104;
									queueFrommasterTointerpd_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 106:
							if (queueFrominterpd_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 107;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 107:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_1_";
								}
								if (receiver.equals("psinv_1_")) {
									monitor.notifyAll();
									state = 108;
									queueFrommasterTopsinv_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 110:
							if (queueFrompsinv_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 111;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 111:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_1_";
								}
								if (receiver.equals("rprj_1_")) {
									monitor.notifyAll();
									state = 112;
									queueFrommasterTorprj_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 114:
							if (queueFromrprj_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 115;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 115:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_1_";
								}
								if (receiver.equals("resid_1_")) {
									monitor.notifyAll();
									state = 116;
									queueFrommasterToresid_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 118:
							if (queueFromresid_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 119;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 119:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_2_";
								}
								if (receiver.equals("interpd_2_")) {
									monitor.notifyAll();
									state = 120;
									queueFrommasterTointerpd_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 122:
							if (queueFrominterpd_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 123;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 123:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_2_";
								}
								if (receiver.equals("psinv_2_")) {
									monitor.notifyAll();
									state = 124;
									queueFrommasterTopsinv_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 126:
							if (queueFrompsinv_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 127;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 127:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_2_";
								}
								if (receiver.equals("rprj_2_")) {
									monitor.notifyAll();
									state = 128;
									queueFrommasterTorprj_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 130:
							if (queueFromrprj_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 131;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 131:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_2_";
								}
								if (receiver.equals("resid_2_")) {
									monitor.notifyAll();
									state = 132;
									queueFrommasterToresid_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 134:
							if (queueFromresid_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 135;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 135:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_3_";
								}
								if (receiver.equals("interpd_3_")) {
									monitor.notifyAll();
									state = 136;
									queueFrommasterTointerpd_3_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 138:
							if (queueFrominterpd_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 139;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 139:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_3_";
								}
								if (receiver.equals("psinv_3_")) {
									monitor.notifyAll();
									state = 140;
									queueFrommasterTopsinv_3_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 142:
							if (queueFrompsinv_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 143;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 143:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_3_";
								}
								if (receiver.equals("rprj_3_")) {
									monitor.notifyAll();
									state = 144;
									queueFrommasterTorprj_3_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 146:
							if (queueFromrprj_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 147;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 147:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_3_";
								}
								if (receiver.equals("resid_3_")) {
									monitor.notifyAll();
									state = 148;
									queueFrommasterToresid_3_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 150:
							if (queueFromresid_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 151;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 151:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_4_";
								}
								if (receiver.equals("interpd_4_")) {
									monitor.notifyAll();
									state = 152;
									queueFrommasterTointerpd_4_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 154:
							if (queueFrominterpd_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 155;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 155:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_4_";
								}
								if (receiver.equals("psinv_4_")) {
									monitor.notifyAll();
									state = 156;
									queueFrommasterTopsinv_4_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 158:
							if (queueFrompsinv_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 159;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 159:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_4_";
								}
								if (receiver.equals("rprj_4_")) {
									monitor.notifyAll();
									state = 160;
									queueFrommasterTorprj_4_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 162:
							if (queueFromrprj_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 163;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 163:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_4_";
								}
								if (receiver.equals("resid_4_")) {
									monitor.notifyAll();
									state = 164;
									queueFrommasterToresid_4_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 166:
							if (queueFromresid_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 167;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 167:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_5_";
								}
								if (receiver.equals("interpd_5_")) {
									monitor.notifyAll();
									state = 168;
									queueFrommasterTointerpd_5_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 170:
							if (queueFrominterpd_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 171;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 171:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_5_";
								}
								if (receiver.equals("psinv_5_")) {
									monitor.notifyAll();
									state = 172;
									queueFrommasterTopsinv_5_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 174:
							if (queueFrompsinv_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 175;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 175:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_5_";
								}
								if (receiver.equals("rprj_5_")) {
									monitor.notifyAll();
									state = 176;
									queueFrommasterTorprj_5_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 178:
							if (queueFromrprj_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 179;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 179:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_5_";
								}
								if (receiver.equals("resid_5_")) {
									monitor.notifyAll();
									state = 180;
									queueFrommasterToresid_5_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 182:
							if (queueFromresid_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 183;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 183:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_6_";
								}
								if (receiver.equals("interpd_6_")) {
									monitor.notifyAll();
									state = 184;
									queueFrommasterTointerpd_6_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 186:
							if (queueFrominterpd_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 187;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 187:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_6_";
								}
								if (receiver.equals("psinv_6_")) {
									monitor.notifyAll();
									state = 188;
									queueFrommasterTopsinv_6_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 190:
							if (queueFrompsinv_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 191;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 191:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_6_";
								}
								if (receiver.equals("rprj_6_")) {
									monitor.notifyAll();
									state = 192;
									queueFrommasterTorprj_6_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 194:
							if (queueFromrprj_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 195;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 195:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_6_";
								}
								if (receiver.equals("resid_6_")) {
									monitor.notifyAll();
									state = 196;
									queueFrommasterToresid_6_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 198:
							if (queueFromresid_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 199;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 199:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_7_";
								}
								if (receiver.equals("interpd_7_")) {
									monitor.notifyAll();
									state = 200;
									queueFrommasterTointerpd_7_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 204 :
						case 205 :
						case 208 :
						case 209 :
						case 212 :
						case 213 :
						case 216 :
						case 217 :
						case 220 :
						case 221 :
						case 224 :
						case 225 :
						case 228 :
						case 229 :
						case 232 :
						case 233 :
						case 236 :
						case 237 :
						case 240 :
						case 241 :
						case 244 :
						case 245 :
						case 248 :
						case 249 :
						case 252 :
						case 253 :
						case 256 :
						case 257 :
						case 260 :
						case 261 :
						case 264 :
						case 265 :
						case 268 :
						case 269 :
						case 272 :
						case 273 :
						case 276 :
						case 277 :
						case 280 :
						case 281 :
						case 284 :
						case 285 :
						case 288 :
						case 289 :
						case 292 :
						case 293 :
						case 296 :
						case 297 :
						case 300 :
						case 301 :
						case 304 :
						case 305 :
						case 308 :
						case 309 :
						case 312 :
						case 313 :
						case 316 :
						case 317 :
						case 320 :
						case 321 :
						case 324 :
						case 325 :
						case 328 :
						case 329 :
						case 332 :
						case 333 :
						case 336 :
						case 337 :
						case 340 :
						case 341 :
						case 344 :
						case 345 :
						case 348 :
						case 349 :
						case 352 :
						case 353 :
						case 356 :
						case 357 :
						case 360 :
						case 361 :
						case 364 :
						case 365 :
						case 368 :
						case 369 :
						case 372 :
						case 373 :
						case 376 :
						case 377 :
						case 380 :
						case 381 :
						case 384 :
						case 385 :
						case 388 :
						case 389 :
						case 392 :
						case 393 :
						case 396 :
						case 397 :
							monitor.wait();
							break;
						case 202:
							if (queueFrominterpd_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 203;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 203:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_7_";
								}
								if (receiver.equals("psinv_7_")) {
									monitor.notifyAll();
									state = 204;
									queueFrommasterTopsinv_7_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 206:
							if (queueFrompsinv_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 207;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 207:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_7_";
								}
								if (receiver.equals("rprj_7_")) {
									monitor.notifyAll();
									state = 208;
									queueFrommasterTorprj_7_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 210:
							if (queueFromrprj_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 211;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 211:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_7_";
								}
								if (receiver.equals("resid_7_")) {
									monitor.notifyAll();
									state = 212;
									queueFrommasterToresid_7_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 214:
							if (queueFromresid_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 215;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 215:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_8_";
								}
								if (receiver.equals("interpd_8_")) {
									monitor.notifyAll();
									state = 216;
									queueFrommasterTointerpd_8_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 218:
							if (queueFrominterpd_8_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 219;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 219:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_8_";
								}
								if (receiver.equals("psinv_8_")) {
									monitor.notifyAll();
									state = 220;
									queueFrommasterTopsinv_8_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 222:
							if (queueFrompsinv_8_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 223;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 223:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_8_";
								}
								if (receiver.equals("rprj_8_")) {
									monitor.notifyAll();
									state = 224;
									queueFrommasterTorprj_8_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 226:
							if (queueFromrprj_8_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 227;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 227:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_8_";
								}
								if (receiver.equals("resid_8_")) {
									monitor.notifyAll();
									state = 228;
									queueFrommasterToresid_8_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 230:
							if (queueFromresid_8_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 231;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 231:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_9_";
								}
								if (receiver.equals("interpd_9_")) {
									monitor.notifyAll();
									state = 232;
									queueFrommasterTointerpd_9_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 234:
							if (queueFrominterpd_9_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 235;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_9_Tomaster.take());
							}
							monitor.wait();
							break;
						case 235:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_9_";
								}
								if (receiver.equals("psinv_9_")) {
									monitor.notifyAll();
									state = 236;
									queueFrommasterTopsinv_9_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 238:
							if (queueFrompsinv_9_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 239;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_9_Tomaster.take());
							}
							monitor.wait();
							break;
						case 239:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_9_";
								}
								if (receiver.equals("rprj_9_")) {
									monitor.notifyAll();
									state = 240;
									queueFrommasterTorprj_9_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 242:
							if (queueFromrprj_9_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 243;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_9_Tomaster.take());
							}
							monitor.wait();
							break;
						case 243:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_9_";
								}
								if (receiver.equals("resid_9_")) {
									monitor.notifyAll();
									state = 244;
									queueFrommasterToresid_9_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 246:
							if (queueFromresid_9_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 247;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_9_Tomaster.take());
							}
							monitor.wait();
							break;
						case 247:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_10_";
								}
								if (receiver.equals("interpd_10_")) {
									monitor.notifyAll();
									state = 248;
									queueFrommasterTointerpd_10_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 250:
							if (queueFrominterpd_10_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 251;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 251:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_10_";
								}
								if (receiver.equals("psinv_10_")) {
									monitor.notifyAll();
									state = 252;
									queueFrommasterTopsinv_10_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 254:
							if (queueFrompsinv_10_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 255;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 255:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_10_";
								}
								if (receiver.equals("rprj_10_")) {
									monitor.notifyAll();
									state = 256;
									queueFrommasterTorprj_10_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 258:
							if (queueFromrprj_10_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 259;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 259:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_10_";
								}
								if (receiver.equals("resid_10_")) {
									monitor.notifyAll();
									state = 260;
									queueFrommasterToresid_10_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 262:
							if (queueFromresid_10_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 263;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 263:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_11_";
								}
								if (receiver.equals("interpd_11_")) {
									monitor.notifyAll();
									state = 264;
									queueFrommasterTointerpd_11_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 266:
							if (queueFrominterpd_11_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 267;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_11_Tomaster.take());
							}
							monitor.wait();
							break;
						case 267:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_11_";
								}
								if (receiver.equals("psinv_11_")) {
									monitor.notifyAll();
									state = 268;
									queueFrommasterTopsinv_11_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 270:
							if (queueFrompsinv_11_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 271;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_11_Tomaster.take());
							}
							monitor.wait();
							break;
						case 271:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_11_";
								}
								if (receiver.equals("rprj_11_")) {
									monitor.notifyAll();
									state = 272;
									queueFrommasterTorprj_11_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 274:
							if (queueFromrprj_11_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 275;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_11_Tomaster.take());
							}
							monitor.wait();
							break;
						case 275:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_11_";
								}
								if (receiver.equals("resid_11_")) {
									monitor.notifyAll();
									state = 276;
									queueFrommasterToresid_11_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 278:
							if (queueFromresid_11_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 279;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_11_Tomaster.take());
							}
							monitor.wait();
							break;
						case 279:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_12_";
								}
								if (receiver.equals("interpd_12_")) {
									monitor.notifyAll();
									state = 280;
									queueFrommasterTointerpd_12_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 282:
							if (queueFrominterpd_12_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 283;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_12_Tomaster.take());
							}
							monitor.wait();
							break;
						case 283:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_12_";
								}
								if (receiver.equals("psinv_12_")) {
									monitor.notifyAll();
									state = 284;
									queueFrommasterTopsinv_12_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 286:
							if (queueFrompsinv_12_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 287;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_12_Tomaster.take());
							}
							monitor.wait();
							break;
						case 287:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_12_";
								}
								if (receiver.equals("rprj_12_")) {
									monitor.notifyAll();
									state = 288;
									queueFrommasterTorprj_12_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 290:
							if (queueFromrprj_12_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 291;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_12_Tomaster.take());
							}
							monitor.wait();
							break;
						case 291:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_12_";
								}
								if (receiver.equals("resid_12_")) {
									monitor.notifyAll();
									state = 292;
									queueFrommasterToresid_12_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 294:
							if (queueFromresid_12_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 295;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_12_Tomaster.take());
							}
							monitor.wait();
							break;
						case 295:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_13_";
								}
								if (receiver.equals("interpd_13_")) {
									monitor.notifyAll();
									state = 296;
									queueFrommasterTointerpd_13_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 298:
							if (queueFrominterpd_13_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 299;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_13_Tomaster.take());
							}
							monitor.wait();
							break;
						case 299:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_13_";
								}
								if (receiver.equals("psinv_13_")) {
									monitor.notifyAll();
									state = 300;
									queueFrommasterTopsinv_13_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 302:
							if (queueFrompsinv_13_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 303;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_13_Tomaster.take());
							}
							monitor.wait();
							break;
						case 303:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_13_";
								}
								if (receiver.equals("rprj_13_")) {
									monitor.notifyAll();
									state = 304;
									queueFrommasterTorprj_13_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 306:
							if (queueFromrprj_13_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 307;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_13_Tomaster.take());
							}
							monitor.wait();
							break;
						case 307:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_13_";
								}
								if (receiver.equals("resid_13_")) {
									monitor.notifyAll();
									state = 308;
									queueFrommasterToresid_13_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 310:
							if (queueFromresid_13_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 311;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_13_Tomaster.take());
							}
							monitor.wait();
							break;
						case 311:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_14_";
								}
								if (receiver.equals("interpd_14_")) {
									monitor.notifyAll();
									state = 312;
									queueFrommasterTointerpd_14_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 314:
							if (queueFrominterpd_14_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 315;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_14_Tomaster.take());
							}
							monitor.wait();
							break;
						case 315:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_14_";
								}
								if (receiver.equals("psinv_14_")) {
									monitor.notifyAll();
									state = 316;
									queueFrommasterTopsinv_14_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 318:
							if (queueFrompsinv_14_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 319;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_14_Tomaster.take());
							}
							monitor.wait();
							break;
						case 319:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_14_";
								}
								if (receiver.equals("rprj_14_")) {
									monitor.notifyAll();
									state = 320;
									queueFrommasterTorprj_14_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 322:
							if (queueFromrprj_14_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 323;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_14_Tomaster.take());
							}
							monitor.wait();
							break;
						case 323:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_14_";
								}
								if (receiver.equals("resid_14_")) {
									monitor.notifyAll();
									state = 324;
									queueFrommasterToresid_14_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 326:
							if (queueFromresid_14_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 327;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_14_Tomaster.take());
							}
							monitor.wait();
							break;
						case 327:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_15_";
								}
								if (receiver.equals("interpd_15_")) {
									monitor.notifyAll();
									state = 328;
									queueFrommasterTointerpd_15_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 330:
							if (queueFrominterpd_15_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 331;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_15_Tomaster.take());
							}
							monitor.wait();
							break;
						case 331:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_15_";
								}
								if (receiver.equals("psinv_15_")) {
									monitor.notifyAll();
									state = 332;
									queueFrommasterTopsinv_15_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 334:
							if (queueFrompsinv_15_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 335;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_15_Tomaster.take());
							}
							monitor.wait();
							break;
						case 335:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_15_";
								}
								if (receiver.equals("rprj_15_")) {
									monitor.notifyAll();
									state = 336;
									queueFrommasterTorprj_15_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 338:
							if (queueFromrprj_15_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 339;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_15_Tomaster.take());
							}
							monitor.wait();
							break;
						case 339:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_15_";
								}
								if (receiver.equals("resid_15_")) {
									monitor.notifyAll();
									state = 340;
									queueFrommasterToresid_15_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 342:
							if (queueFromresid_15_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 343;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_15_Tomaster.take());
							}
							monitor.wait();
							break;
						case 343:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_16_";
								}
								if (receiver.equals("interpd_16_")) {
									monitor.notifyAll();
									state = 344;
									queueFrommasterTointerpd_16_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 346:
							if (queueFrominterpd_16_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 347;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_16_Tomaster.take());
							}
							monitor.wait();
							break;
						case 347:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_16_";
								}
								if (receiver.equals("psinv_16_")) {
									monitor.notifyAll();
									state = 348;
									queueFrommasterTopsinv_16_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 350:
							if (queueFrompsinv_16_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 351;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_16_Tomaster.take());
							}
							monitor.wait();
							break;
						case 351:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_16_";
								}
								if (receiver.equals("rprj_16_")) {
									monitor.notifyAll();
									state = 352;
									queueFrommasterTorprj_16_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 354:
							if (queueFromrprj_16_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 355;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_16_Tomaster.take());
							}
							monitor.wait();
							break;
						case 355:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_16_";
								}
								if (receiver.equals("resid_16_")) {
									monitor.notifyAll();
									state = 356;
									queueFrommasterToresid_16_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 358:
							if (queueFromresid_16_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 359;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_16_Tomaster.take());
							}
							monitor.wait();
							break;
						case 359:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_17_";
								}
								if (receiver.equals("interpd_17_")) {
									monitor.notifyAll();
									state = 360;
									queueFrommasterTointerpd_17_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 362:
							if (queueFrominterpd_17_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 363;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_17_Tomaster.take());
							}
							monitor.wait();
							break;
						case 363:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_17_";
								}
								if (receiver.equals("psinv_17_")) {
									monitor.notifyAll();
									state = 364;
									queueFrommasterTopsinv_17_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 366:
							if (queueFrompsinv_17_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 367;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_17_Tomaster.take());
							}
							monitor.wait();
							break;
						case 367:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_17_";
								}
								if (receiver.equals("rprj_17_")) {
									monitor.notifyAll();
									state = 368;
									queueFrommasterTorprj_17_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 370:
							if (queueFromrprj_17_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 371;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_17_Tomaster.take());
							}
							monitor.wait();
							break;
						case 371:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_17_";
								}
								if (receiver.equals("resid_17_")) {
									monitor.notifyAll();
									state = 372;
									queueFrommasterToresid_17_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 374:
							if (queueFromresid_17_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 375;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_17_Tomaster.take());
							}
							monitor.wait();
							break;
						case 375:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_18_";
								}
								if (receiver.equals("interpd_18_")) {
									monitor.notifyAll();
									state = 376;
									queueFrommasterTointerpd_18_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 378:
							if (queueFrominterpd_18_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 379;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_18_Tomaster.take());
							}
							monitor.wait();
							break;
						case 379:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_18_";
								}
								if (receiver.equals("psinv_18_")) {
									monitor.notifyAll();
									state = 380;
									queueFrommasterTopsinv_18_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 382:
							if (queueFrompsinv_18_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 383;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_18_Tomaster.take());
							}
							monitor.wait();
							break;
						case 383:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_18_";
								}
								if (receiver.equals("rprj_18_")) {
									monitor.notifyAll();
									state = 384;
									queueFrommasterTorprj_18_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 386:
							if (queueFromrprj_18_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 387;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_18_Tomaster.take());
							}
							monitor.wait();
							break;
						case 387:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_18_";
								}
								if (receiver.equals("resid_18_")) {
									monitor.notifyAll();
									state = 388;
									queueFrommasterToresid_18_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 390:
							if (queueFromresid_18_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 391;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_18_Tomaster.take());
							}
							monitor.wait();
							break;
						case 391:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_19_";
								}
								if (receiver.equals("interpd_19_")) {
									monitor.notifyAll();
									state = 392;
									queueFrommasterTointerpd_19_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 394:
							if (queueFrominterpd_19_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 395;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_19_Tomaster.take());
							}
							monitor.wait();
							break;
						case 395:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_19_";
								}
								if (receiver.equals("psinv_19_")) {
									monitor.notifyAll();
									state = 396;
									queueFrommasterTopsinv_19_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 398:
							if (queueFrompsinv_19_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 399;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_19_Tomaster.take());
							}
							monitor.wait();
							break;
						case 399:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_19_";
								}
								if (receiver.equals("rprj_19_")) {
									monitor.notifyAll();
									state = 400;
									queueFrommasterTorprj_19_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 404 :
						case 405 :
						case 408 :
						case 409 :
						case 412 :
						case 413 :
						case 416 :
						case 417 :
						case 420 :
						case 421 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 593 :
						case 595 :
						case 597 :
						case 599 :
							monitor.wait();
							break;
						case 402:
							if (queueFromrprj_19_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 403;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_19_Tomaster.take());
							}
							monitor.wait();
							break;
						case 403:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_19_";
								}
								if (receiver.equals("resid_19_")) {
									monitor.notifyAll();
									state = 404;
									queueFrommasterToresid_19_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 406:
							if (queueFromresid_19_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 407;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_19_Tomaster.take());
							}
							monitor.wait();
							break;
						case 407:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_20_";
								}
								if (receiver.equals("interpd_20_")) {
									monitor.notifyAll();
									state = 408;
									queueFrommasterTointerpd_20_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 410:
							if (queueFrominterpd_20_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 411;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_20_Tomaster.take());
							}
							monitor.wait();
							break;
						case 411:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_20_";
								}
								if (receiver.equals("psinv_20_")) {
									monitor.notifyAll();
									state = 412;
									queueFrommasterTopsinv_20_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 414:
							if (queueFrompsinv_20_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 415;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_20_Tomaster.take());
							}
							monitor.wait();
							break;
						case 415:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_20_";
								}
								if (receiver.equals("rprj_20_")) {
									monitor.notifyAll();
									state = 416;
									queueFrommasterTorprj_20_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 418:
							if (queueFromrprj_20_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 419;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_20_Tomaster.take());
							}
							monitor.wait();
							break;
						case 419:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_20_";
								}
								if (receiver.equals("resid_20_")) {
									monitor.notifyAll();
									state = 420;
									queueFrommasterToresid_20_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 422:
							if (queueFromresid_20_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 423;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_20_Tomaster.take());
							}
							monitor.wait();
							break;
						case 423:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 424;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 424:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 425;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 425:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 426;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 426:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 427;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 427:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 428;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 428:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 429;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 429:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 430;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 430:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 431;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 431:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 432;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 432:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 433;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 433:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 434;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 434:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 435;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 435:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 436;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 436:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 437;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 437:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 438;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 438:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 439;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 439:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 440;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 440:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 441;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 441:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 442;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 442:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 443;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 443:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 444;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 465:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 466;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 466:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 467;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 467:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 468;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 468:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 469;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 469:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 470;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 470:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 471;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 471:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 472;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 472:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 473;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 473:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 474;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 474:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 475;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 475:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 476;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 476:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 477;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 477:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 478;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 478:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 479;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 479:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 480;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 480:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 481;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 481:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 482;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 482:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 483;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 483:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 484;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 484:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 485;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 485:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 486;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 507:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 508;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 508:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 509;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 509:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 510;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 510:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 511;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 511:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 512;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 512:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 513;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 513:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 514;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 514:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 515;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 515:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 516;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 516:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 517;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 517:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 518;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 518:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 519;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 519:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 520;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 520:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 521;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 521:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 522;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 522:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 523;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 523:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 524;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 524:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 525;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 525:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 526;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 526:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 527;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 527:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 528;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 549:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 550;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 550:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 551;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 551:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 552;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 552:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 553;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 553:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 554;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 554:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 555;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 555:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 556;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 556:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 557;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 557:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 558;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 558:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 559;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 559:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 560;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 560:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 561;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 561:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 562;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 562:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 563;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 563:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 564;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 564:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 565;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 565:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 566;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 566:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 567;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 567:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 568;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 568:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 569;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 569:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 570;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 592:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_1_";
								}
								if (receiver.equals("psinv_1_")) {
									monitor.notifyAll();
									state = 593;
									queueFrommasterTopsinv_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 594:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_2_";
								}
								if (receiver.equals("psinv_2_")) {
									monitor.notifyAll();
									state = 595;
									queueFrommasterTopsinv_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 596:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_3_";
								}
								if (receiver.equals("psinv_3_")) {
									monitor.notifyAll();
									state = 597;
									queueFrommasterTopsinv_3_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 598:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_4_";
								}
								if (receiver.equals("psinv_4_")) {
									monitor.notifyAll();
									state = 599;
									queueFrommasterTopsinv_4_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 601 :
						case 603 :
						case 605 :
						case 607 :
						case 609 :
						case 611 :
						case 613 :
						case 615 :
						case 617 :
						case 619 :
						case 621 :
						case 623 :
						case 625 :
						case 627 :
						case 629 :
						case 631 :
						case 632 :
						case 634 :
						case 636 :
						case 638 :
						case 640 :
						case 642 :
						case 644 :
						case 646 :
						case 648 :
						case 650 :
						case 652 :
						case 654 :
						case 656 :
						case 658 :
						case 660 :
						case 662 :
						case 664 :
						case 666 :
						case 668 :
						case 670 :
						case 672 :
						case 675 :
						case 677 :
						case 679 :
						case 681 :
						case 683 :
						case 685 :
						case 687 :
						case 689 :
						case 691 :
						case 693 :
						case 695 :
						case 697 :
						case 699 :
						case 701 :
						case 703 :
						case 705 :
						case 707 :
						case 709 :
						case 711 :
						case 713 :
						case 714 :
						case 716 :
						case 718 :
						case 720 :
						case 722 :
						case 724 :
						case 726 :
						case 728 :
						case 730 :
						case 732 :
						case 734 :
						case 736 :
						case 738 :
						case 740 :
						case 742 :
						case 744 :
						case 746 :
						case 748 :
						case 750 :
						case 752 :
						case 754 :
						case 757 :
						case 759 :
						case 761 :
						case 763 :
						case 765 :
						case 767 :
						case 769 :
						case 771 :
						case 773 :
						case 775 :
						case 777 :
						case 779 :
						case 781 :
						case 783 :
						case 785 :
						case 787 :
						case 789 :
						case 791 :
						case 793 :
						case 795 :
						case 796 :
						case 798 :
							monitor.wait();
							break;
						case 600:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_5_";
								}
								if (receiver.equals("psinv_5_")) {
									monitor.notifyAll();
									state = 601;
									queueFrommasterTopsinv_5_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 602:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_6_";
								}
								if (receiver.equals("psinv_6_")) {
									monitor.notifyAll();
									state = 603;
									queueFrommasterTopsinv_6_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 604:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_7_";
								}
								if (receiver.equals("psinv_7_")) {
									monitor.notifyAll();
									state = 605;
									queueFrommasterTopsinv_7_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 606:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_8_";
								}
								if (receiver.equals("psinv_8_")) {
									monitor.notifyAll();
									state = 607;
									queueFrommasterTopsinv_8_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 608:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_9_";
								}
								if (receiver.equals("psinv_9_")) {
									monitor.notifyAll();
									state = 609;
									queueFrommasterTopsinv_9_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 610:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_10_";
								}
								if (receiver.equals("psinv_10_")) {
									monitor.notifyAll();
									state = 611;
									queueFrommasterTopsinv_10_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 612:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_11_";
								}
								if (receiver.equals("psinv_11_")) {
									monitor.notifyAll();
									state = 613;
									queueFrommasterTopsinv_11_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 614:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_12_";
								}
								if (receiver.equals("psinv_12_")) {
									monitor.notifyAll();
									state = 615;
									queueFrommasterTopsinv_12_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 616:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_13_";
								}
								if (receiver.equals("psinv_13_")) {
									monitor.notifyAll();
									state = 617;
									queueFrommasterTopsinv_13_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 618:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_14_";
								}
								if (receiver.equals("psinv_14_")) {
									monitor.notifyAll();
									state = 619;
									queueFrommasterTopsinv_14_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 620:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_15_";
								}
								if (receiver.equals("psinv_15_")) {
									monitor.notifyAll();
									state = 621;
									queueFrommasterTopsinv_15_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 622:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_16_";
								}
								if (receiver.equals("psinv_16_")) {
									monitor.notifyAll();
									state = 623;
									queueFrommasterTopsinv_16_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 624:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_17_";
								}
								if (receiver.equals("psinv_17_")) {
									monitor.notifyAll();
									state = 625;
									queueFrommasterTopsinv_17_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 626:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_18_";
								}
								if (receiver.equals("psinv_18_")) {
									monitor.notifyAll();
									state = 627;
									queueFrommasterTopsinv_18_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 628:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_19_";
								}
								if (receiver.equals("psinv_19_")) {
									monitor.notifyAll();
									state = 629;
									queueFrommasterTopsinv_19_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 630:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_20_";
								}
								if (receiver.equals("psinv_20_")) {
									monitor.notifyAll();
									state = 631;
									queueFrommasterTopsinv_20_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 633:
							if (queueFrompsinv_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 634;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 635:
							if (queueFrompsinv_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 636;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 637:
							if (queueFrompsinv_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 638;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 639:
							if (queueFrompsinv_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 640;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 641:
							if (queueFrompsinv_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 642;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 643:
							if (queueFrompsinv_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 644;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 645:
							if (queueFrompsinv_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 646;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 647:
							if (queueFrompsinv_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 648;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 649:
							if (queueFrompsinv_8_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 650;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 651:
							if (queueFrompsinv_9_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 652;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_9_Tomaster.take());
							}
							monitor.wait();
							break;
						case 653:
							if (queueFrompsinv_10_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 654;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 655:
							if (queueFrompsinv_11_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 656;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_11_Tomaster.take());
							}
							monitor.wait();
							break;
						case 657:
							if (queueFrompsinv_12_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 658;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_12_Tomaster.take());
							}
							monitor.wait();
							break;
						case 659:
							if (queueFrompsinv_13_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 660;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_13_Tomaster.take());
							}
							monitor.wait();
							break;
						case 661:
							if (queueFrompsinv_14_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 662;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_14_Tomaster.take());
							}
							monitor.wait();
							break;
						case 663:
							if (queueFrompsinv_15_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 664;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_15_Tomaster.take());
							}
							monitor.wait();
							break;
						case 665:
							if (queueFrompsinv_16_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 666;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_16_Tomaster.take());
							}
							monitor.wait();
							break;
						case 667:
							if (queueFrompsinv_17_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 668;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_17_Tomaster.take());
							}
							monitor.wait();
							break;
						case 669:
							if (queueFrompsinv_18_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 670;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_18_Tomaster.take());
							}
							monitor.wait();
							break;
						case 671:
							if (queueFrompsinv_19_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 672;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_19_Tomaster.take());
							}
							monitor.wait();
							break;
						case 673:
							if (queueFrompsinv_20_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 88;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_20_Tomaster.take());
							}
							monitor.wait();
							break;
						case 674:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_1_";
								}
								if (receiver.equals("rprj_1_")) {
									monitor.notifyAll();
									state = 675;
									queueFrommasterTorprj_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 676:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_2_";
								}
								if (receiver.equals("rprj_2_")) {
									monitor.notifyAll();
									state = 677;
									queueFrommasterTorprj_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 678:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_3_";
								}
								if (receiver.equals("rprj_3_")) {
									monitor.notifyAll();
									state = 679;
									queueFrommasterTorprj_3_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 680:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_4_";
								}
								if (receiver.equals("rprj_4_")) {
									monitor.notifyAll();
									state = 681;
									queueFrommasterTorprj_4_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 682:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_5_";
								}
								if (receiver.equals("rprj_5_")) {
									monitor.notifyAll();
									state = 683;
									queueFrommasterTorprj_5_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 684:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_6_";
								}
								if (receiver.equals("rprj_6_")) {
									monitor.notifyAll();
									state = 685;
									queueFrommasterTorprj_6_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 686:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_7_";
								}
								if (receiver.equals("rprj_7_")) {
									monitor.notifyAll();
									state = 687;
									queueFrommasterTorprj_7_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 688:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_8_";
								}
								if (receiver.equals("rprj_8_")) {
									monitor.notifyAll();
									state = 689;
									queueFrommasterTorprj_8_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 690:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_9_";
								}
								if (receiver.equals("rprj_9_")) {
									monitor.notifyAll();
									state = 691;
									queueFrommasterTorprj_9_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 692:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_10_";
								}
								if (receiver.equals("rprj_10_")) {
									monitor.notifyAll();
									state = 693;
									queueFrommasterTorprj_10_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 694:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_11_";
								}
								if (receiver.equals("rprj_11_")) {
									monitor.notifyAll();
									state = 695;
									queueFrommasterTorprj_11_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 696:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_12_";
								}
								if (receiver.equals("rprj_12_")) {
									monitor.notifyAll();
									state = 697;
									queueFrommasterTorprj_12_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 698:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_13_";
								}
								if (receiver.equals("rprj_13_")) {
									monitor.notifyAll();
									state = 699;
									queueFrommasterTorprj_13_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 700:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_14_";
								}
								if (receiver.equals("rprj_14_")) {
									monitor.notifyAll();
									state = 701;
									queueFrommasterTorprj_14_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 702:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_15_";
								}
								if (receiver.equals("rprj_15_")) {
									monitor.notifyAll();
									state = 703;
									queueFrommasterTorprj_15_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 704:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_16_";
								}
								if (receiver.equals("rprj_16_")) {
									monitor.notifyAll();
									state = 705;
									queueFrommasterTorprj_16_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 706:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_17_";
								}
								if (receiver.equals("rprj_17_")) {
									monitor.notifyAll();
									state = 707;
									queueFrommasterTorprj_17_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 708:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_18_";
								}
								if (receiver.equals("rprj_18_")) {
									monitor.notifyAll();
									state = 709;
									queueFrommasterTorprj_18_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 710:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_19_";
								}
								if (receiver.equals("rprj_19_")) {
									monitor.notifyAll();
									state = 711;
									queueFrommasterTorprj_19_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 712:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_20_";
								}
								if (receiver.equals("rprj_20_")) {
									monitor.notifyAll();
									state = 713;
									queueFrommasterTorprj_20_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 715:
							if (queueFromrprj_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 716;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 717:
							if (queueFromrprj_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 718;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 719:
							if (queueFromrprj_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 720;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 721:
							if (queueFromrprj_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 722;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 723:
							if (queueFromrprj_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 724;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 725:
							if (queueFromrprj_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 726;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 727:
							if (queueFromrprj_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 728;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 729:
							if (queueFromrprj_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 730;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 731:
							if (queueFromrprj_8_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 732;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 733:
							if (queueFromrprj_9_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 734;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_9_Tomaster.take());
							}
							monitor.wait();
							break;
						case 735:
							if (queueFromrprj_10_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 736;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 737:
							if (queueFromrprj_11_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 738;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_11_Tomaster.take());
							}
							monitor.wait();
							break;
						case 739:
							if (queueFromrprj_12_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 740;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_12_Tomaster.take());
							}
							monitor.wait();
							break;
						case 741:
							if (queueFromrprj_13_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 742;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_13_Tomaster.take());
							}
							monitor.wait();
							break;
						case 743:
							if (queueFromrprj_14_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 744;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_14_Tomaster.take());
							}
							monitor.wait();
							break;
						case 745:
							if (queueFromrprj_15_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 746;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_15_Tomaster.take());
							}
							monitor.wait();
							break;
						case 747:
							if (queueFromrprj_16_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 748;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_16_Tomaster.take());
							}
							monitor.wait();
							break;
						case 749:
							if (queueFromrprj_17_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 750;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_17_Tomaster.take());
							}
							monitor.wait();
							break;
						case 751:
							if (queueFromrprj_18_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 752;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_18_Tomaster.take());
							}
							monitor.wait();
							break;
						case 753:
							if (queueFromrprj_19_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 754;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_19_Tomaster.take());
							}
							monitor.wait();
							break;
						case 755:
							if (queueFromrprj_20_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 88;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_20_Tomaster.take());
							}
							monitor.wait();
							break;
						case 756:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_1_";
								}
								if (receiver.equals("resid_1_")) {
									monitor.notifyAll();
									state = 757;
									queueFrommasterToresid_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 758:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_2_";
								}
								if (receiver.equals("resid_2_")) {
									monitor.notifyAll();
									state = 759;
									queueFrommasterToresid_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 760:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_3_";
								}
								if (receiver.equals("resid_3_")) {
									monitor.notifyAll();
									state = 761;
									queueFrommasterToresid_3_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 762:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_4_";
								}
								if (receiver.equals("resid_4_")) {
									monitor.notifyAll();
									state = 763;
									queueFrommasterToresid_4_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 764:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_5_";
								}
								if (receiver.equals("resid_5_")) {
									monitor.notifyAll();
									state = 765;
									queueFrommasterToresid_5_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 766:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_6_";
								}
								if (receiver.equals("resid_6_")) {
									monitor.notifyAll();
									state = 767;
									queueFrommasterToresid_6_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 768:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_7_";
								}
								if (receiver.equals("resid_7_")) {
									monitor.notifyAll();
									state = 769;
									queueFrommasterToresid_7_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 770:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_8_";
								}
								if (receiver.equals("resid_8_")) {
									monitor.notifyAll();
									state = 771;
									queueFrommasterToresid_8_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 772:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_9_";
								}
								if (receiver.equals("resid_9_")) {
									monitor.notifyAll();
									state = 773;
									queueFrommasterToresid_9_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 774:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_10_";
								}
								if (receiver.equals("resid_10_")) {
									monitor.notifyAll();
									state = 775;
									queueFrommasterToresid_10_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 776:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_11_";
								}
								if (receiver.equals("resid_11_")) {
									monitor.notifyAll();
									state = 777;
									queueFrommasterToresid_11_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 778:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_12_";
								}
								if (receiver.equals("resid_12_")) {
									monitor.notifyAll();
									state = 779;
									queueFrommasterToresid_12_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 780:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_13_";
								}
								if (receiver.equals("resid_13_")) {
									monitor.notifyAll();
									state = 781;
									queueFrommasterToresid_13_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 782:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_14_";
								}
								if (receiver.equals("resid_14_")) {
									monitor.notifyAll();
									state = 783;
									queueFrommasterToresid_14_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 784:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_15_";
								}
								if (receiver.equals("resid_15_")) {
									monitor.notifyAll();
									state = 785;
									queueFrommasterToresid_15_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 786:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_16_";
								}
								if (receiver.equals("resid_16_")) {
									monitor.notifyAll();
									state = 787;
									queueFrommasterToresid_16_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 788:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_17_";
								}
								if (receiver.equals("resid_17_")) {
									monitor.notifyAll();
									state = 789;
									queueFrommasterToresid_17_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 790:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_18_";
								}
								if (receiver.equals("resid_18_")) {
									monitor.notifyAll();
									state = 791;
									queueFrommasterToresid_18_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 792:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_19_";
								}
								if (receiver.equals("resid_19_")) {
									monitor.notifyAll();
									state = 793;
									queueFrommasterToresid_19_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 794:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_20_";
								}
								if (receiver.equals("resid_20_")) {
									monitor.notifyAll();
									state = 795;
									queueFrommasterToresid_20_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 797:
							if (queueFromresid_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 798;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 799:
							if (queueFromresid_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 800;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_1_Tomaster.take());
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 802 :
						case 804 :
						case 806 :
						case 808 :
						case 810 :
						case 812 :
						case 814 :
						case 816 :
						case 818 :
						case 820 :
						case 822 :
						case 824 :
						case 826 :
						case 828 :
						case 830 :
						case 832 :
						case 834 :
						case 836 :
							monitor.wait();
							break;
						case 801:
							if (queueFromresid_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 802;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 803:
							if (queueFromresid_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 804;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 805:
							if (queueFromresid_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 806;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 807:
							if (queueFromresid_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 808;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 809:
							if (queueFromresid_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 810;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 811:
							if (queueFromresid_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 812;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 813:
							if (queueFromresid_8_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 814;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 815:
							if (queueFromresid_9_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 816;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_9_Tomaster.take());
							}
							monitor.wait();
							break;
						case 817:
							if (queueFromresid_10_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 818;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 819:
							if (queueFromresid_11_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 820;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_11_Tomaster.take());
							}
							monitor.wait();
							break;
						case 821:
							if (queueFromresid_12_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 822;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_12_Tomaster.take());
							}
							monitor.wait();
							break;
						case 823:
							if (queueFromresid_13_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 824;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_13_Tomaster.take());
							}
							monitor.wait();
							break;
						case 825:
							if (queueFromresid_14_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 826;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_14_Tomaster.take());
							}
							monitor.wait();
							break;
						case 827:
							if (queueFromresid_15_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 828;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_15_Tomaster.take());
							}
							monitor.wait();
							break;
						case 829:
							if (queueFromresid_16_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 830;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_16_Tomaster.take());
							}
							monitor.wait();
							break;
						case 831:
							if (queueFromresid_17_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 832;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_17_Tomaster.take());
							}
							monitor.wait();
							break;
						case 833:
							if (queueFromresid_18_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 834;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_18_Tomaster.take());
							}
							monitor.wait();
							break;
						case 835:
							if (queueFromresid_19_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 836;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_19_Tomaster.take());
							}
							monitor.wait();
							break;
						case 837:
							if (queueFromresid_20_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 88;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_20_Tomaster.take());
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_0_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 2:
							if (queueFrommasterTopsinv_0_.peek() != null ) {
								monitor.notifyAll();
								state = 592;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_0_.take());
							}
							monitor.wait();
							break;
						case 92:
							if (queueFrommasterTopsinv_0_.peek() != null ) {
								monitor.notifyAll();
								state = 93;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_0_.take());
							}
							monitor.wait();
							break;
						case 93:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 94;
									queueFrompsinv_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 486:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 487;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 632:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 633;
									queueFrompsinv_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_10_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 252:
							if (queueFrommasterTopsinv_10_.peek() != null ) {
								monitor.notifyAll();
								state = 253;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_10_.take());
							}
							monitor.wait();
							break;
						case 253:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 254;
									queueFrompsinv_10_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 496:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 497;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 611:
							if (queueFrommasterTopsinv_10_.peek() != null ) {
								monitor.notifyAll();
								state = 612;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_10_.take());
							}
							monitor.wait();
							break;
						case 652:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 653;
									queueFrompsinv_10_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_11_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 268:
							if (queueFrommasterTopsinv_11_.peek() != null ) {
								monitor.notifyAll();
								state = 269;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_11_.take());
							}
							monitor.wait();
							break;
						case 269:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 270;
									queueFrompsinv_11_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 497:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 498;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 613:
							if (queueFrommasterTopsinv_11_.peek() != null ) {
								monitor.notifyAll();
								state = 614;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_11_.take());
							}
							monitor.wait();
							break;
						case 654:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 655;
									queueFrompsinv_11_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_12_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 284:
							if (queueFrommasterTopsinv_12_.peek() != null ) {
								monitor.notifyAll();
								state = 285;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_12_.take());
							}
							monitor.wait();
							break;
						case 285:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 286;
									queueFrompsinv_12_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 498:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 499;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 615:
							if (queueFrommasterTopsinv_12_.peek() != null ) {
								monitor.notifyAll();
								state = 616;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_12_.take());
							}
							monitor.wait();
							break;
						case 656:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 657;
									queueFrompsinv_12_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_13_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 300:
							if (queueFrommasterTopsinv_13_.peek() != null ) {
								monitor.notifyAll();
								state = 301;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_13_.take());
							}
							monitor.wait();
							break;
						case 301:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 302;
									queueFrompsinv_13_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 499:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 500;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 617:
							if (queueFrommasterTopsinv_13_.peek() != null ) {
								monitor.notifyAll();
								state = 618;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_13_.take());
							}
							monitor.wait();
							break;
						case 658:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 659;
									queueFrompsinv_13_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_14_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 316:
							if (queueFrommasterTopsinv_14_.peek() != null ) {
								monitor.notifyAll();
								state = 317;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_14_.take());
							}
							monitor.wait();
							break;
						case 317:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 318;
									queueFrompsinv_14_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 500:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 501;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 619:
							if (queueFrommasterTopsinv_14_.peek() != null ) {
								monitor.notifyAll();
								state = 620;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_14_.take());
							}
							monitor.wait();
							break;
						case 660:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 661;
									queueFrompsinv_14_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_15_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 332:
							if (queueFrommasterTopsinv_15_.peek() != null ) {
								monitor.notifyAll();
								state = 333;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_15_.take());
							}
							monitor.wait();
							break;
						case 333:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 334;
									queueFrompsinv_15_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 501:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 502;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 621:
							if (queueFrommasterTopsinv_15_.peek() != null ) {
								monitor.notifyAll();
								state = 622;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_15_.take());
							}
							monitor.wait();
							break;
						case 662:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 663;
									queueFrompsinv_15_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_16_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 348:
							if (queueFrommasterTopsinv_16_.peek() != null ) {
								monitor.notifyAll();
								state = 349;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_16_.take());
							}
							monitor.wait();
							break;
						case 349:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 350;
									queueFrompsinv_16_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 502:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 503;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 623:
							if (queueFrommasterTopsinv_16_.peek() != null ) {
								monitor.notifyAll();
								state = 624;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_16_.take());
							}
							monitor.wait();
							break;
						case 664:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 665;
									queueFrompsinv_16_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_17_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 364:
							if (queueFrommasterTopsinv_17_.peek() != null ) {
								monitor.notifyAll();
								state = 365;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_17_.take());
							}
							monitor.wait();
							break;
						case 365:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 366;
									queueFrompsinv_17_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 503:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 504;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 625:
							if (queueFrommasterTopsinv_17_.peek() != null ) {
								monitor.notifyAll();
								state = 626;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_17_.take());
							}
							monitor.wait();
							break;
						case 666:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 667;
									queueFrompsinv_17_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_18_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 380:
							if (queueFrommasterTopsinv_18_.peek() != null ) {
								monitor.notifyAll();
								state = 381;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_18_.take());
							}
							monitor.wait();
							break;
						case 381:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 382;
									queueFrompsinv_18_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 504:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 505;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 627:
							if (queueFrommasterTopsinv_18_.peek() != null ) {
								monitor.notifyAll();
								state = 628;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_18_.take());
							}
							monitor.wait();
							break;
						case 668:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 669;
									queueFrompsinv_18_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_19_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 396:
							if (queueFrommasterTopsinv_19_.peek() != null ) {
								monitor.notifyAll();
								state = 397;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_19_.take());
							}
							monitor.wait();
							break;
						case 397:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 398;
									queueFrompsinv_19_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 505:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 506;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 629:
							if (queueFrommasterTopsinv_19_.peek() != null ) {
								monitor.notifyAll();
								state = 630;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_19_.take());
							}
							monitor.wait();
							break;
						case 670:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 671;
									queueFrompsinv_19_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_1_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 108:
							if (queueFrommasterTopsinv_1_.peek() != null ) {
								monitor.notifyAll();
								state = 109;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_1_.take());
							}
							monitor.wait();
							break;
						case 109:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 110;
									queueFrompsinv_1_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 487:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 488;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 593:
							if (queueFrommasterTopsinv_1_.peek() != null ) {
								monitor.notifyAll();
								state = 594;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_1_.take());
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 634:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 635;
									queueFrompsinv_1_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_20_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 412:
							if (queueFrommasterTopsinv_20_.peek() != null ) {
								monitor.notifyAll();
								state = 413;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_20_.take());
							}
							monitor.wait();
							break;
						case 413:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 414;
									queueFrompsinv_20_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 506:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 507;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 631:
							if (queueFrommasterTopsinv_20_.peek() != null ) {
								monitor.notifyAll();
								state = 632;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_20_.take());
							}
							monitor.wait();
							break;
						case 672:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 673;
									queueFrompsinv_20_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_2_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 124:
							if (queueFrommasterTopsinv_2_.peek() != null ) {
								monitor.notifyAll();
								state = 125;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_2_.take());
							}
							monitor.wait();
							break;
						case 125:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 126;
									queueFrompsinv_2_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 488:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 489;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 595:
							if (queueFrommasterTopsinv_2_.peek() != null ) {
								monitor.notifyAll();
								state = 596;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_2_.take());
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 636:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 637;
									queueFrompsinv_2_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_3_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 140:
							if (queueFrommasterTopsinv_3_.peek() != null ) {
								monitor.notifyAll();
								state = 141;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_3_.take());
							}
							monitor.wait();
							break;
						case 141:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 142;
									queueFrompsinv_3_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 489:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 490;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 597:
							if (queueFrommasterTopsinv_3_.peek() != null ) {
								monitor.notifyAll();
								state = 598;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_3_.take());
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 638:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 639;
									queueFrompsinv_3_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_4_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 156:
							if (queueFrommasterTopsinv_4_.peek() != null ) {
								monitor.notifyAll();
								state = 157;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_4_.take());
							}
							monitor.wait();
							break;
						case 157:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 158;
									queueFrompsinv_4_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
							monitor.wait();
							break;
						case 490:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 491;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 599:
							if (queueFrommasterTopsinv_4_.peek() != null ) {
								monitor.notifyAll();
								state = 600;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_4_.take());
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 640:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 641;
									queueFrompsinv_4_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_5_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 172:
							if (queueFrommasterTopsinv_5_.peek() != null ) {
								monitor.notifyAll();
								state = 173;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_5_.take());
							}
							monitor.wait();
							break;
						case 173:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 174;
									queueFrompsinv_5_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 491:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 492;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 601:
							if (queueFrommasterTopsinv_5_.peek() != null ) {
								monitor.notifyAll();
								state = 602;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_5_.take());
							}
							monitor.wait();
							break;
						case 642:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 643;
									queueFrompsinv_5_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_6_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 188:
							if (queueFrommasterTopsinv_6_.peek() != null ) {
								monitor.notifyAll();
								state = 189;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_6_.take());
							}
							monitor.wait();
							break;
						case 189:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 190;
									queueFrompsinv_6_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 492:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 493;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 603:
							if (queueFrommasterTopsinv_6_.peek() != null ) {
								monitor.notifyAll();
								state = 604;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_6_.take());
							}
							monitor.wait();
							break;
						case 644:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 645;
									queueFrompsinv_6_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_7_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 204:
							if (queueFrommasterTopsinv_7_.peek() != null ) {
								monitor.notifyAll();
								state = 205;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_7_.take());
							}
							monitor.wait();
							break;
						case 205:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 206;
									queueFrompsinv_7_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 493:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 494;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 605:
							if (queueFrommasterTopsinv_7_.peek() != null ) {
								monitor.notifyAll();
								state = 606;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_7_.take());
							}
							monitor.wait();
							break;
						case 646:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 647;
									queueFrompsinv_7_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_8_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 220:
							if (queueFrommasterTopsinv_8_.peek() != null ) {
								monitor.notifyAll();
								state = 221;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_8_.take());
							}
							monitor.wait();
							break;
						case 221:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 222;
									queueFrompsinv_8_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 494:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 495;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 607:
							if (queueFrommasterTopsinv_8_.peek() != null ) {
								monitor.notifyAll();
								state = 608;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_8_.take());
							}
							monitor.wait();
							break;
						case 648:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 649;
									queueFrompsinv_8_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_9_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 236:
							if (queueFrommasterTopsinv_9_.peek() != null ) {
								monitor.notifyAll();
								state = 237;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_9_.take());
							}
							monitor.wait();
							break;
						case 237:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 238;
									queueFrompsinv_9_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 495:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 496;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 609:
							if (queueFrommasterTopsinv_9_.peek() != null ) {
								monitor.notifyAll();
								state = 610;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_9_.take());
							}
							monitor.wait();
							break;
						case 650:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 651;
									queueFrompsinv_9_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "resid_0_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 4:
							if (queueFrommasterToresid_0_.peek() != null ) {
								monitor.notifyAll();
								state = 756;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToresid_0_.take());
							}
							monitor.wait();
							break;
						case 100:
							if (queueFrommasterToresid_0_.peek() != null ) {
								monitor.notifyAll();
								state = 101;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToresid_0_.take());
							}
							monitor.wait();
							break;
						case 101:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 102;
									queueFromresid_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 570:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 571;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 796:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 797;
									queueFromresid_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "resid_10_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 260:
							if (queueFrommasterToresid_10_.peek() != null ) {
								monitor.notifyAll();
								state = 261;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToresid_10_.take());
							}
							monitor.wait();
							break;
						case 261:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 262;
									queueFromresid_10_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 580:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 581;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 775:
							if (queueFrommasterToresid_10_.peek() != null ) {
								monitor.notifyAll();
								state = 776;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToresid_10_.take());
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
						case 816:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 817;
									queueFromresid_10_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								Optional result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								Optional result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								Optional result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								Optional result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 838){
								Optional result = exchange_800_838(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "resid_11_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 276:
							if (queueFrommasterToresid_11_.peek() != null ) {
								monitor.notifyAll();
								state = 277;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToresid_11_.take());
							}
							monitor.wait();
							break;
						case 277:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 278;
									queueFromresid_11_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 581:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 582;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 777:
							if (queueFrommasterToresid_11_.peek() != null ) {
								monitor.notifyAll();
								state = 778;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToresid_11_.take());
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_838(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
							monitor.wait();
							break;
						case 818:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 819;
									queueFromresid_11_Tomaster.put(box.get());
									return Optional.empty();
								}
	}