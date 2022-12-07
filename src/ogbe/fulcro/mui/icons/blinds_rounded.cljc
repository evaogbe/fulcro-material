(ns ogbe.fulcro.mui.icons.blinds-rounded
  #?(:cljs (:require
            ["@mui/icons-material/BlindsRounded" :default BlindsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-blinds-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BlindsRounded)))