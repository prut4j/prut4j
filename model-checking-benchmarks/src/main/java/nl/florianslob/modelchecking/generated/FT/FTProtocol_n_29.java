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

public class FTProtocol_n_29 implements IProtocol {
	private volatile int state = 0;
	private final Object monitor = this;
	
	private final BlockingQueue<Object> queueFrommasterTofft_20_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_7_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_6_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_14_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_26_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_12_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_27_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_23_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_16_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_28_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_16_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_6_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_4_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_11_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_0_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_13_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_5_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_25_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_23_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_19_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_8_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_9_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_15_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_5_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_27_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_27_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_1_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_15_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_1_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_14_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_9_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_20_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_12_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_4_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_24_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_28_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_11_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_24_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_19_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_15_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_26_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_25_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_13_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_19_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_8_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_11_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_5_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_23_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_1_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_3_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_16_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_22_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_6_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_12_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_9_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_2_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_26_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_24_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_3_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_18_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_12_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_10_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_22_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_21_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_2_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_10_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_25_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_18_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_14_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_2_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_17_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_1_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_23_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_11_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_9_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_21_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_6_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_2_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_17_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_21_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_7_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_13_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_3_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_19_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_25_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_16_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_28_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_22_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_5_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_10_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_8_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_20_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_22_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_26_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_17_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_18_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_13_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_27_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_4_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_21_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_3_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_10_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_7_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_15_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_18_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_20_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_7_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_8_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_14_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_4_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_28_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_17_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_0_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_24_Tomaster = new LinkedBlockingQueue<>(); 
	
