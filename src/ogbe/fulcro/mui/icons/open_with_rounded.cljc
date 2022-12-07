(ns ogbe.fulcro.mui.icons.open-with-rounded
  #?(:cljs (:require
            ["@mui/icons-material/OpenWithRounded" :default OpenWithRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-open-with-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OpenWithRounded)))