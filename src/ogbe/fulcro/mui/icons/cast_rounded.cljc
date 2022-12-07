(ns ogbe.fulcro.mui.icons.cast-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CastRounded" :default CastRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cast-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CastRounded)))