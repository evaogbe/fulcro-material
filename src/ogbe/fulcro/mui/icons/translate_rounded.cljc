(ns ogbe.fulcro.mui.icons.translate-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TranslateRounded" :default TranslateRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-translate-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TranslateRounded)))