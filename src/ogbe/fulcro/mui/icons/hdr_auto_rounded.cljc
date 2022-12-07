(ns ogbe.fulcro.mui.icons.hdr-auto-rounded
  #?(:cljs (:require
            ["@mui/icons-material/HdrAutoRounded" :default HdrAutoRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hdr-auto-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HdrAutoRounded)))