	@Override
	public IEnvironment getEnvironment(String environmentName) throws Exception{
		switch (environmentName){
			case "evolve_0_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
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
							if (queueFrommasterToevolve_0_.peek() != null ) {
								monitor.notifyAll();
								state = 5;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_0_.take());
							}
							monitor.wait();
							break;
						case 4:
							if (queueFrommasterToevolve_0_.peek() != null ) {
								monitor.notifyAll();
								state = 120;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_0_.take());
							}
							monitor.wait();
							break;
						case 61:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 62;
									queueFromevolve_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 120:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 121;
									queueFromevolve_0_Tomaster.put(box.get());
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
						case 379:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 380;
								return Optional.empty();
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
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "evolve_10_": return new IEnvironment() {
				
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
							monitor.wait();
							break;
						case 24:
							if (queueFrommasterToevolve_10_.peek() != null ) {
								monitor.notifyAll();
								state = 25;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_10_.take());
							}
							monitor.wait();
							break;
						case 81:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 82;
									queueFromevolve_10_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 199:
							if (queueFrommasterToevolve_10_.peek() != null ) {
								monitor.notifyAll();
								state = 200;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_10_.take());
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
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
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 201;
									queueFromevolve_10_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 389:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 390;
								return Optional.empty();
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
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "evolve_11_": return new IEnvironment() {
				
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
						case 26:
							if (queueFrommasterToevolve_11_.peek() != null ) {
								monitor.notifyAll();
								state = 27;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_11_.take());
							}
							monitor.wait();
							break;
						case 83:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 84;
									queueFromevolve_11_Tomaster.put(box.get());
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
						case 207:
							if (queueFrommasterToevolve_11_.peek() != null ) {
								monitor.notifyAll();
								state = 208;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_11_.take());
							}
							monitor.wait();
							break;
						case 208:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 209;
									queueFromevolve_11_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 390:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 391;
								return Optional.empty();
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
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "evolve_12_": return new IEnvironment() {
				
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
						case 28:
							if (queueFrommasterToevolve_12_.peek() != null ) {
								monitor.notifyAll();
								state = 29;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_12_.take());
							}
							monitor.wait();
							break;
						case 85:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 86;
									queueFromevolve_12_Tomaster.put(box.get());
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
						case 215:
							if (queueFrommasterToevolve_12_.peek() != null ) {
								monitor.notifyAll();
								state = 216;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_12_.take());
							}
							monitor.wait();
							break;
						case 216:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 217;
									queueFromevolve_12_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 391:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 392;
								return Optional.empty();
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
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "evolve_13_": return new IEnvironment() {
				
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
						case 30:
							if (queueFrommasterToevolve_13_.peek() != null ) {
								monitor.notifyAll();
								state = 31;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_13_.take());
							}
							monitor.wait();
							break;
						case 87:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 88;
									queueFromevolve_13_Tomaster.put(box.get());
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
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 223:
							if (queueFrommasterToevolve_13_.peek() != null ) {
								monitor.notifyAll();
								state = 224;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_13_.take());
							}
							monitor.wait();
							break;
						case 224:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 225;
									queueFromevolve_13_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 392:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 393;
								return Optional.empty();
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
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "evolve_14_": return new IEnvironment() {
				
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
						case 32:
							if (queueFrommasterToevolve_14_.peek() != null ) {
								monitor.notifyAll();
								state = 33;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_14_.take());
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
									queueFromevolve_14_Tomaster.put(box.get());
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
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 231:
							if (queueFrommasterToevolve_14_.peek() != null ) {
								monitor.notifyAll();
								state = 232;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_14_.take());
							}
							monitor.wait();
							break;
						case 232:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 233;
									queueFromevolve_14_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 393:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 394;
								return Optional.empty();
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
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "evolve_15_": return new IEnvironment() {
				
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
						case 34:
							if (queueFrommasterToevolve_15_.peek() != null ) {
								monitor.notifyAll();
								state = 35;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_15_.take());
							}
							monitor.wait();
							break;
						case 91:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 92;
									queueFromevolve_15_Tomaster.put(box.get());
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
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 239:
							if (queueFrommasterToevolve_15_.peek() != null ) {
								monitor.notifyAll();
								state = 240;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_15_.take());
							}
							monitor.wait();
							break;
						case 240:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 241;
									queueFromevolve_15_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 394:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 395;
								return Optional.empty();
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
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "evolve_16_": return new IEnvironment() {
				
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
						case 36:
							if (queueFrommasterToevolve_16_.peek() != null ) {
								monitor.notifyAll();
								state = 37;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_16_.take());
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
									queueFromevolve_16_Tomaster.put(box.get());
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
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 247:
							if (queueFrommasterToevolve_16_.peek() != null ) {
								monitor.notifyAll();
								state = 248;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_16_.take());
							}
							monitor.wait();
							break;
						case 248:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 249;
									queueFromevolve_16_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 395:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 396;
								return Optional.empty();
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
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "evolve_17_": return new IEnvironment() {
				
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
						case 38:
							if (queueFrommasterToevolve_17_.peek() != null ) {
								monitor.notifyAll();
								state = 39;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_17_.take());
							}
							monitor.wait();
							break;
						case 95:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 96;
									queueFromevolve_17_Tomaster.put(box.get());
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
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 255:
							if (queueFrommasterToevolve_17_.peek() != null ) {
								monitor.notifyAll();
								state = 256;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_17_.take());
							}
							monitor.wait();
							break;
						case 256:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 257;
									queueFromevolve_17_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 396:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 397;
								return Optional.empty();
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
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "evolve_18_": return new IEnvironment() {
				
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
						case 40:
							if (queueFrommasterToevolve_18_.peek() != null ) {
								monitor.notifyAll();
								state = 41;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_18_.take());
							}
							monitor.wait();
							break;
						case 97:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 98;
									queueFromevolve_18_Tomaster.put(box.get());
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
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 263:
							if (queueFrommasterToevolve_18_.peek() != null ) {
								monitor.notifyAll();
								state = 264;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_18_.take());
							}
							monitor.wait();
							break;
						case 264:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 265;
									queueFromevolve_18_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 397:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 398;
								return Optional.empty();
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
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "evolve_19_": return new IEnvironment() {
				
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
						case 42:
							if (queueFrommasterToevolve_19_.peek() != null ) {
								monitor.notifyAll();
								state = 43;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_19_.take());
							}
							monitor.wait();
							break;
						case 99:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 100;
									queueFromevolve_19_Tomaster.put(box.get());
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
						case 399 :
							monitor.wait();
							break;
						case 271:
							if (queueFrommasterToevolve_19_.peek() != null ) {
								monitor.notifyAll();
								state = 272;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_19_.take());
							}
							monitor.wait();
							break;
						case 272:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 273;
									queueFromevolve_19_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 398:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 399;
								return Optional.empty();
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
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "evolve_1_": return new IEnvironment() {
				
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
						case 6:
							if (queueFrommasterToevolve_1_.peek() != null ) {
								monitor.notifyAll();
								state = 7;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_1_.take());
							}
							monitor.wait();
							break;
						case 63:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 64;
									queueFromevolve_1_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 127:
							if (queueFrommasterToevolve_1_.peek() != null ) {
								monitor.notifyAll();
								state = 128;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_1_.take());
							}
							monitor.wait();
							break;
						case 128:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 129;
									queueFromevolve_1_Tomaster.put(box.get());
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
						case 380:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 381;
								return Optional.empty();
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
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "evolve_20_": return new IEnvironment() {
				
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
						case 44:
							if (queueFrommasterToevolve_20_.peek() != null ) {
								monitor.notifyAll();
								state = 45;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_20_.take());
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
									queueFromevolve_20_Tomaster.put(box.get());
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
							monitor.wait();
							break;
						case 279:
							if (queueFrommasterToevolve_20_.peek() != null ) {
								monitor.notifyAll();
								state = 280;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_20_.take());
							}
							monitor.wait();
							break;
						case 280:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 281;
									queueFromevolve_20_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 399:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 400;
								return Optional.empty();
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
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "evolve_21_": return new IEnvironment() {
				
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
						case 46:
							if (queueFrommasterToevolve_21_.peek() != null ) {
								monitor.notifyAll();
								state = 47;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_21_.take());
							}
							monitor.wait();
							break;
						case 103:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 104;
									queueFromevolve_21_Tomaster.put(box.get());
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
						case 287:
							if (queueFrommasterToevolve_21_.peek() != null ) {
								monitor.notifyAll();
								state = 288;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_21_.take());
							}
							monitor.wait();
							break;
						case 288:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 289;
									queueFromevolve_21_Tomaster.put(box.get());
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
						case 400:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 401;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "evolve_22_": return new IEnvironment() {
				
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
						case 48:
							if (queueFrommasterToevolve_22_.peek() != null ) {
								monitor.notifyAll();
								state = 49;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_22_.take());
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
									queueFromevolve_22_Tomaster.put(box.get());
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
						case 295:
							if (queueFrommasterToevolve_22_.peek() != null ) {
								monitor.notifyAll();
								state = 296;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_22_.take());
							}
							monitor.wait();
							break;
						case 296:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 297;
									queueFromevolve_22_Tomaster.put(box.get());
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
						case 401:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 402;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "evolve_23_": return new IEnvironment() {
				
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
						case 50:
							if (queueFrommasterToevolve_23_.peek() != null ) {
								monitor.notifyAll();
								state = 51;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_23_.take());
							}
							monitor.wait();
							break;
						case 107:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 108;
									queueFromevolve_23_Tomaster.put(box.get());
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
						case 303:
							if (queueFrommasterToevolve_23_.peek() != null ) {
								monitor.notifyAll();
								state = 304;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_23_.take());
							}
							monitor.wait();
							break;
						case 304:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 305;
									queueFromevolve_23_Tomaster.put(box.get());
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
						case 402:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 403;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "evolve_24_": return new IEnvironment() {
				
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
						case 52:
							if (queueFrommasterToevolve_24_.peek() != null ) {
								monitor.notifyAll();
								state = 53;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_24_.take());
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
									queueFromevolve_24_Tomaster.put(box.get());
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
						case 311:
							if (queueFrommasterToevolve_24_.peek() != null ) {
								monitor.notifyAll();
								state = 312;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_24_.take());
							}
							monitor.wait();
							break;
						case 312:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 313;
									queueFromevolve_24_Tomaster.put(box.get());
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
						case 403:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 404;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "evolve_25_": return new IEnvironment() {
				
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
						case 54:
							if (queueFrommasterToevolve_25_.peek() != null ) {
								monitor.notifyAll();
								state = 55;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_25_.take());
							}
							monitor.wait();
							break;
						case 111:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 112;
									queueFromevolve_25_Tomaster.put(box.get());
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
						case 319:
							if (queueFrommasterToevolve_25_.peek() != null ) {
								monitor.notifyAll();
								state = 320;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_25_.take());
							}
							monitor.wait();
							break;
						case 320:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 321;
									queueFromevolve_25_Tomaster.put(box.get());
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
						case 404:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 405;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "evolve_26_": return new IEnvironment() {
				
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
						case 56:
							if (queueFrommasterToevolve_26_.peek() != null ) {
								monitor.notifyAll();
								state = 57;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_26_.take());
							}
							monitor.wait();
							break;
						case 113:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 114;
									queueFromevolve_26_Tomaster.put(box.get());
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
						case 327:
							if (queueFrommasterToevolve_26_.peek() != null ) {
								monitor.notifyAll();
								state = 328;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_26_.take());
							}
							monitor.wait();
							break;
						case 328:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 329;
									queueFromevolve_26_Tomaster.put(box.get());
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
						case 405:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 406;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "evolve_27_": return new IEnvironment() {
				
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
						case 58:
							if (queueFrommasterToevolve_27_.peek() != null ) {
								monitor.notifyAll();
								state = 59;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_27_.take());
							}
							monitor.wait();
							break;
						case 115:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 116;
									queueFromevolve_27_Tomaster.put(box.get());
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
						case 335:
							if (queueFrommasterToevolve_27_.peek() != null ) {
								monitor.notifyAll();
								state = 336;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_27_.take());
							}
							monitor.wait();
							break;
						case 336:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 337;
									queueFromevolve_27_Tomaster.put(box.get());
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
						case 406:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 407;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "evolve_28_": return new IEnvironment() {
				
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
						case 60:
							if (queueFrommasterToevolve_28_.peek() != null ) {
								monitor.notifyAll();
								state = 61;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_28_.take());
							}
							monitor.wait();
							break;
						case 117:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 118;
									queueFromevolve_28_Tomaster.put(box.get());
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
						case 343:
							if (queueFrommasterToevolve_28_.peek() != null ) {
								monitor.notifyAll();
								state = 344;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_28_.take());
							}
							monitor.wait();
							break;
						case 344:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 345;
									queueFromevolve_28_Tomaster.put(box.get());
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
						case 407:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 408;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "evolve_2_": return new IEnvironment() {
				
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
						case 8:
							if (queueFrommasterToevolve_2_.peek() != null ) {
								monitor.notifyAll();
								state = 9;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_2_.take());
							}
							monitor.wait();
							break;
						case 65:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 66;
									queueFromevolve_2_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 135:
							if (queueFrommasterToevolve_2_.peek() != null ) {
								monitor.notifyAll();
								state = 136;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_2_.take());
							}
							monitor.wait();
							break;
						case 136:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 137;
									queueFromevolve_2_Tomaster.put(box.get());
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
						case 381:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 382;
								return Optional.empty();
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
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "evolve_3_": return new IEnvironment() {
				
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
						case 10:
							if (queueFrommasterToevolve_3_.peek() != null ) {
								monitor.notifyAll();
								state = 11;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_3_.take());
							}
							monitor.wait();
							break;
						case 67:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 68;
									queueFromevolve_3_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 143:
							if (queueFrommasterToevolve_3_.peek() != null ) {
								monitor.notifyAll();
								state = 144;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_3_.take());
							}
							monitor.wait();
							break;
						case 144:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 145;
									queueFromevolve_3_Tomaster.put(box.get());
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
						case 382:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 383;
								return Optional.empty();
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
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "evolve_4_": return new IEnvironment() {
				
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
						case 12:
							if (queueFrommasterToevolve_4_.peek() != null ) {
								monitor.notifyAll();
								state = 13;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_4_.take());
							}
							monitor.wait();
							break;
						case 69:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 70;
									queueFromevolve_4_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 151:
							if (queueFrommasterToevolve_4_.peek() != null ) {
								monitor.notifyAll();
								state = 152;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_4_.take());
							}
							monitor.wait();
							break;
						case 152:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 153;
									queueFromevolve_4_Tomaster.put(box.get());
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
						case 383:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 384;
								return Optional.empty();
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
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "evolve_5_": return new IEnvironment() {
				
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
						case 14:
							if (queueFrommasterToevolve_5_.peek() != null ) {
								monitor.notifyAll();
								state = 15;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_5_.take());
							}
							monitor.wait();
							break;
						case 71:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 72;
									queueFromevolve_5_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 159:
							if (queueFrommasterToevolve_5_.peek() != null ) {
								monitor.notifyAll();
								state = 160;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_5_.take());
							}
							monitor.wait();
							break;
						case 160:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 161;
									queueFromevolve_5_Tomaster.put(box.get());
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
						case 384:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 385;
								return Optional.empty();
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
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "evolve_6_": return new IEnvironment() {
				
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
						case 16:
							if (queueFrommasterToevolve_6_.peek() != null ) {
								monitor.notifyAll();
								state = 17;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_6_.take());
							}
							monitor.wait();
							break;
						case 73:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 74;
									queueFromevolve_6_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 167:
							if (queueFrommasterToevolve_6_.peek() != null ) {
								monitor.notifyAll();
								state = 168;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_6_.take());
							}
							monitor.wait();
							break;
						case 168:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 169;
									queueFromevolve_6_Tomaster.put(box.get());
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
						case 385:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 386;
								return Optional.empty();
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
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "evolve_7_": return new IEnvironment() {
				
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
						case 18:
							if (queueFrommasterToevolve_7_.peek() != null ) {
								monitor.notifyAll();
								state = 19;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_7_.take());
							}
							monitor.wait();
							break;
						case 75:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 76;
									queueFromevolve_7_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 175:
							if (queueFrommasterToevolve_7_.peek() != null ) {
								monitor.notifyAll();
								state = 176;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_7_.take());
							}
							monitor.wait();
							break;
						case 176:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 177;
									queueFromevolve_7_Tomaster.put(box.get());
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
						case 386:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 387;
								return Optional.empty();
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
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "evolve_8_": return new IEnvironment() {
				
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
						case 20:
							if (queueFrommasterToevolve_8_.peek() != null ) {
								monitor.notifyAll();
								state = 21;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_8_.take());
							}
							monitor.wait();
							break;
						case 77:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 78;
									queueFromevolve_8_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 183:
							if (queueFrommasterToevolve_8_.peek() != null ) {
								monitor.notifyAll();
								state = 184;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_8_.take());
							}
							monitor.wait();
							break;
						case 184:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 185;
									queueFromevolve_8_Tomaster.put(box.get());
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
						case 387:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 388;
								return Optional.empty();
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
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "evolve_9_": return new IEnvironment() {
				
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
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 22:
							if (queueFrommasterToevolve_9_.peek() != null ) {
								monitor.notifyAll();
								state = 23;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_9_.take());
							}
							monitor.wait();
							break;
						case 79:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 80;
									queueFromevolve_9_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 191:
							if (queueFrommasterToevolve_9_.peek() != null ) {
								monitor.notifyAll();
								state = 192;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_9_.take());
							}
							monitor.wait();
							break;
						case 192:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 193;
									queueFromevolve_9_Tomaster.put(box.get());
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
						case 388:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 389;
								return Optional.empty();
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
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "fft_0_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
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
							if (queueFrommasterTofft_0_.peek() != null ) {
								monitor.notifyAll();
								state = 467;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_0_.take());
							}
							monitor.wait();
							break;
						case 3:
							if (queueFrommasterTofft_0_.peek() != null ) {
								monitor.notifyAll();
								state = 581;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_0_.take());
							}
							monitor.wait();
							break;
						case 123:
							if (queueFrommasterTofft_0_.peek() != null ) {
								monitor.notifyAll();
								state = 124;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_0_.take());
							}
							monitor.wait();
							break;
						case 124:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 125;
									queueFromfft_0_Tomaster.put(box.get());
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
						case 437:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 438;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 523:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 524;
									queueFromfft_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "fft_10_": return new IEnvironment() {
				
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
						case 203:
							if (queueFrommasterTofft_10_.peek() != null ) {
								monitor.notifyAll();
								state = 204;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_10_.take());
							}
							monitor.wait();
							break;
						case 204:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 205;
									queueFromfft_10_Tomaster.put(box.get());
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
						case 486:
							if (queueFrommasterTofft_10_.peek() != null ) {
								monitor.notifyAll();
								state = 487;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_10_.take());
							}
							monitor.wait();
							break;
						case 543:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 544;
									queueFromfft_10_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
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
							monitor.wait();
							break;
						case 600:
							if (queueFrommasterTofft_10_.peek() != null ) {
								monitor.notifyAll();
								state = 601;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_10_.take());
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "fft_11_": return new IEnvironment() {
				
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
						case 211:
							if (queueFrommasterTofft_11_.peek() != null ) {
								monitor.notifyAll();
								state = 212;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_11_.take());
							}
							monitor.wait();
							break;
						case 212:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 213;
									queueFromfft_11_Tomaster.put(box.get());
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
						case 488:
							if (queueFrommasterTofft_11_.peek() != null ) {
								monitor.notifyAll();
								state = 489;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_11_.take());
							}
							monitor.wait();
							break;
						case 545:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 546;
									queueFromfft_11_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
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
							monitor.wait();
							break;
						case 602:
							if (queueFrommasterTofft_11_.peek() != null ) {
								monitor.notifyAll();
								state = 603;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_11_.take());
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "fft_12_": return new IEnvironment() {
				
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
						case 219:
							if (queueFrommasterTofft_12_.peek() != null ) {
								monitor.notifyAll();
								state = 220;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_12_.take());
							}
							monitor.wait();
							break;
						case 220:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 221;
									queueFromfft_12_Tomaster.put(box.get());
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
						case 490:
							if (queueFrommasterTofft_12_.peek() != null ) {
								monitor.notifyAll();
								state = 491;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_12_.take());
							}
							monitor.wait();
							break;
						case 547:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 548;
									queueFromfft_12_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
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
							monitor.wait();
							break;
						case 604:
							if (queueFrommasterTofft_12_.peek() != null ) {
								monitor.notifyAll();
								state = 605;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_12_.take());
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "fft_13_": return new IEnvironment() {
				
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
						case 227:
							if (queueFrommasterTofft_13_.peek() != null ) {
								monitor.notifyAll();
								state = 228;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_13_.take());
							}
							monitor.wait();
							break;
						case 228:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 229;
									queueFromfft_13_Tomaster.put(box.get());
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
						case 492:
							if (queueFrommasterTofft_13_.peek() != null ) {
								monitor.notifyAll();
								state = 493;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_13_.take());
							}
							monitor.wait();
							break;
						case 549:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 550;
									queueFromfft_13_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
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
							monitor.wait();
							break;
						case 606:
							if (queueFrommasterTofft_13_.peek() != null ) {
								monitor.notifyAll();
								state = 607;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_13_.take());
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "fft_14_": return new IEnvironment() {
				
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
						case 235:
							if (queueFrommasterTofft_14_.peek() != null ) {
								monitor.notifyAll();
								state = 236;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_14_.take());
							}
							monitor.wait();
							break;
						case 236:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 237;
									queueFromfft_14_Tomaster.put(box.get());
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
						case 494:
							if (queueFrommasterTofft_14_.peek() != null ) {
								monitor.notifyAll();
								state = 495;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_14_.take());
							}
							monitor.wait();
							break;
						case 551:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 552;
									queueFromfft_14_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
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
							monitor.wait();
							break;
						case 608:
							if (queueFrommasterTofft_14_.peek() != null ) {
								monitor.notifyAll();
								state = 609;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_14_.take());
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "fft_15_": return new IEnvironment() {
				
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
						case 243:
							if (queueFrommasterTofft_15_.peek() != null ) {
								monitor.notifyAll();
								state = 244;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_15_.take());
							}
							monitor.wait();
							break;
						case 244:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 245;
									queueFromfft_15_Tomaster.put(box.get());
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
						case 496:
							if (queueFrommasterTofft_15_.peek() != null ) {
								monitor.notifyAll();
								state = 497;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_15_.take());
							}
							monitor.wait();
							break;
						case 553:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 554;
									queueFromfft_15_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							monitor.wait();
							break;
						case 610:
							if (queueFrommasterTofft_15_.peek() != null ) {
								monitor.notifyAll();
								state = 611;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_15_.take());
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "fft_16_": return new IEnvironment() {
				
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
						case 251:
							if (queueFrommasterTofft_16_.peek() != null ) {
								monitor.notifyAll();
								state = 252;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_16_.take());
							}
							monitor.wait();
							break;
						case 252:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 253;
									queueFromfft_16_Tomaster.put(box.get());
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
						case 498:
							if (queueFrommasterTofft_16_.peek() != null ) {
								monitor.notifyAll();
								state = 499;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_16_.take());
							}
							monitor.wait();
							break;
						case 555:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 556;
									queueFromfft_16_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							monitor.wait();
							break;
						case 612:
							if (queueFrommasterTofft_16_.peek() != null ) {
								monitor.notifyAll();
								state = 613;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_16_.take());
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "fft_17_": return new IEnvironment() {
				
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
						case 259:
							if (queueFrommasterTofft_17_.peek() != null ) {
								monitor.notifyAll();
								state = 260;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_17_.take());
							}
							monitor.wait();
							break;
						case 260:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 261;
									queueFromfft_17_Tomaster.put(box.get());
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
						case 500:
							if (queueFrommasterTofft_17_.peek() != null ) {
								monitor.notifyAll();
								state = 501;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_17_.take());
							}
							monitor.wait();
							break;
						case 557:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 558;
									queueFromfft_17_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							monitor.wait();
							break;
						case 614:
							if (queueFrommasterTofft_17_.peek() != null ) {
								monitor.notifyAll();
								state = 615;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_17_.take());
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "fft_18_": return new IEnvironment() {
				
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
						case 267:
							if (queueFrommasterTofft_18_.peek() != null ) {
								monitor.notifyAll();
								state = 268;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_18_.take());
							}
							monitor.wait();
							break;
						case 268:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 269;
									queueFromfft_18_Tomaster.put(box.get());
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
						case 502:
							if (queueFrommasterTofft_18_.peek() != null ) {
								monitor.notifyAll();
								state = 503;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_18_.take());
							}
							monitor.wait();
							break;
						case 559:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 560;
									queueFromfft_18_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							monitor.wait();
							break;
						case 616:
							if (queueFrommasterTofft_18_.peek() != null ) {
								monitor.notifyAll();
								state = 617;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_18_.take());
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "fft_19_": return new IEnvironment() {
				
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
						case 275:
							if (queueFrommasterTofft_19_.peek() != null ) {
								monitor.notifyAll();
								state = 276;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_19_.take());
							}
							monitor.wait();
							break;
						case 276:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 277;
									queueFromfft_19_Tomaster.put(box.get());
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
						case 504:
							if (queueFrommasterTofft_19_.peek() != null ) {
								monitor.notifyAll();
								state = 505;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_19_.take());
							}
							monitor.wait();
							break;
						case 561:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 562;
									queueFromfft_19_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							monitor.wait();
							break;
						case 618:
							if (queueFrommasterTofft_19_.peek() != null ) {
								monitor.notifyAll();
								state = 619;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_19_.take());
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "fft_1_": return new IEnvironment() {
				
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
						case 131:
							if (queueFrommasterTofft_1_.peek() != null ) {
								monitor.notifyAll();
								state = 132;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_1_.take());
							}
							monitor.wait();
							break;
						case 132:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 133;
									queueFromfft_1_Tomaster.put(box.get());
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
						case 438:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 439;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 468:
							if (queueFrommasterTofft_1_.peek() != null ) {
								monitor.notifyAll();
								state = 469;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_1_.take());
							}
							monitor.wait();
							break;
						case 525:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 526;
									queueFromfft_1_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 582:
							if (queueFrommasterTofft_1_.peek() != null ) {
								monitor.notifyAll();
								state = 583;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_1_.take());
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "fft_20_": return new IEnvironment() {
				
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
						case 283:
							if (queueFrommasterTofft_20_.peek() != null ) {
								monitor.notifyAll();
								state = 284;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_20_.take());
							}
							monitor.wait();
							break;
						case 284:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 285;
									queueFromfft_20_Tomaster.put(box.get());
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
						case 506:
							if (queueFrommasterTofft_20_.peek() != null ) {
								monitor.notifyAll();
								state = 507;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_20_.take());
							}
							monitor.wait();
							break;
						case 563:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 564;
									queueFromfft_20_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							monitor.wait();
							break;
						case 620:
							if (queueFrommasterTofft_20_.peek() != null ) {
								monitor.notifyAll();
								state = 621;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_20_.take());
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "fft_21_": return new IEnvironment() {
				
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
						case 291:
							if (queueFrommasterTofft_21_.peek() != null ) {
								monitor.notifyAll();
								state = 292;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_21_.take());
							}
							monitor.wait();
							break;
						case 292:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 293;
									queueFromfft_21_Tomaster.put(box.get());
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
						case 508:
							if (queueFrommasterTofft_21_.peek() != null ) {
								monitor.notifyAll();
								state = 509;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_21_.take());
							}
							monitor.wait();
							break;
						case 565:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 566;
									queueFromfft_21_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							monitor.wait();
							break;
						case 622:
							if (queueFrommasterTofft_21_.peek() != null ) {
								monitor.notifyAll();
								state = 623;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_21_.take());
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "fft_22_": return new IEnvironment() {
				
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
						case 299:
							if (queueFrommasterTofft_22_.peek() != null ) {
								monitor.notifyAll();
								state = 300;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_22_.take());
							}
							monitor.wait();
							break;
						case 300:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 301;
									queueFromfft_22_Tomaster.put(box.get());
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
						case 510:
							if (queueFrommasterTofft_22_.peek() != null ) {
								monitor.notifyAll();
								state = 511;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_22_.take());
							}
							monitor.wait();
							break;
						case 567:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 568;
									queueFromfft_22_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							monitor.wait();
							break;
						case 624:
							if (queueFrommasterTofft_22_.peek() != null ) {
								monitor.notifyAll();
								state = 625;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_22_.take());
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "fft_23_": return new IEnvironment() {
				
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
						case 307:
							if (queueFrommasterTofft_23_.peek() != null ) {
								monitor.notifyAll();
								state = 308;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_23_.take());
							}
							monitor.wait();
							break;
						case 308:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 309;
									queueFromfft_23_Tomaster.put(box.get());
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
						case 512:
							if (queueFrommasterTofft_23_.peek() != null ) {
								monitor.notifyAll();
								state = 513;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_23_.take());
							}
							monitor.wait();
							break;
						case 569:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 570;
									queueFromfft_23_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
							monitor.wait();
							break;
						case 626:
							if (queueFrommasterTofft_23_.peek() != null ) {
								monitor.notifyAll();
								state = 627;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_23_.take());
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "fft_24_": return new IEnvironment() {
				
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
						case 315:
							if (queueFrommasterTofft_24_.peek() != null ) {
								monitor.notifyAll();
								state = 316;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_24_.take());
							}
							monitor.wait();
							break;
						case 316:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 317;
									queueFromfft_24_Tomaster.put(box.get());
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
						case 514:
							if (queueFrommasterTofft_24_.peek() != null ) {
								monitor.notifyAll();
								state = 515;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_24_.take());
							}
							monitor.wait();
							break;
						case 571:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 572;
									queueFromfft_24_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
							monitor.wait();
							break;
						case 628:
							if (queueFrommasterTofft_24_.peek() != null ) {
								monitor.notifyAll();
								state = 629;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_24_.take());
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "fft_25_": return new IEnvironment() {
				
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
						case 323:
							if (queueFrommasterTofft_25_.peek() != null ) {
								monitor.notifyAll();
								state = 324;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_25_.take());
							}
							monitor.wait();
							break;
						case 324:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 325;
									queueFromfft_25_Tomaster.put(box.get());
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
						case 516:
							if (queueFrommasterTofft_25_.peek() != null ) {
								monitor.notifyAll();
								state = 517;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_25_.take());
							}
							monitor.wait();
							break;
						case 573:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 574;
									queueFromfft_25_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
							monitor.wait();
							break;
						case 630:
							if (queueFrommasterTofft_25_.peek() != null ) {
								monitor.notifyAll();
								state = 631;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_25_.take());
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "fft_26_": return new IEnvironment() {
				
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
						case 331:
							if (queueFrommasterTofft_26_.peek() != null ) {
								monitor.notifyAll();
								state = 332;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_26_.take());
							}
							monitor.wait();
							break;
						case 332:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 333;
									queueFromfft_26_Tomaster.put(box.get());
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
						case 518:
							if (queueFrommasterTofft_26_.peek() != null ) {
								monitor.notifyAll();
								state = 519;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_26_.take());
							}
							monitor.wait();
							break;
						case 575:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 576;
									queueFromfft_26_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							monitor.wait();
							break;
						case 632:
							if (queueFrommasterTofft_26_.peek() != null ) {
								monitor.notifyAll();
								state = 633;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_26_.take());
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "fft_27_": return new IEnvironment() {
				
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
						case 339:
							if (queueFrommasterTofft_27_.peek() != null ) {
								monitor.notifyAll();
								state = 340;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_27_.take());
							}
							monitor.wait();
							break;
						case 340:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 341;
									queueFromfft_27_Tomaster.put(box.get());
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
						case 464:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 465;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 520:
							if (queueFrommasterTofft_27_.peek() != null ) {
								monitor.notifyAll();
								state = 521;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_27_.take());
							}
							monitor.wait();
							break;
						case 577:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 578;
									queueFromfft_27_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							monitor.wait();
							break;
						case 634:
							if (queueFrommasterTofft_27_.peek() != null ) {
								monitor.notifyAll();
								state = 635;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_27_.take());
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "fft_28_": return new IEnvironment() {
				
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
						case 347:
							if (queueFrommasterTofft_28_.peek() != null ) {
								monitor.notifyAll();
								state = 348;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_28_.take());
							}
							monitor.wait();
							break;
						case 348:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 349;
									queueFromfft_28_Tomaster.put(box.get());
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
						case 465:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 466;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 522:
							if (queueFrommasterTofft_28_.peek() != null ) {
								monitor.notifyAll();
								state = 523;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_28_.take());
							}
							monitor.wait();
							break;
						case 579:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 580;
									queueFromfft_28_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "fft_2_": return new IEnvironment() {
				
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
						case 139:
							if (queueFrommasterTofft_2_.peek() != null ) {
								monitor.notifyAll();
								state = 140;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_2_.take());
							}
							monitor.wait();
							break;
						case 140:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 141;
									queueFromfft_2_Tomaster.put(box.get());
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
						case 439:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 440;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 470:
							if (queueFrommasterTofft_2_.peek() != null ) {
								monitor.notifyAll();
								state = 471;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_2_.take());
							}
							monitor.wait();
							break;
						case 527:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 528;
									queueFromfft_2_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 584:
							if (queueFrommasterTofft_2_.peek() != null ) {
								monitor.notifyAll();
								state = 585;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_2_.take());
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "fft_3_": return new IEnvironment() {
				
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
						case 147:
							if (queueFrommasterTofft_3_.peek() != null ) {
								monitor.notifyAll();
								state = 148;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_3_.take());
							}
							monitor.wait();
							break;
						case 148:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 149;
									queueFromfft_3_Tomaster.put(box.get());
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
						case 440:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 441;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 472:
							if (queueFrommasterTofft_3_.peek() != null ) {
								monitor.notifyAll();
								state = 473;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_3_.take());
							}
							monitor.wait();
							break;
						case 529:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 530;
									queueFromfft_3_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 586:
							if (queueFrommasterTofft_3_.peek() != null ) {
								monitor.notifyAll();
								state = 587;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_3_.take());
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "fft_4_": return new IEnvironment() {
				
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
						case 155:
							if (queueFrommasterTofft_4_.peek() != null ) {
								monitor.notifyAll();
								state = 156;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_4_.take());
							}
							monitor.wait();
							break;
						case 156:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 157;
									queueFromfft_4_Tomaster.put(box.get());
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
						case 441:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 442;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 474:
							if (queueFrommasterTofft_4_.peek() != null ) {
								monitor.notifyAll();
								state = 475;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_4_.take());
							}
							monitor.wait();
							break;
						case 531:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 532;
									queueFromfft_4_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 588:
							if (queueFrommasterTofft_4_.peek() != null ) {
								monitor.notifyAll();
								state = 589;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_4_.take());
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "fft_5_": return new IEnvironment() {
				
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
						case 163:
							if (queueFrommasterTofft_5_.peek() != null ) {
								monitor.notifyAll();
								state = 164;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_5_.take());
							}
							monitor.wait();
							break;
						case 164:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 165;
									queueFromfft_5_Tomaster.put(box.get());
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
						case 442:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 443;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 476:
							if (queueFrommasterTofft_5_.peek() != null ) {
								monitor.notifyAll();
								state = 477;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_5_.take());
							}
							monitor.wait();
							break;
						case 533:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 534;
									queueFromfft_5_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 590:
							if (queueFrommasterTofft_5_.peek() != null ) {
								monitor.notifyAll();
								state = 591;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_5_.take());
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "fft_6_": return new IEnvironment() {
				
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
						case 171:
							if (queueFrommasterTofft_6_.peek() != null ) {
								monitor.notifyAll();
								state = 172;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_6_.take());
							}
							monitor.wait();
							break;
						case 172:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 173;
									queueFromfft_6_Tomaster.put(box.get());
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
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
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
						case 478:
							if (queueFrommasterTofft_6_.peek() != null ) {
								monitor.notifyAll();
								state = 479;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_6_.take());
							}
							monitor.wait();
							break;
						case 535:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 536;
									queueFromfft_6_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 592:
							if (queueFrommasterTofft_6_.peek() != null ) {
								monitor.notifyAll();
								state = 593;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_6_.take());
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "fft_7_": return new IEnvironment() {
				
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
						case 179:
							if (queueFrommasterTofft_7_.peek() != null ) {
								monitor.notifyAll();
								state = 180;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_7_.take());
							}
							monitor.wait();
							break;
						case 180:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 181;
									queueFromfft_7_Tomaster.put(box.get());
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
						case 480:
							if (queueFrommasterTofft_7_.peek() != null ) {
								monitor.notifyAll();
								state = 481;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_7_.take());
							}
							monitor.wait();
							break;
						case 537:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 538;
									queueFromfft_7_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 594:
							if (queueFrommasterTofft_7_.peek() != null ) {
								monitor.notifyAll();
								state = 595;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_7_.take());
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "fft_8_": return new IEnvironment() {
				
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
						case 187:
							if (queueFrommasterTofft_8_.peek() != null ) {
								monitor.notifyAll();
								state = 188;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_8_.take());
							}
							monitor.wait();
							break;
						case 188:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 189;
									queueFromfft_8_Tomaster.put(box.get());
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
						case 482:
							if (queueFrommasterTofft_8_.peek() != null ) {
								monitor.notifyAll();
								state = 483;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_8_.take());
							}
							monitor.wait();
							break;
						case 539:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 540;
									queueFromfft_8_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 596:
							if (queueFrommasterTofft_8_.peek() != null ) {
								monitor.notifyAll();
								state = 597;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_8_.take());
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "fft_9_": return new IEnvironment() {
				
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
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 195:
							if (queueFrommasterTofft_9_.peek() != null ) {
								monitor.notifyAll();
								state = 196;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_9_.take());
							}
							monitor.wait();
							break;
						case 196:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 197;
									queueFromfft_9_Tomaster.put(box.get());
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
						case 484:
							if (queueFrommasterTofft_9_.peek() != null ) {
								monitor.notifyAll();
								state = 485;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_9_.take());
							}
							monitor.wait();
							break;
						case 541:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 542;
									queueFromfft_9_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 598:
							if (queueFrommasterTofft_9_.peek() != null ) {
								monitor.notifyAll();
								state = 599;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_9_.take());
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
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
						case 6 :
						case 8 :
						case 10 :
						case 12 :
						case 14 :
						case 16 :
						case 18 :
						case 20 :
						case 22 :
						case 24 :
						case 26 :
						case 28 :
						case 30 :
						case 32 :
						case 34 :
						case 36 :
						case 38 :
						case 40 :
						case 42 :
						case 44 :
						case 46 :
						case 48 :
						case 50 :
						case 52 :
						case 54 :
						case 56 :
						case 58 :
						case 60 :
						case 61 :
						case 63 :
						case 65 :
						case 67 :
						case 69 :
						case 71 :
						case 73 :
						case 75 :
						case 77 :
						case 79 :
						case 81 :
						case 83 :
						case 85 :
						case 87 :
						case 89 :
						case 91 :
						case 93 :
						case 95 :
						case 97 :
						case 99 :
						case 101 :
						case 103 :
						case 105 :
						case 107 :
						case 109 :
						case 111 :
						case 113 :
						case 115 :
						case 117 :
						case 120 :
						case 123 :
						case 124 :
						case 127 :
						case 128 :
						case 131 :
						case 132 :
						case 135 :
						case 136 :
						case 139 :
						case 140 :
						case 143 :
						case 144 :
						case 147 :
						case 148 :
						case 151 :
						case 152 :
						case 155 :
						case 156 :
						case 159 :
						case 160 :
						case 163 :
						case 164 :
						case 167 :
						case 168 :
						case 171 :
						case 172 :
						case 175 :
						case 176 :
						case 179 :
						case 180 :
						case 183 :
						case 184 :
						case 187 :
						case 188 :
						case 191 :
						case 192 :
						case 195 :
						case 196 :
						case 199 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_0_";
								}
								if (receiver.equals("evolve_0_")) {
									monitor.notifyAll();
									state = 1;
									queueFrommasterToevolve_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									monitor.notifyAll();
									state = 3;
									queueFrommasterTofft_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									monitor.notifyAll();
									state = 2;
									queueFrommasterTofft_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_0_";
								}
								if (receiver.equals("evolve_0_")) {
									monitor.notifyAll();
									state = 4;
									queueFrommasterToevolve_0_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 5:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_1_";
								}
								if (receiver.equals("evolve_1_")) {
									monitor.notifyAll();
									state = 6;
									queueFrommasterToevolve_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 7:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_2_";
								}
								if (receiver.equals("evolve_2_")) {
									monitor.notifyAll();
									state = 8;
									queueFrommasterToevolve_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 9:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_3_";
								}
								if (receiver.equals("evolve_3_")) {
									monitor.notifyAll();
									state = 10;
									queueFrommasterToevolve_3_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 11:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_4_";
								}
								if (receiver.equals("evolve_4_")) {
									monitor.notifyAll();
									state = 12;
									queueFrommasterToevolve_4_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 13:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_5_";
								}
								if (receiver.equals("evolve_5_")) {
									monitor.notifyAll();
									state = 14;
									queueFrommasterToevolve_5_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 15:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_6_";
								}
								if (receiver.equals("evolve_6_")) {
									monitor.notifyAll();
									state = 16;
									queueFrommasterToevolve_6_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 17:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_7_";
								}
								if (receiver.equals("evolve_7_")) {
									monitor.notifyAll();
									state = 18;
									queueFrommasterToevolve_7_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 19:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_8_";
								}
								if (receiver.equals("evolve_8_")) {
									monitor.notifyAll();
									state = 20;
									queueFrommasterToevolve_8_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 21:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_9_";
								}
								if (receiver.equals("evolve_9_")) {
									monitor.notifyAll();
									state = 22;
									queueFrommasterToevolve_9_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 23:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_10_";
								}
								if (receiver.equals("evolve_10_")) {
									monitor.notifyAll();
									state = 24;
									queueFrommasterToevolve_10_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 25:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_11_";
								}
								if (receiver.equals("evolve_11_")) {
									monitor.notifyAll();
									state = 26;
									queueFrommasterToevolve_11_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 27:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_12_";
								}
								if (receiver.equals("evolve_12_")) {
									monitor.notifyAll();
									state = 28;
									queueFrommasterToevolve_12_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 29:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_13_";
								}
								if (receiver.equals("evolve_13_")) {
									monitor.notifyAll();
									state = 30;
									queueFrommasterToevolve_13_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 31:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_14_";
								}
								if (receiver.equals("evolve_14_")) {
									monitor.notifyAll();
									state = 32;
									queueFrommasterToevolve_14_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 33:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_15_";
								}
								if (receiver.equals("evolve_15_")) {
									monitor.notifyAll();
									state = 34;
									queueFrommasterToevolve_15_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 35:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_16_";
								}
								if (receiver.equals("evolve_16_")) {
									monitor.notifyAll();
									state = 36;
									queueFrommasterToevolve_16_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 37:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_17_";
								}
								if (receiver.equals("evolve_17_")) {
									monitor.notifyAll();
									state = 38;
									queueFrommasterToevolve_17_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 39:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_18_";
								}
								if (receiver.equals("evolve_18_")) {
									monitor.notifyAll();
									state = 40;
									queueFrommasterToevolve_18_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 41:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_19_";
								}
								if (receiver.equals("evolve_19_")) {
									monitor.notifyAll();
									state = 42;
									queueFrommasterToevolve_19_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 43:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_20_";
								}
								if (receiver.equals("evolve_20_")) {
									monitor.notifyAll();
									state = 44;
									queueFrommasterToevolve_20_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 45:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_21_";
								}
								if (receiver.equals("evolve_21_")) {
									monitor.notifyAll();
									state = 46;
									queueFrommasterToevolve_21_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 47:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_22_";
								}
								if (receiver.equals("evolve_22_")) {
									monitor.notifyAll();
									state = 48;
									queueFrommasterToevolve_22_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 49:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_23_";
								}
								if (receiver.equals("evolve_23_")) {
									monitor.notifyAll();
									state = 50;
									queueFrommasterToevolve_23_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 51:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_24_";
								}
								if (receiver.equals("evolve_24_")) {
									monitor.notifyAll();
									state = 52;
									queueFrommasterToevolve_24_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 53:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_25_";
								}
								if (receiver.equals("evolve_25_")) {
									monitor.notifyAll();
									state = 54;
									queueFrommasterToevolve_25_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 55:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_26_";
								}
								if (receiver.equals("evolve_26_")) {
									monitor.notifyAll();
									state = 56;
									queueFrommasterToevolve_26_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 57:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_27_";
								}
								if (receiver.equals("evolve_27_")) {
									monitor.notifyAll();
									state = 58;
									queueFrommasterToevolve_27_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 59:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_28_";
								}
								if (receiver.equals("evolve_28_")) {
									monitor.notifyAll();
									state = 60;
									queueFrommasterToevolve_28_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 62:
							if (queueFromevolve_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 63;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 64:
							if (queueFromevolve_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 65;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 66:
							if (queueFromevolve_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 67;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 68:
							if (queueFromevolve_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 69;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 70:
							if (queueFromevolve_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 71;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 72:
							if (queueFromevolve_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 73;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 74:
							if (queueFromevolve_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 75;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 76:
							if (queueFromevolve_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 77;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 78:
							if (queueFromevolve_8_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 79;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 80:
							if (queueFromevolve_9_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 81;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_9_Tomaster.take());
							}
							monitor.wait();
							break;
						case 82:
							if (queueFromevolve_10_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 83;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 84:
							if (queueFromevolve_11_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 85;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_11_Tomaster.take());
							}
							monitor.wait();
							break;
						case 86:
							if (queueFromevolve_12_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 87;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_12_Tomaster.take());
							}
							monitor.wait();
							break;
						case 88:
							if (queueFromevolve_13_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 89;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_13_Tomaster.take());
							}
							monitor.wait();
							break;
						case 90:
							if (queueFromevolve_14_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 91;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_14_Tomaster.take());
							}
							monitor.wait();
							break;
						case 92:
							if (queueFromevolve_15_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 93;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_15_Tomaster.take());
							}
							monitor.wait();
							break;
						case 94:
							if (queueFromevolve_16_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 95;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_16_Tomaster.take());
							}
							monitor.wait();
							break;
						case 96:
							if (queueFromevolve_17_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 97;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_17_Tomaster.take());
							}
							monitor.wait();
							break;
						case 98:
							if (queueFromevolve_18_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 99;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_18_Tomaster.take());
							}
							monitor.wait();
							break;
						case 100:
							if (queueFromevolve_19_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 101;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_19_Tomaster.take());
							}
							monitor.wait();
							break;
						case 102:
							if (queueFromevolve_20_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 103;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_20_Tomaster.take());
							}
							monitor.wait();
							break;
						case 104:
							if (queueFromevolve_21_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 105;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_21_Tomaster.take());
							}
							monitor.wait();
							break;
						case 106:
							if (queueFromevolve_22_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 107;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_22_Tomaster.take());
							}
							monitor.wait();
							break;
						case 108:
							if (queueFromevolve_23_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 109;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_23_Tomaster.take());
							}
							monitor.wait();
							break;
						case 110:
							if (queueFromevolve_24_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 111;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_24_Tomaster.take());
							}
							monitor.wait();
							break;
						case 112:
							if (queueFromevolve_25_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 113;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_25_Tomaster.take());
							}
							monitor.wait();
							break;
						case 114:
							if (queueFromevolve_26_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 115;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_26_Tomaster.take());
							}
							monitor.wait();
							break;
						case 116:
							if (queueFromevolve_27_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 117;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_27_Tomaster.take());
							}
							monitor.wait();
							break;
						case 118:
							if (queueFromevolve_28_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 119;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_28_Tomaster.take());
							}
							monitor.wait();
							break;
						case 119:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_0_";
								}
								if (receiver.equals("evolve_0_")) {
									monitor.notifyAll();
									state = 4;
									queueFrommasterToevolve_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									monitor.notifyAll();
									state = 2;
									queueFrommasterTofft_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_0_";
								}
								if (receiver.equals("evolve_0_")) {
									monitor.notifyAll();
									state = 1;
									queueFrommasterToevolve_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									monitor.notifyAll();
									state = 3;
									queueFrommasterTofft_0_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 121:
							if (queueFromevolve_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 122;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 122:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									monitor.notifyAll();
									state = 123;
									queueFrommasterTofft_0_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 125:
							if (queueFromfft_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 126;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 126:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_1_";
								}
								if (receiver.equals("evolve_1_")) {
									monitor.notifyAll();
									state = 127;
									queueFrommasterToevolve_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 129:
							if (queueFromevolve_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 130;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 130:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_1_";
								}
								if (receiver.equals("fft_1_")) {
									monitor.notifyAll();
									state = 131;
									queueFrommasterTofft_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 133:
							if (queueFromfft_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 134;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 134:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_2_";
								}
								if (receiver.equals("evolve_2_")) {
									monitor.notifyAll();
									state = 135;
									queueFrommasterToevolve_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 137:
							if (queueFromevolve_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 138;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 138:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_2_";
								}
								if (receiver.equals("fft_2_")) {
									monitor.notifyAll();
									state = 139;
									queueFrommasterTofft_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 141:
							if (queueFromfft_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 142;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 142:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_3_";
								}
								if (receiver.equals("evolve_3_")) {
									monitor.notifyAll();
									state = 143;
									queueFrommasterToevolve_3_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 145:
							if (queueFromevolve_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 146;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 146:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_3_";
								}
								if (receiver.equals("fft_3_")) {
									monitor.notifyAll();
									state = 147;
									queueFrommasterTofft_3_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 149:
							if (queueFromfft_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 150;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 150:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_4_";
								}
								if (receiver.equals("evolve_4_")) {
									monitor.notifyAll();
									state = 151;
									queueFrommasterToevolve_4_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 153:
							if (queueFromevolve_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 154;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 154:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_4_";
								}
								if (receiver.equals("fft_4_")) {
									monitor.notifyAll();
									state = 155;
									queueFrommasterTofft_4_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 157:
							if (queueFromfft_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 158;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 158:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_5_";
								}
								if (receiver.equals("evolve_5_")) {
									monitor.notifyAll();
									state = 159;
									queueFrommasterToevolve_5_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 161:
							if (queueFromevolve_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 162;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 162:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_5_";
								}
								if (receiver.equals("fft_5_")) {
									monitor.notifyAll();
									state = 163;
									queueFrommasterTofft_5_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 165:
							if (queueFromfft_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 166;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 166:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_6_";
								}
								if (receiver.equals("evolve_6_")) {
									monitor.notifyAll();
									state = 167;
									queueFrommasterToevolve_6_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 169:
							if (queueFromevolve_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 170;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 170:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_6_";
								}
								if (receiver.equals("fft_6_")) {
									monitor.notifyAll();
									state = 171;
									queueFrommasterTofft_6_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 173:
							if (queueFromfft_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 174;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 174:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_7_";
								}
								if (receiver.equals("evolve_7_")) {
									monitor.notifyAll();
									state = 175;
									queueFrommasterToevolve_7_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 177:
							if (queueFromevolve_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 178;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 178:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_7_";
								}
								if (receiver.equals("fft_7_")) {
									monitor.notifyAll();
									state = 179;
									queueFrommasterTofft_7_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 181:
							if (queueFromfft_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 182;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 182:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_8_";
								}
								if (receiver.equals("evolve_8_")) {
									monitor.notifyAll();
									state = 183;
									queueFrommasterToevolve_8_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 185:
							if (queueFromevolve_8_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 186;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 186:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_8_";
								}
								if (receiver.equals("fft_8_")) {
									monitor.notifyAll();
									state = 187;
									queueFrommasterTofft_8_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 189:
							if (queueFromfft_8_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 190;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 190:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_9_";
								}
								if (receiver.equals("evolve_9_")) {
									monitor.notifyAll();
									state = 191;
									queueFrommasterToevolve_9_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 193:
							if (queueFromevolve_9_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 194;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_9_Tomaster.take());
							}
							monitor.wait();
							break;
						case 194:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_9_";
								}
								if (receiver.equals("fft_9_")) {
									monitor.notifyAll();
									state = 195;
									queueFrommasterTofft_9_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 197:
							if (queueFromfft_9_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 198;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_9_Tomaster.take());
							}
							monitor.wait();
							break;
						case 198:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_10_";
								}
								if (receiver.equals("evolve_10_")) {
									monitor.notifyAll();
									state = 199;
									queueFrommasterToevolve_10_.put(box.get());
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
						case 203 :
						case 204 :
						case 207 :
						case 208 :
						case 211 :
						case 212 :
						case 215 :
						case 216 :
						case 219 :
						case 220 :
						case 223 :
						case 224 :
						case 227 :
						case 228 :
						case 231 :
						case 232 :
						case 235 :
						case 236 :
						case 239 :
						case 240 :
						case 243 :
						case 244 :
						case 247 :
						case 248 :
						case 251 :
						case 252 :
						case 255 :
						case 256 :
						case 259 :
						case 260 :
						case 263 :
						case 264 :
						case 267 :
						case 268 :
						case 271 :
						case 272 :
						case 275 :
						case 276 :
						case 279 :
						case 280 :
						case 283 :
						case 284 :
						case 287 :
						case 288 :
						case 291 :
						case 292 :
						case 295 :
						case 296 :
						case 299 :
						case 300 :
						case 303 :
						case 304 :
						case 307 :
						case 308 :
						case 311 :
						case 312 :
						case 315 :
						case 316 :
						case 319 :
						case 320 :
						case 323 :
						case 324 :
						case 327 :
						case 328 :
						case 331 :
						case 332 :
						case 335 :
						case 336 :
						case 339 :
						case 340 :
						case 343 :
						case 344 :
						case 347 :
						case 348 :
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
						case 201:
							if (queueFromevolve_10_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 202;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 202:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_10_";
								}
								if (receiver.equals("fft_10_")) {
									monitor.notifyAll();
									state = 203;
									queueFrommasterTofft_10_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 205:
							if (queueFromfft_10_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 206;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 206:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_11_";
								}
								if (receiver.equals("evolve_11_")) {
									monitor.notifyAll();
									state = 207;
									queueFrommasterToevolve_11_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 209:
							if (queueFromevolve_11_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 210;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_11_Tomaster.take());
							}
							monitor.wait();
							break;
						case 210:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_11_";
								}
								if (receiver.equals("fft_11_")) {
									monitor.notifyAll();
									state = 211;
									queueFrommasterTofft_11_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 213:
							if (queueFromfft_11_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 214;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_11_Tomaster.take());
							}
							monitor.wait();
							break;
						case 214:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_12_";
								}
								if (receiver.equals("evolve_12_")) {
									monitor.notifyAll();
									state = 215;
									queueFrommasterToevolve_12_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 217:
							if (queueFromevolve_12_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 218;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_12_Tomaster.take());
							}
							monitor.wait();
							break;
						case 218:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_12_";
								}
								if (receiver.equals("fft_12_")) {
									monitor.notifyAll();
									state = 219;
									queueFrommasterTofft_12_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 221:
							if (queueFromfft_12_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 222;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_12_Tomaster.take());
							}
							monitor.wait();
							break;
						case 222:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_13_";
								}
								if (receiver.equals("evolve_13_")) {
									monitor.notifyAll();
									state = 223;
									queueFrommasterToevolve_13_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 225:
							if (queueFromevolve_13_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 226;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_13_Tomaster.take());
							}
							monitor.wait();
							break;
						case 226:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_13_";
								}
								if (receiver.equals("fft_13_")) {
									monitor.notifyAll();
									state = 227;
									queueFrommasterTofft_13_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 229:
							if (queueFromfft_13_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 230;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_13_Tomaster.take());
							}
							monitor.wait();
							break;
						case 230:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_14_";
								}
								if (receiver.equals("evolve_14_")) {
									monitor.notifyAll();
									state = 231;
									queueFrommasterToevolve_14_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 233:
							if (queueFromevolve_14_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 234;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_14_Tomaster.take());
							}
							monitor.wait();
							break;
						case 234:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_14_";
								}
								if (receiver.equals("fft_14_")) {
									monitor.notifyAll();
									state = 235;
									queueFrommasterTofft_14_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 237:
							if (queueFromfft_14_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 238;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_14_Tomaster.take());
							}
							monitor.wait();
							break;
						case 238:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_15_";
								}
								if (receiver.equals("evolve_15_")) {
									monitor.notifyAll();
									state = 239;
									queueFrommasterToevolve_15_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 241:
							if (queueFromevolve_15_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 242;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_15_Tomaster.take());
							}
							monitor.wait();
							break;
						case 242:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_15_";
								}
								if (receiver.equals("fft_15_")) {
									monitor.notifyAll();
									state = 243;
									queueFrommasterTofft_15_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 245:
							if (queueFromfft_15_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 246;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_15_Tomaster.take());
							}
							monitor.wait();
							break;
						case 246:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_16_";
								}
								if (receiver.equals("evolve_16_")) {
									monitor.notifyAll();
									state = 247;
									queueFrommasterToevolve_16_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 249:
							if (queueFromevolve_16_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 250;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_16_Tomaster.take());
							}
							monitor.wait();
							break;
						case 250:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_16_";
								}
								if (receiver.equals("fft_16_")) {
									monitor.notifyAll();
									state = 251;
									queueFrommasterTofft_16_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 253:
							if (queueFromfft_16_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 254;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_16_Tomaster.take());
							}
							monitor.wait();
							break;
						case 254:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_17_";
								}
								if (receiver.equals("evolve_17_")) {
									monitor.notifyAll();
									state = 255;
									queueFrommasterToevolve_17_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 257:
							if (queueFromevolve_17_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 258;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_17_Tomaster.take());
							}
							monitor.wait();
							break;
						case 258:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_17_";
								}
								if (receiver.equals("fft_17_")) {
									monitor.notifyAll();
									state = 259;
									queueFrommasterTofft_17_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 261:
							if (queueFromfft_17_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 262;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_17_Tomaster.take());
							}
							monitor.wait();
							break;
						case 262:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_18_";
								}
								if (receiver.equals("evolve_18_")) {
									monitor.notifyAll();
									state = 263;
									queueFrommasterToevolve_18_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 265:
							if (queueFromevolve_18_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 266;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_18_Tomaster.take());
							}
							monitor.wait();
							break;
						case 266:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_18_";
								}
								if (receiver.equals("fft_18_")) {
									monitor.notifyAll();
									state = 267;
									queueFrommasterTofft_18_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 269:
							if (queueFromfft_18_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 270;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_18_Tomaster.take());
							}
							monitor.wait();
							break;
						case 270:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_19_";
								}
								if (receiver.equals("evolve_19_")) {
									monitor.notifyAll();
									state = 271;
									queueFrommasterToevolve_19_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 273:
							if (queueFromevolve_19_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 274;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_19_Tomaster.take());
							}
							monitor.wait();
							break;
						case 274:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_19_";
								}
								if (receiver.equals("fft_19_")) {
									monitor.notifyAll();
									state = 275;
									queueFrommasterTofft_19_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 277:
							if (queueFromfft_19_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 278;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_19_Tomaster.take());
							}
							monitor.wait();
							break;
						case 278:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_20_";
								}
								if (receiver.equals("evolve_20_")) {
									monitor.notifyAll();
									state = 279;
									queueFrommasterToevolve_20_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 281:
							if (queueFromevolve_20_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 282;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_20_Tomaster.take());
							}
							monitor.wait();
							break;
						case 282:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_20_";
								}
								if (receiver.equals("fft_20_")) {
									monitor.notifyAll();
									state = 283;
									queueFrommasterTofft_20_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 285:
							if (queueFromfft_20_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 286;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_20_Tomaster.take());
							}
							monitor.wait();
							break;
						case 286:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_21_";
								}
								if (receiver.equals("evolve_21_")) {
									monitor.notifyAll();
									state = 287;
									queueFrommasterToevolve_21_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 289:
							if (queueFromevolve_21_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 290;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_21_Tomaster.take());
							}
							monitor.wait();
							break;
						case 290:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_21_";
								}
								if (receiver.equals("fft_21_")) {
									monitor.notifyAll();
									state = 291;
									queueFrommasterTofft_21_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 293:
							if (queueFromfft_21_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 294;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_21_Tomaster.take());
							}
							monitor.wait();
							break;
						case 294:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_22_";
								}
								if (receiver.equals("evolve_22_")) {
									monitor.notifyAll();
									state = 295;
									queueFrommasterToevolve_22_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 297:
							if (queueFromevolve_22_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 298;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_22_Tomaster.take());
							}
							monitor.wait();
							break;
						case 298:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_22_";
								}
								if (receiver.equals("fft_22_")) {
									monitor.notifyAll();
									state = 299;
									queueFrommasterTofft_22_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 301:
							if (queueFromfft_22_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 302;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_22_Tomaster.take());
							}
							monitor.wait();
							break;
						case 302:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_23_";
								}
								if (receiver.equals("evolve_23_")) {
									monitor.notifyAll();
									state = 303;
									queueFrommasterToevolve_23_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 305:
							if (queueFromevolve_23_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 306;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_23_Tomaster.take());
							}
							monitor.wait();
							break;
						case 306:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_23_";
								}
								if (receiver.equals("fft_23_")) {
									monitor.notifyAll();
									state = 307;
									queueFrommasterTofft_23_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 309:
							if (queueFromfft_23_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 310;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_23_Tomaster.take());
							}
							monitor.wait();
							break;
						case 310:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_24_";
								}
								if (receiver.equals("evolve_24_")) {
									monitor.notifyAll();
									state = 311;
									queueFrommasterToevolve_24_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 313:
							if (queueFromevolve_24_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 314;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_24_Tomaster.take());
							}
							monitor.wait();
							break;
						case 314:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_24_";
								}
								if (receiver.equals("fft_24_")) {
									monitor.notifyAll();
									state = 315;
									queueFrommasterTofft_24_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 317:
							if (queueFromfft_24_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 318;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_24_Tomaster.take());
							}
							monitor.wait();
							break;
						case 318:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_25_";
								}
								if (receiver.equals("evolve_25_")) {
									monitor.notifyAll();
									state = 319;
									queueFrommasterToevolve_25_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 321:
							if (queueFromevolve_25_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 322;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_25_Tomaster.take());
							}
							monitor.wait();
							break;
						case 322:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_25_";
								}
								if (receiver.equals("fft_25_")) {
									monitor.notifyAll();
									state = 323;
									queueFrommasterTofft_25_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 325:
							if (queueFromfft_25_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 326;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_25_Tomaster.take());
							}
							monitor.wait();
							break;
						case 326:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_26_";
								}
								if (receiver.equals("evolve_26_")) {
									monitor.notifyAll();
									state = 327;
									queueFrommasterToevolve_26_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 329:
							if (queueFromevolve_26_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 330;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_26_Tomaster.take());
							}
							monitor.wait();
							break;
						case 330:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_26_";
								}
								if (receiver.equals("fft_26_")) {
									monitor.notifyAll();
									state = 331;
									queueFrommasterTofft_26_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 333:
							if (queueFromfft_26_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 334;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_26_Tomaster.take());
							}
							monitor.wait();
							break;
						case 334:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_27_";
								}
								if (receiver.equals("evolve_27_")) {
									monitor.notifyAll();
									state = 335;
									queueFrommasterToevolve_27_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 337:
							if (queueFromevolve_27_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 338;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_27_Tomaster.take());
							}
							monitor.wait();
							break;
						case 338:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_27_";
								}
								if (receiver.equals("fft_27_")) {
									monitor.notifyAll();
									state = 339;
									queueFrommasterTofft_27_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 341:
							if (queueFromfft_27_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 342;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_27_Tomaster.take());
							}
							monitor.wait();
							break;
						case 342:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_28_";
								}
								if (receiver.equals("evolve_28_")) {
									monitor.notifyAll();
									state = 343;
									queueFrommasterToevolve_28_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 345:
							if (queueFromevolve_28_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 346;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_28_Tomaster.take());
							}
							monitor.wait();
							break;
						case 346:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_28_";
								}
								if (receiver.equals("fft_28_")) {
									monitor.notifyAll();
									state = 347;
									queueFrommasterTofft_28_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 349:
							if (queueFromfft_28_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 350;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_28_Tomaster.take());
							}
							monitor.wait();
							break;
						case 350:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 351;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 351:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 352;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 352:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 353;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 353:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 354;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 354:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 355;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 355:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 356;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 356:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 357;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 357:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 358;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 358:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 359;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 359:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 360;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 360:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 361;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 361:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 362;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 362:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 363;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 363:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 364;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 364:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 365;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 365:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 366;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 366:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 367;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 367:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 368;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 368:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 369;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 369:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 370;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 370:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 371;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 371:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 372;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 372:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 373;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 373:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 374;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 374:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 375;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 375:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 376;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 376:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 377;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 377:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 378;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 378:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 379;
								return Optional.empty();
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
						case 468 :
						case 470 :
						case 472 :
						case 474 :
						case 476 :
						case 478 :
						case 480 :
						case 482 :
						case 484 :
						case 486 :
						case 488 :
						case 490 :
						case 492 :
						case 494 :
						case 496 :
						case 498 :
						case 500 :
						case 502 :
						case 504 :
						case 506 :
						case 508 :
						case 510 :
						case 512 :
						case 514 :
						case 516 :
						case 518 :
						case 520 :
						case 522 :
						case 523 :
						case 525 :
						case 527 :
						case 529 :
						case 531 :
						case 533 :
						case 535 :
						case 537 :
						case 539 :
						case 541 :
						case 543 :
						case 545 :
						case 547 :
						case 549 :
						case 551 :
						case 553 :
						case 555 :
						case 557 :
						case 559 :
						case 561 :
						case 563 :
						case 565 :
						case 567 :
						case 569 :
						case 571 :
						case 573 :
						case 575 :
						case 577 :
						case 579 :
						case 582 :
						case 584 :
						case 586 :
						case 588 :
						case 590 :
						case 592 :
						case 594 :
						case 596 :
						case 598 :
							monitor.wait();
							break;
						case 408:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 409;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 409:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 410;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 410:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 411;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 411:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 412;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 412:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 413;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 413:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 414;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 414:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 415;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 415:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 416;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 416:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 417;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 417:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 418;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 418:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 419;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 419:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 420;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 420:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 421;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 421:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 422;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 422:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 423;
								return Optional.empty();
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
						case 467:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_1_";
								}
								if (receiver.equals("fft_1_")) {
									monitor.notifyAll();
									state = 468;
									queueFrommasterTofft_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 469:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_2_";
								}
								if (receiver.equals("fft_2_")) {
									monitor.notifyAll();
									state = 470;
									queueFrommasterTofft_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 471:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_3_";
								}
								if (receiver.equals("fft_3_")) {
									monitor.notifyAll();
									state = 472;
									queueFrommasterTofft_3_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 473:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_4_";
								}
								if (receiver.equals("fft_4_")) {
									monitor.notifyAll();
									state = 474;
									queueFrommasterTofft_4_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 475:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_5_";
								}
								if (receiver.equals("fft_5_")) {
									monitor.notifyAll();
									state = 476;
									queueFrommasterTofft_5_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 477:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_6_";
								}
								if (receiver.equals("fft_6_")) {
									monitor.notifyAll();
									state = 478;
									queueFrommasterTofft_6_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 479:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_7_";
								}
								if (receiver.equals("fft_7_")) {
									monitor.notifyAll();
									state = 480;
									queueFrommasterTofft_7_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 481:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_8_";
								}
								if (receiver.equals("fft_8_")) {
									monitor.notifyAll();
									state = 482;
									queueFrommasterTofft_8_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 483:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_9_";
								}
								if (receiver.equals("fft_9_")) {
									monitor.notifyAll();
									state = 484;
									queueFrommasterTofft_9_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 485:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_10_";
								}
								if (receiver.equals("fft_10_")) {
									monitor.notifyAll();
									state = 486;
									queueFrommasterTofft_10_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 487:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_11_";
								}
								if (receiver.equals("fft_11_")) {
									monitor.notifyAll();
									state = 488;
									queueFrommasterTofft_11_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 489:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_12_";
								}
								if (receiver.equals("fft_12_")) {
									monitor.notifyAll();
									state = 490;
									queueFrommasterTofft_12_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 491:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_13_";
								}
								if (receiver.equals("fft_13_")) {
									monitor.notifyAll();
									state = 492;
									queueFrommasterTofft_13_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 493:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_14_";
								}
								if (receiver.equals("fft_14_")) {
									monitor.notifyAll();
									state = 494;
									queueFrommasterTofft_14_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 495:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_15_";
								}
								if (receiver.equals("fft_15_")) {
									monitor.notifyAll();
									state = 496;
									queueFrommasterTofft_15_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 497:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_16_";
								}
								if (receiver.equals("fft_16_")) {
									monitor.notifyAll();
									state = 498;
									queueFrommasterTofft_16_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 499:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_17_";
								}
								if (receiver.equals("fft_17_")) {
									monitor.notifyAll();
									state = 500;
									queueFrommasterTofft_17_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 501:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_18_";
								}
								if (receiver.equals("fft_18_")) {
									monitor.notifyAll();
									state = 502;
									queueFrommasterTofft_18_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 503:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_19_";
								}
								if (receiver.equals("fft_19_")) {
									monitor.notifyAll();
									state = 504;
									queueFrommasterTofft_19_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 505:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_20_";
								}
								if (receiver.equals("fft_20_")) {
									monitor.notifyAll();
									state = 506;
									queueFrommasterTofft_20_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 507:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_21_";
								}
								if (receiver.equals("fft_21_")) {
									monitor.notifyAll();
									state = 508;
									queueFrommasterTofft_21_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 509:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_22_";
								}
								if (receiver.equals("fft_22_")) {
									monitor.notifyAll();
									state = 510;
									queueFrommasterTofft_22_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 511:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_23_";
								}
								if (receiver.equals("fft_23_")) {
									monitor.notifyAll();
									state = 512;
									queueFrommasterTofft_23_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 513:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_24_";
								}
								if (receiver.equals("fft_24_")) {
									monitor.notifyAll();
									state = 514;
									queueFrommasterTofft_24_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 515:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_25_";
								}
								if (receiver.equals("fft_25_")) {
									monitor.notifyAll();
									state = 516;
									queueFrommasterTofft_25_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 517:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_26_";
								}
								if (receiver.equals("fft_26_")) {
									monitor.notifyAll();
									state = 518;
									queueFrommasterTofft_26_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 519:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_27_";
								}
								if (receiver.equals("fft_27_")) {
									monitor.notifyAll();
									state = 520;
									queueFrommasterTofft_27_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 521:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_28_";
								}
								if (receiver.equals("fft_28_")) {
									monitor.notifyAll();
									state = 522;
									queueFrommasterTofft_28_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 524:
							if (queueFromfft_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 525;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 526:
							if (queueFromfft_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 527;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 528:
							if (queueFromfft_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 529;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 530:
							if (queueFromfft_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 531;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 532:
							if (queueFromfft_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 533;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 534:
							if (queueFromfft_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 535;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 536:
							if (queueFromfft_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 537;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 538:
							if (queueFromfft_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 539;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 540:
							if (queueFromfft_8_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 541;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 542:
							if (queueFromfft_9_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 543;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_9_Tomaster.take());
							}
							monitor.wait();
							break;
						case 544:
							if (queueFromfft_10_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 545;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 546:
							if (queueFromfft_11_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 547;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_11_Tomaster.take());
							}
							monitor.wait();
							break;
						case 548:
							if (queueFromfft_12_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 549;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_12_Tomaster.take());
							}
							monitor.wait();
							break;
						case 550:
							if (queueFromfft_13_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 551;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_13_Tomaster.take());
							}
							monitor.wait();
							break;
						case 552:
							if (queueFromfft_14_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 553;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_14_Tomaster.take());
							}
							monitor.wait();
							break;
						case 554:
							if (queueFromfft_15_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 555;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_15_Tomaster.take());
							}
							monitor.wait();
							break;
						case 556:
							if (queueFromfft_16_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 557;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_16_Tomaster.take());
							}
							monitor.wait();
							break;
						case 558:
							if (queueFromfft_17_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 559;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_17_Tomaster.take());
							}
							monitor.wait();
							break;
						case 560:
							if (queueFromfft_18_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 561;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_18_Tomaster.take());
							}
							monitor.wait();
							break;
						case 562:
							if (queueFromfft_19_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 563;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_19_Tomaster.take());
							}
							monitor.wait();
							break;
						case 564:
							if (queueFromfft_20_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 565;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_20_Tomaster.take());
							}
							monitor.wait();
							break;
						case 566:
							if (queueFromfft_21_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 567;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_21_Tomaster.take());
							}
							monitor.wait();
							break;
						case 568:
							if (queueFromfft_22_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 569;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_22_Tomaster.take());
							}
							monitor.wait();
							break;
						case 570:
							if (queueFromfft_23_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 571;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_23_Tomaster.take());
							}
							monitor.wait();
							break;
						case 572:
							if (queueFromfft_24_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 573;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_24_Tomaster.take());
							}
							monitor.wait();
							break;
						case 574:
							if (queueFromfft_25_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 575;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_25_Tomaster.take());
							}
							monitor.wait();
							break;
						case 576:
							if (queueFromfft_26_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 577;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_26_Tomaster.take());
							}
							monitor.wait();
							break;
						case 578:
							if (queueFromfft_27_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 579;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_27_Tomaster.take());
							}
							monitor.wait();
							break;
						case 580:
							if (queueFromfft_28_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 119;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_28_Tomaster.take());
							}
							monitor.wait();
							break;
						case 581:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_1_";
								}
								if (receiver.equals("fft_1_")) {
									monitor.notifyAll();
									state = 582;
									queueFrommasterTofft_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 583:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_2_";
								}
								if (receiver.equals("fft_2_")) {
									monitor.notifyAll();
									state = 584;
									queueFrommasterTofft_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 585:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_3_";
								}
								if (receiver.equals("fft_3_")) {
									monitor.notifyAll();
									state = 586;
									queueFrommasterTofft_3_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 587:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_4_";
								}
								if (receiver.equals("fft_4_")) {
									monitor.notifyAll();
									state = 588;
									queueFrommasterTofft_4_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 589:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_5_";
								}
								if (receiver.equals("fft_5_")) {
									monitor.notifyAll();
									state = 590;
									queueFrommasterTofft_5_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 591:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_6_";
								}
								if (receiver.equals("fft_6_")) {
									monitor.notifyAll();
									state = 592;
									queueFrommasterTofft_6_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 593:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_7_";
								}
								if (receiver.equals("fft_7_")) {
									monitor.notifyAll();
									state = 594;
									queueFrommasterTofft_7_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 595:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_8_";
								}
								if (receiver.equals("fft_8_")) {
									monitor.notifyAll();
									state = 596;
									queueFrommasterTofft_8_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 597:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_9_";
								}
								if (receiver.equals("fft_9_")) {
									monitor.notifyAll();
									state = 598;
									queueFrommasterTofft_9_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 599:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_10_";
								}
								if (receiver.equals("fft_10_")) {
									monitor.notifyAll();
									state = 600;
									queueFrommasterTofft_10_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_636(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 602 :
						case 604 :
						case 606 :
						case 608 :
						case 610 :
						case 612 :
						case 614 :
						case 616 :
						case 618 :
						case 620 :
						case 622 :
						case 624 :
						case 626 :
						case 628 :
						case 630 :
						case 632 :
						case 634 :
							monitor.wait();
							break;
						case 601:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_11_";
								}
								if (receiver.equals("fft_11_")) {
									monitor.notifyAll();
									state = 602;
									queueFrommasterTofft_11_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 603:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_12_";
								}
								if (receiver.equals("fft_12_")) {
									monitor.notifyAll();
									state = 604;
									queueFrommasterTofft_12_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 605:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_13_";
								}
								if (receiver.equals("fft_13_")) {
									monitor.notifyAll();
									state = 606;
									queueFrommasterTofft_13_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 607:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_14_";
								}
								if (receiver.equals("fft_14_")) {
									monitor.notifyAll();
									state = 608;
									queueFrommasterTofft_14_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 609:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_15_";
								}
								if (receiver.equals("fft_15_")) {
									monitor.notifyAll();
									state = 610;
									queueFrommasterTofft_15_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 611:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_16_";
								}
								if (receiver.equals("fft_16_")) {
									monitor.notifyAll();
									state = 612;
									queueFrommasterTofft_16_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 613:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_17_";
								}
								if (receiver.equals("fft_17_")) {
									monitor.notifyAll();
									state = 614;
									queueFrommasterTofft_17_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 615:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_18_";
								}
								if (receiver.equals("fft_18_")) {
									monitor.notifyAll();
									state = 616;
									queueFrommasterTofft_18_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 617:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_19_";
								}
								if (receiver.equals("fft_19_")) {
									monitor.notifyAll();
									state = 618;
									queueFrommasterTofft_19_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 619:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_20_";
								}
								if (receiver.equals("fft_20_")) {
									monitor.notifyAll();
									state = 620;
									queueFrommasterTofft_20_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 621:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_21_";
								}
								if (receiver.equals("fft_21_")) {
									monitor.notifyAll();
									state = 622;
									queueFrommasterTofft_21_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 623:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_22_";
								}
								if (receiver.equals("fft_22_")) {
									monitor.notifyAll();
									state = 624;
									queueFrommasterTofft_22_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 625:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_23_";
								}
								if (receiver.equals("fft_23_")) {
									monitor.notifyAll();
									state = 626;
									queueFrommasterTofft_23_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 627:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_24_";
								}
								if (receiver.equals("fft_24_")) {
									monitor.notifyAll();
									state = 628;
									queueFrommasterTofft_24_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 629:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_25_";
								}
								if (receiver.equals("fft_25_")) {
									monitor.notifyAll();
									state = 630;
									queueFrommasterTofft_25_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 631:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_26_";
								}
								if (receiver.equals("fft_26_")) {
									monitor.notifyAll();
									state = 632;
									queueFrommasterTofft_26_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 633:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_27_";
								}
								if (receiver.equals("fft_27_")) {
									monitor.notifyAll();
									state = 634;
									queueFrommasterTofft_27_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 635:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_28_";
								}
								if (receiver.equals("fft_28_")) {
									monitor.notifyAll();
									state = 522;
									queueFrommasterTofft_28_.put(box.get());
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
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 636){
								var result = exchange_600_636(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			default: throw new Exception("Unknown environment");
		}
	}
	
	@Override
	public String[] threadNames(){
		return new String[] { "fft_2_","fft_4_","evolve_7_","evolve_22_","fft_5_","fft_15_","evolve_6_","fft_24_","evolve_20_","fft_27_","evolve_13_","evolve_15_","evolve_23_","evolve_26_","evolve_14_","fft_22_","evolve_21_","fft_9_","fft_3_","evolve_16_","fft_8_","fft_10_","fft_28_","evolve_8_","evolve_18_","fft_17_","evolve_4_","evolve_17_","fft_16_","fft_11_","master","fft_25_","fft_12_","fft_1_","fft_6_","evolve_9_","evolve_1_","evolve_5_","evolve_2_","fft_13_","evolve_3_","fft_23_","evolve_25_","evolve_27_","evolve_0_","evolve_12_","fft_20_","fft_21_","fft_18_","evolve_19_","fft_0_","evolve_24_","evolve_10_","fft_19_","fft_26_","fft_7_","evolve_28_","fft_14_","evolve_11_" };
	}
	
	@Override
	public Object[] dummies(){
		return new Object[]{"TestStringDummy"};
	}
	
	@Override
	public int getState(){
		return this.state;
	}
}
