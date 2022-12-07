(ns ogbe.fulcro.mui.customization.colors.light-green
  #?(:cljs (:require
            ["@mui/material/colors/lightGreen" :default js-light-green]
            [goog.object :as gobj])))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn light-green
  ([] #?(:cljs js-light-green))
  ([shade] #?(:cljs (gobj/get js-light-green shade))))
