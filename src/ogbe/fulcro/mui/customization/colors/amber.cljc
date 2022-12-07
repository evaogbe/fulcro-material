(ns ogbe.fulcro.mui.customization.colors.amber
  #?(:cljs (:require
            ["@mui/material/colors/amber" :default js-amber]
            [goog.object :as gobj])))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn amber
  ([] #?(:cljs js-amber))
  ([shade] #?(:cljs (gobj/get js-amber shade))))
