(ns ogbe.fulcro.mui.icons.mp-rounded
  #?(:cljs (:require
            ["@mui/icons-material/MpRounded" :default MpRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mp-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MpRounded)))