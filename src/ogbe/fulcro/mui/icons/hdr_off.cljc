(ns ogbe.fulcro.mui.icons.hdr-off
  #?(:cljs (:require
            ["@mui/icons-material/HdrOff" :default HdrOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hdr-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HdrOff)))