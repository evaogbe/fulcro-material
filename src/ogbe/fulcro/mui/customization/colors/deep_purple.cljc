(ns ogbe.fulcro.mui.customization.colors.deep-purple
  #?(:cljs (:require
            ["@mui/material/colors/deepPurple" :default js-deep-purple]
            [goog.object :as gobj])))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn deep-purple
  ([] #?(:cljs js-deep-purple))
  ([shade] #?(:cljs (gobj/get js-deep-purple shade))))
