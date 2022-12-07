(ns ogbe.fulcro.mui.customization.colors.cyan
  #?(:cljs (:require
            ["@mui/material/colors/cyan" :default js-cyan]
            [goog.object :as gobj])))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn cyan
  ([] #?(:cljs js-cyan))
  ([shade] #?(:cljs (gobj/get js-cyan shade))))
