(ns ogbe.fulcro.mui.icons.margin-rounded
  #?(:cljs (:require
            ["@mui/icons-material/MarginRounded" :default MarginRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-margin-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MarginRounded)))