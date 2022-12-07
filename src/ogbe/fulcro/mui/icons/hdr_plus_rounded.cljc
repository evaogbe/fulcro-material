(ns ogbe.fulcro.mui.icons.hdr-plus-rounded
  #?(:cljs (:require
            ["@mui/icons-material/HdrPlusRounded" :default HdrPlusRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hdr-plus-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HdrPlusRounded)))