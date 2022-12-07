(ns ogbe.fulcro.mui.icons.tapas-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TapasRounded" :default TapasRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tapas-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TapasRounded)))