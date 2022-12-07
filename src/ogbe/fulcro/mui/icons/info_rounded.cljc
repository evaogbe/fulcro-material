(ns ogbe.fulcro.mui.icons.info-rounded
  #?(:cljs (:require
            ["@mui/icons-material/InfoRounded" :default InfoRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-info-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory InfoRounded)))